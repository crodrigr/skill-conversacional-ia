# 💡 Ejemplo 06 — Comparar y elegir

## 🌍 Contexto

Ya conoces los tres niveles. Ahora hay que **decidir cuál usar**: más ayuda da más control, pero cuesta más.

## 🧠 Concepto

Elegir el nivel es un balance entre **control del resultado**, **costo** (longitud del prompt, medida en tokens) y **riesgo**.

🔗 **Analogía**: con un empleado experto basta decir "hazlo"; con uno nuevo en una tarea con reglas propias, le muestras casos. Pero cada caso que muestras **te toma tiempo**.

## 🧭 Explicación paso a paso

**Tabla comparativa**

| | 🟦 Zero-shot | 🟨 One-shot | 🟩 Few-shot |
|---|---|---|---|
| **Ejemplos** | 0 | 1 | 2 o más |
| **Control del formato** | Bajo | Medio | Alto |
| **Costo (tokens)** | Menor | Medio | Mayor |
| **Riesgo principal** | Formato o criterio equivocado | Copiar el único ejemplo | Ejemplos sesgados o contradictorios; llenar la ventana de contexto |
| **Úsalo para** | Tareas comunes | Fijar formato o tono | Criterios propios, clasificar, etiquetar |

**Criterios de elección**

1. ¿La tarea es **común** y el formato libre? → **zero-shot**.
2. ¿Solo necesitas fijar el **formato o el tono**? → **one-shot**.
3. ¿Hay un **criterio propio** o categorías con fronteras difíciles? → **few-shot**.
4. ¿El prompt ya es **muy largo**? Menos ejemplos, más breves.
5. **Siempre**: empieza por el nivel más simple y **sube solo si hace falta**.

**Tres casos**

| Caso | Nivel | Criterio |
|---|---|---|
| A. Resumir una nota de prensa para un cliente | Zero-shot | Tarea común, formato libre |
| B. Pasar correos de pedido a una línea `Cliente \| Producto \| Cantidad \| Entrega` | One-shot (o few-shot si hay casos raros) | Formato fijo; con un ejemplo basta si los correos son parecidos |
| C. Clasificar quejas como "urgente" o "normal" según las reglas de la tienda | Few-shot | Criterio propio, fronteras difíciles |

## ✅ Resultado esperado

El estudiante elige un nivel para un caso nuevo y lo justifica con un criterio.

## 🎲 Dinámica: Ordena las tarjetas / votación por caso

Los equipos ordenan las tarjetas de menos a más ayuda (zero → one → few) y votan el nivel de cada caso.
