# 💡 Ejemplo 01 — ¿Qué es un system prompt?

## 🌍 Contexto

Un mismo mensaje de usuario, enviado a dos asistentes distintos, recibe respuestas muy diferentes. ¿Qué los diferencia? Algo que el usuario **no ve**.

## 🧠 Concepto

Un **system prompt** (prompt o mensaje del sistema) es la **instrucción entregada al modelo antes de cualquier mensaje del usuario**. Define el **rol**, el **comportamiento** y el **estilo** de respuesta. El **user prompt**, en cambio, es lo que el usuario escribe en cada interacción.

🔗 **Analogía**: el **manual del puesto**. Antes de abrir la ventanilla, la empresa le entrega al empleado un manual: quién es, cómo habla, qué hace y qué nunca hace. El **cliente en el mostrador** (el usuario) cambia en cada turno; el manual permanece.

## 🧭 Explicación paso a paso

**El mismo mensaje, dos asistentes**

Mensaje del usuario: *«Cuéntame algo sobre el sol.»*

| | System prompt | Respuesta |
|---|---|---|
| **Asistente A** | «Eres un narrador de cuentos para niños. Usas un tono lúdico y frases cortas.» | «¡Había una vez una estrella amarilla que se levantaba temprano para calentar el mundo!» |
| **Asistente B** | «Eres un asistente científico. Respondes con datos claros y breves.» | «El Sol es una estrella que emite luz y calor; es la fuente principal de energía de la Tierra.» |

> ⚠️ Respuestas simuladas — ilustrativas, no son la salida de un modelo real.

El **mensaje del usuario es idéntico**. Cambió el system prompt.

**¿Qué significa «oculto»?**

- El usuario **normalmente no lo ve**.
- Pero **no es inviolable**: puede inferirse o incluso extraerse con ciertas preguntas.
- Por eso **no se incluyen secretos** (claves, contraseñas, datos personales). Lo verás en el [Ejemplo 08](08-probar-y-reforzar.md).

**Cuatro ejemplos por caso de uso**

| Caso de uso | System prompt (ficticio) | Qué fija |
|---|---|---|
| 🧑‍💼 **Asistente general** | «Eres un asistente útil y bien informado. Responde preguntas de manera concisa y clara.» | Rol y estilo |
| 📖 **Escritura creativa** | «Eres una IA especializada en narración. Creas historias breves, atractivas e imaginativas, con un tono lúdico.» | Rol y tono |
| 💻 **Programación** | «Eres una IA que ayuda a desarrolladores a escribir código limpio y eficiente. Das explicaciones claras y sigues buenas prácticas.» | Rol y criterio |
| 🛎️ **Atención al cliente** | «Eres un agente de soporte profesional y educado. Respondes con empatía y ofreces soluciones claras.» | Rol, tono y actitud |

## ✅ Resultado esperado

El estudiante define system prompt, lo distingue del user prompt, y reconoce qué rol y tono fija cada ejemplo.

## 🎲 Dinámica: El mismo mensaje, dos asistentes / ¿De qué asistente es?

Se leen las dos respuestas sobre el sol y el grupo adivina qué fijó el sistema. Luego se unen cuatro system prompts con su caso de uso.
