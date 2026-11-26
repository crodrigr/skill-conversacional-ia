# 🛠️ Taller 01 — Explora el mapa de significados

## 🎯 Objetivo

Practicar con mapas, tarjetas y búsquedas, sin programar, para comprobar con tus propias observaciones qué es un embedding, cómo se mide la cercanía y en qué se diferencian los vectores fijos de los contextuales.

## 🚧 Reglas

- Equipos de **3 a 4** personas.
- **No necesitas pantallas ni internet**: el taller funciona con tarjetas y cuadrículas impresas (ver el 📎 Anexo).
- Los ejes del mapa son **arbitrarios**: lo importante es **qué queda cerca de qué y por qué**.
- Usa **solo textos ficticios**; no escribas datos personales en ningún asistente.
- ⏱️ Total: 60 minutos.

## 🪜 Pasos

| Tiempo | Actividad | Min |
|---|---|---|
| 0:00 | Reglas y equipos | 5 |
| 0:05 | 🏁 Reto 1 · Mapa de palabras | 12 |
| 0:17 | 🏁 Reto 2 · Palabras vs. significado | 12 |
| 0:29 | 🏁 Reto 3 · Analogías vectoriales | 8 |
| 0:37 | 🏁 Reto 4 · Mismo vector, distinto significado | 10 |
| 0:47 | Presentación de hallazgos | 8 |
| 0:55 | Reflexión | 5 |

---

## 🏁 Reto 1 — Mapa de palabras (12 min)

### 🧰 Materiales

La **cuadrícula** de 0 a 10 y las **12 tarjetas** de palabras del anexo.

### 🪜 Pasos

1. **Sin mirar las coordenadas**, ubiquen las 12 tarjetas en la cuadrícula para que **las parecidas queden cerca**.
2. Elijan tres palabras y busquen sus **dos vecinas más cercanas**. Justifiquen: ¿por qué son parecidas?
3. Comparen su mapa con las **coordenadas de referencia** (anexo). ¿Qué grupos coinciden?

### 🔍 Qué observar

- ¿Qué grupos se formaron?
- ¿Alguna palabra quedó "en medio" de dos grupos? ¿Por qué?
- Los **ejes no tienen nombre**: ¿pudieron ponerles uno?

### 🧠 Concepto relacionado

Espacio vectorial: **cerca = parecido**.

---

## 🏁 Reto 2 — Palabras vs. significado (12 min)

### 🧰 Materiales

Las **8 fichas** de frases y las **4 consultas** del anexo.

### 🪜 Pasos

1. Para cada consulta, **busquen por palabras exactas**: ¿alguna ficha comparte una palabra con la consulta?
2. Ahora **busquen por significado**: ¿qué ficha está más cerca de la idea de la consulta? Ordenen las 3 más cercanas.
3. Completen la tabla: ¿qué método acertó y cuál falló?

| Consulta | ¿Por palabras exactas? | ¿Por significado? |
|---|---|---|
| 1 | … | … |
| 2 | … | … |
| 3 | … | … |
| 4 | … | … |

### 🔍 Qué observar

- ¿En cuántas consultas **no hay ninguna palabra en común**?
- ¿Por qué la búsqueda por significado encuentra igual?

### 🧠 Concepto relacionado

Similitud y búsqueda por significado.

---

## 🏁 Reto 3 — Analogías vectoriales (8 min)

### 🪜 Pasos

1. Completen estas analogías ("A es a B como C es a ?"):
   1. *rey es a reina como actor es a …*
   2. *perro es a cachorro como gato es a …*
   3. *París es a Francia como Lima es a …*
2. Con la cuadrícula del reto 1, hagan la prueba: ¿cómo "se mueve" el vector de A a B? Apliquen **el mismo paso** desde C.
3. Analicen esta: *bicicleta es a pedal como auto es a …* ¿Cuántas respuestas posibles hay?
4. Discutan esta otra: *hombre es a programador como mujer es a …* ¿Qué problema aparece y de dónde viene?

### 🔍 Qué observar

- ¿Cuáles funcionan de forma clara y cuáles no?
- ¿Qué pasa cuando la relación tiene **varias respuestas**?
- ¿Qué sesgo puede aparecer?

### 🧠 Concepto relacionado

Analogías vectoriales, sus límites y los sesgos.

---

## 🏁 Reto 4 — Mismo vector, distinto significado (10 min)

### 🪜 Pasos

1. Para cada pareja de frases, indiquen si la palabra marcada tendría **el mismo vector** o **vectores distintos** con (a) **Word2Vec o GloVe** y (b) **BERT o GPT**:

| Pareja | Frase 1 | Frase 2 |
|---|---|---|
| 1 | Me senté en el **banco** del parque. | Fui al **banco** a retirar dinero. |
| 2 | Cerré la **llave** del agua. | Guardé la **llave** en el cajón. |
| 3 | Tomé **vino** tinto. | El **vino** llegó tarde. |

2. Inventen **una pareja nueva** con otra palabra ambigua (por ejemplo, *cola*, *sierra*, *rayo*) y háganla leer por otro equipo.
3. Expliquen **por qué** el vector cambia en BERT y GPT.

### 🔍 Qué observar

- ¿Qué **palabras de la frase** deciden el sentido?
- ¿Qué problema evita un embedding contextual?

### 🧠 Concepto relacionado

Estático vs. contextual (BERT y GPT).

---

## 📦 Entregable

Una ficha por equipo:

| Reto | Qué observamos | Concepto de la sección |
|---|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |

## 📌 Reflexión

Cada equipo presenta **un hallazgo** (2 min) y responde: ¿qué concepto de la sección lo explica?

---

## 📎 Anexo — Materiales del taller

### 🗺️ Cuadrícula

Dibuja un cuadrado de 0 a 10 en cada eje (eje A horizontal y eje B vertical).

```text
 B
10 |
 9 |
 8 |
 7 |
 6 |
 5 |
 4 |
 3 |
 2 |
 1 |
 0 +---------------------------------→ A
   0   1   2   3   4   5   6   7   8   9  10
```

### 🃏 12 tarjetas de palabras (coordenadas de referencia, ilustrativas)

| Palabra | (A, B) | Palabra | (A, B) | Palabra | (A, B) |
|---|---|---|---|---|---|
| perro | (2, 8) | auto | (8, 2) | pan | (2, 2) |
| gato | (3, 9) | bicicleta | (7, 3) | manzana | (1, 3) |
| caballo | (4, 7) | avión | (9, 1) | leche | (3, 1) |
| conejo | (1, 9) | tren | (8, 1) | queso | (3, 3) |

Tres grupos esperados: **animales**, **transportes** y **alimentos**.

### 🧾 8 fichas de frases (la "biblioteca")

| Ficha | Texto |
|---|---|
| F1 | Cómo cuidar a un cachorro recién llegado a casa |
| F2 | Receta de pan casero con masa madre |
| F3 | Horarios de trenes y buses interurbanos |
| F4 | Consejos para dormir mejor por la noche |
| F5 | Cómo preparar una taza de café en casa |
| F6 | Guía para reducir el gasto mensual de la familia |
| F7 | Ejercicios suaves para fortalecer la espalda |
| F8 | Cómo elegir una bicicleta para ir al trabajo |

### 🔎 4 consultas (sin palabras en común con la ficha correcta)

| Consulta | Texto |
|---|---|
| 1 | mi perrito nuevo |
| 2 | insomnio |
| 3 | ahorrar dinero |
| 4 | dolor lumbar |

### ✨ Variantes opcionales

- **Con una herramienta de visualización de embeddings** (si hay pantalla e internet): observen cómo se agrupan palabras reales y comparen con su mapa del reto 1.
- **Con un asistente**: pídanle que explique, **con sus propias palabras**, por qué "insomnio" y "dormir mejor" están cerca. Verifiquen su respuesta con lo aprendido.
