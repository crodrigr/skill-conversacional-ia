# 🧑‍🏫 Guía docente — Módulo 01

> Material solo para el docente. No compartir con los estudiantes.

## 🎯 Objetivo

Dictar 180 minutos dinámicos: 120 de explicación y 60 de taller, sin material adicional.

## 🪜 Agenda minuto a minuto

### Explicación (120 min)

| Tiempo | Min | Actividad | Diapositivas |
|---|---|---|---|
| 0:00 | 8 | 🎲 ¿Humano o IA? | 4 |
| 0:08 | 7 | Qué es y sus piezas | 5–6 |
| 0:15 | 5 | 🎲 Ordenar el flujo | 7–8 |
| 0:20 | 10 | Reglas vs. LLM + votación | 9 |
| 0:30 | 10 | Mapa IA/ML/DL/LLM | 10–13 |
| 0:40 | 8 | 🎲 Clasificar tarjetas *(prescindible)* | 14 |
| 0:48 | 7 | 🎲 Adivina la siguiente palabra | 15 |
| 0:55 | 8 | Neurona y capas | 16–17 |
| 1:03 | 12 | 🎲 Red neuronal humana | 18 |
| 1:15 | 5 | Perillas / entrenamiento *(prescindible)* | 19 |
| 1:20 | 6 | Tokens con tarjetas | 20 |
| 1:26 | 9 | Atención | 21 |
| 1:35 | 5 | 🎲 Frase ambigua "banco" | 22 |
| 1:40 | 5 | Token a token y variación *(prescindible)* | 23 |
| 1:45 | 6 | Límites y buen uso | 24 |
| 1:51 | 4 | 🌉 Puente a RAG *(prescindible)* | 25–26 |
| 1:55 | 5 | Resumen y quiz | 27–28 |

### Taller (60 min)

Ver [taller-01.md](../../actividades/talleres/taller-01.md): 5 + 12 + 8 + 10 + 10 + 10 + 5.

## 🎲 Fichas de dinámicas

### ¿Humano o IA? (8 min)

- **Materiales**: 4 fragmentos impresos o proyectados; tarjetas 👤/🤖 por persona.
- **Pasos**: lee cada fragmento → votación simultánea → revela → pregunta "¿qué pista usaste?".
- **Fragmentos sugeridos** (el docente decide cuáles son de IA; conviene mezclar):
  1. Un mensaje con una errata y una broma local (humano).
  2. Una respuesta muy ordenada con lista de tres puntos (IA).
  3. Un mensaje corto y seco de soporte técnico (humano).
  4. Una respuesta amable que se disculpa y reformula la pregunta (IA).
- **Cierre**: ser humano o IA no siempre se nota; hoy veremos cómo funciona por dentro.
- **Virtual**: encuesta en línea.

### Ordenar el flujo (5 min)

- **Materiales**: 5 tarjetas por equipo (Entrada, Interpretación, Generación, Respuesta, Historial).
- **Orden**: Entrada → Interpretación (con historial) → Generación → Respuesta → Historial.

### Reglas vs. LLM (10 min)

- Proyecta [Ejemplo 02](../ejemplos/02-reglas-vs-llm.md); vota cuál responde mejor y cuál es más controlable.

### Clasificar tarjetas (8 min) *(prescindible)*

- **Tarjetas**: filtro de spam, recomendador de series, reconocimiento facial, asistente de chat, termostato con reglas.
- Cada equipo las pega en el mapa dibujado en la pizarra.

### Adivina la siguiente palabra (7 min)

- Frases: "Voy a la panadería a comprar…", "Hoy hace tanto calor que…", "El cartero tocó el…".
- Anota en la pizarra las respuestas más frecuentes: son las "más probables".
- Cierre: el LLM hace esto con millones de frases.

### Red neuronal humana (12 min)

- **Roles**: 4 entradas, 3 de capa oculta, 1 salida (el resto observa y registra).
- **Tarea**: decidir si un correo es spam. Cada entrada recibe una pista y la pasa con 1, 2 o 3 palmadas (peso).
- **Capa oculta**: suma las palmadas que oye y, si pasa un umbral, levanta la mano.
- **Salida**: dice "spam" o "no spam".
- **Ajuste**: si se equivoca, el docente cambia los pesos (más o menos palmadas) y se repite.
- **Cierre**: nadie escribió la regla; salió de ajustar volúmenes.
- **Virtual**: simular con números en el chat.

### Tokens con tarjetas (6 min)

- Imprime la frase "Me encanta aprender inteligencia artificial" en fragmentos; los equipos las pegan como crean que las partiría un modelo y se compara con el ejemplo.

### Frase ambigua (5 min)

- Proyecta "Me senté en el banco del parque a descansar."; pide que subrayen las pistas.

## ❓ Preguntas dinamizadoras

- B1: ¿Alguna vez un asistente te respondió algo que no tenía que ver? ¿Por qué crees?
- B2: ¿Qué diferencia hay entre "seguir reglas" y "aprender de ejemplos"?
- B3: ¿Qué perilla moverías si la red marca como spam un correo de tu familia?
- B4: ¿Por qué un modelo no puede "mirar" solo la palabra anterior?
- B5: ¿Cuándo no te fiarías de una respuesta de un asistente?

## 🚧 Privacidad

Avisa antes del taller: **no escribir datos personales ni confidenciales**; usar datos ficticios.

## 🧰 Si hay retraso

Salta las dinámicas marcadas *(prescindible)* en este orden: puente a RAG → variación token a token → clasificar tarjetas → perillas.

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
