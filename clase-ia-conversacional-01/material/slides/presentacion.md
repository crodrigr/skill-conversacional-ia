# Introducción a la IA Conversacional

Módulo 01 · IA Conversacional

---

# 🎯 ¿Qué lograrás hoy?

- Explicar cómo "conversa" una máquina
- Ubicar a los LLM en el mapa de la IA
- Conocer sus orígenes y cómo se construye
- Entender redes neuronales y Transformers
- Detectar los límites de un asistente

---

# 📅 La ruta de hoy

| Parte | Tiempo |
|---|---|
| 🗣️ IA conversacional y orígenes | 30 min |
| 🧠 LLM, ML, DL y cómo se construye | 25 min |
| 🕸️ Redes neuronales | 22 min |
| 🔦 Transformers | 23 min |
| 👥 Actores, usos, límites y quiz | 20 min |
| 🛠️ Taller | 60 min |

---

# 🎲 ¿Humano o IA?

Te leo 4 fragmentos de conversación.

**Vota con la mano:** 👤 humano · 🤖 IA

---

# 💬 ¿Qué es una IA conversacional?

Un sistema que **dialoga** contigo en lenguaje natural.

> Escribes o hablas → te responde.

---

# 🧩 Las piezas

```text
🎙️ Voz → [STT] → [Entender] → [Decidir] → [Responder] → [TTS] → 🔊
                      ↑             ↑
                  [ Contexto ]  [ Política ]
```

Un **engranaje**, no una sola cosa.

---

# 🎙️ Voz ↔ texto

- **STT**: la voz se vuelve texto
- **TTS**: el texto se vuelve voz

En un chat escrito no hacen falta.

---

# 🎯 Entender: intención y datos

*"Pide una pizza grande para el viernes a las 8"*

- 🎯 **Intención**: pedir comida
- 📦 **Slots**: grande · viernes · 20:00

---

# 🎲 Detective de intenciones

3 frases. Encuentra la **intención** y los **datos**.

⏱️ 3 minutos

---

# 🧭 Contexto y política de diálogo

- 🧾 **Múltiples turnos**: recuerda lo dicho
- 🧭 **Política**: ¿pregunto, confirmo o retomo?

---

# 🔄 El flujo de una conversación

1. 📥 Entrada
2. 🔍 Interpretación
3. ✍️ Generación
4. 📤 Respuesta
5. 🧾 Se guarda en el historial

---

# 🎲 Ordena el flujo

En equipos: ordenen las 5 tarjetas.

⏱️ 3 minutos

---

# 🕰️ Orígenes: ELIZA (1966)

Joseph Weizenbaum, MIT.

Imitaba a un terapeuta con **reglas**.

La gente creía que "la entendía".

---

# 🎲 Línea del tiempo

1950 Turing · 1966 ELIZA · 2011 Siri
2017 Transformer · 2022 ChatGPT

**Ordena las tarjetas.** ⏱️ 4 min

---

# 🤖 Reglas vs. LLM

| | Reglas | LLM |
|---|---|---|
| Responde a | lo previsto | casi cualquier cosa |
| Si no entiende | "No comprendo" | improvisa |
| Se programa con | reglas escritas | datos de entrenamiento |

---

# 🗺️ El mapa de la IA

```text
┌─ IA ─────────────────────────┐
│ ┌─ Machine Learning ───────┐ │
│ │ ┌─ Deep Learning ──────┐ │ │
│ │ │ ┌─ LLM ───────────┐  │ │ │
│ │ │ └─────────────────┘  │ │ │
│ │ └──────────────────────┘ │ │
│ └──────────────────────────┘ │
└──────────────────────────────┘
```

---

# 📊 Machine Learning

Aprende **patrones** a partir de **ejemplos**,
en lugar de seguir reglas escritas a mano.

---

# 🕸️ Deep Learning

Machine Learning con **redes neuronales de muchas capas**.

Muchas capas = "profundo".

---

# 📚 ¿Qué es un LLM?

**L**arge **L**anguage **M**odel

Modelo de lenguaje entrenado con **enormes cantidades de texto**.

---

# 🎲 Clasifica los ejemplos

Spam · Recomendador · Reconocer rostros · Chat con IA

¿En qué nivel del mapa va cada uno?

---

# 🎲 Adivina la siguiente palabra

"Voy a la panadería a comprar…"

Un LLM hace esto, **millones de veces**.

---

# 🏗️ Cómo se construye un LLM

1. 📚 Datos
2. 🎯 Preentrenamiento
3. 🛠️ Ajuste
4. 🧭 Alineación
5. ✅ Evaluación

---

# 🍳 Preentrenar vs. ajustar

- 🎯 Preentrenar = **aprender el lenguaje** (predecir el siguiente token)
- 🛠️ Ajustar = **aprender a conversar**

---

# 🧠 La neurona artificial

Recibe señales → las pondera → decide qué pasar.

🔗 Como un portero con un volumen para cada voz.

---

# 🧱 Capas

```text
Entrada → [ Capa ] → [ Capa ] → [ Capa ] → Salida
```

Cada capa detecta cosas más complejas.

---

# 🎲 La red neuronal humana

Todo el grupo es una red.

⏱️ 11 minutos

---

# 🎛️ Aprender = ajustar perillas

Compara su respuesta con la correcta
y **gira las perillas** (pesos).

Los LLM tienen **miles de millones**.

---

# 🧩 Tokens

`Hola` `,` ` me` ` llamo` ` Ana`

El modelo lee **fragmentos**, no palabras exactas.

---

# 🧬 Embeddings

Cada token → **números** que lo ubican en un mapa.

🐶 perro **cerca** de 🐱 gato · **lejos** de ✈️ avión

---

# 🔦 Atención

Cada palabra mira **qué otras palabras importan**.

🔗 Como un marcador fluorescente.

---

# 🐕 ¿A quién se refiere "su"?

*El perro que estaba en el parque corrió hacia **su** dueño.*

La atención conecta "su" con **perro**, no con parque.

---

# 🎲 ¿Qué "banco" es?

"Me senté en el banco del parque a descansar."

¿Qué palabras te dieron la pista?

---

# 🏗️ El Transformer por dentro

1. 📥 Entrada
2. 🧬 Embedding
3. 🔦 Self-attention
4. 🔧 Feed-forward
5. 🔁 Capas repetidas
6. 📤 Salida

🎲 **Armemos el Transformer** ⏱️ 3 min

---

# ✍️ Token a token

Elige un token probable → lo añade → repite.

Por eso la misma pregunta puede dar **respuestas distintas**.

---

# 👥 ¿Quién lo construye?

Laboratorios y empresas · Investigadores · Ingenieros · Personas evaluadoras · Comunidad abierta

---

# 🎯 ¿Para qué sirve?

Atención al cliente · Educación · Redacción · Programación · Traducción · Análisis de documentos

🎲 **Empareja** actores y usos.

---

# ⚠️ Límites

- 🌀 Alucinaciones
- 📅 Datos desactualizados
- ⚖️ Sesgos
- 🧐 No "entiende" como una persona

---

# 🌉 Examen a libro abierto

¿Datos desactualizados?

Dale al modelo **un libro** para consultar.

---

# 🌉 RAG en dos pasos

1. 🔎 **Recuperar** información relevante
2. ✍️ **Generar** la respuesta con ella

*Lo veremos en un módulo futuro.*

---

# 📌 Lo que te llevas

- De ELIZA (reglas) a ChatGPT (aprendizaje)
- IA ⊃ ML ⊃ DL ⊃ LLM
- Un LLM predice el siguiente token
- Las redes aprenden ajustando pesos
- La atención da contexto
- Verifica siempre

---

# ❓ Quiz relámpago

14 preguntas · 7 minutos

---

# 🛠️ Ahora, el taller

Equipos de 3–4 · 4 retos · 60 minutos
