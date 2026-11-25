# 🛠️ Taller 01 — Diseña el contexto

## 🎯 Objetivo

Practicar, sin programar, cómo se cuenta el espacio de la ventana, se eligen fragmentos relevantes, se diagnostica un contexto defectuoso y se diseña el contexto de un asistente con la plantilla.

## 🚧 Reglas

- Equipos de **3 a 4** personas.
- **No necesitas pantallas ni internet**: todo está en el 📎 Anexo.
- La regla de «trozos» es **ilustrativa**: no es la de un modelo real.
- Las salidas y respuestas del anexo son **simuladas** (ilustrativas).
- Usa **solo datos ficticios**. No escribas datos personales ni confidenciales en ningún asistente externo.
- ⏱️ Total: 60 minutos.

## 🪜 Pasos

| Tiempo | Actividad | Min |
|---|---|---|
| 0:00 | Reglas y equipos | 5 |
| 0:05 | 🏁 Reto 1 · Tokens y ventana | 10 |
| 0:15 | 🏁 Reto 2 · Selecciona los fragmentos | 12 |
| 0:27 | 🏁 Reto 3 · Diagnostica el contexto | 10 |
| 0:37 | 🏁 Reto 4 · Diseña el contexto del asistente | 12 |
| 0:49 | Presentación de hallazgos | 6 |
| 0:55 | Reflexión | 5 |

---

## 🏁 Reto 1 — Tokens y ventana (10 min)

### 🧰 Materiales

Las **cuatro partes del contexto** y la regla de «trozos» (anexo A).

### 🪜 Pasos

1. Cuenten los **trozos** de cada parte con la regla.
2. Sumen: ¿cabe en una ventana de **50 trozos**?
3. Decidan qué **recortar o dejar fuera**, sin perder lo necesario para responder.
4. Justifiquen: ¿qué conservaron y qué descartaron?

### 🔍 Qué observar

- ¿Qué parte ocupa más espacio y aporta menos?
- ¿Cambia la respuesta posible si quitan el historial?

### 🧠 Concepto relacionado

Tokenización y ventana de contexto.

---

## 🏁 Reto 2 — Selecciona los fragmentos (12 min)

### 🧰 Materiales

La **pregunta** y los **8 fragmentos** (anexo B).

### 🪜 Pasos

1. Marquen cuáles fragmentos **responden** la pregunta.
2. Descarten los **ruidosos**, los **desactualizados** y los que **se contradicen**; expliquen por qué.
3. **Ordenen por prioridad** los que se quedan.
4. Redacten el contexto final en 3 líneas.

### 🔍 Qué observar

- ¿Hay dos fragmentos que se contradicen? ¿Cuál es el vigente?
- ¿Qué fragmento aporta un detalle útil pero secundario?

### 🧠 Concepto relacionado

Selección, priorización, actualización.

---

## 🏁 Reto 3 — Diagnostica el contexto (10 min)

### 🧰 Materiales

El **contexto defectuoso** y la **lista de verificación** (anexo C).

### 🪜 Pasos

1. Marquen todos los **problemas** que encuentren y nómbrenlos con la tabla de problemas comunes.
2. Para cada uno, escriban la **corrección**.
3. Reescriban el contexto corregido.

### 🔍 Qué observar

- ¿Cuántos «no» obtiene el contexto original en la lista de verificación?

### 🧠 Concepto relacionado

Problemas comunes y lista de verificación.

---

## 🏁 Reto 4 — Diseña el contexto del asistente (12 min)

### 🧰 Materiales

La **ficha del gimnasio ficticio**, las **3 consultas** y la **plantilla en blanco** (anexo D).

### 🪜 Pasos

1. Completen la plantilla con los **ocho apartados**.
2. Escriban la **respuesta esperada** para cada consulta.
3. ¿Qué hace el asistente cuando **no tiene el dato**? Escríbanlo en las restricciones.
4. Revisen con la lista de verificación y marquen los «sí».

### 🔍 Qué observar

- ¿Qué apartado costó más completar?
- ¿Qué parte del contexto cambia entre consultas y cuál es fija?

### 🧠 Concepto relacionado

Plantilla de contexto y elementos del contexto.

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

1. ¿Qué es más difícil: **conseguir** información o **decidir qué dejar fuera**?
2. ¿Qué problema de contexto es más fácil de pasar por alto?
3. ¿Qué parte de su asistente necesitaría **recuperar** datos en lugar de llevarlos fijos?

## ✨ Variante opcional

Con un contador de tokens real o un asistente de chat, comparen su conteo con el de la regla y prueben su contexto. Las cifras **pueden diferir**; **solo datos ficticios**.

---

## 📎 Anexo

### A. Reto 1 — Regla de «trozos» y partes del contexto

**Regla (ilustrativa)**: palabra de hasta 6 letras = **1** trozo; de 7 a 12 letras = **2**; de más de 12 = **3**; cada signo de puntuación = **1**. Los números cuentan como una palabra.

**Ventana: 50 trozos.**

| Parte | Texto |
|---|---|
| **Instrucciones** | Eres asistente de la biblioteca Casa del Libro. Responde breve y amable. No inventes datos. |
| **Historial** | Hola. Buenas tardes. Quería preguntar por los horarios. Gracias, ya los vi. Ahora tengo otra duda. |
| **Datos** | Préstamo: 14 días. Renovación: una vez. Multa: 1 dólar por día. |
| **Pregunta** | ¿Puedo renovar mi préstamo? |

### B. Reto 2 — Pregunta y fragmentos

**Pregunta**: *«¿Cuánto pago si devuelvo un libro con 3 días de retraso?»*

| # | Fragmento |
|---|---|
| F1 | Multa por retraso: 1 dólar por cada día de atraso (vigente desde enero de este año). |
| F2 | Multa por retraso: 2 dólares por día (reglamento de hace seis años). |
| F3 | El préstamo dura 14 días y se puede renovar una vez. |
| F4 | La biblioteca abre de lunes a sábado. |
| F5 | Los socios pueden retirar hasta 3 libros a la vez. |
| F6 | La multa se cobra al devolver el libro, en el mostrador. |
| F7 | El café de la biblioteca ofrece descuentos a socios. |
| F8 | Si el libro se pierde, el socio paga su valor. |

### C. Reto 3 — Contexto defectuoso

```text
Rol: ayuda a todos.
Historial: [los 30 mensajes del mes pasado, completos]
Datos: Escala de 0 a 5, nota mínima 3.0. Escala de 0 a 10, nota mínima 6.0 (año 2019).
Herramienta: buscar → busca cosas
Pregunta: ¿Aprobé?
```

**Lista de verificación**: ¿Rol claro? · ¿Tarea definida? · ¿Información necesaria? · ¿Sin irrelevante? · ¿Historial resumido? · ¿Reglas explícitas? · ¿Herramientas descritas? · ¿Formato definido? · ¿Qué evitar? · ¿Cómo evaluar? · ¿Actualizado? · ¿Fuentes confiables?

### D. Reto 4 — Ficha del asistente (ficticio) y plantilla

**Gimnasio Fuerza Viva** (ficticio)

- Abre de lunes a sábado, de 6 a 22 h.
- Plan mensual: 30 dólares. Plan trimestral: 80 dólares.
- Yoga los lunes y miércoles a las 18 h.
- Las cuotas **no** se devuelven.

**Consultas**

1. «¿Cuánto cuesta el plan trimestral?»
2. «¿Hay yoga los viernes?»
3. «¿Me devuelven la cuota si me voy de viaje?»

**Plantilla en blanco**

```text
# Rol del modelo
# Objetivo de la tarea
# Solicitud del usuario
# Contexto relevante
# Restricciones
# Herramientas disponibles
# Formato esperado
# Criterios de calidad
```
