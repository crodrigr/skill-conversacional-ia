# 📚 Explicación conceptual — Fundamentos de Embeddings

## 🎯 Objetivo

Entender, sin matemáticas ni código, qué es un embedding, cómo se obtiene, qué tipos existen y para qué sirve al personalizar un sistema experto.

---

## 🌍 B1 · Qué es un embedding

### 🧠 Concepto: Embedding

Un **embedding** es un **vector** (una lista de números) que representa el **significado** de una palabra, una frase o un documento.

- Las máquinas **calculan con números**, no con letras.
- El embedding traduce el sentido a **coordenadas**.
- Con dos números ya se puede dibujar un mapa; los modelos reales usan **cientos o miles**.

🔗 **Analogía**: dar las coordenadas de una ciudad para saber dónde está y qué tiene cerca.

📎 Ver en la práctica: [Ejemplo 01 — Definición y mapa de palabras](01-definicion-y-mapa-de-palabras.md)

### 🧠 Concepto: Espacio vectorial

El **espacio vectorial** es el "mapa" donde viven los vectores.

- **Cerca** significa significado parecido; **lejos**, distinto.
- Los ejes **no tienen un nombre claro**: lo importante es la cercanía.
- Se dibuja en 2 o 3 dimensiones por pedagogía; la idea no cambia con más.

🔗 **Analogía**: un mapa de barrios donde las palabras parecidas viven en el mismo barrio.

📎 Ver en la práctica: [Ejemplo 01 — Definición y mapa de palabras](01-definicion-y-mapa-de-palabras.md)

---

## 🌍 B2 · Cómo funciona un embedding

### 🧠 Concepto: Del texto al vector

El texto pasa por pasos hasta convertirse en vector.

- **Texto** → se parte en **tokens**.
- Cada **token** pasa a ser un **vector**.
- Los vectores se pueden **combinar** para representar una frase o un documento.
- Existen embeddings de **palabras**, de **oraciones** y de **documentos**.

🔗 **Analogía**: convertir una receta en una lista de ingredientes con cantidades.

📎 Ver en la práctica: [Ejemplo 02 — Del texto al vector](02-del-texto-al-vector.md)

### 🧠 Concepto: Aprender por contexto

El modelo aprende **dónde ubicar** cada palabra mirando las palabras que la rodean.

- Las palabras que aparecen en **contextos parecidos** reciben vectores **cercanos**.
- Así *perro* y *gato* quedan cerca, y *avión* lejos.
- Nadie escribe a mano las coordenadas: **se aprenden** de muchísimo texto.

🔗 **Analogía**: "Dime con quién andas y te diré quién eres".

📎 Ver en la práctica: [Ejemplo 02 — Del texto al vector](02-del-texto-al-vector.md)

### 🧠 Concepto: Similitud

Medir **qué tan parecidos** son dos textos es medir **qué tan cerca** están sus vectores.

- **Distancia**: qué tan separados están.
- **Ángulo** (similitud del coseno): si apuntan hacia el mismo lado.
- Permite **buscar por significado**, incluso sin palabras en común.

🔗 **Analogía**: dos personas del mismo barrio se parecen en lo que tienen cerca, aunque se llamen distinto.

📎 Ver en la práctica: [Ejemplo 03 — Similitud: palabras vs. significado](03-similitud-palabras-vs-significado.md)

### 🧠 Concepto: Analogías vectoriales y sesgos

El espacio guarda **relaciones**, no solo cercanías.

- Ejemplo clásico: **rey − hombre + mujer ≈ reina** (Mikolov, Yih y Zweig, 2013).
- Es **aproximado**: no siempre se cumple.
- Los embeddings **heredan sesgos** del texto con que se aprendieron (Bolukbasi y colaboradores, 2016).
- Hay que revisar los resultados antes de usarlos en decisiones.

🔗 **Analogía**: si sabes cómo ir de "hombre" a "mujer" en el mapa, puedes dar el mismo paso desde "rey".

📎 Ver en la práctica: [Ejemplo 04 — Analogías vectoriales y sesgos](04-analogias-y-sesgos.md)

---

## 🌍 B3 · Embeddings estáticos: Word2Vec y GloVe

### 🧠 Concepto: Embedding estático

Un embedding **estático** da **un solo vector fijo** por palabra.

- Es rápido y ligero.
- Capta bien similitudes entre palabras.
- No distingue sentidos: "banco" tiene el mismo vector en todas las frases.

🔗 **Analogía**: un diccionario con una sola definición por palabra.

📎 Ver en la práctica: [Ejemplo 05 — Word2Vec](05-word2vec.md)

### 🧠 Concepto: Word2Vec

**Word2Vec** (Mikolov y colaboradores, Google, 2013) aprende adivinando palabras.

- **CBOW**: adivina la palabra a partir de su contexto.
- **Skip-gram**: adivina el contexto a partir de la palabra.
- Resultado: una tabla con un vector por palabra.

🔗 **Analogía**: jugar millones de veces a adivinar la palabra oculta.

📎 Ver en la práctica: [Ejemplo 05 — Word2Vec](05-word2vec.md)

### 🧠 Concepto: GloVe

**GloVe** (Pennington, Socher y Manning, Stanford, 2014) usa **conteos globales**.

- Cuenta **cuántas veces aparecen juntas** las palabras en todo el texto.
- Usa esos conteos para construir los vectores.
- También da **un vector por palabra**.

🔗 **Analogía**: el registro de una biblioteca que anota qué palabras comparten página.

📎 Ver en la práctica: [Ejemplo 06 — GloVe](06-glove.md)

---

## 🌍 B4 · Embeddings contextuales: BERT y GPT

### 🧠 Concepto: Embedding contextual

Un embedding **contextual** cambia según la frase.

- El vector de una palabra depende de las palabras que la rodean.
- Resuelve ambigüedades como la de "banco".
- Es el tipo que usan los modelos de hoy.

🔗 **Analogía**: una persona que entiende según la conversación, frente a un diccionario con una sola definición.

📎 Ver en la práctica: [Ejemplo 07 — Embeddings contextuales: BERT y GPT](07-embeddings-contextuales-bert-y-gpt.md)

### 🧠 Concepto: BERT

**BERT** (Devlin y colaboradores, Google, 2018) lee la frase completa.

- Usa un **Transformer**.
- Se entrena **tapando palabras** y adivinándolas con el contexto de **ambos lados**.
- Es muy usado para comprender y clasificar frases.

🔗 **Analogía**: completar un crucigrama mirando las letras de ambos lados de cada hueco.

📎 Ver en la práctica: [Ejemplo 07 — Embeddings contextuales: BERT y GPT](07-embeddings-contextuales-bert-y-gpt.md)

### 🧠 Concepto: GPT

**GPT** (Radford y colaboradores, OpenAI, 2018) lee de **izquierda a derecha**.

- Usa un **Transformer**.
- Se entrena **prediciendo la siguiente palabra**.
- Sus representaciones internas son contextuales.
- Varios proveedores ofrecen **modelos dedicados a producir embeddings de texto**.

🔗 **Analogía**: alguien que lee y va anticipando cómo sigue la frase.

📎 Ver en la práctica: [Ejemplo 07 — Embeddings contextuales: BERT y GPT](07-embeddings-contextuales-bert-y-gpt.md)

### 🧠 Concepto: De palabras a oraciones y documentos

Para **buscar por significado** se necesitan vectores de **frases y documentos**.

- Usar directamente las salidas de BERT da resultados pobres para comparar oraciones.
- Aparecieron variantes como **Sentence-BERT** (2019) y modelos de **embeddings de texto**.
- Un documento largo se suele partir en **fragmentos**, cada uno con su vector.

🔗 **Analogía**: pasar de tener una ficha por palabra a tener una ficha por párrafo.

📎 Ver en la práctica: [Ejemplo 07 — Embeddings contextuales: BERT y GPT](07-embeddings-contextuales-bert-y-gpt.md)

---

## 🌍 B5 · Elegir, usos y adelanto

### 🧠 Concepto: Elegir un tipo de embedding

Se elige con **criterios**, no por moda.

- ¿Importa el **contexto**?
- ¿Qué **tarea** es?
- ¿Qué **recursos** hay?
- ¿Qué **idioma** y qué tipo de texto?

🔗 **Analogía**: elegir la herramienta adecuada para cada tornillo.

📎 Ver en la práctica: [Ejemplo 08 — Comparar, elegir y usos](08-comparar-elegir-y-usos.md)

### 🧠 Concepto: Usos y limitaciones

Los embeddings alimentan muchas funciones.

- **Búsqueda por significado**, **recomendación**, **clasificación**, **detección de duplicados** y **base de conocimiento propia**.
- Limitaciones: **sesgos**, dependencia del **idioma** y de los **datos**, y que **no entienden**: miden patrones de uso.

🔗 **Analogía**: un buen mapa ayuda a llegar, pero no sabe a dónde quieres ir.

📎 Ver en la práctica: [Ejemplo 08 — Comparar, elegir y usos](08-comparar-elegir-y-usos.md)

### 🌉 Concepto: Puente a bases vectoriales y RAG

Si guardas los vectores de **tus documentos** puedes buscar el que **más se parece** a una pregunta.

- Con eso un sistema puede **responder con conocimiento propio**.
- Es la base de las **bases vectoriales** y de **RAG**.
- Se desarrolla en las secciones siguientes del módulo.

🔗 **Analogía**: pasar de un examen a libro cerrado a uno a **libro abierto**, con un buen índice.

📎 Ver en la práctica: [Ejemplo 08 — Comparar, elegir y usos](08-comparar-elegir-y-usos.md)

---

## 📌 Resumen

- Embedding = significado convertido en números.
- Cerca = parecido; el espacio guarda relaciones.
- Se aprende por contexto, de muchísimo texto.
- **Estáticos** (Word2Vec, GloVe): un vector por palabra.
- **Contextuales** (BERT, GPT): el vector cambia según la frase.
- Se elige según el contexto, la tarea, los recursos y el idioma.
- Úsalos con cuidado: sesgos, idioma y datos.
