# 💡 Ejemplo 05 — Cómo se construye un LLM

## 🌍 Contexto

Un asistente como los que usas hoy no se programa regla por regla: se **entrena** en varias etapas. Veámoslas con una analogía de cocina.

## 🧠 Concepto

Construir un LLM implica reunir datos, preentrenar, ajustar para conversar, alinear con personas y evaluar.

## 🧭 Explicación paso a paso

| Etapa | Qué ocurre | 🍳 Analogía |
|---|---|---|
| 1. Datos | Se reúne y limpia texto muy variado (libros, artículos, páginas web, código…) | Conseguir y seleccionar los ingredientes |
| 2. Tokenización | El texto se parte en tokens | Cortar los ingredientes |
| 3. **Preentrenamiento** | El modelo practica **predecir el siguiente token** una y otra vez; es la etapa más larga y costosa y usa miles de chips especializados | Aprender a cocinar probando millones de platos |
| 4. **Ajuste** | Se entrena con ejemplos de conversaciones e instrucciones para que responda como asistente | Aprender a atender como camarero |
| 5. **Alineación** | Personas evalúan respuestas y se aplican reglas de seguridad para preferir las útiles y seguras | Probar el plato y corregirlo según el comensal |
| 6. Evaluación y publicación | Se prueba, se detectan fallas y se lanza; luego se actualiza | Abrir el restaurante y mejorar la carta |

## 📖 Ideas clave

- **Preentrenar** da el conocimiento general del lenguaje; **ajustar y alinear** lo vuelve un asistente.
- El modelo aprende patrones del texto de su entrenamiento, por eso hereda **errores y sesgos** de ese texto.
- Después del entrenamiento, el modelo **no se actualiza solo**: de ahí los datos desactualizados.

## ✅ Resultado esperado

El estudiante nombra al menos 4 etapas en orden y explica la diferencia entre preentrenar y ajustar.

## 🎲 Dinámica

"La receta del LLM": cada equipo ordena las 6 tarjetas y empareja cada etapa con su analogía.
