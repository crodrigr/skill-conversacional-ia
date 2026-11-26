# 💡 Ejemplo 07 — Limitaciones y puente

## 🌍 Contexto

El prompting es el primer paso para personalizar un asistente: es barato e inmediato. Pero tiene límites que conviene conocer.

## 🧠 Concepto

Los ejemplos **orientan** al modelo, pero **no le dan conocimiento nuevo** ni lo cambian de forma permanente.

🔗 **Analogía**: una nota de encargo ayuda al empleado a hacer bien la tarea, pero no le enseña lo que **no sabe** (por ejemplo, el stock de hoy).

## 🧭 Explicación paso a paso

**Cinco limitaciones**

| Limitación | Qué significa |
|---|---|
| 🪟 **Ventana de contexto** | El prompt, los ejemplos y la respuesta deben caber en un espacio limitado |
| 🎛️ **Sensibilidad** | Cambiar palabras o el **orden** de los ejemplos puede cambiar la respuesta |
| 🎲 **Variabilidad** | Con el mismo prompt, la respuesta puede variar entre intentos |
| 🌫️ **Alucinaciones** | Si no sabe, puede inventar algo que suena bien |
| 📚 **Conocimiento ausente** | Si el dato no está en el prompt ni en lo que aprendió, no lo sabrá |

**Qué hacer**

- Probar con **varios casos** (no solo uno) y repetir la prueba.
- Pedir explícitamente: "**si no sabes, di que no lo sabes**".
- Dar los datos necesarios **dentro del prompt** (contexto).

**🌉 Puente: cuando el prompt no alcanza**

| Si el modelo necesita… | Entonces… |
|---|---|
| **Tus datos** (manuales, catálogo, políticas largas) | **RAG**: consultar los documentos antes de responder |
| **Cambiar su comportamiento de fondo** | **Ajuste fino**: entrenarlo con ejemplos propios |

Se verán en secciones posteriores. El orden habitual es: **primero prompt, luego RAG, y solo si hace falta, ajuste fino.**

**Qué viene después en prompting** (solo mención)

- Pedir que **razone paso a paso**.
- Pedir que **verifique** su respuesta.
- **Dividir** una tarea grande en pasos.

## ✅ Resultado esperado

El estudiante nombra tres limitaciones del prompting y sabe cuándo pasar a RAG.

## 🎲 Dinámica: ¿Prompt o RAG?

Se leen tres situaciones y el grupo decide si basta un buen prompt o se necesita consultar documentos propios.
