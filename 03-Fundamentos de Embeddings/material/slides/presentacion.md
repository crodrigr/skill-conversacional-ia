# Fundamentos de Embeddings

Módulo 02 · Personalización de un Sistema Experto

---

# 🎯 ¿Qué lograrás hoy?

- Explicar qué es un embedding
- Entender cómo se obtiene y cómo se compara
- Conocer Word2Vec, GloVe, BERT y GPT
- Elegir un tipo según la necesidad

---

# 📅 La ruta de hoy

| Parte | Tiempo |
|---|---|
| 📍 Qué es un embedding | 20 min |
| ⚙️ Cómo funciona | 30 min |
| 🧱 Word2Vec y GloVe | 25 min |
| 🔦 BERT y GPT | 25 min |
| 📊 Comparar, usos y quiz | 20 min |
| 🛠️ Taller | 60 min |

---

# 🎲 Mapa de palabras

Cada equipo recibe una palabra.

**Ubíquense en el mapa:** las parecidas, **cerca**.

⏱️ 7 minutos

---

# 🔁 Antes de empezar

- 🧩 **Token**: un trozo de texto
- 🔢 **Vector**: una lista de números
- 🗺️ **Mapa**: dónde "vive" el significado

---

# 📍 ¿Qué es un embedding?

Un **vector** (lista de números)
que representa el **significado** de un texto.

`perro → (2, 8)` · `gato → (3, 8)` · `auto → (8, 2)`

---

# 🔢 ¿Por qué números?

Las máquinas **calculan con números**,
no con letras.

El embedding traduce **sentido → coordenadas**.

---

# 🗺️ El espacio vectorial

**Cerca** = parecido
**Lejos** = distinto

En la realidad: **cientos o miles** de ejes.

---

# 🧩 Del texto al vector

```text
Texto → Tokens → Vectores → Comparar cercanía
```

---

# 👯 "Dime con quién andas…"

Una palabra se define por **las palabras que la rodean**.

*"El ___ ladra en el parque."*

---

# 🎲 Completa la frase

Tapa una palabra. ¿Qué palabras caben?

Las que caben **tienen vectores cercanos**.

⏱️ 4 minutos

---

# 📏 ¿Cuán cerca están?

- 📐 **Distancia**: qué tan lejos
- 🧭 **Ángulo**: hacia dónde apuntan (coseno)

---

# 🔎 Palabras vs. significado

Consulta: **"insomnio"**

- Por palabras: ❌ no encuentra nada
- Por significado: ✅ "consejos para dormir"

---

# 🎲 ¿Se parecen?

Dos frases, **cero palabras en común**.

Vota: 👍 cerca · 👎 lejos

---

# ➕ Analogías vectoriales

**rey − hombre + mujer ≈ reina**

El mapa guarda **relaciones**.

*(Aproximado: no siempre se cumple.)*

---

# ⚖️ Los sesgos también viajan

El modelo aprende de textos humanos.

También aprende **sus estereotipos**.

---

# 🎯 Word2Vec (2013)

Google · Mikolov y colaboradores

Aprende **adivinando palabras** a partir de su contexto.

---

# 🎲 La palabra oculta

*"El gato bebe ___ en su plato."*

CBOW: **contexto → palabra**
Skip-gram: **palabra → contexto**

---

# 📚 GloVe (2014)

Stanford · Pennington, Socher y Manning

Cuenta **cuántas veces** aparecen juntas las palabras.

---

# 🎲 Cuenta con tarjetas

Tabla de coocurrencia:

¿Qué palabras andan **siempre juntas**?

⏱️ 4 minutos

---

# ⚔️ Word2Vec vs. GloVe

| | Word2Vec | GloVe |
|---|---|---|
| Aprende de | contexto local | conteos globales |
| Vector por palabra | 1 | 1 |

---

# 🎲 ¿Cuántos vectores tiene "banco"?

**Un solo vector** para todos sus sentidos.

¿Qué problema trae?

---

# 🔦 BERT (2018)

Google · Devlin y colaboradores

Lee la frase **completa**, mirando **a ambos lados**.

---

# 🎲 ¿Qué "banco" es?

1. *Me senté en el **banco** del parque.*
2. *Fui al **banco** a retirar dinero.*

¿Mismo vector? ✋ **No**.

---

# ✍️ GPT (2018)

OpenAI · Radford y colaboradores

Lee de **izquierda a derecha** para predecir lo que sigue.

---

# 🎲 ¿Quién lee qué?

- ⬅️➡️ Ambos lados → **BERT**
- ➡️ Solo hacia adelante → **GPT**

Empareja las tarjetas.

---

# 🔄 Estático vs. contextual

- 📖 **Estático**: una definición por palabra
- 🗣️ **Contextual**: el sentido cambia con la frase

---

# 📄 De palabras a oraciones

También hay embeddings de **frases y documentos**.

Con ellos se **busca por significado**.

---

# 📊 Los cuatro tipos

| Tipo | Año | Vector |
|---|---|---|
| Word2Vec | 2013 | fijo |
| GloVe | 2014 | fijo |
| BERT | 2018 | contextual |
| GPT | 2018 | contextual |

---

# 🎲 Clasifica con tarjetas

Origen · idea · tipo de vector

Une cada tarjeta con su modelo.

---

# 🧭 ¿Cuál elegir?

- ¿Importa el **contexto**?
- ¿Qué **tarea** es?
- ¿Qué **recursos** hay?
- ¿Qué **idioma**?

---

# 🎲 Tres casos

1. Buscar en manuales internos
2. Clasificar opiniones
3. Sugerir sinónimos

Vota el tipo.

---

# 🧰 ¿Para qué sirven?

Búsqueda por significado · Recomendación · Clasificación · Duplicados · **Base de conocimiento propia**

---

# ⚠️ Límites

- ⚖️ Sesgos
- 🌍 Depende del idioma y los datos
- 🧐 No "entiende": mide **patrones de uso**

---

# 🌉 Y después…

Guardar los vectores de **tus documentos**
y buscar por cercanía.

Eso permite **responder con conocimiento propio**.

---

# 📌 Lo que te llevas

- Embedding = significado en números
- Cerca = parecido
- Se aprende por contexto
- Estático: 1 vector · Contextual: cambia
- Elige según la tarea

---

# ❓ Quiz relámpago

10 preguntas · 6 minutos

---

# 🛠️ Ahora, el taller

Equipos de 3–4 · 4 retos · 60 minutos
