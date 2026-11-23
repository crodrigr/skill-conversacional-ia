# 📚 Explicación conceptual — Introducción a la IA Conversacional

## 🎯 Objetivo

Entender, sin matemáticas ni código, cómo una máquina mantiene una conversación y qué hay detrás de un LLM.

---

## 🌍 B1 · IA conversacional y su funcionamiento

### 🧠 Concepto: IA conversacional

Una **IA conversacional** es un sistema que dialoga contigo en lenguaje natural.

- **Entrada**: lo que escribes o dices.
- **Interpretación**: el sistema intenta captar qué quieres.
- **Generación**: construye una respuesta.
- **Respuesta**: te la muestra.
- **Historial**: guarda lo dicho para seguir el hilo.

🔗 **Analogía**: es como un mesero que recuerda lo que pediste antes en la mesa; si olvidara la conversación, cada frase empezaría de cero.

📎 Ver en la práctica: [Ejemplo 01 — El flujo de una conversación](01-flujo-de-una-conversacion.md)

### 🧠 Concepto: Chatbot de reglas vs. asistente con LLM

Hay dos grandes familias de asistentes.

- **De reglas**: siguen un guion escrito a mano ("si dice X, responde Y").
  - ✅ Predecibles y fáciles de controlar.
  - ❌ Se rompen ante lo inesperado.
- **Con LLM**: generan la respuesta a partir de lo aprendido con muchísimo texto.
  - ✅ Flexibles ante casi cualquier pregunta.
  - ❌ Pueden equivocarse con mucha seguridad.

📎 Ver en la práctica: [Ejemplo 02 — Reglas vs. LLM](02-reglas-vs-llm.md)

---

## 🌍 B2 · LLM, Machine Learning y Deep Learning

### 🧠 Concepto: El mapa IA ⊃ Machine Learning ⊃ Deep Learning ⊃ LLM

Son conjuntos que se contienen unos a otros.

- **IA**: cualquier sistema que realiza tareas que asociamos a la inteligencia.
- **Machine Learning (ML)**: IA que aprende patrones a partir de ejemplos, en lugar de reglas escritas a mano.
- **Deep Learning (DL)**: ML con redes neuronales de muchas capas.
- **LLM**: modelo de Deep Learning especializado en lenguaje.

🔗 **Analogía**: aprender a distinguir perros de gatos viendo miles de fotos, en vez de que alguien te dicte una lista de reglas.

📎 Ver en la práctica: [Ejemplo 03 — El mapa IA, ML, DL y LLM](03-mapa-ia-ml-dl-llm.md)

### 🧠 Concepto: Un LLM predice el siguiente token

Un **LLM** (*Large Language Model*) es "grande" por sus datos y sus parámetros.

- Se entrena con enormes cantidades de texto.
- Su tarea básica: dada una secuencia, **calcular qué token es más probable que siga**.
- Repitiendo esa tarea, escribe párrafos enteros.
- No "sabe" hechos como una persona: reproduce patrones.

📎 Ver en la práctica: [Ejemplo 03 — El mapa IA, ML, DL y LLM](03-mapa-ia-ml-dl-llm.md)

---

## 🌍 B3 · Redes neuronales

### 🧠 Concepto: Red neuronal

Una **red neuronal** es un conjunto de "neuronas" artificiales organizadas en capas.

- **Neurona**: recibe señales, las pondera y pasa una señal a la siguiente.
- **Capas**: entrada, ocultas y salida.
- **Pesos**: el "volumen" con el que cuenta cada conexión.
- Cada capa detecta patrones más complejos que la anterior.

🔗 **Analogía**: una cadena humana donde cada persona escucha a varias, decide cuánto caso les hace y avisa a la siguiente.

📎 Ver en la práctica: [Ejemplo 04 — La red neuronal y sus perillas](04-red-neuronal-y-perillas.md)

### 🧠 Concepto: Entrenamiento

**Entrenar** es ajustar los pesos para que la red se equivoque cada vez menos.

- La red da una respuesta.
- Se compara con la correcta.
- Se ajustan los pesos un poquito.
- Se repite millones de veces.
- Los **parámetros** de un modelo son esos pesos: las "perillas".

🔗 **Analogía**: afinar una receta probando y corrigiendo la sal, el tiempo y el fuego.

📎 Ver en la práctica: [Ejemplo 04 — La red neuronal y sus perillas](04-red-neuronal-y-perillas.md)

---

## 🌍 B4 · Transformers

### 🧠 Concepto: Token

Un **token** es un fragmento de texto: una palabra, parte de una palabra o un signo.

- El modelo no lee letras ni palabras exactas, lee tokens.
- Cada token se convierte en números que representan su significado (como una ubicación en un mapa).
- Palabras largas o raras se parten en varios tokens.

🔗 **Analogía**: piezas de Lego de texto.

📎 Ver en la práctica: [Ejemplo 05 — Tokens y atención](05-tokens-y-atencion.md)

### 🧠 Concepto: Atención

La **atención** es el mecanismo del **Transformer** (arquitectura presentada en 2017) que permite a cada token fijarse en los demás.

- Decide qué palabras de la frase importan para interpretar otra.
- Resuelve ambigüedades ("banco" de parque o de dinero).
- Permite mirar toda la frase a la vez, no solo la palabra anterior.

🔗 **Analogía**: subrayar con un marcador las pistas de una frase.

📎 Ver en la práctica: [Ejemplo 05 — Tokens y atención](05-tokens-y-atencion.md)

### 🧠 Concepto: Generación token a token

El modelo escribe de a un token por vez.

- Calcula probabilidades para el siguiente token.
- Elige uno entre los probables (no siempre el primero).
- Lo añade al texto y repite.
- Por eso la misma pregunta puede producir respuestas distintas.

📎 Ver en la práctica: [Ejemplo 05 — Tokens y atención](05-tokens-y-atencion.md)

---

## 🌍 B5 · Límites y adelanto

### 🧠 Concepto: Limitaciones de las IA conversacionales

Un LLM puede fallar de varias formas.

- **Alucinaciones**: inventa datos con aparente seguridad.
- **Datos desactualizados**: solo sabe lo que había en su entrenamiento.
- **Sesgos**: refleja los sesgos del texto con que se entrenó.
- **Sin comprensión real**: predice texto; no vive el mundo.
- Buen hábito: **verificar** lo importante con fuentes confiables y no compartir datos personales.

📎 Ver en la práctica: [Ejemplo 06 — Limitaciones y puente a RAG](06-limitaciones-y-puente-a-rag.md)

### 🌉 Concepto: Puente a RAG

**RAG** (generación aumentada por recuperación) es una forma de reducir el problema de los datos desactualizados.

- **Paso 1 — Recuperar**: se busca información relevante en una fuente externa.
- **Paso 2 — Generar**: el LLM responde usando esa información junto con la pregunta.
- Evita reentrenar el modelo cada vez que cambian los datos.

🔗 **Analogía**: pasar de un examen a libro cerrado a uno a **libro abierto**.

> Aquí solo se presenta la idea; se desarrolla en un módulo posterior. Lectura complementaria (divulgación comercial): Ortiz Ascencio, A., "La generación aumentada por recuperación (RAG): qué es y cómo puede transformar tu negocio", blog de Minds2, 2024.

📎 Ver en la práctica: [Ejemplo 06 — Limitaciones y puente a RAG](06-limitaciones-y-puente-a-rag.md)

---

## 📌 Resumen

- IA conversacional = entrada, interpretación, generación, respuesta e historial.
- IA ⊃ ML ⊃ Deep Learning ⊃ LLM.
- Un LLM predice el siguiente token.
- Las redes aprenden ajustando pesos.
- La atención permite entender el contexto.
- Todo asistente puede equivocarse: verifica.
