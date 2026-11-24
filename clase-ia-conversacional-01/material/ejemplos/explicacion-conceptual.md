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

### 🧠 Concepto: Las piezas de una IA conversacional

No es un sistema único: es un **engranaje** de piezas que trabajan juntas.

- **Speech-to-Text (STT)**: convierte la voz en texto (solo si hablas).
- **Comprensión del lenguaje (NLU)**: entiende el mensaje completo, aunque no uses las palabras exactas.
- **Detección de intención**: descubre qué quiere lograr la persona; es difícil con voz porque la gente cuenta historias largas antes de ir al punto.
- **Extracción de valores (slots)**: guarda datos útiles (fechas, nombres, lugares, cantidades), incluso cuando vienen varios en una misma frase.
- **Contexto y múltiples turnos**: recuerda lo dicho para mantener la coherencia; con voz es más importante porque no hay un historial visible.
- **Política de diálogo**: decide el siguiente paso (preguntar un dato, confirmar, retomar un tema, manejar interrupciones).
- **Text-to-Speech (TTS)**: convierte la respuesta en voz; puede sonar robótica o muy natural según la técnica.

🔗 **Analogía**: un restaurante: quien toma el pedido (entender), la cocina (generar), el camarero que recuerda la mesa (contexto) y el jefe de sala que organiza el servicio (política).

📎 Ver en la práctica: [Ejemplo 01 — El flujo de una conversación y sus piezas](01-flujo-de-una-conversacion.md)

### 🧠 Concepto: Chatbot de reglas vs. asistente con LLM

Hay dos grandes familias de asistentes.

- **De reglas**: siguen un guion escrito a mano ("si dice X, responde Y").
  - ✅ Predecibles y fáciles de controlar.
  - ❌ Se rompen ante lo inesperado.
- **Con LLM**: generan la respuesta a partir de lo aprendido con muchísimo texto.
  - ✅ Flexibles ante casi cualquier pregunta.
  - ❌ Pueden equivocarse con mucha seguridad.

🔗 **Analogía**: un cajero con un manual fijo frente a un empleado con experiencia que improvisa ante lo nuevo.

📎 Ver en la práctica: [Ejemplo 02 — Reglas vs. LLM](02-reglas-vs-llm.md)

### 🧠 Concepto: Orígenes y evolución

La idea de conversar con máquinas es antigua y cambió de enfoque.

- **1950**: Alan Turing propone el "juego de la imitación".
- **1966**: **ELIZA** (Joseph Weizenbaum, MIT) imita a un terapeuta con reglas; muestra que tendemos a atribuir comprensión a quien responde bien.
- **2011–2016**: llegan los asistentes de voz (Siri, Alexa, Google Assistant).
- **2017**: el **Transformer**, creado por investigadores de Google, hace posibles los LLM modernos.
- **2022**: **ChatGPT** populariza la conversación con un LLM.
- El gran cambio: de **escribir el guion** a **entrenar un modelo**.

🔗 **Analogía**: es como pasar de seguir un guion de teatro (ELIZA) a un actor que improvisa tras haber visto miles de obras (un LLM).

📎 Ver en la práctica: [Ejemplo 03 — Orígenes y evolución](03-origenes-y-evolucion.md)

---

## 🌍 B2 · LLM, Machine Learning y Deep Learning

### 🧠 Concepto: El mapa IA ⊃ Machine Learning ⊃ Deep Learning ⊃ LLM

Son conjuntos que se contienen unos a otros.

- **IA**: cualquier sistema que realiza tareas que asociamos a la inteligencia.
- **Machine Learning (ML)**: IA que aprende patrones a partir de ejemplos, en lugar de reglas escritas a mano.
- **Deep Learning (DL)**: ML con redes neuronales de muchas capas.
- **LLM**: modelo de Deep Learning especializado en lenguaje.

🔗 **Analogía**: aprender a distinguir perros de gatos viendo miles de fotos, en vez de que alguien te dicte una lista de reglas.

📎 Ver en la práctica: [Ejemplo 04 — El mapa IA, ML, DL y LLM](04-mapa-ia-ml-dl-llm.md)

### 🧠 Concepto: Un LLM predice el siguiente token

Un **LLM** (*Large Language Model*) es "grande" por sus datos y sus parámetros.

- Se entrena con enormes cantidades de texto.
- Su tarea básica: dada una secuencia, **calcular qué token es más probable que siga**.
- Repitiendo esa tarea, escribe párrafos enteros.
- No "sabe" hechos como una persona: reproduce patrones.

🔗 **Analogía**: es como el autocompletar del teléfono, pero entrenado con muchísimo más texto.

📎 Ver en la práctica: [Ejemplo 04 — El mapa IA, ML, DL y LLM](04-mapa-ia-ml-dl-llm.md)

### 🧠 Concepto: Cómo se construye un LLM

Un LLM se **entrena** en etapas.

- **Datos**: se reúne y limpia mucho texto variado.
- **Preentrenamiento**: el modelo practica predecir el siguiente token; es la etapa más larga y costosa.
- **Ajuste**: se entrena con ejemplos de instrucciones y conversaciones.
- **Alineación**: personas evalúan respuestas y se aplican reglas de seguridad.
- **Evaluación y publicación**: se prueba, se lanza y se actualiza después.
- El modelo no se actualiza solo: por eso puede tener datos desactualizados.

🔗 **Analogía**: aprender a cocinar (preentrenar), a atender mesas (ajustar) y a corregir según el comensal (alinear).

📎 Ver en la práctica: [Ejemplo 05 — Cómo se construye un LLM](05-como-se-construye-un-llm.md)

---

## 🌍 B3 · Redes neuronales

### 🧠 Concepto: Red neuronal

Una **red neuronal** es un conjunto de "neuronas" artificiales organizadas en capas.

- **Neurona**: recibe señales, las pondera y pasa una señal a la siguiente.
- **Capas**: entrada, ocultas y salida.
- **Pesos**: el "volumen" con el que cuenta cada conexión.
- Cada capa detecta patrones más complejos que la anterior.
- Una neurona pasa su señal a la siguiente **solo si supera un umbral**.
- Se inspiran libremente en el cerebro, pero **no funcionan igual**.

🔗 **Analogía**: una cadena humana donde cada persona escucha a varias, decide cuánto caso les hace y avisa a la siguiente.

📎 Ver en la práctica: [Ejemplo 06 — La red neuronal y sus perillas](06-red-neuronal-y-perillas.md)

### 🧠 Concepto: Entrenamiento

**Entrenar** es ajustar los pesos para que la red se equivoque cada vez menos.

- La red da una respuesta.
- Se compara con la correcta.
- Se ajustan los pesos un poquito.
- Se repite millones de veces.
- Los **parámetros** de un modelo son esos pesos: las "perillas".

🔗 **Analogía**: afinar una receta probando y corrigiendo la sal, el tiempo y el fuego.

📎 Ver en la práctica: [Ejemplo 06 — La red neuronal y sus perillas](06-red-neuronal-y-perillas.md)

---

## 🌍 B4 · Transformers

### 🧠 Concepto: Token

Un **token** es un fragmento de texto: una palabra, parte de una palabra o un signo.

- El modelo no lee letras ni palabras exactas, lee tokens.
- Cada token se convierte en números que representan su significado (como una ubicación en un mapa).
- Palabras largas o raras se parten en varios tokens.

🔗 **Analogía**: piezas de Lego de texto.

📎 Ver en la práctica: [Ejemplo 07 — Tokens y atención](07-tokens-y-atencion.md)

### 🧠 Concepto: Embedding

Un **embedding** convierte un token en una lista de números (un vector) que ubica su significado.

- Palabras relacionadas quedan **cerca** (*perro* y *gato*); las que no, **lejos** (*perro* y *avión*).
- Es la forma en que el modelo "ve" el significado: como un espacio de números.

🔗 **Analogía**: un mapa de barrios donde las palabras parecidas viven en el mismo barrio.

📎 Ver en la práctica: [Ejemplo 07 — Tokens, embeddings y atención](07-tokens-y-atencion.md)

### 🧠 Concepto: Atención

La **atención** es el mecanismo del **Transformer** (arquitectura presentada en 2017) que permite a cada token fijarse en los demás.

- Decide qué palabras de la frase importan para interpretar otra.
- Resuelve ambigüedades ("banco" de parque o de dinero).
- Permite mirar toda la frase a la vez, no solo la palabra anterior.
- Ejemplo: en "El perro que estaba en el parque corrió hacia su dueño", conecta *su* con *perro*, no con *parque*.

🔗 **Analogía**: subrayar con un marcador las pistas de una frase.

📎 Ver en la práctica: [Ejemplo 07 — Tokens y atención](07-tokens-y-atencion.md)

### 🧠 Concepto: Estructura de un Transformer

Un Transformer procesa el texto en pasos.

- **Entrada**: llega el texto; el modelo aún no entiende, solo recibe símbolos.
- **Embedding**: cada token pasa a ser un vector.
- **Self-attention**: cada palabra se conecta con las demás y pondera su importancia.
- **Feed-forward**: una red neuronal refina lo que dejó la atención.
- **Capas repetidas**: atención + feed-forward se repiten muchas veces; más capas permiten captar patrones más complejos.
- **Salida**: depende de la tarea: predecir la siguiente palabra, clasificar un texto o traducir.

🔗 **Analogía**: leer un texto varias veces, entendiendo algo más en cada lectura.

📎 Ver en la práctica: [Ejemplo 07 — Tokens, embeddings y atención](07-tokens-y-atencion.md)

### 🧠 Concepto: Generación token a token

El modelo escribe de a un token por vez.

- Calcula probabilidades para el siguiente token.
- Elige uno entre los probables (no siempre el primero).
- Lo añade al texto y repite.
- Por eso la misma pregunta puede producir respuestas distintas.

🔗 **Analogía**: es como tirar un dado cargado que favorece las palabras más probables: casi siempre sale una buena opción, pero no siempre la misma.

📎 Ver en la práctica: [Ejemplo 07 — Tokens y atención](07-tokens-y-atencion.md)

---

## 🌍 B5 · Actores, usos, límites y adelanto

### 🧠 Concepto: Quién los construye y para qué se usan

Los LLM los construyen equipos grandes con muchos recursos.

- **Quiénes**: laboratorios y empresas de IA (OpenAI, Google, Anthropic, Meta, Mistral, entre otros), investigadores, ingenieros, personas evaluadoras y la comunidad de código abierto.
- **Para qué**: atención al cliente, educación, redacción y resumen, programación, traducción y accesibilidad, análisis de documentos.
- **Precaución**: la responsabilidad del uso es también de quien los usa; en temas delicados se necesita supervisión humana.

🔗 **Analogía**: es como una película: la hacen muchos equipos (producción, dirección, pruebas con público) y luego se usa para fines muy distintos.

📎 Ver en la práctica: [Ejemplo 08 — Quién lo construye y para qué se usa](08-quien-lo-construye-y-para-que.md)

### 🧠 Concepto: Limitaciones de las IA conversacionales

Un LLM puede fallar de varias formas.

- **Alucinaciones**: inventa datos con aparente seguridad.
- **Datos desactualizados**: solo sabe lo que había en su entrenamiento.
- **Sesgos**: refleja los sesgos del texto con que se entrenó.
- **Sin comprensión real**: predice texto; no vive el mundo.
- Buen hábito: **verificar** lo importante con fuentes confiables y no compartir datos personales.

🔗 **Analogía**: un estudiante muy seguro de sí mismo que a veces responde de memoria sin comprobar.

📎 Ver en la práctica: [Ejemplo 09 — Limitaciones y puente a RAG](09-limitaciones-y-puente-a-rag.md)

### 🌉 Concepto: Puente a RAG

**RAG** (generación aumentada por recuperación) es una forma de reducir el problema de los datos desactualizados.

- **Paso 1 — Recuperar**: se busca información relevante en una fuente externa.
- **Paso 2 — Generar**: el LLM responde usando esa información junto con la pregunta.
- Evita reentrenar el modelo cada vez que cambian los datos.

🔗 **Analogía**: pasar de un examen a libro cerrado a uno a **libro abierto**.

> Aquí solo se presenta la idea; se desarrolla en un módulo posterior. Lectura complementaria (divulgación comercial): Ortiz Ascencio, A., "La generación aumentada por recuperación (RAG): qué es y cómo puede transformar tu negocio", blog de Minds2, 2024.

📎 Ver en la práctica: [Ejemplo 09 — Limitaciones y puente a RAG](09-limitaciones-y-puente-a-rag.md)

---

## 📌 Resumen

- IA conversacional = entrada, interpretación, generación, respuesta e historial.
- IA ⊃ ML ⊃ Deep Learning ⊃ LLM.
- Un LLM predice el siguiente token.
- Una IA conversacional es un engranaje de piezas: voz, comprensión, intención, datos, contexto y política de diálogo.
- Las redes aprenden ajustando pesos.
- La atención permite entender el contexto, y el Transformer repite atención + feed-forward en muchas capas.
- Hay una historia: de ELIZA (reglas) al Transformer y ChatGPT (aprendizaje).
- Un LLM se construye en etapas: datos, preentrenamiento, ajuste y alineación.
- Lo construyen equipos de empresas, universidades y comunidad; se usa en muchas tareas.
- Todo asistente puede equivocarse: verifica.
