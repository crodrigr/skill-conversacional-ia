# 🧑‍🏫 Lectura para el docente — Fundamentos de Embeddings

> Material solo para el docente. Está escrito en lenguaje sencillo: si lo lees una vez (≈ 40 minutos), podrás dictar la sección con tranquilidad.

## 🎯 Cómo usar esta lectura

1. Lee primero **"La idea en una página"**.
2. Antes de cada bloque, lee su sección: *lo esencial*, *lo que puedes decir en voz alta*, *errores comunes* y *si te preguntan…*.
3. Ten a mano el [glosario](../ejemplos/glosario.md).
4. **No necesitas saber más** de lo que está aquí. Para lo que no sepas, ve a "Cuando no sepas".

## 🧭 La idea en una página

- Una máquina **no entiende palabras**: calcula con **números**.
- Un **embedding** es una lista de números (un **vector**) que representa el **significado** de un texto: es como sus **coordenadas en un mapa**.
- En ese mapa, **cerca = parecido** y **lejos = distinto**.
- El modelo **aprende** el mapa leyendo muchísimo texto: las palabras que aparecen entre las mismas compañías quedan **cerca** ("dime con quién andas…").
- **Word2Vec** y **GloVe** (2013 y 2014) dan **un vector fijo por palabra**. **BERT** y **GPT** (2018) dan vectores que **cambian según la frase**.
- Con embeddings se puede **buscar por significado**: la base de personalizar un asistente con documentos propios.
- Cuidado: heredan **sesgos** y **no entienden**; miden patrones de uso.

---

## 🌍 B1 · Qué es un embedding

### 🔑 Lo esencial

- Un embedding es un **vector**: una lista de números que ubica el significado de una palabra, una frase o un documento.
- Con **dos números** se puede dibujar un mapa. Los modelos reales usan **cientos o miles**, pero la idea es la misma.
- Los **ejes no tienen nombre**: nadie sabe qué significa cada número por separado. Lo útil es **qué tan cerca** quedan las cosas.

### 🗣️ Lo que puedes decir en voz alta

- "Las coordenadas de una ciudad te dicen dónde está y qué tiene cerca. Un embedding hace lo mismo con el significado."
- "La máquina no compara 'perro' con 'gato' como letras; compara sus coordenadas."

### ⚠️ Errores comunes

- Pensar que un embedding es una **traducción**.
- Pensar que cada número "significa" algo (por ejemplo, "el primero es si es animal"). **No**: es una distribución difícil de interpretar.
- Creer que el mapa de dos ejes es **el real**. Es solo una **simplificación** para poder dibujarlo.

### ❓ Si te preguntan…

- **¿Cuántas dimensiones tiene un embedding real?** Cientos o miles. Los clásicos suelen tener unos cientos. No des una cifra exacta: depende del modelo.
- **¿Se pueden dibujar?** No directamente; existen herramientas que los "aplastan" a 2 o 3 dimensiones, perdiendo algo de información.
- **¿Es lo mismo que un token?** No: el token es el trozo de texto; el embedding es el vector asociado.

---

## 🌍 B2 · Cómo funciona

### 🔑 Lo esencial

- **Texto → tokens → vectores → comparar.**
- El modelo **aprende** dónde ubicar cada palabra mirando **con qué palabras aparece**. Es una regla simple: contextos parecidos, vectores cercanos.
- Se mide la cercanía con la **distancia** o, más habitual, con el **ángulo** entre los vectores (la **similitud del coseno**): si "apuntan hacia el mismo lado", se parecen.
- Gracias a esto se puede **buscar por significado**: "insomnio" encuentra "consejos para dormir".
- Hay **analogías**: **rey − hombre + mujer ≈ reina** (de un artículo de Mikolov, Yih y Zweig, 2013). Es **aproximado**.
- **Sesgos**: como se aprende de textos escritos por personas, se heredan sus estereotipos (Bolukbasi y colaboradores, 2016).

### 🗣️ Lo que puedes decir en voz alta

- "Dime con quién andas y te diré quién eres: eso es lo que hace el modelo con las palabras."
- "Dos frases pueden no compartir ni una palabra y aun así estar muy cerca."
- "El modelo no tiene opiniones; refleja lo que leyó."

### ⚠️ Errores comunes

- Creer que la analogía **siempre** funciona. Se cumple **de forma aproximada** y no en todos los casos.
- Creer que el sesgo es "un error del programa". Viene de los textos con que se entrenó.
- Confundir **similitud** con **igualdad**.

### ❓ Si te preguntan…

- **¿Qué es el coseno?** "La idea es si dos flechas apuntan hacia el mismo lado. No necesitas la fórmula."
- **¿Cómo se corrige un sesgo?** Existen técnicas para reducirlo, pero no lo eliminan por completo; lo importante es **revisar** los resultados.
- **¿Por qué busca bien aunque no haya palabras iguales?** Porque compara el **significado** (la cercanía de los vectores), no las letras.

---

## 🌍 B3 · Word2Vec y GloVe

### 🔑 Lo esencial

- **Word2Vec** (Tomas Mikolov y colaboradores, **Google, 2013**) aprende vectores **adivinando palabras**:
  - **CBOW**: adivina la palabra del medio a partir de las que la rodean.
  - **Skip-gram**: a partir de una palabra, adivina las que la rodean.
- **GloVe** (Pennington, Socher y Manning, **Stanford, 2014**) parte de una **tabla de cuántas veces aparecen juntas** las palabras en todo el texto (**coocurrencia**) y de ahí saca los vectores.
- Los dos son **estáticos**: **un vector fijo por palabra**. "Banco" tiene un solo vector aunque sea de parque o de dinero.

### 🗣️ Lo que puedes decir en voz alta

- "Word2Vec aprende jugando a adivinar la palabra oculta."
- "GloVe aprende contando cuántas veces andan juntas las palabras en toda la biblioteca."
- "Los dos tienen un límite: una palabra, un vector."

### ⚠️ Errores comunes

- Pensar que **Word2Vec** y **GloVe** son rivales: son **dos caminos** al mismo tipo de resultado.
- Pensar que son "los de antes" y ya no sirven: son **ligeros y útiles** para tareas sencillas.
- Creer que distinguen los sentidos de una palabra. **No**.

### ❓ Si te preguntan…

- **¿Cuál es mejor?** Depende de la tarea y de los datos. Para esta clase, la diferencia clave es la **idea** (adivinar frente a contar), no el rendimiento.
- **¿Qué pasa con una palabra que no vio?** Un Word2Vec o GloVe básico **no tiene vector** para ella.
- **¿Se siguen usando?** Sí, en tareas sencillas y como punto de partida didáctico.

---

## 🌍 B4 · BERT y GPT

### 🔑 Lo esencial

- Ambos usan la arquitectura **Transformer** (la del Módulo 01) y producen vectores **contextuales**: el vector de una palabra **depende de la frase**.
- **BERT** (Devlin y colaboradores, **Google, 2018**) se entrena **tapando palabras** y adivinándolas con las de **ambos lados**: lee la frase completa.
- **GPT** (Radford y colaboradores, **OpenAI, 2018**) se entrena **prediciendo la palabra siguiente**, leyendo **de izquierda a derecha**.
- Para **comparar frases y documentos**, las salidas directas de BERT no son ideales; por eso aparecieron variantes como **Sentence-BERT** (2019) y **modelos dedicados a producir embeddings de texto**, que ofrecen varios proveedores.

### 🗣️ Lo que puedes decir en voz alta

- "BERT es como completar un crucigrama mirando las letras de los dos lados."
- "GPT es como alguien que lee y va anticipando cómo sigue la frase."
- "Con estos modelos, 'banco' tiene un vector distinto en cada frase."

### ⚠️ Errores comunes

- Creer que **GPT** y **BERT** son "lo mismo": comparten la base, pero **leen distinto**.
- Si hablas de *encoder* y *decoder*: **no los necesitas**; di "mira ambos lados" y "va de izquierda a derecha".
- Pensar que un embedding contextual es **un solo vector por frase**: hay **un vector por token**; luego se pueden combinar.

### ❓ Si te preguntan…

- **¿Cuál es mejor para buscar?** Para buscar por significado se usan modelos pensados para producir embeddings de frases y documentos.
- **¿ChatGPT usa embeddings?** Los modelos de lenguaje trabajan con representaciones internas de este tipo; además, los sistemas que consultan documentos suelen usar modelos de embeddings de texto aparte.
- **¿Hay que entrenarlos uno mismo?** Normalmente no: se usan modelos ya entrenados.

---

## 🌍 B5 · Elegir, usos y puente

### 🔑 Lo esencial

- Se elige por **criterios**: contexto, tarea, recursos, idioma.
  - Palabras sueltas y pocos recursos → **Word2Vec o GloVe**.
  - Frases y contexto → **BERT o un modelo de embeddings de texto**.
- Usos: búsqueda por significado, recomendación, clasificación, duplicados y **base de conocimiento propia**.
- Límites: sesgos, idioma y datos, y **no entienden**.
- **Puente**: guardar los vectores de tus documentos y buscar el más cercano a una pregunta permite **responder con conocimiento propio**. Se verá en las secciones siguientes.

### 🗣️ Lo que puedes decir en voz alta

- "No hay un tipo mejor: hay uno que **encaja** con cada necesidad."
- "Es como un archivo ordenado por significado en vez de por orden alfabético."
- "Esto es la base de lo que haremos después: asistentes con tus propios documentos."

### ⚠️ Errores comunes

- Creer que "lo más nuevo es siempre lo mejor".
- Creer que, con embeddings, el asistente ya **sabe** los documentos: solo los **encuentra**.

### ❓ Si te preguntan…

- **¿Qué es una base vectorial?** Un almacén que guarda vectores y encuentra los más cercanos a una consulta. Se verá después.
- **¿Qué es RAG?** Consultar documentos antes de responder ("examen a libro abierto"). También se verá después.

---

## 🛠️ Taller: qué hacer cuando algo no sale como esperabas

| Situación | Qué decir |
|---|---|
| "Mi mapa quedó distinto al de otro equipo" | "Es normal: los ejes son arbitrarios. Lo importante es que **las parecidas queden cerca**." |
| "La búsqueda por palabras sí encontró" | "Bien: probemos con una consulta **sin ninguna palabra en común**." |
| "La analogía no salió" | "Es una limitación: las analogías son **aproximadas**." |
| "No sé si el vector es igual o distinto" | "Pregunta: ¿cambia el **significado** con la frase? Si cambia, un embedding contextual da vectores distintos." |

## 🙋 Cuando no sepas

- "Buena pregunta. No tengo certeza; lo investigo y lo traigo en la próxima sesión."
- "Es un tema en el que los especialistas aún discuten."
- "Probemos mirarlo juntos y **verifiquemos**."

## 📚 Para profundizar (opcional)

- Mikolov, Chen, Corrado y Dean (2013), *Efficient Estimation of Word Representations in Vector Space* (Word2Vec).
- Mikolov, Yih y Zweig (2013), *Linguistic Regularities in Continuous Space Word Representations* (analogías).
- Pennington, Socher y Manning (2014), *GloVe: Global Vectors for Word Representation*.
- Devlin y colaboradores (2018), *BERT: Pre-training of Deep Bidirectional Transformers for Language Understanding*.
- Radford y colaboradores (2018), *Improving Language Understanding by Generative Pre-Training* (OpenAI).
- Reimers y Gurevych (2019), *Sentence-BERT*.
- Bolukbasi y colaboradores (2016), *Man is to Computer Programmer as Woman is to Homemaker? Debiasing Word Embeddings*.
- Videos divulgativos sobre embeddings y Transformers (por ejemplo, la serie de 3Blue1Brown).

## 📌 Checklist antes de clase

- [ ] Leí "La idea en una página".
- [ ] Imprimí las cuadrículas y tarjetas del anexo del taller y de la guía.
- [ ] Repasé el Módulo 01 (token, vector, mapa) en 2 minutos.
- [ ] Tengo el glosario a mano.
- [ ] Pensé una frase para "cuando no sepa".
