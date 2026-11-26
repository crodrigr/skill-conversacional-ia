# 💡 Ejemplo 08 — Comparar, elegir y usos

## 🌍 Contexto

Ya conoces cuatro tipos de embeddings. ¿Cuál conviene según lo que necesites?

## 🧠 Concepto

Elegir un tipo de embedding es **decidir con criterios**: si importa el contexto, qué tarea es, qué recursos hay y en qué idioma se trabaja.

🔗 **Analogía**: elegir herramienta: un destornillador sirve para unos tornillos y no para otros.

## 🧭 Explicación paso a paso

**1. Tabla comparativa**

| Tipo | Origen | Año | Vector | Idea | Uso típico | Limitación |
|---|---|---|---|---|---|---|
| Word2Vec | Google | 2013 | Fijo | Adivinar palabra y contexto | Similitud entre palabras | Un vector por palabra |
| GloVe | Stanford | 2014 | Fijo | Conteos globales de coocurrencia | Similitud entre palabras | Un vector por palabra |
| BERT | Google | 2018 | Contextual | Adivinar palabras tapadas, mirando ambos lados | Comprensión y clasificación de frases | Más cómputo |
| GPT | OpenAI | 2018 | Contextual | Predecir lo que sigue, de izquierda a derecha | Generación; modelos de embeddings de texto | Más cómputo; depende de proveedores |

**2. Criterios para elegir**

- ¿Importa el **contexto** (palabras con varios sentidos)?
- ¿Qué **tarea** es (buscar, clasificar, agrupar)?
- ¿Qué **recursos** hay (equipo y tiempo)?
- ¿Qué **idioma** y qué tipo de texto?

**3. Tres casos**

| Caso | Tipo recomendado | Criterio |
|---|---|---|
| Buscar en manuales internos aunque la consulta use otras palabras | Embeddings de **texto contextuales** (modelos de embeddings de texto o variantes de BERT) | Trabaja con frases y necesita contexto |
| Sugerir sinónimos o palabras parecidas en un diccionario sencillo | **Word2Vec** o **GloVe** | Palabras sueltas, pocos recursos |
| Clasificar opiniones de clientes como positivas o negativas | **BERT** o un modelo de embeddings de texto | El sentido depende de la frase |

**4. Usos de los embeddings**

- 🔎 **Búsqueda por significado**.
- 🎁 **Recomendación** de contenidos parecidos.
- 🗂️ **Clasificación** de textos.
- 🧹 **Detección de duplicados**.
- 📚 **Base de conocimiento propia**: guardar los vectores de tus documentos.

**5. Limitaciones**

- Heredan **sesgos** del texto con que se entrenaron.
- Dependen del **idioma** y de los **datos**.
- No "entienden": miden **patrones de uso**.

## 🌉 Puente

Si guardas los vectores de **tus documentos** y buscas por cercanía el que más se parece a una pregunta, puedes **responder con conocimiento propio**. Eso es lo que verás en las secciones siguientes (bases vectoriales y RAG).

## ✅ Resultado esperado

El estudiante elige un tipo para un caso nuevo y justifica con al menos un criterio, y menciona tres usos y una limitación.

## 🎲 Dinámicas

- **Clasifica con tarjetas**: unir origen, idea y tipo de vector con cada modelo.
- **Tres casos**: votar el tipo recomendado y justificar.
