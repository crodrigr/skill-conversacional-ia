# 🛠️ Taller 01 — Pon a prueba a tu asistente

## 🎯 Objetivo

Experimentar con un asistente conversacional para comprobar, con tus propias observaciones, lo que viste sobre LLM, tokens y contexto.

## 🚧 Reglas

- Equipos de **3 a 4** personas; puedes usar el asistente que tengas.
- **No escribas datos personales ni confidenciales.** Usa datos ficticios.
- Las respuestas varían: **observa**, no busques "la respuesta correcta".
- ⏱️ Total: 60 minutos.

## 🪜 Pasos

| Tiempo | Actividad | Min |
|---|---|---|
| 0:00 | Reglas y equipos | 5 |
| 0:05 | 🏁 Reto 1 | 12 |
| 0:17 | 🏁 Reto 2 | 8 |
| 0:25 | 🏁 Reto 3 | 10 |
| 0:35 | 🏁 Reto 4 | 10 |
| 0:45 | Presentación de hallazgos | 10 |
| 0:55 | Reflexión | 5 |

---

## 🏁 Reto 1 — Cazar alucinaciones (12 min)

### 🗨️ Prompt

```text
Dime el título, el autor y el año de tres libros poco conocidos sobre la historia de los faros en el mundo, e incluye una cita textual de cada uno.
```

### 🔍 Qué observar

- ¿Los libros existen? Búscalos en una fuente confiable.
- ¿Las citas son reales?
- ¿El tono suena seguro aunque haya errores?

### 🧠 Concepto relacionado

Alucinaciones y predicción del siguiente token.

Prueba además con un dato que **tú sepas** (por ejemplo, un dato de tu ciudad) y anota si acierta.

---

## 🏁 Reto 2 — Mismo mensaje, varias respuestas (8 min)

### 🗨️ Prompt

```text
Escribe un eslogan de una frase para una cafetería que se llama "La Pausa".
```

### 🔍 Qué observar

- Envía el mismo mensaje 3 veces (usa "regenerar" o una conversación nueva).
- ¿Cuánto cambian las respuestas?
- ¿Por qué crees que cambian?

### 🧠 Concepto relacionado

Generación token a token entre opciones probables.

---

## 🏁 Reto 3 — El asistente olvida (10 min)

### 🗨️ Prompt

Mensaje 1:

```text
Mi mascota se llama Nube y es un gato naranja. Recuérdalo.
```

Luego mantén una conversación de 8 a 10 mensajes sobre otros temas (recetas, viajes, música) y pregunta:

```text
¿Cómo se llama mi mascota y de qué color es?
```

### 🔍 Qué observar

- ¿Recuerda el dato? ¿Con exactitud?
- ¿Cambia algo si repites el dato más cerca de la pregunta?

### 🧠 Concepto relacionado

Historial y límite de contexto.

---

## 🏁 Reto 4 — Vago vs. claro (10 min)

### 🗨️ Prompt A (vago)

```text
Dame ideas para una fiesta.
```

### 🗨️ Prompt B (claro)

```text
Dame 5 ideas para una fiesta sorpresa de cumpleaños para 8 adultos, en un patio, con un presupuesto bajo y un tema de los años 90. Preséntalas en una lista con una línea cada una.
```

### 🔍 Qué observar

- ¿Qué respuesta es más útil y específica?
- ¿Qué información extra le diste al modelo en B?

### 🧠 Concepto relacionado

El contexto guía la generación.

---

## 📦 Entregable

Una ficha por equipo:

| Reto | Qué observamos | Concepto del módulo |
|---|---|---|
| 1 | | |
| 2 | | |
| 3 | | |
| 4 | | |

## 📌 Reflexión

Cada equipo presenta **un hallazgo** (2 min) y responde: ¿qué concepto del módulo lo explica?

---

## 📎 Anexo — Si no hay asistente disponible

Analiza estas transcripciones pregrabadas (ilustrativas).

**Reto 1**

> Tú: Dime tres libros poco conocidos sobre faros, con una cita.
> Asistente: 1. *La luz del acantilado* (M. Duarte, 1998): "El faro no guía a los barcos; guía a quienes los esperan." 2. *Faros del sur* (R. Albán, 2005)…
>
> ❓ ¿Cómo podrías comprobar si existen? ¿Qué señal te haría dudar de la cita?

**Reto 2**

> Intento 1: "La Pausa: el sabor de detenerte."
> Intento 2: "Haz una pausa, disfruta el café."
> Intento 3: "En La Pausa, el tiempo se sirve despacio."
>
> ❓ ¿Qué cambió? ¿Qué se mantuvo?

**Reto 3**

> Tú: (mensaje 1) Mi mascota es Nube, un gato naranja. (…10 mensajes después…) ¿Cómo se llama mi mascota?
> Asistente: Mencionaste que tienes una mascota, pero no recuerdo su nombre. ¿Me lo recuerdas?
>
> ❓ ¿Qué pudo pasar con el dato?

**Reto 4**

> A (vago): 10 ideas genéricas: pizza, juegos, música…
> B (claro): 5 ideas con tema noventero: playlist de los 90, disfraces de dibujos animados, trivia…
>
> ❓ ¿Qué diferencias ves y por qué?
