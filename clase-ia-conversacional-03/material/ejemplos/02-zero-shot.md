# 💡 Ejemplo 02 — Zero-shot

## 🌍 Contexto

Primer nivel de ayuda: **solo la instrucción, sin ejemplos**. Es lo que hace casi todo el mundo al usar un asistente.

## 🧠 Concepto

**Zero-shot prompting** es pedir una tarea al modelo **sin darle ningún ejemplo** de cómo se hace. Funciona porque el modelo vio muchísimo texto y ya "conoce" tareas comunes. (El término *zero-shot* fue usado en los informes de GPT-2 y GPT-3 de OpenAI; ver la [lectura para el docente](../soluciones/lectura-para-el-docente.md).)

🔗 **Analogía**: al empleado nuevo le dices "traduce esta frase" y lo hace: es una tarea que ya conoce, no necesita ver un caso antes.

## 🧭 Explicación paso a paso

**Tres zero-shot que funcionan**

| # | Prompt | Por qué funciona |
|---|---|---|
| 1 | `Traduce al inglés: "Nos vemos mañana a las cinco."` | Tarea común, clara y acotada |
| 2 | `Resume en dos frases, para un cliente, el siguiente texto: [texto]` | Dice **cuánto** y **para quién** |
| 3 | `Eres asistente de una biblioteca. Explica en tres pasos cómo renovar un libro. Tono amable, sin tecnicismos.` | Tiene rol, formato y restricciones |

**Dos zero-shot que fallan**

| # | Prompt | Qué falla |
|---|---|---|
| 1 | `Hazlo mejor.` | No dice qué ni cómo: sin tarea ni contexto |
| 2 | `Clasifica este comentario: "El capuchino llegó tibio."` | No dice **qué categorías** ni **en qué formato** |

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Es un comentario sobre una bebida que no estaba lo bastante caliente...
```

El modelo respondió algo razonable, pero **no la etiqueta que el negocio necesitaba** (por ejemplo, "Negativa"). Ese es el límite del zero-shot: cuando el formato o el criterio son **propios**, la instrucción sola no alcanza.

**Cuándo basta y cuándo no**

- ✅ Basta: traducir, resumir, explicar, reescribir, ideas generales.
- ❌ No basta: formatos propios, criterios del negocio, etiquetas fijas, tono muy específico.

## ✅ Resultado esperado

El estudiante redacta un zero-shot con rol, tarea, contexto y formato, y reconoce cuándo falta un ejemplo.

## 🎲 Dinámica: ¿Basta con pedirlo? / Mejora el prompt

Se muestran cinco tareas y se vota "basta con pedirlo" o "falta un ejemplo". Luego los equipos mejoran el prompt vago "Hazlo mejor".
