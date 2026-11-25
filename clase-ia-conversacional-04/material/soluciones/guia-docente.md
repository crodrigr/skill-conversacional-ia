# 🧑‍🏫 Guía docente — Ingeniería de Contexto en Modelos IA

> Material solo para el docente. No compartir con los estudiantes.

## 🎯 Objetivo

Dictar 180 minutos dinámicos: 120 de explicación y 60 de taller, sin material adicional.

> ¿No eres experto? Empieza por la [Lectura para el docente](lectura-para-el-docente.md) y ten a mano el [Glosario](../ejemplos/glosario.md).

## 🪜 Agenda minuto a minuto

### 📅 Explicación (120 min)

| Tiempo | Min | Actividad | Diapositivas |
|---|---|---|---|
| 0:00 | 7 | 🎲 El mismo pedido, con y sin información | 4 |
| 0:07 | 5 | Repaso: token, ventana, embedding, prompt | 5 |
| 0:12 | 8 | Qué es el contexto, ingeniería de contexto, prompt vs. contexto + 🎲 ¿Prompt o contexto? | 6–10 |
| 0:20 | 8 | Tokens + 🎲 Parte la frase en tokens | 11–12 |
| 0:28 | 7 | Ventana, costo + 🎲 ¿Cabe o no cabe? | 13–15 |
| 0:35 | 5 | Si no cabe: seleccionar, resumir, guardar fuera | 16 |
| 0:40 | 6 | Repaso de embeddings y espacio semántico + 🎲 Ordena por cercanía | 17–19 |
| 0:46 | 8 | Modelo de embedding (y pregunta de repaso) | 20 |
| 0:54 | 6 | Ampliar la consulta + 🎲 Enriquece la consulta *(prescindible)* | 21–22 |
| 1:00 | 10 | Los siete elementos + 🎲 ¿De dónde viene cada pieza? | 23–24 |
| 1:10 | 6 | Memoria *(prescindible: mención)* | 25 |
| 1:16 | 8 | Estrategias, seleccionar, comprimir + 🎲 Resume el historial | 26–29 |
| 1:24 | 6 | Recuperar (idea de RAG) y ejemplos en contexto | 30–31 |
| 1:30 | 5 | Aislar + 🎲 ¿Dentro o fuera? + evaluar el contexto | 32–34 |
| 1:35 | 7 | Problemas comunes + 🎲 Diagnostica | 35–36 |
| 1:42 | 6 | El caso del LMS | 37 |
| 1:48 | 2 | Arquitectura y puente a agentes *(prescindible)* | 38–39 |
| 1:50 | 4 | Plantilla, principios y lista de verificación | 40–41 |
| 1:54 | 6 | Resumen y quiz (10 ítems) | 42–44 |

### 🛠️ Taller (60 min)

Ver [taller-01.md](../../actividades/talleres/taller-01.md): 5 + 10 + 12 + 10 + 12 + 6 + 5.

## 🎲 Fichas de dinámicas

### 🎲 El mismo pedido, con y sin información (7 min)

- **Materiales**: los contextos A y B del [Ejemplo 01](../ejemplos/01-contexto-vs-prompt-engineering.md) en la pizarra.
- **Pasos**: lee el A y su respuesta, luego el B. Pregunta: «¿qué cambió?». Anota las ideas.
- **Cierre**: «El modelo es el mismo; **cambió lo que podía ver**.»

### 🎲 ¿Prompt o contexto? (3 min)

- **Tareas**: ver [Ejercicio 02](../ejercicios/02-prompt-o-contexto.md).
- **Pasos**: 👍 prompt · ✋ contexto, con la mano.

### 🎲 Parte la frase en tokens (4 min)

- **Pasos**: dicta «La biblioteca presta libros.» Cada equipo la corta con la regla de trozos (ver [Ejercicio 03](../ejercicios/03-parte-en-tokens.md)) y compara.
- **Cierre**: un token no siempre es una palabra; cada modelo corta a su manera.

### 🎲 ¿Cabe o no cabe? (4 min)

- **Pasos**: tres textos con su número de trozos (por ejemplo, 18, 42 y 63) y una ventana de 50. Pregunta cuáles caben y qué harían con el que no cabe.
- **Respuesta**: caben 18 y 42; el de 63 requiere seleccionar o resumir.

### 🎲 Ordena por cercanía (5 min)

- **Pasos**: pregunta «¿Cuántos libros puedo llevar a casa?» con los cuatro fragmentos del [Ejemplo 03](../ejemplos/03-embeddings-y-espacio-semantico-para-el-contexto.md) más uno extra. Los equipos los ordenan.
- **Cierre**: comparten significado aunque no comparten palabras.

### 🎲 Enriquece la consulta (4 min) *(prescindible)*

- **Pasos**: consulta «horarios». Los equipos la amplían (horario de atención, días de apertura, feriados...).

### 🎲 ¿De dónde viene cada pieza? (7 min)

- **Materiales**: tarjetas con: «No modifiques notas», «¿Por qué mi nota es 3.8?», «Mensajes de la charla», «Notas y pesos del curso», «Prefiere respuestas breves», «buscar_estudiante», «Fase: definir criterios».
- **Respuesta**: instrucciones, mensaje, historial, datos externos, memoria, herramienta, estado.

### 🎲 Resume el historial (5 min)

- **Materiales**: el historial del [Ejercicio 06](../ejercicios/06-resume-el-historial.md).
- **Pasos**: resumir en 2 líneas. Compara qué conservó cada equipo.

### 🎲 ¿Dentro o fuera? (3 min)

- **Materiales**: los ocho objetos del [Ejercicio 07](../ejercicios/07-dentro-o-fuera.md).

### 🎲 Diagnostica (6 min)

- **Materiales**: 7 tarjetas, una por problema (por ejemplo: «solo la pregunta»; «todo el manual»; «dos plazos distintos»; «reglamento del 2019»; «datos del café del campus»; «30 mensajes sin resumir»; «herramienta: busca cosas»).
- **Pasos**: los equipos nombran el problema y su corrección.

## 🧪 Claves del taller

| Reto | Clave |
|---|---|
| **1** | Trozos: instrucciones **22**, historial **25**, datos **19**, pregunta **8**; total **74**, sobran **24** para la ventana de 50. Se deja fuera el **historial** (no aporta a la pregunta): 22 + 19 + 8 = **49 ≤ 50**. |
| **2** | Se quedan **F1** (vigente), **F6** (cuándo se cobra) y, como secundario, **F3**. Se descartan **F2** (desactualizado y contradictorio con F1), y **F4, F5, F7, F8** (ruido). Prioridad: F1 > F6 > F3. Respuesta: 3 días × 1 dólar = **3 dólares**. |
| **3** | Problemas: rol vago; **historial largo sin resumir**; **datos contradictorios** (dos escalas) y **desactualizados** (2019); **herramienta mal descrita**; **insuficiente** (faltan las notas del estudiante); sin formato ni restricciones. Pocos «sí» en la lista. |
| **4** | (1) «El plan trimestral cuesta 80 dólares.» (2) «Por ahora el yoga es los lunes y miércoles a las 18 h; no tengo datos de los viernes, te sugiero consultar en recepción.» (3) «Las cuotas no se devuelven.» **Restricción clave**: si no está en los datos, no inventar; derivar. |

**Criterios de evaluación** (por equipo, 0–2 por criterio): conteo y decisión en R1; selección y prioridad en R2; diagnóstico y corrección en R3; plantilla completa y consultas respondidas sin inventar en R4; presentan un hallazgo ligado a un concepto.

**Imprevistos**: si hay retraso, omite el paso 4 del Reto 4. Si usan un contador de tokens real y los números difieren, explica que cada modelo tiene su tokenizador y la regla es solo ilustrativa.

## ⚠️ Advertencia de datos

**Solo datos ficticios**; nada personal ni confidencial en asistentes externos.

## 🔁 Repaso de las clases anteriores (2 minutos)

- **Token**: un trozo de texto. **Ventana**: cuánto cabe a la vez.
- **Embedding**: el significado como coordenadas en un mapa.
- **Prompt**: la nota de encargo, con o sin ejemplos.

## 📋 Preguntas para dinamizar

- «¿Qué hay sobre el escritorio del asistente cuando le preguntas algo?»
- «¿Qué pasa si el escritorio está lleno de papeles de otro tema?»
- «¿Cómo sabrías si tu contexto mejoró las respuestas?»
- «¿Qué dejarías fuera aunque lo tengas?»
