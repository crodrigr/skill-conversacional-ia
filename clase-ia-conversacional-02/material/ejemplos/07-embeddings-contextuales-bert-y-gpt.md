# 💡 Ejemplo 07 — Embeddings contextuales: BERT y GPT

## 🌍 Contexto

Una palabra puede significar cosas distintas según la frase. Con un vector fijo, el modelo no puede distinguirlas.

## 🧠 Concepto

Un embedding **contextual** cambia según la frase: el vector de una palabra depende de las palabras que la rodean.

🔗 **Analogía**: un diccionario con una sola definición frente a una persona que **entiende según la conversación**.

## 🧭 Explicación paso a paso

**1. El problema**

| Frase | Sentido de "banco" |
|---|---|
| *Me senté en el banco del parque.* | asiento |
| *Fui al banco a retirar dinero.* | entidad financiera |

Con un vector fijo, ambas frases darían **el mismo** vector.

**2. BERT** (Jacob Devlin y colaboradores, Google AI Language, 2018)

- Usa un **Transformer** (el mismo tipo de arquitectura del Módulo 01).
- Se entrena **tapando palabras** de una frase y adivinándolas con el contexto de **ambos lados** (izquierda y derecha).
- Resultado: un vector por token que **depende de toda la frase**.

**3. GPT** (Alec Radford y colaboradores, OpenAI, 2018)

- También usa un **Transformer**.
- Se entrena **leyendo de izquierda a derecha**, para predecir **lo que sigue**.
- Sus representaciones internas también son **contextuales**.
- Además, varios proveedores ofrecen **modelos dedicados a producir embeddings de texto**; son los que suelen usarse para buscar por significado.

**4. ¿Quién lee qué?**

| | BERT | GPT |
|---|---|---|
| Mira | Ambos lados | De izquierda a derecha |
| Entrenamiento | Adivinar palabras tapadas | Predecir la siguiente palabra |
| Año | 2018 | 2018 |

**5. De palabras a oraciones**

- Para comparar **frases o documentos** se necesitan vectores pensados para eso. Usar directamente las salidas de BERT da resultados pobres; por eso aparecieron variantes como **Sentence-BERT** (2019).
- Hoy, las búsquedas por significado usan modelos de **embeddings de texto** diseñados para frases y párrafos.

## ✅ Resultado esperado

El estudiante explica por qué el vector de "banco" es distinto en las dos frases con BERT o GPT y diferencia a ambos por la forma de leer.

## 🎲 Dinámicas

- **Votación**: ¿el vector de "banco" es el mismo en las dos frases? (No, con BERT o GPT.)
- **¿Quién lee qué?**: emparejar las tarjetas «ambos lados», «de izquierda a derecha» con BERT y GPT.
