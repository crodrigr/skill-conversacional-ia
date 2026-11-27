# 🐉 Guía paso a paso: el narrador de cuentos con Spring Boot y OpenRouter

Vas a construir una aplicación que recibe una pregunta, se la envía a una IA y devuelve la respuesta en forma de cuento. Hay dos clases: la de arranque, que escribes una vez, y un **controlador**, donde haremos todas las pruebas y que crece en cada paso. Usa `RestClient` (Spring Framework 6.1 / Spring Boot 3.2 o superior; aquí, Spring Boot 4.1.2) y el enrutador gratuito `openrouter/free`.

| Paso | Qué construyes | Qué aprendes |
| ---- | -------------- | ------------ |
| 0 | Proyecto vacío y dependencias | Estructura de Maven |
| 1 | La aplicación arranca | `@SpringBootApplication` |
| 2 | El controlador recibe la pregunta | `@RestController`, `@PostMapping` |
| 3 | La clave de OpenRouter | Variables de entorno |
| 4 | La primera llamada a la IA | `RestClient`, mensajes |
| 5 | Solo el texto de la respuesta | `choices[0].message.content` |
| 6 | El narrador | *System Prompt* |

## 🗺️ Mapa del proyecto

Así quedará al terminar. El número indica el paso en que aparece cada archivo.

```text
ejemplo-narrador/
├── pom.xml                              [0] dependencias
└── src/main/
    ├── java/com/example/openrouter/
    │   ├── OpenRouterApplication.java   [1] arranca la aplicación
    │   └── OpenRouterController.java    [2] aquí hacemos las pruebas
    └── resources/
        └── application.properties       [3] de dónde sale la clave
```

### 🧩 Qué hace cada clase

| Clase | Para qué sirve |
| ----- | -------------- |
| `OpenRouterApplication` | Solo arranca la aplicación (`main`). No se vuelve a tocar después del paso 1. |
| `OpenRouterController` | Recibe la petición, llama a la IA y devuelve la respuesta. |

Dentro de `OpenRouterController`:

| Parte | Para qué sirve | Paso |
| ----- | -------------- | ---- |
| `ask` | Atiende `POST /api/ai/ask`. | 2 |
| `apiKey` | Guarda la clave con la que nos identificamos. | 3 |
| `restClient` | Hace la petición HTTP a OpenRouter. | 4 |
| `body` | El modelo y los mensajes que se envían. | 4 |
| `choices` y `message` | Sacan el texto de la respuesta. | 5 |
| Mensaje `system` | Convierte a la IA en narrador. | 6 |

### 🔄 Cómo viaja una petición

```text
Postman ──pregunta──► OpenRouterController ──system + user──► OpenRouter ──► un modelo gratuito
Postman ◄──texto───── OpenRouterController ◄──choices[0].message.content───┘
```

## ✅ Requisitos

- Java 21 o superior y Maven 3.6.3 o superior (`java -version`, `mvn -version`).
- Una API Key de OpenRouter: <https://openrouter.ai/keys>
- Postman o `curl`.

## 📁 Paso 0 · Proyecto vacío y dependencias

```bash
mkdir -p ejemplo-narrador/src/main/java/com/example/openrouter
mkdir -p ejemplo-narrador/src/main/resources
cd ejemplo-narrador
```

Solo hace falta una dependencia, `spring-boot-starter-webmvc`: permite crear endpoints e incluye `RestClient`.

#### 📄 Crea `pom.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>4.1.2</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>openrouter</artifactId>
    <version>1.0.0</version>

    <properties>
        <java.version>21</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webmvc</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

## 🚀 Paso 1 · La aplicación arranca

`@SpringBootApplication` marca la clase de arranque y `main` la pone en marcha. También hace que Spring encuentre los controladores que estén en el mismo paquete.

#### 📄 Crea `src/main/java/com/example/openrouter/OpenRouterApplication.java`

```java
package com.example.openrouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenRouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenRouterApplication.class, args);
    }
}
```

▶️ Desde la carpeta `ejemplo-narrador/`:

```bash
mvn spring-boot:run
```

👀 En la consola debe aparecer `Started OpenRouterApplication`. Aún no hay endpoints.

- [ ] La aplicación arranca sin errores.

## 📬 Paso 2 · El controlador recibe la pregunta

Crea el controlador junto a la clase de arranque. Desde aquí, todas las pruebas se hacen en este archivo.

- `@RestController` permite que la clase responda peticiones web.
- `@RequestMapping` y `@PostMapping` forman la ruta `/api/ai/ask`.
- `@RequestBody` convierte el JSON recibido en un `Map`.

Todavía no hay IA: devolvemos la pregunta.

#### 📄 Crea `src/main/java/com/example/openrouter/OpenRouterController.java`

```java
package com.example.openrouter;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        return "Recibí tu pregunta: " + question;
    }
}
```

▶️ Detén la aplicación con `Ctrl+C` y vuelve a arrancarla:

```bash
mvn spring-boot:run
```

En Postman: método `POST`, URL `http://localhost:8080/api/ai/ask`, Body → raw → JSON:

```json
{
  "question": "Cuéntame un cuento sobre un dragón que tenía miedo de volar."
}
```

O con `curl`, en otra terminal:

```bash
curl -X POST http://localhost:8080/api/ai/ask \
  -H "Content-Type: application/json" \
  -d '{"question":"Cuéntame un cuento sobre un dragón que tenía miedo de volar."}'
```

👀 Responde `Recibí tu pregunta: …`.

- [ ] El endpoint devuelve mi pregunta.

## 🔑 Paso 3 · La clave de OpenRouter

La clave es un secreto: se lee de una **variable de entorno** y no se escribe en ningún archivo.

#### 📄 Crea `src/main/resources/application.properties`

```properties
openrouter.api.key=${OPENROUTER_API_KEY}
```

#### 📄 Escribe en `src/main/java/com/example/openrouter/OpenRouterController.java`

```java
package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @Value("${openrouter.api.key}")
    private String apiKey;

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        // Nunca se muestra la clave: solo si está o no
        String clave = apiKey.isBlank() ? "no" : "sí";

        return "Recibí tu pregunta: " + question + " (clave cargada: " + clave + ")";
    }
}
```

▶️ Detén la aplicación, define la variable **en la misma terminal** y arranca:

```bash
# Linux / macOS
export OPENROUTER_API_KEY="tu-clave"
mvn spring-boot:run
```

```powershell
# Windows (PowerShell)
$env:OPENROUTER_API_KEY="tu-clave"
mvn spring-boot:run
```

Repite la petición del paso 2.

👀 La respuesta termina en `(clave cargada: sí)`. Si no defines la variable, la aplicación no arranca: `Could not resolve placeholder 'OPENROUTER_API_KEY'`.

> ⚠️ No subas la clave a Git ni la pegues en capturas o chats.

- [ ] La clave se carga y no está escrita en el proyecto.

## 🤖 Paso 4 · La primera llamada a la IA

`RestClient` envía un `POST` a OpenRouter con:

- la cabecera `Authorization: Bearer <clave>`;
- `model`: `openrouter/free`, que elige un modelo gratuito disponible;
- `messages`: de momento, solo la pregunta con el rol `user`.

Devolvemos la respuesta completa para ver qué llega.

#### 📄 Escribe en `src/main/java/com/example/openrouter/OpenRouterController.java`

```java
package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    @PostMapping("/ask")
    public Map ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        // Construir el prompt
        Map<String, Object> body = Map.of(
            "model", "openrouter/free",
            "messages", List.of(
                Map.of(
                    "role", "user",
                    "content", question
                )
            )
        );

        // Consumir la API de OpenRouter
        Map response = restClient.post()
            .uri("https://openrouter.ai/api/v1/chat/completions")
            .header("Authorization", "Bearer " + apiKey)
            .header("Content-Type", "application/json")
            .body(body)
            .retrieve()
            .body(Map.class);

        // De momento devolvemos todo, para ver su forma
        return response;
    }
}
```

▶️ Detén la aplicación con `Ctrl+C` y vuelve a arrancarla:

```bash
mvn spring-boot:run
```

```bash
curl -X POST http://localhost:8080/api/ai/ask \
  -H "Content-Type: application/json" \
  -d '{"question":"Cuéntame un cuento sobre un dragón que tenía miedo de volar."}'
```

👀 Llega un JSON grande. Busca `model` (qué modelo contestó) y, dentro de `choices`, el campo `message.content`. Al compilar verás un aviso *unchecked* por los `Map`; no impide arrancar.

- [ ] Recibo el JSON de OpenRouter.
- [ ] Localizo el texto de la respuesta.

## ✂️ Paso 5 · Solo el texto

El texto está en `choices[0].message.content`: la primera opción, su mensaje, su contenido. El método vuelve a devolver `String`.

#### 📄 Escribe en `src/main/java/com/example/openrouter/OpenRouterController.java`

```java
package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        // Construir el prompt
        Map<String, Object> body = Map.of(
            "model", "openrouter/free",
            "messages", List.of(
                Map.of(
                    "role", "user",
                    "content", question
                )
            )
        );

        // Consumir la API de OpenRouter
        Map response = restClient.post()
            .uri("https://openrouter.ai/api/v1/chat/completions")
            .header("Authorization", "Bearer " + apiKey)
            .header("Content-Type", "application/json")
            .body(body)
            .retrieve()
            .body(Map.class);

        // Extraer la respuesta del modelo
        List<Map<String, Object>> choices =
            (List<Map<String, Object>>) response.get("choices");

        Map<String, Object> message =
            (Map<String, Object>) choices.get(0).get("message");

        return message.get("content").toString();
    }
}
```

▶️ Detén la aplicación con `Ctrl+C` y vuelve a arrancarla:

```bash
mvn spring-boot:run
```

```bash
curl -X POST http://localhost:8080/api/ai/ask \
  -H "Content-Type: application/json" \
  -d '{"question":"Cuéntame un cuento sobre un dragón que tenía miedo de volar."}'
```

👀 Ahora llega solo texto. Fíjate en el tono: todavía no le hemos dicho cómo responder.

- [ ] La respuesta es texto limpio.

## 🎭 Paso 6 · El narrador (*System Prompt*)

Añadimos, **antes** de la pregunta, un mensaje con el rol `system`. Define el comportamiento del asistente; el usuario solo envía el mensaje `user`.

Este es el controlador terminado:

#### 📄 Escribe en `src/main/java/com/example/openrouter/OpenRouterController.java`

```java
package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        // Construir el prompt
        Map<String, Object> body = Map.of(
            "model", "openrouter/free",
            "messages", List.of(
                Map.of(
                    "role", "system",
                    "content", "Eres un narrador de cuentos infantiles. " +
                               "Usas un tono lúdico y frases cortas."
                ),
                Map.of(
                    "role", "user",
                    "content", question
                )
            )
        );

        // Consumir la API de OpenRouter
        Map response = restClient.post()
            .uri("https://openrouter.ai/api/v1/chat/completions")
            .header("Authorization", "Bearer " + apiKey)
            .header("Content-Type", "application/json")
            .body(body)
            .retrieve()
            .body(Map.class);

        // Extraer la respuesta del modelo
        List<Map<String, Object>> choices =
            (List<Map<String, Object>>) response.get("choices");

        Map<String, Object> message =
            (Map<String, Object>) choices.get(0).get("message");

        return message.get("content").toString();
    }
}
```

▶️ Detén la aplicación con `Ctrl+C` y vuelve a arrancarla:

```bash
mvn spring-boot:run
```

```bash
curl -X POST http://localhost:8080/api/ai/ask \
  -H "Content-Type: application/json" \
  -d '{"question":"Cuéntame un cuento sobre un dragón que tenía miedo de volar."}'
```

Respuesta de ejemplo (ilustrativa; cambia en cada petición y según el modelo que toque):

```text
Había una vez un pequeño dragón llamado Tito.
Tito tenía un gran problema. ¡Le daba miedo volar!
```

👀 Compara con el paso 5: la misma pregunta, otro estilo.

- [ ] La respuesta usa tono lúdico y frases cortas.

## 🧠 Conceptos

| Concepto      | Función                                     |
| ------------- | ------------------------------------------- |
| System Prompt | Define el comportamiento de la IA.          |
| User Prompt   | Contiene la pregunta del usuario.           |
| Model         | Identifica el modelo o enrutador utilizado. |
| API Key       | Autentica nuestra aplicación.               |
| RestClient    | Permite consumir la API HTTP.               |
| JSON          | Formato de intercambio de información.      |

## 🆘 Si algo falla

| Síntoma | Causa probable |
| ------- | -------------- |
| `Could not resolve placeholder 'OPENROUTER_API_KEY'` | La variable no está definida en esa terminal. |
| `Port 8080 was already in use` | Usa `mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081` y cambia el puerto en la URL. |
| Respuesta `500` y en la consola `401 Unauthorized` | La clave no es válida. |
| Respuesta `500` y en la consola `429 Too Many Requests` | Límite de los modelos gratuitos: espera un poco. |
| Respuesta `500` y en la consola `NullPointerException` | Falta el campo `question`, o el modelo no devolvió texto. |

## 🏁 Retos

1. Cambia el mensaje `system` a «Eres un profesor de historia muy serio» y repite la pregunta.
2. Pide en el `system` que el cuento termine con una moraleja.
3. Si falta `question`, responde con un mensaje claro en lugar de un error 500.
4. Conecta Angular a este endpoint y construye un chat con el narrador.

> Es un ejemplo didáctico: en producción faltan manejo de errores, validaciones y límites de peticiones. Con modelos gratuitos usa solo datos ficticios.
