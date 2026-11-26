# 🧑‍🏫 Guía docente — Módulo 01

> Material solo para el docente. No compartir con los estudiantes.

## 🎯 Objetivo

> ¿No eres experto? Empieza por la [Lectura para el docente](lectura-para-el-docente.md) y ten a mano el [Glosario](../ejemplos/glosario.md).

Dictar 180 minutos dinámicos: 120 de explicación y 60 de taller, sin material adicional.

## 🪜 Agenda minuto a minuto

### 📅 Explicación (120 min)

| Tiempo | Min | Actividad | Diapositivas |
|---|---|---|---|
| 0:00 | 7 | 🎲 ¿Humano o IA? | 4 |
| 0:07 | 4 | Qué es y sus piezas | 5–6 |
| 0:11 | 6 | Voz, comprensión y diálogo + 🎲 Detective de intenciones | 7–10 |
| 0:17 | 4 | Flujo + 🎲 ordenar el flujo | 11–12 |
| 0:21 | 6 | 🕰️ Orígenes + 🎲 línea del tiempo | 13–14 |
| 0:27 | 3 | Reglas vs. LLM + votación | 15 |
| 0:30 | 8 | Mapa IA/ML/DL/LLM | 16–19 |
| 0:38 | 5 | 🎲 Clasificar tarjetas *(prescindible)* | 20 |
| 0:43 | 5 | 🎲 Adivina la siguiente palabra | 21 |
| 0:48 | 7 | 🏗️ Cómo se construye un LLM + 🎲 receta | 22–23 |
| 0:55 | 6 | Neurona y capas | 24–25 |
| 1:01 | 11 | 🎲 Red neuronal humana | 26 |
| 1:12 | 5 | Perillas / entrenamiento *(prescindible)* | 27 |
| 1:17 | 6 | Tokens y embeddings | 28–29 |
| 1:23 | 7 | Atención + perro y su dueño | 30–31 |
| 1:30 | 4 | 🎲 Frase ambigua "banco" | 32 |
| 1:34 | 6 | El Transformer por dentro + 🎲 Armemos el Transformer | 33–34 |
| 1:40 | 7 | 👥 Quién lo construye y para qué + 🎲 empareja | 35–36 |
| 1:47 | 3 | Límites y buen uso | 37 |
| 1:50 | 3 | 🌉 Puente a RAG *(prescindible)* | 38–39 |
| 1:53 | 7 | Resumen y quiz (14 ítems) | 40–41 |

### 🛠️ Taller (60 min)

Ver [taller-01.md](../../actividades/talleres/taller-01.md): 5 + 12 + 8 + 10 + 10 + 10 + 5.

## 🎲 Fichas de dinámicas

### 🎲 ¿Humano o IA? (7 min)

- **Materiales**: 4 fragmentos impresos o proyectados; tarjetas 👤/🤖 por persona.
- **Pasos**: lee cada fragmento → votación simultánea → revela → pregunta "¿qué pista usaste?".
- **Fragmentos sugeridos** (el docente decide cuáles son de IA; conviene mezclar):
  1. Un mensaje con una errata y una broma local (humano).
  2. Una respuesta muy ordenada con lista de tres puntos (IA).
  3. Un mensaje corto y seco de soporte técnico (humano).
  4. Una respuesta amable que se disculpa y reformula la pregunta (IA).
- **Cierre**: ser humano o IA no siempre se nota; hoy veremos cómo funciona por dentro.
- **Virtual**: encuesta en línea.

### 🎲 Línea del tiempo (4 min)

- **Materiales**: 5 tarjetas de hitos (Turing 1950, ELIZA 1966, Siri 2011, Transformer 2017, ChatGPT 2022).
- **Pasos**: los equipos las ordenan; compara con la tabla del [Ejemplo 03](../ejemplos/03-origenes-y-evolucion.md).
- **Pregunta**: ¿qué cambió entre ELIZA y ChatGPT? (de reglas a aprendizaje).

### 🎲 La receta del LLM (parte de 7 min)

- **Materiales**: 6 tarjetas de etapas + 6 de analogías de cocina.
- **Pasos**: ordenar etapas (datos → tokenización → preentrenamiento → ajuste → alineación → evaluación) y emparejar cada una con su analogía ([Ejemplo 05](../ejemplos/05-como-se-construye-un-llm.md)).

### 🎲 Empareja actores y usos (parte de 7 min)

- **Materiales**: tarjetas de actores y de usos ([Ejemplo 08](../ejemplos/08-quien-lo-construye-y-para-que.md)).
- **Cierre**: cada equipo comenta un uso que le gustaría y una precaución.

### 🎲 Detective de intenciones (3 min)

- **Materiales**: 3 frases proyectadas ([Ejemplo 01](../ejemplos/01-flujo-de-una-conversacion.md)).
- **Pasos**: cada equipo escribe la **intención** y los **slots**; se comparan en voz alta.
- **Respuestas**: 1) agendar cita · dentista, martes, tarde; 2) consultar el clima · Lima, fin de semana; 3) reservar mesa · 4 personas, hoy, 9 pm.
- **Clave**: intención = acción; slots = datos.

### 🎲 Armemos el Transformer (3 min)

- **Materiales**: 6 tarjetas (Entrada, Embedding, Self-attention, Feed-forward, Capas repetidas, Salida).
- **Pasos**: ordenar las tarjetas y decir qué le pasa a "El perro corre en el…" en cada una ([Ejemplo 07](../ejemplos/07-tokens-y-atencion.md)).

### 🎲 Ordenar el flujo (3 min)

- **Materiales**: 5 tarjetas por equipo (Entrada, Interpretación, Generación, Respuesta, Historial).
- **Orden**: Entrada → Interpretación (con historial) → Generación → Respuesta → Historial.

### 🎲 Reglas vs. LLM (3 min)

- Proyecta [Ejemplo 02](../ejemplos/02-reglas-vs-llm.md); vota cuál responde mejor y cuál es más controlable.

### 🎲 Clasificar tarjetas (5 min) *(prescindible)*

- **Tarjetas**: filtro de spam, recomendador de series, reconocimiento facial, asistente de chat, termostato con reglas.
- Cada equipo las pega en el mapa dibujado en la pizarra.

### 🎲 Adivina la siguiente palabra (5 min)

- Frases: "Voy a la panadería a comprar…", "Hoy hace tanto calor que…", "El cartero tocó el…".
- Anota en la pizarra las respuestas más frecuentes: son las "más probables".
- Cierre: el LLM hace esto con millones de frases.

### 🎲 Red neuronal humana (11 min)

- **Roles**: 4 entradas, 3 de capa oculta, 1 salida (el resto observa y registra).
- **Tarea**: decidir si un correo es spam. Cada entrada recibe una pista y la pasa con 1, 2 o 3 palmadas (peso).
- **Capa oculta**: suma las palmadas que oye y, si pasa un umbral, levanta la mano.
- **Salida**: dice "spam" o "no spam".
- **Ajuste**: si se equivoca, el docente cambia los pesos (más o menos palmadas) y se repite.
- **Cierre**: nadie escribió la regla; salió de ajustar volúmenes.
- **Virtual**: simular con números en el chat.

### 🎲 Tokens con tarjetas (parte de 6 min)

- Imprime la frase "Me encanta aprender inteligencia artificial" en fragmentos; los equipos las pegan como crean que las partiría un modelo y se compara con el ejemplo.

### 🎲 Frase ambigua (4 min)

- Proyecta "Me senté en el banco del parque a descansar."; pide que subrayen las pistas.

## ❓ Preguntas dinamizadoras

- B1: ¿Alguna vez un asistente te respondió algo que no tenía que ver? ¿Por qué crees?
- B2: ¿Qué diferencia hay entre "seguir reglas" y "aprender de ejemplos"?
- B3: ¿Qué perilla moverías si la red marca como spam un correo de tu familia?
- B1: ¿Qué pieza fallaría si hablas en un lugar con mucho ruido?
- B4: ¿Por qué un modelo no puede "mirar" solo la palabra anterior?
- B4: En "su dueño", ¿qué palabras te ayudaron a saber que es el perro?
- B1: ¿Por qué crees que la gente creía que ELIZA los entendía?
- B2: ¿Qué etapa hace que un modelo sea un buen "asistente" y no solo un predictor?
- B5: ¿Quién es responsable cuando alguien usa mal un asistente?
- B5: ¿Cuándo no te fiarías de una respuesta de un asistente?

## 🚧 Privacidad

Avisa antes del taller: **no escribir datos personales ni confidenciales**; usar datos ficticios.

## 🧰 Si hay retraso

Salta las dinámicas marcadas *(prescindible)* en este orden: puente a RAG → clasificar tarjetas → perillas.

## 🏁 Facilitación del taller

| Reto | Hallazgos esperados | Qué hacer si no ocurre |
|---|---|---|
| 1 Alucinaciones | Datos inventados o imprecisos en fechas, citas o libros poco conocidos | Sugerir una cita literal o un libro muy específico |
| 2 Varias respuestas | Redacción distinta; a veces contenido distinto | Pedir algo creativo (un poema corto) |
| 3 Contexto | Olvido del dato o confusión en charlas largas; a veces lo recuerda | Es válido: explicar que depende del límite de contexto |
| 4 Vago vs. claro | La respuesta clara es más útil y específica | Pedir que midan con una lista de criterios |

**Nota**: la variación entre asistentes es normal; evalúa la **observación y su relación con un concepto**, no que "salga" un error concreto.

### 📏 Criterios de evaluación del taller

- Documenta al menos un hallazgo por reto realizado.
- Contrasta con una fuente confiable (reto 1).
- Relaciona cada hallazgo con un concepto del módulo.
- Presenta un hallazgo al grupo.

## 📌 Cierre

Pide a cada persona una frase: "Hoy aprendí que…". Anota 3 para retomar en el siguiente módulo.
