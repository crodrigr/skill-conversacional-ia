# 🛠️ Guía paso a paso — Construye tu asistente con Spring Boot

Vas a construir **desde cero** un asistente de biblioteca. En cada paso creas unos pocos archivos, arrancas la aplicación y compruebas el resultado. El modelo corre en tu equipo con Ollama: sin claves ni costo.

| Paso | Construyes | Aprendes | Dirección |
|---|---|---|---|
| 0 | Proyecto vacío | Estructura y dependencias | — |
| 1 | Aplicación encendida | Un controlador | `GET /api/estado` |
| 2 | Chat sin ayuda | Zero-shot | `POST /api/chat` |
| 3 | Asistente con instrucciones | System prompt | `POST /api/asistente` |
| 4 | Clasificador | Few-shot | `POST /api/clasificar` |
| 5 | Comparador de textos | Embeddings | `POST /api/similitud` |
| 6 | Respuestas con documentos | Ingeniería de contexto | `POST /api/preguntar` |
| 7 | Pruebas automáticas | Comprobar tu código | `mvn test` |

**Cómo usar la guía**: 📄 = archivo nuevo (cópialo completo en esa ruta) · ➕ = agrega al final de un archivo · ▶️ = ejecutar · ✅ = comprobar.

## ✅ Requisitos

| Necesitas | Compruébalo con |
|---|---|
| Java 21 o superior | `java -version` |
| Maven | `mvn -v` |
| Ollama encendido | `ollama list` |
| Un editor (VS Code, IntelliJ) | — |

Descarga los dos modelos (solo una vez):

```bash
ollama pull llama3.2           # responde preguntas
ollama pull nomic-embed-text   # convierte texto en números
```

---

## 📁 Paso 0 — Crea el proyecto

### 0.1 Carpetas

En Linux o macOS, en la carpeta donde guardas tus proyectos (en Windows usa Git Bash):

```bash
mkdir -p asistente-biblioteca/src/main/resources
mkdir -p asistente-biblioteca/src/main/java/com/curso/asistente/{modelo,paso1,paso2,paso3,paso4,paso5,paso6}
mkdir -p asistente-biblioteca/src/test/java/com/curso/asistente
cd asistente-biblioteca
```

Desde aquí, **todas las rutas son relativas a `asistente-biblioteca/`**.

### 0.2 Dependencias

| Dependencia | Para qué |
|---|---|
| `spring-boot-starter-webmvc` | Crear direcciones web (API REST) y llamar a Ollama |
| `spring-boot-starter-test` | Escribir pruebas (paso 7) |
| `spring-boot-maven-plugin` | Ejecutar con `mvn spring-boot:run` |

No hace falta ninguna librería de IA: se habla con Ollama por HTTP.

#### 📄 Crea `pom.xml`

El archivo del proyecto: versión de Spring Boot, Java y dependencias.

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

    <groupId>com.curso</groupId>
    <artifactId>asistente-biblioteca</artifactId>
    <version>1.0.0</version>

    <properties>
        <java.version>21</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webmvc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
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

#### 📄 Crea `src/main/resources/application.properties`

La configuración. Empieza pequeña y crece en cada paso.

```properties
server.port=8080
```

#### 📄 Crea `src/main/java/com/curso/asistente/AsistenteApplication.java`

El punto de arranque de la aplicación.

```java
package com.curso.asistente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsistenteApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsistenteApplication.class, args);
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
asistente-biblioteca/
├── pom.xml ⭐
└── src/
    ├── main/
    │   ├── java/com/curso/asistente/
    │   │   └── AsistenteApplication.java ⭐
    │   └── resources/
    │       └── application.properties ⭐
    └── test/java/com/curso/asistente/
```

**▶️ Comprueba que compila** (la primera vez descarga las dependencias):

```bash
mvn compile
```

**✅ Antes de seguir**

- [ ] Termina en `BUILD SUCCESS`.

---

## 🚀 Paso 1 — Enciende la aplicación

**Idea**: un *controlador* es la clase que atiende una dirección web.

#### 📄 Crea `src/main/java/com/curso/asistente/paso1/EstadoController.java`

- `@RestController`: la clase responde peticiones web.
- `@GetMapping`: qué dirección atiende.

```java
package com.curso.asistente.paso1;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {

    @GetMapping("/api/estado")
    public Map<String, String> estado() {
        return Map.of("estado", "ok");
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
com/curso/asistente/
├── AsistenteApplication.java
└── paso1/
    └── EstadoController.java ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

> Si el puerto 8080 está ocupado, cambia `server.port` (por ejemplo, a `8095`) y usa ese número en los `curl`.

En **otra terminal**:

```bash
curl -s localhost:8080/api/estado
```

Respuesta (ejemplo de una ejecución real):

```json
{"estado":"ok"}
```

**✅ Antes de seguir**

- [ ] Ves `{"estado":"ok"}`.

---

## 💬 Paso 2 — Habla con el modelo (zero-shot)

**Idea**: envías solo la pregunta, sin instrucciones ni ejemplos.

```text
Tú → ChatController → ModeloLenguaje → OllamaModelo → Ollama (llama3.2)
```

#### ➕ Añade al final de `src/main/resources/application.properties`

Dónde está Ollama y qué modelos usar.

```properties

# Modelo local con Ollama
ollama.url=http://localhost:11434
ollama.modelo-chat=llama3.2
ollama.modelo-embedding=nomic-embed-text
```

#### 📄 Crea `src/main/java/com/curso/asistente/modelo/Mensaje.java`

Un turno de la conversación, con su rol: `system`, `user` o `assistant`.

```java
package com.curso.asistente.modelo;

/** Un turno de la conversación: role = system, user o assistant. */
public record Mensaje(String role, String content) {

    public static Mensaje sistema(String texto) {
        return new Mensaje("system", texto);
    }

    public static Mensaje usuario(String texto) {
        return new Mensaje("user", texto);
    }

    public static Mensaje asistente(String texto) {
        return new Mensaje("assistant", texto);
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/modelo/ModeloLenguaje.java`

Lo que tu aplicación le pide a un modelo: responder y convertir texto en números. Al ser una interfaz, en las pruebas puedes usar un modelo falso.

```java
package com.curso.asistente.modelo;

import java.util.List;

/** Lo que la aplicación necesita de un modelo. Así las pruebas pueden usar uno falso. */
public interface ModeloLenguaje {

    String responder(List<Mensaje> mensajes);

    double[] embedding(String texto);
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/modelo/OllamaModelo.java`

La única clase que conoce Ollama. `responder` llama a `/api/chat`; `embedding`, a `/api/embed` (lo usarás en el paso 5).

```java
package com.curso.asistente.modelo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class OllamaModelo implements ModeloLenguaje {

    private final RestClient http;
    private final String modeloChat;
    private final String modeloEmbedding;

    public OllamaModelo(@Value("${ollama.url}") String url,
                        @Value("${ollama.modelo-chat}") String modeloChat,
                        @Value("${ollama.modelo-embedding}") String modeloEmbedding) {
        this.http = RestClient.create(url);
        this.modeloChat = modeloChat;
        this.modeloEmbedding = modeloEmbedding;
    }

    @Override
    public String responder(List<Mensaje> mensajes) {
        var peticion = Map.of(
                "model", modeloChat,
                "messages", mensajes,
                "stream", false,
                // temperature 0 y semilla fija: respuestas más repetibles
                "options", Map.of("temperature", 0, "seed", 42));

        var respuesta = http.post().uri("/api/chat")
                .body(peticion)
                .retrieve()
                .body(RespuestaChat.class);

        return respuesta.message().content().strip();
    }

    @Override
    public double[] embedding(String texto) {
        var respuesta = http.post().uri("/api/embed")
                .body(Map.of("model", modeloEmbedding, "input", texto))
                .retrieve()
                .body(RespuestaEmbedding.class);

        return respuesta.embeddings().get(0);
    }

    record RespuestaChat(Mensaje message) {
    }

    record RespuestaEmbedding(List<double[]> embeddings) {
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/modelo/Validar.java`

Rechaza campos vacíos.

```java
package com.curso.asistente.modelo;

public final class Validar {

    private Validar() {
    }

    public static String texto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El campo '" + campo + "' es obligatorio");
        }
        return valor.strip();
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/modelo/ErroresController.java`

Convierte los errores en respuestas claras: 400 (dato inválido) y 503 (modelo no disponible).

```java
package com.curso.asistente.modelo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;

@RestControllerAdvice
public class ErroresController {

    @ExceptionHandler(RestClientException.class)
    ProblemDetail modeloNoDisponible(RestClientException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE,
                "No se pudo usar el modelo. ¿Está Ollama encendido y los modelos descargados?");
    }

    @ExceptionHandler(IllegalArgumentException.class)
    ProblemDetail datoInvalido(IllegalArgumentException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso2/ChatController.java`

Recibe `{"mensaje":"..."}` y devuelve `{"respuesta":"..."}`.

```java
package com.curso.asistente.paso2;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Zero-shot: solo el mensaje del usuario, sin system prompt ni ejemplos. */
@RestController
public class ChatController {

    private final ModeloLenguaje modelo;

    public ChatController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/chat")
    public Respuesta chat(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        return new Respuesta(modelo.responder(List.of(Mensaje.usuario(texto))));
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta) {
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
com/curso/asistente/
├── AsistenteApplication.java
├── modelo/
│   ├── ErroresController.java ⭐
│   ├── Mensaje.java ⭐
│   ├── ModeloLenguaje.java ⭐
│   ├── OllamaModelo.java ⭐
│   └── Validar.java ⭐
├── paso1/EstadoController.java
└── paso2/ChatController.java ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

```bash
curl -s -X POST localhost:8080/api/chat \
  -H 'Content-Type: application/json' \
  -d '{"mensaje":"¿A qué hora abre la biblioteca?"}'
```

El modelo **no sabe** de qué biblioteca hablas: da consejos generales. La primera respuesta puede tardar.

**✅ Antes de seguir**

- [ ] Recibes una respuesta del modelo.
- [ ] Con `{"mensaje":""}` recibes un error 400.

---

## 📜 Paso 3 — Dale instrucciones (system prompt)

**Idea**: el *system prompt* es el manual que el modelo recibe **antes** de la pregunta. Aquí es una plantilla con campos.

#### ➕ Añade al final de `src/main/resources/application.properties`

Los datos que cambian de una biblioteca a otra.

```properties

# Campos de la plantilla del system prompt
asistente.nombre=Casa del Libro
asistente.tono=amable y breve
asistente.horario=lunes a sábado de 9 a 18 h
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso3/PlantillaSistema.java`

Estructura fija (objetivo, tono, datos, restricciones, procedimiento) y campos `{...}` que se reemplazan.

```java
package com.curso.asistente.paso3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** System prompt con campos variables: estructura fija, datos dinámicos. */
@Component
public class PlantillaSistema {

    private static final String PLANTILLA = """
            [Objetivo]
            Eres el asistente de la biblioteca {nombre}. Respondes sobre préstamos y horarios.
            No das consejos médicos, legales ni financieros.

            [Tono y estilo]
            Tono {tono}. Responde en español, en dos frases como máximo.

            [Datos]
            Horario: {horario}.

            [Restricciones]
            No inventes datos. Si no tienes el dato, responde: "No tengo ese dato".
            Si el tema no es de la biblioteca, di que solo puedes ayudar con la biblioteca.

            [Procedimiento]
            1) Entiende la consulta. 2) Responde con los datos. 3) Ofrece más ayuda.
            """;

    private final String prompt;

    public PlantillaSistema(@Value("${asistente.nombre}") String nombre,
                            @Value("${asistente.tono}") String tono,
                            @Value("${asistente.horario}") String horario) {
        this.prompt = PLANTILLA
                .replace("{nombre}", nombre)
                .replace("{tono}", tono)
                .replace("{horario}", horario);
    }

    public String prompt() {
        return prompt;
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso3/AsistenteController.java`

Envía **dos** mensajes: el del sistema y el del usuario.

```java
package com.curso.asistente.paso3;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** El mismo mensaje del paso 2, ahora con system prompt. */
@RestController
public class AsistenteController {

    private final ModeloLenguaje modelo;
    private final PlantillaSistema plantilla;

    public AsistenteController(ModeloLenguaje modelo, PlantillaSistema plantilla) {
        this.modelo = modelo;
        this.plantilla = plantilla;
    }

    /** Solo para aprender: en una aplicación real no se expone el system prompt. */
    @GetMapping("/api/asistente/prompt")
    public String prompt() {
        return plantilla.prompt();
    }

    @PostMapping("/api/asistente")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        var mensajes = List.of(
                Mensaje.sistema(plantilla.prompt()),
                Mensaje.usuario(texto));
        return new Respuesta(modelo.responder(mensajes));
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta) {
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
com/curso/asistente/
├── …
└── paso3/
    ├── AsistenteController.java ⭐
    └── PlantillaSistema.java ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

La misma pregunta del paso 2:

```bash
curl -s -X POST localhost:8080/api/asistente \
  -H 'Content-Type: application/json' \
  -d '{"mensaje":"¿A qué hora abre la biblioteca?"}'
```

Respuesta (ejemplo de una ejecución real):

```json
{"respuesta":"La biblioteca Casa del Libro abre de lunes a sábado de 9 a 18 horas."}
```

Ahora una pregunta fuera de tema:

```bash
curl -s -X POST localhost:8080/api/asistente \
  -H 'Content-Type: application/json' \
  -d '{"mensaje":"¿Qué medicina tomo para el dolor de cabeza?"}'
```

> ⚠️ `GET /api/asistente/prompt` muestra las instrucciones solo para aprender. En una aplicación real no se expone, y nunca lleva claves.

🔧 **Pruébalo tú**: cambia `asistente.tono`, reinicia y repite.

**✅ Antes de seguir**

- [ ] Responde con el horario configurado.
- [ ] Se niega a dar consejo médico.

---

## 🏷️ Paso 4 — Enseña con ejemplos (few-shot)

**Idea**: antes de la opinión real envías ejemplos resueltos, como turnos de usuario y asistente.

#### 📄 Crea `src/main/java/com/curso/asistente/paso4/Clasificador.java`

Instrucción + 4 ejemplos + la opinión nueva. `normalizar` comprueba la salida: nunca confíes a ciegas en el modelo.

```java
package com.curso.asistente.paso4;

import java.util.ArrayList;
import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import org.springframework.stereotype.Component;

/** Few-shot: los ejemplos viajan como turnos de usuario y asistente. */
@Component
public class Clasificador {

    private static final List<String> CATEGORIAS = List.of("Positiva", "Negativa", "Neutra");

    private static final List<Mensaje> EJEMPLOS = List.of(
            Mensaje.usuario("El préstamo fue rapidísimo y me atendieron muy bien."),
            Mensaje.asistente("Positiva"),
            Mensaje.usuario("Esperé 40 minutos y nadie me ayudó."),
            Mensaje.asistente("Negativa"),
            Mensaje.usuario("La biblioteca abre de lunes a sábado."),
            Mensaje.asistente("Neutra"),
            Mensaje.usuario("No estuvo mal, aunque esperaba más."),
            Mensaje.asistente("Neutra"));

    private final ModeloLenguaje modelo;

    public Clasificador(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    public String clasificar(String opinion) {
        var mensajes = new ArrayList<Mensaje>();
        mensajes.add(Mensaje.sistema(
                "Clasifica la opinión como Positiva, Negativa o Neutra. Responde solo con la categoría."));
        mensajes.addAll(EJEMPLOS);
        mensajes.add(Mensaje.usuario(opinion));

        return normalizar(modelo.responder(mensajes));
    }

    /** El modelo puede responder de más: el código comprueba la salida. */
    static String normalizar(String salida) {
        return CATEGORIAS.stream()
                .filter(c -> salida.toLowerCase().startsWith(c.toLowerCase()))
                .findFirst()
                .orElse("Sin clasificar");
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso4/ClasificadorController.java`

La dirección web del clasificador.

```java
package com.curso.asistente.paso4;

import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasificadorController {

    private final Clasificador clasificador;

    public ClasificadorController(Clasificador clasificador) {
        this.clasificador = clasificador;
    }

    @PostMapping("/api/clasificar")
    public Resultado clasificar(@RequestBody Opinion opinion) {
        var texto = Validar.texto(opinion.opinion(), "opinion");
        return new Resultado(clasificador.clasificar(texto));
    }

    public record Opinion(String opinion) {
    }

    public record Resultado(String categoria) {
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
com/curso/asistente/
├── …
└── paso4/
    ├── Clasificador.java ⭐
    └── ClasificadorController.java ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

```bash
curl -s -X POST localhost:8080/api/clasificar \
  -H 'Content-Type: application/json' \
  -d '{"opinion":"El capuchino estaba frío y la mesa sucia."}'
```

Respuesta (ejemplo de una ejecución real):

```json
{"categoria":"Negativa"}
```

**✅ Antes de seguir**

- [ ] `Me ayudaron enseguida, excelente trato.` da `Positiva`.
- [ ] `El mostrador está en el segundo piso.` da `Neutra`.

---

## 🗺️ Paso 5 — Compara significados (embeddings)

**Idea**: cada texto se convierte en una lista de números; el *coseno* mide qué tan cerca están dos listas.

#### 📄 Crea `src/main/java/com/curso/asistente/paso5/Similitud.java`

El cálculo del coseno.

```java
package com.curso.asistente.paso5;

public final class Similitud {

    private Similitud() {
    }

    /** Similitud del coseno: cuanto más cerca de 1, más parecidos. */
    public static double coseno(double[] a, double[] b) {
        double producto = 0;
        double normaA = 0;
        double normaB = 0;
        for (int i = 0; i < a.length; i++) {
            producto += a[i] * b[i];
            normaA += a[i] * a[i];
            normaB += b[i] * b[i];
        }
        return producto / (Math.sqrt(normaA) * Math.sqrt(normaB));
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso5/SimilitudController.java`

Pide los dos vectores y los compara.

```java
package com.curso.asistente.paso5;

import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimilitudController {

    private final ModeloLenguaje modelo;

    public SimilitudController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/similitud")
    public Resultado comparar(@RequestBody Textos textos) {
        var a = modelo.embedding(Validar.texto(textos.a(), "a"));
        var b = modelo.embedding(Validar.texto(textos.b(), "b"));
        return new Resultado(a.length, Similitud.coseno(a, b));
    }

    public record Textos(String a, String b) {
    }

    public record Resultado(int dimensiones, double similitud) {
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
com/curso/asistente/
├── …
└── paso5/
    ├── Similitud.java ⭐
    └── SimilitudController.java ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

```bash
curl -s -X POST localhost:8080/api/similitud \
  -H 'Content-Type: application/json' \
  -d '{"a":"Quiero devolver un libro","b":"Quiero regresar un libro prestado"}'
```

Respuesta (ejemplo de una ejecución real):

```json
{"dimensiones":768,"similitud":0.7241411582258442}
```

Cambia `b` y compara:

| `b` | Similitud |
|---|---|
| Quiero regresar un libro prestado | 0.72 |
| Necesito regresar un préstamo | 0.53 |
| Mañana va a llover | 0.50 |

🔍 La segunda frase significa casi lo mismo y queda muy cerca de la tercera. Este modelo rinde mejor en inglés: **el modelo de embeddings importa, y el idioma también**.

**✅ Antes de seguir**

- [ ] La frase parecida puntúa más alto que la del clima.

---

## 🗂️ Paso 6 — Responde con tus documentos (contexto)

**Idea**: no envías todo; eliges los fragmentos más cercanos a la pregunta.

```text
Pregunta → vector → comparar con cada fragmento → 3 mejores
        → system prompt + fragmentos + pregunta → respuesta
```

#### ➕ Añade al final de `src/main/resources/application.properties`

Cuántos fragmentos se envían.

```properties

# Cantidad de fragmentos que entran al contexto
contexto.fragmentos=3
```

#### 📄 Crea `src/main/resources/biblioteca.txt`

Tus «documentos»: un fragmento por línea.

```text
Cada socio puede retirar hasta 3 libros a la vez.
El préstamo dura 14 días y se puede renovar una sola vez.
La multa por retraso es de 1 dólar por cada día.
Para hacerse socio se necesita un documento de identidad.
La sala de estudio tiene 40 puestos y conexión a internet.
El club de lectura se reúne los jueves a las 17 h.
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso6/BuscadorContexto.java`

Convierte los fragmentos en vectores una vez y devuelve los más cercanos.

```java
package com.curso.asistente.paso6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;

import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.paso5.Similitud;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/** Selección de contexto: solo entran los fragmentos más cercanos a la pregunta. */
@Component
public class BuscadorContexto {

    private final ModeloLenguaje modelo;
    private final int cuantos;
    private final List<String> textos;
    private List<Indexado> indice;

    public BuscadorContexto(ModeloLenguaje modelo,
                            @Value("${contexto.fragmentos}") int cuantos) throws IOException {
        this.modelo = modelo;
        this.cuantos = cuantos;
        this.textos = new ClassPathResource("biblioteca.txt")
                .getContentAsString(StandardCharsets.UTF_8)
                .lines()
                .filter(linea -> !linea.isBlank())
                .toList();
    }

    public List<Fragmento> buscar(String pregunta) {
        // nomic-embed-text pide indicar si el texto es una consulta o un documento
        var consulta = modelo.embedding("search_query: " + pregunta);
        return indice().stream()
                .map(i -> new Fragmento(i.texto(), Similitud.coseno(consulta, i.vector())))
                .sorted(Comparator.comparingDouble(Fragmento::similitud).reversed())
                .limit(cuantos)
                .toList();
    }

    /** Los documentos se convierten en vectores una sola vez, en la primera búsqueda. */
    private synchronized List<Indexado> indice() {
        if (indice == null) {
            indice = textos.stream()
                    .map(t -> new Indexado(t, modelo.embedding("search_document: " + t)))
                    .toList();
        }
        return indice;
    }

    private record Indexado(String texto, double[] vector) {
    }

    public record Fragmento(String texto, double similitud) {
    }
}
```

#### 📄 Crea `src/main/java/com/curso/asistente/paso6/ContextoController.java`

Arma el contexto y devuelve también los fragmentos usados (trazabilidad).

```java
package com.curso.asistente.paso6;

import java.util.List;
import java.util.stream.Collectors;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import com.curso.asistente.paso3.PlantillaSistema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Ingeniería de contexto: system prompt + fragmentos seleccionados + pregunta. */
@RestController
public class ContextoController {

    private final ModeloLenguaje modelo;
    private final PlantillaSistema plantilla;
    private final BuscadorContexto buscador;

    public ContextoController(ModeloLenguaje modelo, PlantillaSistema plantilla,
                              BuscadorContexto buscador) {
        this.modelo = modelo;
        this.plantilla = plantilla;
        this.buscador = buscador;
    }

    @PostMapping("/api/preguntar")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        var fragmentos = buscador.buscar(texto);

        var datos = fragmentos.stream()
                .map(f -> "- " + f.texto())
                .collect(Collectors.joining("\n"));

        var mensajes = List.of(
                Mensaje.sistema(plantilla.prompt() + "\n[Documentos]\n" + datos),
                Mensaje.usuario(texto));

        // Se devuelven los fragmentos usados: eso es trazabilidad
        return new Respuesta(modelo.responder(mensajes), fragmentos);
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta, List<BuscadorContexto.Fragmento> fragmentos) {
    }
}
```

**🌳 Así va tu proyecto** (⭐ = nuevo en este paso)

```text
src/main/
├── java/com/curso/asistente/
│   ├── …
│   └── paso6/
│       ├── BuscadorContexto.java ⭐
│       └── ContextoController.java ⭐
└── resources/
    ├── application.properties
    └── biblioteca.txt ⭐
```

**▶️ Arranca** (si ya estaba encendida, detenla antes con `Ctrl+C`):

```bash
mvn spring-boot:run
```

```bash
curl -s -X POST localhost:8080/api/preguntar \
  -H 'Content-Type: application/json' \
  -d '{"mensaje":"¿Cuánto pago si me atraso 3 días?"}'
```

Debe responder **3 dólares** y mostrar los tres fragmentos usados.

🔬 **Experimento**: pon `contexto.fragmentos=2` y repite. El fragmento de la multa queda tercero, no entra y el asistente dice que no tiene el dato: **contexto insuficiente**.

**✅ Antes de seguir**

- [ ] Responde la multa correctamente con 3 fragmentos.
- [ ] Con 2 fragmentos falla y sabes explicar por qué.

---

## 🧪 Paso 7 — Pruebas automáticas

**Idea**: con un modelo falso compruebas **tu código** sin depender de Ollama.

#### 📄 Crea `src/test/java/com/curso/asistente/AsistenteTest.java`

Cinco pruebas: plantilla, ejemplos enviados, salida inesperada, coseno y buscador.

```java
package com.curso.asistente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.paso3.PlantillaSistema;
import com.curso.asistente.paso4.Clasificador;
import com.curso.asistente.paso5.Similitud;
import com.curso.asistente.paso6.BuscadorContexto;
import org.junit.jupiter.api.Test;

/** Pruebas sin Ollama: un modelo falso permite comprobar lo que hace NUESTRO código. */
class AsistenteTest {

    static class ModeloFalso implements ModeloLenguaje {
        final List<Mensaje> recibidos = new ArrayList<>();
        String respuesta = "Positiva";

        @Override
        public String responder(List<Mensaje> mensajes) {
            recibidos.addAll(mensajes);
            return respuesta;
        }

        @Override
        public double[] embedding(String texto) {
            // Un "mapa" de dos ejes: multas y club de lectura
            var t = texto.toLowerCase();
            return new double[] {t.contains("multa") ? 1 : 0.1, t.contains("club") ? 1 : 0.1};
        }
    }

    @Test
    void laPlantillaCompletaTodosLosCampos() {
        var prompt = new PlantillaSistema("Prueba", "formal", "de 8 a 12 h").prompt();

        assertTrue(prompt.contains("biblioteca Prueba"));
        assertTrue(prompt.contains("de 8 a 12 h"));
        assertFalse(prompt.contains("{"));
    }

    @Test
    void elFewShotEnviaSistemaEjemplosYLaOpinionAlFinal() {
        var modelo = new ModeloFalso();

        var categoria = new Clasificador(modelo).clasificar("Me encantó");

        assertEquals("Positiva", categoria);
        assertEquals("system", modelo.recibidos.getFirst().role());
        assertEquals(10, modelo.recibidos.size());
        assertEquals("Me encantó", modelo.recibidos.getLast().content());
    }

    @Test
    void unaSalidaInesperadaNoSeDaPorBuena() {
        var modelo = new ModeloFalso();
        modelo.respuesta = "Creo que el cliente está contento";

        assertEquals("Sin clasificar", new Clasificador(modelo).clasificar("Me encantó"));
    }

    @Test
    void elCosenoDistingueIgualesDeDistintos() {
        assertEquals(1.0, Similitud.coseno(new double[] {1, 2}, new double[] {2, 4}), 1e-9);
        assertEquals(0.0, Similitud.coseno(new double[] {1, 0}, new double[] {0, 1}), 1e-9);
    }

    @Test
    void elBuscadorTraeSoloLosFragmentosPedidosYElMasCercanoPrimero() throws Exception {
        var fragmentos = new BuscadorContexto(new ModeloFalso(), 2).buscar("¿Cuánto es la multa?");

        assertEquals(2, fragmentos.size());
        assertTrue(fragmentos.getFirst().texto().contains("multa"));
    }
}
```

```bash
mvn test
```

Debe mostrar `Tests run: 5, Failures: 0`.

**✅ Antes de seguir**

- [ ] Las 5 pruebas pasan.

---

## 🌳 Proyecto terminado

```text
asistente-biblioteca/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/curso/asistente/
    │   │   ├── AsistenteApplication.java
    │   │   ├── modelo/   Mensaje · ModeloLenguaje · OllamaModelo · Validar · ErroresController
    │   │   ├── paso1/    EstadoController
    │   │   ├── paso2/    ChatController
    │   │   ├── paso3/    PlantillaSistema · AsistenteController
    │   │   ├── paso4/    Clasificador · ClasificadorController
    │   │   ├── paso5/    Similitud · SimilitudController
    │   │   └── paso6/    BuscadorContexto · ContextoController
    │   └── resources/    application.properties · biblioteca.txt
    └── test/java/com/curso/asistente/AsistenteTest.java
```

## 🆘 Si algo falla

| Síntoma | Qué revisar |
|---|---|
| Error 503 | ¿Ollama está encendido? ¿Aparecen los modelos en `ollama list`? |
| Error 400 | Falta un campo del JSON o está vacío |
| Error 404 | ¿Reiniciaste después de crear los archivos? |
| `Port 8080 was already in use` | Cambia `server.port` |
| `package ... does not exist` | La ruta de la carpeta no coincide con la línea `package` |
| `Could not resolve placeholder` | Falta un ➕ en `application.properties` |

## 🏁 Retos

1. Añade un campo `{idioma}` a la plantilla.
2. Añade una categoría `Pregunta` al clasificador, con sus ejemplos.
3. Agrega líneas a `biblioteca.txt` y busca una pregunta que falle.
4. Pide al asistente que muestre sus instrucciones. ¿Lo hace? ¿Qué control pondrías fuera del modelo?
