# 📚 Explicación conceptual — Prompt Engineering Avanzado

## 🎯 Objetivo

Entender, sin programar, cómo redactar prompts zero-shot, one-shot y few-shot, diseñar buenos ejemplos y elegir el nivel adecuado para personalizar un asistente.

---

## 🌍 B1 · El prompt

### 🧠 Concepto: Prompt

Un **prompt** es todo lo que le entregas al modelo: la **instrucción** y la **información** que necesita.

- La forma de pedir cambia la calidad de la respuesta.
- Un pedido vago deja que el modelo adivine; uno claro lo guía.
- No es magia: el modelo predice texto a partir de lo que recibe.

🔗 **Analogía**: la **nota de encargo** que le dejas a un empleado nuevo.

📎 Ver en la práctica: [Ejemplo 01 — El prompt y su estructura](01-el-prompt-y-su-estructura.md)

### 🧠 Concepto: Estructura de un buen prompt

Cinco piezas ayudan a redactar: **rol**, **tarea**, **contexto**, **formato** y **restricciones**.

- No siempre hacen falta las cinco: son una lista de verificación.
- El contexto es lo que más suele faltar.
- Se pueden combinar en un texto corrido o en líneas separadas.

🔗 **Analogía**: una **receta**: ingredientes (contexto), pasos (tarea), presentación (formato) y lo que no lleva (restricciones).

📎 Ver en la práctica: [Ejemplo 01 — El prompt y su estructura](01-el-prompt-y-su-estructura.md)

---

## 🌍 B2 · Zero-shot

### 🧠 Concepto: Zero-shot

**Zero-shot** es pedir una tarea **sin ningún ejemplo**.

- Funciona con tareas comunes: traducir, resumir, explicar.
- Falla cuando el formato o el criterio son propios.
- Se mejora con rol, contexto y formato, antes de pensar en ejemplos.

🔗 **Analogía**: decirle al empleado **«hazlo»** en una tarea que ya conoce.

📎 Ver en la práctica: [Ejemplo 02 — Zero-shot](02-zero-shot.md)

---

## 🌍 B3 · One-shot

### 🧠 Concepto: One-shot

**One-shot** es dar **un solo ejemplo** (entrada y salida) antes de la tarea real.

- El ejemplo fija el formato, el tono o el criterio.
- Es barato: añade pocas líneas.
- Riesgo: el modelo puede copiar el ejemplo de más.

🔗 **Analogía**: decirle **«hazlo como este caso»** y mostrarle uno resuelto.

📎 Ver en la práctica: [Ejemplo 03 — One-shot](03-one-shot.md)

---

## 🌍 B4 · Few-shot

### 🧠 Concepto: Few-shot

**Few-shot** es dar **varios ejemplos** antes de la tarea real, con el patrón instrucción → ejemplos → nueva entrada.

- Sirve para enseñar un criterio propio: clasificar, etiquetar, un estilo.
- Su nombre se popularizó con el informe de GPT-3 (OpenAI, 2020).
- Más ejemplos cuestan más y ayudan cada vez menos.

🔗 **Analogía**: darle al empleado **varios casos del manual** y pedirle que resuelva el siguiente.

📎 Ver en la práctica: [Ejemplo 04 — Few-shot](04-few-shot.md)

### 🧠 Concepto: Aprendizaje en contexto

El **aprendizaje en contexto** es la capacidad del modelo de adaptarse a lo que muestran los ejemplos del prompt **sin cambiar sus parámetros**.

- Dura solo esa conversación.
- Si los ejemplos no se incluyen de nuevo, el modelo no los recuerda.
- No es entrenar el modelo: eso sería ajuste fino.

🔗 **Analogía**: la **nota de hoy**: la sigue hoy, pero mañana sin la nota no la recuerda.

📎 Ver en la práctica: [Ejemplo 04 — Few-shot](04-few-shot.md)

### 🧠 Concepto: Diseño de ejemplos y errores comunes

Un few-shot es tan bueno como sus ejemplos: **variados, correctos, con el mismo formato, equilibrados y con un caso difícil**.

- Errores: contradictorios, de una sola categoría, formatos distintos, solo casos fáciles, etiqueta equivocada, demasiado largos.
- El orden puede influir en la respuesta: conviene probar.
- Con 3 a 6 ejemplos bien elegidos suele bastar para tareas simples.

🔗 **Analogía**: el **manual del empleado**: si se contradice, el empleado se confunde.

📎 Ver en la práctica: [Ejemplo 05 — Diseñar buenos ejemplos](05-disenar-buenos-ejemplos.md)

---

## 🌍 B5 · Comparación, límites y cierre

### 🧠 Concepto: Elegir un nivel

Se elige entre **control**, **costo** y **riesgo**: empieza por el nivel más simple y sube solo si hace falta.

- Tarea común → zero-shot.
- Solo formato o tono → one-shot.
- Criterio propio → few-shot.

🔗 **Analogía**: pedir ayuda: con un experto basta decir «hazlo»; con alguien nuevo en reglas propias, muestras casos.

📎 Ver en la práctica: [Ejemplo 06 — Comparar y elegir](06-comparar-y-elegir.md)

### 🧠 Concepto: Limitaciones del prompting

Los ejemplos **orientan** al modelo, pero no le dan conocimiento nuevo ni lo cambian de forma permanente.

- Ventana de contexto limitada.
- Sensibilidad a la redacción y al orden; variabilidad entre intentos.
- Puede alucinar; no sabe lo que no está en el prompt.

🔗 **Analogía**: la nota de encargo: ayuda a hacer bien la tarea, pero no enseña lo que no se sabe.

📎 Ver en la práctica: [Ejemplo 07 — Limitaciones y puente](07-limitaciones-y-puente.md)

### 🧠 Concepto: 🌉 Puente: RAG y ajuste fino

Cuando el prompt no alcanza hay dos caminos: **RAG** (tus datos) y **ajuste fino** (cambiar el comportamiento de fondo).

- Primero prompt, luego RAG, y solo si hace falta, ajuste fino.
- Se verán en secciones posteriores.
- Otras técnicas de prompting (razonar paso a paso) también existen.

🔗 **Analogía**: pasar de la nota de encargo a darle al empleado **la biblioteca de la empresa**.

📎 Ver en la práctica: [Ejemplo 07 — Limitaciones y puente](07-limitaciones-y-puente.md)

### 🧠 Concepto: Personalizar un asistente

Se combina **contexto del negocio**, **rol** y, si hace falta, **ejemplos** del estilo y el criterio.

- Los datos del negocio van dentro del prompt.
- Los ejemplos enseñan también qué hacer cuando no hay dato.
- Si el contexto no cabe, hace falta RAG.

🔗 **Analogía**: la **hoja de bienvenida** del empleado nuevo.

📎 Ver en la práctica: [Ejemplo 08 — El asistente de «Tienda La Esquina»](08-asistente-tienda-la-esquina.md)

---

## 📌 Resumen

- El **prompt** es la nota de encargo; con **rol, tarea, contexto, formato y restricciones** pides mejor.
- **Zero-shot**: sin ejemplos · **One-shot**: uno · **Few-shot**: varios.
- Un buen ejemplo es variado, correcto, consistente y equilibrado.
- El modelo **no aprende para siempre**: usa los ejemplos como contexto.
- Empieza por lo simple; si necesitas **tus datos**, el siguiente paso es RAG.
