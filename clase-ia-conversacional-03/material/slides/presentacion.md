# Prompt Engineering Avanzado

Módulo 02 · Personalización de un Sistema Experto

---

# 🎯 ¿Qué lograrás hoy?

- Escribir mejores prompts
- Usar zero-shot, one-shot y few-shot
- Diseñar buenos ejemplos
- Elegir el nivel según la tarea

---

# 📅 La ruta de hoy

| Parte | Tiempo |
|---|---|
| ✍️ El prompt | 20 min |
| 🟦 Zero-shot | 25 min |
| 🟨 One-shot | 20 min |
| 🟩 Few-shot | 30 min |
| 📊 Comparar, límites y quiz | 25 min |
| 🛠️ Taller | 60 min |

---

# 🎲 Pedir mal vs. pedir bien

La misma tarea, dos pedidos.

**¿Cuál respuesta es mejor y por qué?**

⏱️ 7 minutos

---

# 🔁 Antes de empezar

- 🤖 **LLM**: predice la siguiente palabra
- 🧩 **Token**: un trozo de texto
- 🪟 **Ventana de contexto**: cuánto cabe a la vez

---

# ✍️ ¿Qué es un prompt?

Todo lo que le entregas al modelo:
la **instrucción** y la **información**.

🔗 Es la **nota de encargo** del empleado nuevo.

---

# 🧱 Cinco piezas de un buen prompt

🎭 **Rol** · 🎯 **Tarea** · 📚 **Contexto**
📐 **Formato** · 🚫 **Restricciones**

Una lista de verificación, no una regla fija.

---

# 🎲 Arma el prompt

Ordena las tarjetas: **rol, tarea, contexto, formato, restricciones**.

Luego léelo en voz alta.

⏱️ 4 minutos

---

# 🟦 Zero-shot

Pedir **sin ejemplos**.

> "Traduce al inglés: *Nos vemos mañana.*"

🔗 *"Hazlo."*

---

# ✅ ¿Cuándo basta?

Tareas **comunes** que el modelo ya conoce:

traducir · resumir · explicar · reescribir

---

# 🎲 ¿Basta con pedirlo?

Cinco tareas.

Vota: 👍 **basta** · ✋ **falta un ejemplo**

⏱️ 4 minutos

---

# 👍 Un buen zero-shot

```text
Eres bibliotecario amable.
Explica en 3 pasos cómo renovar un libro.
Sin tecnicismos.
```

Rol, tarea, formato y restricción.

---

# 👎 Un mal zero-shot

> "Hazlo mejor."
> "Clasifica este comentario."

¿Qué? ¿Cómo? ¿En qué formato?

---

# 🎲 Mejora el prompt

Equipos: reescriban **"Hazme una oferta"** con al menos 4 piezas.

⏱️ 6 minutos

---

# 🚧 El límite del zero-shot

Cuando el **formato** o el **criterio** son propios, la instrucción sola **no alcanza**.

Falta mostrar **cómo**.

---

# 🟨 One-shot

Un **ejemplo** antes de la tarea.

🔗 *"Hazlo **como este caso**."*

---

# ↔️ Sin ejemplo vs. con ejemplo

| Zero-shot | One-shot |
|---|---|
| Frase libre | `Marta Gil \| café molido \| 3 \| viernes` |

El ejemplo **fija el formato**.

---

# 🎲 ¿Qué copió el modelo?

Dos salidas. Un ejemplo.

**¿Qué se copió del ejemplo?**

⏱️ 4 minutos *(prescindible)*

---

# 🎯 ¿Qué fija un ejemplo?

📐 **Formato**
🗣️ **Tono**
⚖️ **Criterio**

---

# ⚠️ El riesgo: la copia

Con **un solo** ejemplo, el modelo puede copiarlo de más.

Se reduce con una instrucción o **más ejemplos**.

---

# 🎲 Elige el mejor ejemplo

Tres candidatos. Un voto.

**¿Cuál enseña mejor la tarea?**

⏱️ 4 minutos

---

# 🟩 Few-shot

**Varios** ejemplos antes de la tarea.

🔗 *"Mira los **casos del manual** y resuelve el siguiente."*

---

# 🧩 El patrón

```text
1. Instrucción
2. Ejemplos (entrada → salida)
3. Nueva entrada
```

---

# 🕰️ De dónde viene

**GPT-3** (OpenAI, 2020):
usado **sin reentrenarlo**,
solo con ejemplos en el texto.

---

# 🎲 Completa el patrón

Un few-shot con la última salida en blanco.

**¿Qué responderá el modelo?**

⏱️ 4 minutos

---

# 🧠 Aprendizaje en contexto

Usa los ejemplos **solo en esta conversación**.

❌ **No cambia sus parámetros.**
❌ **No lo recuerda mañana.**

---

# ✅ Buenos ejemplos

🌈 Variados · ✅ Correctos · 📐 Mismo formato
🧗 Un caso difícil · ⚖️ Equilibrados · ✂️ Breves

---

# ❌ Errores comunes

Contradictorios · de una sola categoría
formatos distintos · solo casos fáciles
etiqueta equivocada · demasiado largos

---

# 🎲 Caza errores

Lista de ejemplos con **trampas**.

**¿Cuántas encuentran?**

⏱️ 6 minutos

---

# 🔢 ¿Cuántos ejemplos?

Pocos y buenos: **3 a 6** suele bastar.

Más ejemplos = más **costo** y menos ayuda.

---

# 🎲 ¿Cuántos bastan?

Voten: **1 · 3 · 6 · 20**

¿Qué pasa al subir?

⏱️ 3 minutos *(prescindible)*

---

# 📊 Los tres niveles

| | Zero | One | Few |
|---|---|---|---|
| Ejemplos | 0 | 1 | 2+ |
| Control | Bajo | Medio | Alto |
| Costo | Menor | Medio | Mayor |

---

# 🎲 Ordena las tarjetas

De **menos a más ayuda**:

zero → one → few

Y su costo.

⏱️ 4 minutos

---

# 🧭 ¿Cuál elegir?

1. Tarea común → **zero**
2. Solo formato o tono → **one**
3. Criterio propio → **few**

Empieza simple y **sube si hace falta**.

---

# 🧪 Tres casos

**A.** Resumir una nota
**B.** Pasar correos a una línea fija
**C.** Clasificar quejas con reglas propias

---

# 🚧 Límites

🪟 Ventana de contexto · 🎛️ Sensible al orden
🎲 Varía entre intentos · 🌫️ Alucina
📚 No sabe lo que no sabe

---

# 🌉 Y después…

**Tus datos** → RAG
**Cambiar su conducta** → ajuste fino

Primero **prompt**, luego RAG.

---

# 🔭 Qué viene después

- Razonar paso a paso
- Pedir que verifique
- Dividir la tarea

---

# 📌 Lo que te llevas

- Prompt = nota de encargo
- Zero: sin ejemplos · One: 1 · Few: varios
- Buenos ejemplos > más ejemplos
- No aprende para siempre
- Empieza simple

---

# ❓ Quiz relámpago

10 preguntas · 6 minutos

---

# 🛠️ Ahora, el taller

Equipos de 3–4 · 4 retos · 60 minutos
