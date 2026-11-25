# 🧑‍🏫 Guía docente — Fundamentos de Embeddings

> Material solo para el docente. No compartir con los estudiantes.

## 🎯 Objetivo

Dictar 180 minutos dinámicos: 120 de explicación y 60 de taller, sin material adicional.

> ¿No eres experto? Empieza por la [Lectura para el docente](lectura-para-el-docente.md) y ten a mano el [Glosario](../ejemplos/glosario.md).

## 🪜 Agenda minuto a minuto

### 📅 Explicación (120 min)

| Tiempo | Min | Actividad | Diapositivas |
|---|---|---|---|
| 0:00 | 7 | 🎲 Mapa de palabras | 4 |
| 0:07 | 5 | Repaso del Módulo 01 | 5 |
| 0:12 | 8 | Definición, por qué números, espacio vectorial | 6–8 |
| 0:20 | 8 | Del texto al vector | 9 |
| 0:28 | 10 | Aprender por contexto + 🎲 Completa la frase | 10–11 |
| 0:38 | 8 | Medir cercanía, palabras vs. significado + 🎲 ¿Se parecen? | 12–14 |
| 0:46 | 4 | Analogías y sesgos | 15–16 |
| 0:50 | 8 | Word2Vec + 🎲 La palabra oculta | 17–18 |
| 0:58 | 8 | GloVe + 🎲 Cuenta con tarjetas *(prescindible)* | 19–20 |
| 1:06 | 6 | Word2Vec vs. GloVe | 21 |
| 1:12 | 3 | 🎲 ¿Cuántos vectores tiene "banco"? | 22 |
| 1:15 | 8 | BERT + 🎲 votación de "banco" | 23–24 |
| 1:23 | 8 | GPT | 25 |
| 1:31 | 6 | 🎲 ¿Quién lee qué? + estático vs. contextual | 26–27 |
| 1:37 | 3 | De palabras a oraciones y documentos *(prescindible)* | 28 |
| 1:40 | 5 | Los cuatro tipos + 🎲 Clasifica con tarjetas | 29–30 |
| 1:45 | 5 | Criterios + 🎲 tres casos | 31–32 |
| 1:50 | 4 | Usos, límites y 🌉 puente *(prescindible)* | 33–35 |
| 1:54 | 6 | Resumen y quiz (10 ítems) | 36–37 |

### 🛠️ Taller (60 min)

Ver [taller-01.md](../../actividades/talleres/taller-01.md): 5 + 12 + 12 + 8 + 10 + 8 + 5.

## 🎲 Fichas de dinámicas

### 🎲 Mapa de palabras (7 min)

- **Materiales**: una cuadrícula grande (en el suelo con cinta, o en la pizarra) y una tarjeta de palabra por equipo: *perro, gato, caballo, auto, bicicleta, avión, pan, manzana, café, té*.
- **Pasos**: reparte las tarjetas; cada equipo debe **ubicar su palabra** donde crea que corresponde, para que **las parecidas queden cerca**. Después de 4 minutos, comenta los grupos que se formaron.
- **Cierre**: "Esto es un embedding: la ubicación de cada palabra en un mapa. Con dos números ya podemos decir dónde está."
- **Virtual**: pizarra compartida con una cuadrícula.

### 🎲 Completa la frase (4 min)

- **Frases**: "El ___ ladra en el parque.", "Mi ___ ronronea en el sofá.", "Tomo un ___ caliente por la mañana."
- **Pasos**: los equipos dicen qué palabras caben; anota todas en la pizarra.
- **Cierre**: las palabras que caben en el mismo hueco **comparten contexto**, así que **quedan cerca**.

### 🎲 ¿Se parecen? (4 min)

- **Pares** (sin palabras en común): "mi perrito nuevo" / "cómo cuidar a un cachorro recién llegado"; "dolor lumbar" / "ejercicios para fortalecer la espalda"; "dolor lumbar" / "horarios de trenes".
- **Pasos**: vota 👍 cerca / 👎 lejos con la mano; revela la respuesta (cerca, cerca, lejos).
- **Cierre**: "El embedding compara el **significado**, no las letras."

### 🎲 La palabra oculta (4 min)

- **Frases**: "El gato bebe ___ en su plato." y "En invierno hace mucho ___."
- **Pasos**: primero, adivinar la palabra a partir del contexto (**CBOW**); luego, dada una palabra, decir qué palabras suelen rodearla (**Skip-gram**).

### 🎲 Cuenta con tarjetas (4 min) *(prescindible)*

- **Materiales**: tarjetas con las cuatro frases del [Ejercicio 06](../ejercicios/06-word2vec-o-glove.md).
- **Pasos**: cada equipo cuenta cuántas veces aparecen juntas dos palabras y llena la tabla en la pizarra.
- **Cierre**: "GloVe hace esto con toda una biblioteca."

### 🎲 ¿Cuántos vectores tiene «banco»? (3 min)

- Proyecta "Me senté en el banco del parque" y "Fui al banco a retirar dinero".
- Pregunta: "Con Word2Vec o GloVe, ¿cuántos vectores tiene *banco*?" (**Uno**.) "¿Qué problema trae?" (No distingue los sentidos.)

### 🎲 Votación de «banco» (parte de 8 min)

- Tras presentar BERT: "¿El vector de *banco* es el mismo en las dos frases?" (**No**: es contextual.)

### 🎲 ¿Quién lee qué? (parte de 6 min)

- **Materiales**: 4 tarjetas: *BERT*, *GPT*, *ambos lados*, *de izquierda a derecha*.
- **Pasos**: los equipos las emparejan; después, cada equipo explica la diferencia con la analogía del crucigrama y de anticipar la frase.

### 🎲 Clasifica con tarjetas (parte de 5 min)

- **Materiales**: 12 tarjetas (4 modelos × origen, idea y tipo de vector).
- **Pasos**: los equipos las unen y se comparan con la tabla.
- **Respuestas**: Word2Vec (Google, 2013, adivina palabras, fijo); GloVe (Stanford, 2014, conteos globales, fijo); BERT (Google, 2018, ambos lados, contextual); GPT (OpenAI, 2018, de izquierda a derecha, contextual).

### 🎲 Tres casos (parte de 5 min)

- **Casos**: manuales internos con otras palabras; sinónimos en un diccionario sencillo; clasificar opiniones.
- **Pasos**: vota el tipo y pide un criterio (contexto, tarea, recursos, idioma).
- **Respuestas orientativas**: embeddings de texto; Word2Vec o GloVe; BERT o embeddings de texto.

## ❓ Preguntas dinamizadoras

- B1: ¿Qué palabras pusieron juntas y por qué?
- B2: ¿Qué hace que dos frases se parezcan aunque no compartan palabras?
- B2: ¿Dónde podría esconderse un sesgo en un asistente?
- B3: ¿Qué se pierde con "un vector por palabra"?
- B4: ¿Qué palabras de la frase te ayudaron a saber qué "banco" era?
- B5: ¿Para qué usarías tú los embeddings en tu trabajo o estudio?

## 🚧 Datos y privacidad

Avisa antes del taller: usar **solo textos ficticios** y no escribir datos personales en ningún asistente.

## 🧰 Si hay retraso

Salta las dinámicas marcadas *(prescindible)* en este orden: puente a RAG → de palabras a oraciones → cuenta con tarjetas.

## 🏁 Facilitación del taller

| Reto | Hallazgos esperados | Qué hacer si no ocurre |
|---|---|---|
| 1 Mapa de palabras | Grupos claros (animales, transportes, alimentos) y vecinos justificados | Pide que expliquen por qué ubicaron una palabra ahí |
| 2 Palabras vs. significado | La búsqueda por palabras falla en las 3 consultas; la de significado acierta | Prueba una consulta nueva sin palabras en común |
| 3 Analogías | Una analogía funciona y otra falla o muestra un sesgo | Propón *hombre es a programador como mujer es a…* y comenten |
| 4 Mismo vector, distinto significado | "banco", "llave" y "vino" distintos en contextual e iguales en estático | Pide una frase propia con otra palabra ambigua |

**Respuestas del reto 2**: consulta 1 → F1; consulta 2 → F4; consulta 3 → F6; consulta 4 → F7 (ninguna comparte palabras con su ficha). Una consulta extra: «bebida caliente» → F5.

**Respuestas del reto 3**: actriz; gatito; Perú; la de la bicicleta admite varias respuestas (volante, motor, acelerador…); la del programador es el ejemplo de sesgo del estudio de 2016.

**Nota**: los ejes del mapa son arbitrarios; evalúa las **justificaciones** de cercanía, no las coordenadas exactas.

### 📏 Criterios de evaluación del taller

- Documenta al menos un hallazgo por reto realizado.
- Justifica la cercanía con el significado.
- Relaciona cada hallazgo con un concepto de la sección.
- Presenta un hallazgo al grupo.

## 📌 Cierre

Pide a cada persona una frase: "Hoy aprendí que…". Anota 3 para retomar en la sección siguiente (bases vectoriales).
