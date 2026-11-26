# 🧑‍🏫 Guía docente — Prompt Engineering Avanzado

> Material solo para el docente. No compartir con los estudiantes.

## 🎯 Objetivo

Dictar 180 minutos dinámicos: 120 de explicación y 60 de taller, sin material adicional.

> ¿No eres experto? Empieza por la [Lectura para el docente](lectura-para-el-docente.md) y ten a mano el [Glosario](../ejemplos/glosario.md).

## 🪜 Agenda minuto a minuto

### 📅 Explicación (120 min)

| Tiempo | Min | Actividad | Diapositivas |
|---|---|---|---|
| 0:00 | 7 | 🎲 Pedir mal vs. pedir bien | 4 |
| 0:07 | 5 | Repaso: LLM, token y ventana de contexto | 5 |
| 0:12 | 8 | El prompt y sus cinco piezas + 🎲 Arma el prompt | 6–8 |
| 0:20 | 8 | Zero-shot y 🎲 ¿Basta con pedirlo? | 9–11 |
| 0:28 | 10 | Buen y mal zero-shot + 🎲 Mejora el prompt | 12–14 |
| 0:38 | 7 | El límite del zero-shot | 15 |
| 0:45 | 7 | One-shot + 🎲 ¿Qué copió el modelo? *(prescindible)* | 16–18 |
| 0:52 | 8 | Qué fija un ejemplo, riesgo + 🎲 Elige el mejor ejemplo | 19–21 |
| 1:00 | 5 | Cuándo basta un ejemplo (preguntas) | 21 |
| 1:05 | 8 | Few-shot, patrón, origen + 🎲 Completa el patrón | 22–25 |
| 1:13 | 10 | Buenos ejemplos y errores + 🎲 Caza errores | 26–28 |
| 1:23 | 8 | ¿Cuántos ejemplos? + 🎲 ¿Cuántos bastan? *(prescindible)* | 29–30 |
| 1:31 | 4 | ¿Aprendió el modelo? Aprendizaje en contexto | 31 |
| 1:35 | 6 | Los tres niveles + 🎲 Ordena las tarjetas | 32–33 |
| 1:41 | 7 | Criterios y tres casos (votación) | 34–35 |
| 1:48 | 4 | Límites del prompting (pregunta ¿prompt o RAG?) | 36 |
| 1:52 | 2 | 🌉 Puente y qué viene después *(prescindible)* | 37–38 |
| 1:54 | 6 | Resumen y quiz (10 ítems) | 39–41 |

### 🛠️ Taller (60 min)

Ver [taller-01.md](../../actividades/talleres/taller-01.md): 5 + 12 + 12 + 10 + 10 + 6 + 5.

## 🎲 Fichas de dinámicas

### 🎲 Pedir mal vs. pedir bien (7 min)

- **Materiales**: los dos pedidos y las dos salidas del [Ejemplo 01](../ejemplos/01-el-prompt-y-su-estructura.md) en la pizarra.
- **Pasos**: lee primero el pedido A y su salida, luego el B. Pregunta: "¿qué datos cambiaron el resultado?". Anota las respuestas en columnas.
- **Cierre**: "La diferencia no es el modelo: es **cómo pedimos**."

### 🎲 Arma el prompt (4 min)

- **Materiales**: 5 tarjetas (rol, tarea, contexto, formato, restricciones) y un prompt mezclado.
- **Pasos**: por equipo, ordenen las tarjetas sobre el prompt y léanlo en voz alta.
- **Cierre**: son una **lista de verificación**, no una regla.

### 🎲 ¿Basta con pedirlo? (4 min)

- **Tareas**: traducir un saludo; resumir una noticia; pasar correos a `Cliente | Producto | Cantidad | Entrega`; etiquetar quejas con reglas internas; explicar qué es una factura.
- **Pasos**: 👍 basta · ✋ falta un ejemplo.
- **Respuesta**: basta en 1, 2 y 5; falta ejemplo en 3 y 4.

### 🎲 Mejora el prompt (6 min)

- **Prompt**: "Hazme una oferta."
- **Pasos**: los equipos lo reescriben con al menos cuatro piezas. Dos equipos lo leen.
- **Cierre**: comparen con [el Ejercicio 03](../ejercicios/03-mejora-el-zero-shot.md).

### 🎲 ¿Qué copió el modelo? (4 min) *(prescindible)*

- **Pasos**: muestra la salida con "martes" del [Ejemplo 03](../ejemplos/03-one-shot.md) y pregunta de dónde salió.
- **Cierre**: con un solo ejemplo, el modelo puede copiarlo de más.

### 🎲 Elige el mejor ejemplo (4 min)

- **Candidatos** (para "pasar correos a una línea"): (A) un correo larguísimo con 12 productos; (B) un correo corto y claro con el formato correcto; (C) uno con el formato distinto al pedido.
- **Respuesta**: B.

### 🎲 Completa el patrón (4 min)

- **Pasos**: proyecta el few-shot del [Ejemplo 04](../ejemplos/04-few-shot.md) sin la última respuesta. Pide la salida esperada y el formato.

### 🎲 Caza errores (6 min)

- **Materiales**: la lista A de la tabla "Antes y después" del [Ejemplo 05](../ejemplos/05-disenar-buenos-ejemplos.md).
- **Errores esperados**: contradicción ("Muy rico" → Positiva y Negativa), todas de una sola categoría, falta de caso neutro, falta de caso límite.
- **Cierre**: nombra cada error con la tabla de errores comunes.

### 🎲 ¿Cuántos bastan? (3 min) *(prescindible)*

- **Pasos**: vota 1 · 3 · 6 · 20. Lleva la discusión al costo y a los rendimientos decrecientes.
- **Cierre**: "Pocos y buenos; si no mejora, revisa la **calidad**."

### 🎲 Ordena las tarjetas (4 min)

- **Pasos**: zero, one, few; ordénenlas de menos a más ayuda, y de menos a más costo. Respuesta: igual orden en ambas.

## 🧪 Claves del taller

| Reto | Clave |
|---|---|
| **1** | Zero-shot: formato inconsistente ("Positivo", frase larga, "dato informativo"). One-shot: formato correcto, pero **O3 "Positiva" es un error**: copia del ejemplo (tiende a responder siempre lo mismo). Few-shot: correcto y uniforme. |
| **2** | Elegir **C1, C3, C4 y C6** (cubren las tres categorías, con un caso límite). Descartar **C2** (muy corto, repetido), **C5** (etiqueta equivocada: es una reseña negativa), **C7** (formato distinto) y **C8** (largo, redundante y costoso). Último: un caso difícil como C6, ni al principio ni de la misma etiqueta que el anterior. |
| **3** | Defectos: sin rol, tarea vaga ("dime qué onda, ponles algo"), sin formato ni categorías; ejemplos **contradictorios** ("Muy rico" → positivo y negativo); etiquetas inconsistentes ("positivo", "negativo", "mal"); sin restricciones. |
| **4** | (1) "Sí, aceptamos devoluciones hasta 15 días con el ticket." (2) "No, los domingos estamos cerrados; abrimos de lunes a sábado de 9 a 20 h." (3) "No tengo ese dato. Te recomiendo escribirnos para confirmarlo." (**el stock no está en el contexto: derivar, no inventar**). Con cientos de productos → **RAG**. |

**Criterios de evaluación** (por equipo, 0–2 por criterio): redactan los tres niveles (R1); eligen y justifican ejemplos (R2); corrigen y justifican cambios (R3); el asistente no inventa y justifica el nivel (R4); presentan un hallazgo ligado a un concepto.

**Imprevistos**: si no hay tiempo, omite la parte 4 del Reto 4. Si usan un asistente real y las respuestas difieren de las simuladas, explica que **las salidas varían** y que lo importante es el razonamiento.

## ⚠️ Advertencia de datos

Recuerda al grupo: **solo datos ficticios**; nada personal ni confidencial en asistentes externos.

## 🔁 Repaso del Módulo 01 (2 minutos)

- Un **LLM** predice el siguiente token.
- Un **token** es un trozo de texto.
- La **ventana de contexto** es cuánto cabe a la vez: por eso los ejemplos tienen un costo.

## 📋 Preguntas para dinamizar

- "¿Qué le dirías a un empleado nuevo el primer día?"
- "¿Cuándo basta con decir 'hazlo'?"
- "¿Qué pasa si el manual se contradice?"
- "¿Qué haría el asistente si le preguntan algo que no sabe?"
