# 🔑 Soluciones de los ejercicios

## 🟢 Ejercicio 01

1. Un embedding **no traduce idiomas**: es un **vector** (lista de números) que representa el **significado** de un texto.
2. Porque las máquinas **calculan con números**, no con letras.
3. Son **coordenadas**: ubican a *sol* en un mapa de significado.

## 🟢 Ejercicio 02

- Grupos: **transportes** (tren, bus, barco) y **frutas** (manzana, pera, uva).
- Más cerca de *bus*: **tren**. Más cerca de *pera*: **uva** (o *manzana*).
- *Tren* y *uva* están lejos porque sus significados son muy distintos.

## 🟢 Ejercicio 03

- Orden: **D → B → C → E → A**.
- Aprende por contexto: las palabras que aparecen en contextos parecidos reciben vectores cercanos.

## 🟢 Ejercicio 04

1. Orden por significado: **A** (mascota que pierde el apetito) → **C** (menciona al gato, pero no tiene relación con comer) → **B** (trenes).
2. Por palabras exactas podría elegir **C** (repite "mi gatito"); por significado, **A**.
3. Difieren porque una compara letras y la otra, la cercanía de los vectores.

## 🟡 Ejercicio 05

1. *reina*; *Lima*.
2. Es aproximada porque se busca el vector **más cercano**, no uno exacto, y depende del modelo y los datos.
3. Puede dar un estereotipo (por ejemplo una ocupación doméstica) heredado de los **textos de entrenamiento**.
4. Revisar y validar los resultados, y no usarlos solos en decisiones.

## 🟡 Ejercicio 06

1. Conteos: **1, 1 y 1**.
2. **GloVe** usa estos conteos globales para que la relación entre vectores refleje cuánto aparecen juntas las palabras.
3. **Word2Vec** (CBOW) adivina una palabra a partir de las que la rodean; (Skip-gram) adivina el contexto a partir de la palabra.
4. Ambos dan **un vector por palabra** y no distinguen sentidos.

## 🟡 Ejercicio 07

| Pareja | (a) Word2Vec / GloVe | (b) BERT / GPT |
|---|---|---|
| 1 llave | Mismo vector | Vectores distintos |
| 2 vino | Mismo vector | Vectores distintos |
| 3 banco (misma frase) | Mismo vector | Mismo vector |

- **Estático**: un vector fijo por palabra. **Contextual**: cambia según la frase.
- **BERT** mira ambos lados; **GPT**, de izquierda a derecha.

## 🟡 Ejercicio 08

1. **Modelo de embeddings de texto**: trabaja con frases y necesita contexto.
2. **Word2Vec** o **GloVe**: palabras sueltas y pocos recursos.
3. **BERT** o un modelo de embeddings de texto: el sentido depende de la frase.
- Caso 1: uso, búsqueda por significado en documentos propios; limitación, sesgos o dependencia del idioma y de los datos (otra respuesta coherente es válida).
