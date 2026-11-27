# 🐉 Ejemplo mínimo: Spring Boot + OpenRouter en una sola clase

Envías un mensaje a la IA y recibes una respuesta. Todo el código Java cabe en **una clase**, que usa `RestClient` (disponible desde Spring Framework 6.1 / Spring Boot 3.2; este ejemplo usa Spring Boot 4.1.2) y el enrutador gratuito `openrouter/free`.

## 🌳 Árbol de archivos

```text
ejemplo-narrador/
├── pom.xml                              ← dependencias
├── README.md                            ← esta guía
└── src/main/
    ├── java/com/example/openrouter/
    │   └── OpenRouterApplication.java   ← arranca la app, recibe la pregunta y llama a la IA
    └── resources/
        └── application.properties       ← lee la clave desde una variable de entorno
```

## ✅ Requisitos

- Java 21 o superior y Maven 3.6.3 o superior.
- Una API Key de OpenRouter: <https://openrouter.ai/keys>

## 1. Dependencias: `pom.xml`

Solo hace falta una: `spring-boot-starter-webmvc`.

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

## 2. Configuración: `src/main/resources/application.properties`

```properties
openrouter.api.key=${OPENROUTER_API_KEY}
```

Define la variable de entorno **en la misma terminal** desde la que vas a arrancar:

```bash
# Linux / macOS
export OPENROUTER_API_KEY="tu-clave"
```

```powershell
# Windows (PowerShell)
$env:OPENROUTER_API_KEY="tu-clave"
```

> ⚠️ No escribas la clave en `application.properties` ni en el código, y no la subas a Git.

## 3. La clase: `src/main/java/com/example/openrouter/OpenRouterApplication.java`

```java
package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping("/api/ai")
public class OpenRouterApplication {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    public static void main(String[] args) {
        SpringApplication.run(OpenRouterApplication.class, args);
    }

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

## 4. Ejecutar

Desde la carpeta `ejemplo-narrador/`:

```bash
mvn spring-boot:run
```

Al compilar verás un aviso de operaciones *unchecked*: se debe a las conversiones de `Map` y no impide arrancar.

## 5. Probar con Postman

- Método: `POST`
- URL: `http://localhost:8080/api/ai/ask`
- Body → raw → JSON:

```json
{
  "question": "Cuéntame un cuento sobre un dragón que tenía miedo de volar."
}
```

O con `curl`:

```bash
curl -X POST http://localhost:8080/api/ai/ask \
  -H "Content-Type: application/json" \
  -d '{"question":"Cuéntame un cuento sobre un dragón que tenía miedo de volar."}'
```

Respuesta de ejemplo (ilustrativa; cambia en cada petición y según el modelo que toque):

```text
Había una vez un pequeño dragón llamado Tito.

Tito tenía un gran problema.
¡Le daba miedo volar!

Un día conoció a una mariposa.
—¿Por qué estás triste? —preguntó ella.

—Tengo alas, pero no me atrevo a volar.

La mariposa sonrió.
—¡Inténtalo! Yo te acompaño.

Tito respiró profundamente.
Abrió sus alas y saltó.

¡Qué maravilla!
¡Estaba volando!
```

## 6. ¿Qué sucede por dentro?

```text
Postman ──pregunta──► /api/ai/ask ──system + user──► OpenRouter ──► un modelo gratuito
Postman ◄──texto───── Spring Boot ◄──choices[0].message.content───┘
```

1. **Postman** envía la pregunta a `/api/ai/ask`.
2. **Spring Boot** la recibe y construye los mensajes.
3. El **System Prompt** define el comportamiento: narrador infantil.
4. **RestClient** hace un `POST` HTTP a OpenRouter.
5. **OpenRouter** elige un modelo gratuito disponible (`openrouter/free`).
6. **Spring Boot** extrae `choices[0].message.content` y devuelve el texto.

## 7. Conceptos para explicar en clase

| Concepto      | Función                                     |
| ------------- | ------------------------------------------- |
| System Prompt | Define el comportamiento de la IA.          |
| User Prompt   | Contiene la pregunta del usuario.           |
| Model         | Identifica el modelo o enrutador utilizado. |
| API Key       | Autentica nuestra aplicación.               |
| RestClient    | Permite consumir la API HTTP.               |
| JSON          | Formato de intercambio de información.      |

**Experimento:** cambia el texto del mensaje `system` (por ejemplo, «Eres un profesor de historia muy serio»), reinicia y repite la misma pregunta.

## 🆘 Si algo falla

| Síntoma | Causa probable |
| ------- | -------------- |
| No arranca: `Could not resolve placeholder 'OPENROUTER_API_KEY'` | La variable no está definida en esa terminal. |
| No arranca: `Port 8080 was already in use` | Usa `mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081` y cambia el puerto en la URL. |
| Respuesta `500` y en la consola `401 Unauthorized` | La clave no es válida. |
| Respuesta `500` y en la consola `429 Too Many Requests` | Se alcanzó el límite de los modelos gratuitos: espera un poco. |
| Respuesta `500` y en la consola `NullPointerException` | Falta el campo `question`, o el modelo devolvió una respuesta sin texto. |

## 📌 Antes de usarlo en serio

Es un ejemplo didáctico. En producción hay que añadir manejo de errores, validaciones y límites de peticiones, y proteger la clave. Con modelos gratuitos usa solo datos ficticios.

**Siguiente paso:** conectar Angular a este endpoint y construir un chat con el narrador. Para ver estas mejoras paso a paso, sigue [la guía del asistente](../guia-paso-a-paso.md).
