# 💡 Ejemplo 02 — Roles y contexto de la conversación

## 🌍 Contexto

Una conversación con un modelo no es un solo mensaje, sino un **intercambio de turnos**. ¿Quién habla en cada uno y qué ve el modelo cada vez?

## 🧠 Concepto

En una conversación hay **tres roles**: **sistema** (las reglas), **usuario** (quien pregunta) y **asistente** (el modelo que responde). Se alternan usuario y asistente; el sistema va **primero**. En cada turno se incluye el **historial relevante** para que el modelo mantenga el contexto.

🔗 **Analogía**: el manual (sistema), el cliente en el mostrador (usuario) y el empleado (asistente). El empleado, para no repetirse ni contradecirse, **relee el cuaderno de la atención** antes de contestar.

## 🧭 Explicación paso a paso

**El ciclo de mensajes (esquema propio, para leer)**

```text
[SISTEMA]    Eres asistente de la biblioteca Casa del Libro. Responde breve.
[USUARIO]    ¿Cuántos libros puedo llevar?
[ASISTENTE]  Hasta 3 libros a la vez.
[USUARIO]    ¿Y por cuántos días?
[ASISTENTE]  El préstamo dura 14 días.
[USUARIO]    ¿Y si me paso?
[ASISTENTE]  ...
```

**Los tres roles**

| Rol | Quién es | Qué hace |
|---|---|---|
| 🛡️ **Sistema** | Quien construye el asistente | Fija reglas, tono y límites; va primero |
| 🙋 **Usuario** | Quien lo usa | Pregunta, pide, explora; dirige la conversación |
| 🤖 **Asistente** | El modelo | Responde con coherencia, usando el historial y las reglas |

**Cómo lo implementan los proveedores**

La forma exacta cambia: en la API de Anthropic, el mensaje del sistema se envía como un **parámetro aparte** que fija el rol; en la de OpenAI existen roles `system` y, en modelos recientes, `developer`. La idea general es la misma: **instrucciones del sistema + turnos alternados de usuario y asistente**. En esta clase usamos los **tres nombres generales**.

**Preservación del contexto**

- El modelo, por sí mismo, **no recuerda** la conversación anterior: en cada turno se le **envía de nuevo** el historial relevante.
- Gracias a eso: ✅ reconoce los temas ya tratados, ✅ evita contradecirse, ✅ responde acorde con la evolución del diálogo.
- No todo el historial hace falta: se envía **lo relevante** o un **resumen** (ver la clase de ingeniería de contexto).

## ✅ Resultado esperado

El estudiante marca quién dijo qué en una conversación y explica por qué se reenvía el historial.

## 🎲 Dinámica: ¿Quién dijo qué? / ¿Qué se reenvía?

Se reparten líneas de una conversación para que los equipos las etiqueten (sistema, usuario, asistente). Luego deciden qué partes del historial reenviar para responder la última pregunta.
