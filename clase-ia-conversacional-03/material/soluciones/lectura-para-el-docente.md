# 🧑‍🏫 Lectura para el docente — Prompt Engineering Avanzado

> Material solo para el docente. Está escrito en lenguaje sencillo: si lo lees una vez (≈ 35 minutos), podrás dictar la sección con tranquilidad.

## 🎯 Cómo usar esta lectura

1. Lee primero **"La idea en una página"**.
2. Antes de cada bloque, lee su sección: *lo esencial*, *lo que puedes decir en voz alta*, *errores comunes* y *si te preguntan…*.
3. Ten a mano el [glosario](../ejemplos/glosario.md).
4. **No necesitas saber más** de lo que está aquí. Para lo que no sepas, ve a "Cuando no sepas".

## 🧭 La idea en una página

- Un **prompt** es lo que le entregas al modelo: la instrucción y la información. **Cómo pides cambia lo que obtienes.**
- Hay tres niveles de ayuda: **zero-shot** (sin ejemplos), **one-shot** (un ejemplo) y **few-shot** (varios ejemplos). *Shot* significa "ejemplo" o "disparo".
- Los ejemplos sirven para **mostrar** lo que quieres: el formato, el tono o el criterio.
- El modelo **no aprende para siempre**: usa los ejemplos mientras dura la conversación.
- Más ejemplos dan más control, pero **cuestan más** y no siempre mejoran. Empieza simple.
- Si el modelo necesita **tus datos**, el prompt no basta: el siguiente paso es **RAG**.

---

## 🌍 B1 · El prompt

### 🔑 Lo esencial

- Un prompt es la **nota de encargo** que le dejas al modelo.
- Cinco piezas ayudan: **rol** (quién eres), **tarea** (qué hacer), **contexto** (qué debes saber), **formato** (cómo entregar) y **restricciones** (qué evitar).
- No hacen falta siempre las cinco. Es una **lista de verificación**.

### 🗣️ Lo que puedes decir en voz alta

- "Si le dices a un empleado nuevo 'haz algo con el café', no sabrá qué hacer. Con una nota clara, acierta."
- "La diferencia entre las dos respuestas no es el modelo: es el pedido."

### ⚠️ Errores comunes

- Creer que hay una **fórmula mágica** que siempre funciona.
- Pensar que un prompt largo es **mejor** por ser largo. Es mejor si es **claro**.
- Pensar que el modelo "sabe" lo que no le dijiste.

### ❓ Si te preguntan…

- **¿Importa el idioma?** Funciona en español; conviene probar. No des garantías.
- **¿Qué es un rol?** Una instrucción como "eres bibliotecario amable". Ayuda a fijar el tono y el enfoque.
- **¿Es lo mismo que programar?** No: se escribe en lenguaje natural.

---

## 🌍 B2 · Zero-shot

### 🔑 Lo esencial

- Zero-shot es pedir **sin ejemplos**. Es lo que haces casi siempre.
- Funciona bien con tareas **comunes**: traducir, resumir, explicar, reescribir.
- Falla cuando el formato o el criterio son **propios** de tu negocio.
- Antes de añadir ejemplos, **mejora el prompt**: rol, contexto, formato.

### 📚 Ficha verificada

- La idea de que un modelo de lenguaje haga tareas **sin entrenamiento específico** (zero-shot) aparece en el informe de **GPT-2** (*Language Models are Unsupervised Multitask Learners*, Radford, Wu, Child, Luan, Amodei y Sutskever, OpenAI, 2019).

### 🗣️ Lo que puedes decir en voz alta

- "Zero significa cero ejemplos: solo la instrucción."
- "Si el modelo te devuelve algo razonable pero no con tu formato, es hora de mostrarle un ejemplo."

### ⚠️ Errores comunes

- Creer que zero-shot es "peor". Es **suficiente** para muchas tareas, y más barato.
- Pedir una clasificación sin decir **las categorías**.

### ❓ Si te preguntan…

- **¿Por qué funciona sin ejemplos?** Porque el modelo vio muchísimo texto y ya "conoce" tareas comunes.

---

## 🌍 B3 · One-shot

### 🔑 Lo esencial

- One-shot añade **un ejemplo**: una entrada y la salida que esperas.
- El ejemplo fija el **formato**, el **tono** o el **criterio**.
- Riesgo: el modelo puede **copiar** el ejemplo de más (por ejemplo, repetir un dato que no corresponde).

### 🗣️ Lo que puedes decir en voz alta

- "Es como decirle al empleado: hazlo así, mira este caso."
- "Si el ejemplo es raro, el resultado también será raro."

### ⚠️ Errores comunes

- Elegir un ejemplo **extremo o raro** como único modelo.
- Pensar que "uno es poco" siempre: para fijar un formato, a menudo basta.

### ❓ Si te preguntan…

- **¿Cómo evito que copie?** Con una instrucción ("si falta un dato, escribe *sin dato*") o con más ejemplos distintos.

---

## 🌍 B4 · Few-shot

### 🔑 Lo esencial

- Few-shot son **varios ejemplos** antes de la tarea. Patrón: instrucción → ejemplos → nueva entrada.
- Sirve para enseñar un **criterio propio**.
- Los buenos ejemplos son **variados, correctos, con el mismo formato, equilibrados y con un caso difícil**.
- El modelo **no aprende para siempre**: usa los ejemplos como contexto en esa conversación. Eso se llama **aprendizaje en contexto**.

### 📚 Ficha verificada

- *Language Models are Few-Shot Learners* (Tom B. Brown y otros, principalmente de OpenAI; 28 de mayo de 2020; NeurIPS 2020).
- Presenta **GPT-3** y lo usa **sin actualizar sus parámetros ni ajustarlo**: la tarea y los ejemplos se dan solo como texto.
- Distingue **zero-shot, one-shot y few-shot** según **cuántos ejemplos** se dan al usar el modelo, y llama **aprendizaje en contexto** a lo que hace el modelo.
- **No des cifras** del tamaño del modelo ni de su rendimiento.

### 🗣️ Lo que puedes decir en voz alta

- "Few-shot es darle al empleado varios casos del manual para que vea el patrón."
- "Si el manual se contradice, el empleado se confunde: lo mismo le pasa al modelo."
- "Mañana, sin la nota, ya no se acuerda."

### ⚠️ Errores comunes

- Pensar que el modelo **ha sido entrenado** con tus ejemplos: **no**; eso sería ajuste fino.
- Pensar que **más ejemplos** siempre es mejor.
- Poner todos los ejemplos de una sola categoría.

### ❓ Si te preguntan…

- **¿Cuántos ejemplos?** Para tareas simples, de 3 a 6 bien elegidos suele bastar. Es una orientación: lo importante es **probar**.
- **¿El orden importa?** A veces sí; conviene probar con otro orden.
- **¿Se puede guardar el aprendizaje?** No: los ejemplos hay que incluirlos de nuevo en cada conversación.

---

## 🌍 B5 · Comparación, límites y cierre

### 🔑 Lo esencial

- Zero → one → few: **más control, más costo**. Empieza simple y sube si hace falta.
- Tarea común → zero. Formato o tono → one. Criterio propio → few.
- Límites: **ventana de contexto**, **sensibilidad al orden y a la redacción**, **variabilidad**, **alucinaciones**, **no sabe lo que no sabe**.
- **Puente**: si necesitas tus datos → **RAG**; si necesitas cambiar su conducta de fondo → **ajuste fino**. Se ven más adelante.
- Menciona, sin desarrollar, que hay otras técnicas (razonar paso a paso).

### 🗣️ Lo que puedes decir en voz alta

- "Primero el prompt, luego RAG, y solo si hace falta, ajuste fino."
- "Si el asistente no sabe, que lo diga. Le podemos pedir eso en el prompt."

### ⚠️ Errores comunes

- Creer que con un buen prompt el asistente **ya sabe todo** de tu negocio.
- Creer que el modelo **nunca** inventa si se lo pides.

### ❓ Si te preguntan…

- **¿Qué es RAG?** Consultar documentos propios antes de responder, como un examen a libro abierto.
- **¿Qué es ajuste fino?** Entrenar el modelo con ejemplos propios. No se verá hoy.
- **¿Cuántos tokens caben?** Depende del modelo; no des una cifra.

---

## 🆘 Cuando no sepas

- "Buena pregunta. No tengo ese detalle a mano; lo verificamos y lo traemos en la próxima clase."
- "Eso depende del modelo; lo importante es **probar con varios casos**."
- "No quiero inventar una cifra: prefiero decir que no la sé."
- Para dudas técnicas, vuelve a la **idea en una página** y al [glosario](../ejemplos/glosario.md).
