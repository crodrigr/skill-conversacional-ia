# 🛠️ Taller 01 — Escribe prompts que funcionan

## 🎯 Objetivo

Practicar, sin programar, la escritura de prompts zero-shot, one-shot y few-shot: compararlos, diseñar ejemplos, arreglar un prompt defectuoso y personalizar un asistente ficticio.

## 🚧 Reglas

- Equipos de **3 a 4** personas.
- **No necesitas pantallas ni internet**: las salidas del modelo vienen **simuladas** en el 📎 Anexo.
- Las salidas simuladas son **ilustrativas**: no son la respuesta de un modelo real.
- Usa **solo datos ficticios**. No escribas datos personales ni confidenciales en ningún asistente externo.
- ⏱️ Total: 60 minutos.

## 🪜 Pasos

| Tiempo | Actividad | Min |
|---|---|---|
| 0:00 | Reglas y equipos | 5 |
| 0:05 | 🏁 Reto 1 · Mismo pedido, tres niveles | 12 |
| 0:17 | 🏁 Reto 2 · Diseña los ejemplos | 12 |
| 0:29 | 🏁 Reto 3 · Arregla el prompt | 10 |
| 0:39 | 🏁 Reto 4 · El asistente de mi tienda | 10 |
| 0:49 | Presentación de hallazgos | 6 |
| 0:55 | Reflexión | 5 |

---

## 🏁 Reto 1 — Mismo pedido, tres niveles (12 min)

### 🧰 Materiales

La tarea de la cafetería y las **9 salidas simuladas** (anexo A).

### 🪜 Pasos

1. Lean la tarea: *clasificar opiniones del Café del Parque como Positiva, Negativa o Neutra*.
2. Escriban una versión **zero-shot**, una **one-shot** y una **few-shot** del prompt (en papel).
3. Evalúen las salidas simuladas de cada nivel: ¿siguen el formato? ¿son correctas? ¿son consistentes?
4. Completen la tabla:

| Nivel | ¿Formato respetado? | ¿Respuestas correctas? | ¿Qué cambió? |
|---|---|---|---|
| Zero-shot | … | … | … |
| One-shot | … | … | … |
| Few-shot | … | … | … |

### 🔍 Qué observar

- ¿Qué nivel dio respuestas más uniformes?
- ¿Qué costó más: escribir el prompt o interpretar la respuesta?

### 🧠 Concepto relacionado

Niveles de prompting: **a más ejemplos, más control y más costo**.

---

## 🏁 Reto 2 — Diseña los ejemplos (12 min)

### 🧰 Materiales

Los **8 ejemplos candidatos** (anexo B).

### 🪜 Pasos

1. Elijan **4 ejemplos** para un few-shot que clasifique opiniones.
2. Justifiquen cada **descartado** con la lista de verificación (variado, correcto, formato, caso límite, equilibrio, breve).
3. Revisen el **orden**: ¿cuál iría al final y por qué?

### 🔍 Qué observar

- ¿Cubrieron las tres categorías?
- ¿Alguno tenía una etiqueta equivocada o un formato distinto?

### 🧠 Concepto relacionado

Diseño de ejemplos y errores comunes.

---

## 🏁 Reto 3 — Arregla el prompt (10 min)

### 🧰 Materiales

El **prompt defectuoso** (anexo C).

### 🪜 Pasos

1. Marquen todos los defectos que encuentren.
2. Reescriban el prompt con **rol, tarea, contexto, formato y restricciones** y ejemplos consistentes.
3. Justifiquen **cada cambio** en una línea.

### 🔍 Qué observar

- ¿Cuántos defectos eran de **estructura** y cuántos de **ejemplos**?

### 🧠 Concepto relacionado

Estructura de un buen prompt y errores comunes.

---

## 🏁 Reto 4 — El asistente de mi tienda (10 min)

### 🧰 Materiales

La **ficha de Tienda La Esquina** y las **3 consultas** (anexo D).

### 🪜 Pasos

1. Escriban el **prompt final** del asistente con rol, contexto, formato y restricciones.
2. Elijan el **nivel** (zero, one o few-shot) y, si hace falta, **2 o 3 ejemplos**.
3. Escriban la respuesta esperada para cada consulta. ¿Qué hace el asistente cuando **no tiene el dato**?
4. ¿Qué haría falta si la tienda tuviera cientos de productos y políticas?

### 🔍 Qué observar

- ¿Evitaron que el asistente invente?
- ¿Qué parte del contexto es indispensable?

### 🧠 Concepto relacionado

Personalización con prompting y puente a RAG.

---

## 📦 Entregable

Una **ficha de hallazgos** por equipo:

| Reto | Hallazgo (1 línea) | Concepto de la clase |
|---|---|---|
| 1 | … | … |
| 2 | … | … |
| 3 | … | … |
| 4 | … | … |

## 📌 Reflexión (5 min)

1. ¿Qué nivel usarían primero y por qué?
2. ¿Qué error de ejemplos es más fácil de cometer?
3. ¿Qué parte del asistente **no se resuelve con prompts**?

## ✨ Variante opcional

Si hay un asistente de chat disponible, prueben sus prompts y comparen con las salidas simuladas. Recuerden: **solo datos ficticios** y que la respuesta puede variar entre intentos.

---

## 📎 Anexo

### A. Reto 1 — Tarea y salidas simuladas

> ⚠️ Salidas simuladas — ilustrativas, no son la salida de un modelo real.

**Opiniones a clasificar**: **O1** "El capuchino llegó tibio y la mesa estaba sucia." · **O2** "Buen lugar para trabajar, el wifi es rápido." · **O3** "Abren a las 7."

| Nivel | O1 | O2 | O3 |
|---|---|---|---|
| **Zero-shot** | "Parece que al cliente no le gustó la temperatura del capuchino." | "Positivo" | "Es un dato informativo." |
| **One-shot** | "Negativa" | "Positiva" | "Positiva" |
| **Few-shot** | "Negativa" | "Positiva" | "Neutra" |

### B. Reto 2 — Ejemplos candidatos

| # | Opinión | Etiqueta |
|---|---|---|
| C1 | "El café estaba delicioso y el trato fue excelente." | Positiva |
| C2 | "Todo perfecto." | Positiva |
| C3 | "Tardaron 40 minutos y el café llegó frío." | Negativa |
| C4 | "Abren de lunes a sábado de 7 a 19 h." | Neutra |
| C5 | "Me encantó, pero no vuelvo nunca más." | Positiva |
| C6 | "No estuvo mal, aunque esperaba más." | Neutra |
| C7 | "positivo → genial servicio" | (formato distinto) |
| C8 | "El pastel de zanahoria estaba increíble, lo recomiendo muchísimo a todos mis amigos y familiares, además el local es muy bonito y el personal siempre sonríe." | Positiva |

### C. Reto 3 — Prompt defectuoso

```text
Oye, mira estas opiniones y dime qué onda, ponles algo.
"Muy rico" → positivo
"Muy rico" → negativo
"Llegó tarde" → mal
Opinión: "Buena atención"
```

### D. Reto 4 — Ficha de Tienda La Esquina (ficticia)

- Abre de lunes a sábado de 9 a 20 h; domingos cerrado.
- Devoluciones hasta **15 días** con ticket.
- Envío a domicilio gratis desde **50 dólares**.

**Consultas**

1. "¿Puedo devolver una camisa que compré hace 10 días?"
2. "¿Abren el domingo?"
3. "¿Tienen la camisa azul en talla M?"
