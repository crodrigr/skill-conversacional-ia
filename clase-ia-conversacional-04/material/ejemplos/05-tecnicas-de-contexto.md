# 💡 Ejemplo 05 — Técnicas de contexto

## 🌍 Contexto

El asistente del LMS ficticio recibe preguntas sobre un manual de 120 páginas y mantiene charlas de 20 mensajes. No todo cabe ni todo sirve.

## 🧠 Concepto

Seis técnicas ayudan a que **entre al contexto solo lo útil**: **selección**, **compresión**, **recuperación**, **ampliación de la consulta**, **ejemplos en contexto** y **aislamiento**. LangChain agrupa las estrategias comunes en cuatro: **escribir, seleccionar, comprimir y aislar** contexto. Además, el contexto **se evalúa**.

🔗 **Analogía**: cuidar el escritorio: dejar encima solo las hojas útiles, resumir una pila en una nota, ir al archivo por la carpeta correcta y guardar en el sótano lo pesado.

## 🧭 Explicación paso a paso

**1. Selección**

| ❌ Incorrecto | ✅ Correcto |
|---|---|
| Enviar el manual completo | Enviar solo la sección «Crear un curso» si la pregunta es cómo crear un curso |

Reduce ruido, mejora la precisión y baja el costo.

**2. Compresión**

```text
Historial completo: 20 mensajes sobre el diseño de un LMS.

Contexto comprimido:
El usuario diseña un LMS. Ya definió cursos, estudiantes, matrículas y
evaluación. Ahora quiere estandarizar el módulo de notas.
```

**3. Recuperación (la idea de RAG)**

RAG (*Retrieval-Augmented Generation*) significa **recuperar información externa antes de responder**.

```text
Pregunta → búsqueda en los documentos → fragmentos relevantes
        → se arma el contexto → respuesta basada en esos fragmentos
```

Aquí solo se presenta la idea; su desarrollo queda para otra sección.

**4. Ampliación de la consulta**

Mejorar la pregunta antes de buscar (ver [Ejemplo 03](03-embeddings-y-espacio-semantico-para-el-contexto.md)).

**5. Ejemplos en contexto (few-shot)**

Incluir ejemplos para mostrar el patrón esperado (ver la clase de prompt engineering).

```text
Ejemplo 1: "crear usuario"  → explicación paso a paso con validaciones.
Ejemplo 2: "eliminar curso" → explicación con advertencias de integridad.
Nueva tarea: explicar cómo matricular a un estudiante.
```

**6. Aislamiento**

No mostrar todo al modelo: guardar fuera lo pesado y exponer solo lo necesario.

| 🗄️ Fuera del contexto (estado interno) | 👁️ Visible para el modelo |
|---|---|
| Lista completa de documentos | Resumen relevante |
| Resultados intermedios | La instrucción actual |
| Archivos pesados | Los fragmentos necesarios |
| Datos históricos | |

**Evaluar el contexto**

No basta con suponer que más información da mejores respuestas. Se miden: precisión, relevancia del contexto, tokens consumidos, tiempo, costo, errores, alucinaciones y satisfacción del usuario. Si no se mide, no se sabe si mejora o empeora.

## ✅ Resultado esperado

El estudiante explica las seis técnicas con un ejemplo y decide qué se queda dentro y qué fuera del contexto.

## 🎲 Dinámica: Resume el historial / ¿Dentro o fuera?

Se entrega un historial de 8 mensajes para resumir en 2 líneas. Luego se reparten 8 objetos (manual completo, pregunta actual, resumen, resultados intermedios...) para colocar «dentro» o «fuera».
