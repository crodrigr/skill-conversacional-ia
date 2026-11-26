# 💡 Ejemplo 04 — Few-shot

## 🌍 Contexto

El Café del Parque quiere **clasificar opiniones** de sus clientes en *Positiva*, *Negativa* o *Neutra*. La frontera entre categorías es un **criterio propio** del negocio, y un ejemplo no alcanza para mostrarla.

## 🧠 Concepto

**Few-shot prompting** es dar al modelo **varios ejemplos** (en general, de 2 a unas pocas decenas, pocos en la práctica) antes de la tarea real.

🔗 **Analogía**: al empleado nuevo le das **varios casos del manual** ya resueltos; al ver el patrón, resuelve el siguiente.

## 🧭 Explicación paso a paso

**El patrón**

```text
1. Instrucción        → qué hacer y con qué formato
2. Ejemplos           → varios pares entrada → salida
3. Nueva entrada      → el caso real, con la salida en blanco
```

**Ejemplo**

```text
Clasifica la opinión de un cliente como Positiva, Negativa o Neutra.
Responde solo con la categoría.

Opinión: "El café estaba delicioso y el trato fue excelente."
Categoría: Positiva

Opinión: "Tardaron 40 minutos y el café llegó frío."
Categoría: Negativa

Opinión: "Abren de lunes a sábado de 7 a 19 h."
Categoría: Neutra

Opinión: "No estuvo mal, aunque esperaba más."
Categoría: Neutra

Opinión: "El capuchino llegó tibio y la mesa estaba sucia."
Categoría:
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Negativa
```

**De dónde viene la idea**

El nombre y la medición de *zero-shot*, *one-shot* y *few-shot* se popularizaron con el informe técnico de **GPT-3** (*Language Models are Few-Shot Learners*, Brown y otros, OpenAI, 2020). Allí se usó el modelo **sin reentrenarlo**: la tarea y los ejemplos se daban solo como texto. A esa capacidad se la llama **aprendizaje en contexto**.

**¿Aprendió el modelo?**

- ✅ Usó los ejemplos como **contexto** para esa respuesta.
- ❌ **No cambió sus parámetros**: no "se acuerda" en otra conversación.
- Si cierras la conversación, los ejemplos **se pierden**: hay que incluirlos de nuevo.

🔗 **Analogía**: es la nota que le dejaste hoy al empleado. Mañana, sin la nota, no sabe cómo lo hacías.

## ✅ Resultado esperado

El estudiante identifica instrucción, ejemplos y nueva entrada en un prompt few-shot y explica por qué el modelo no "aprendió" para siempre.

## 🎲 Dinámica: Completa el patrón

Se proyecta un few-shot con la nueva entrada en blanco. Los equipos dicen qué salida esperan y qué formato seguiría el modelo.
