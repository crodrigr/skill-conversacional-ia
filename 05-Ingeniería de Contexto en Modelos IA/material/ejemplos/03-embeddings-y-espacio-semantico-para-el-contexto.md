# 💡 Ejemplo 03 — Embeddings y espacio semántico para el contexto

## 🌍 Contexto

La biblioteca ficticia tiene 200 documentos. Cuando alguien pregunta, el sistema debe **elegir cuáles fragmentos poner sobre el escritorio**. ¿Cómo decide?

## 🧠 Concepto

Un **embedding** es un vector que representa el significado de un texto. En el **espacio semántico**, los textos de significado parecido quedan **cerca**. Un **modelo de embedding** es el que convierte la pregunta y los fragmentos en vectores que se pueden comparar. (Repaso de la clase de embeddings: [Fundamentos de Embeddings](../../../clase-ia-conversacional-02/material/ejemplos/01-definicion-y-mapa-de-palabras.md).)

🔗 **Analogía**: un **mapa de barrios** donde cada fragmento tiene su ubicación; la pregunta cae en un punto y se traen los fragmentos **vecinos**.

## 🧭 Explicación paso a paso

**Elegir qué recuperar**

```text
Pregunta:  "¿Cuántos libros puedo llevar a casa?"

Fragmentos (de cerca a lejos de la pregunta):
1. "Cada socio puede retirar hasta 3 libros a la vez."   ← más cerca
2. "El préstamo dura 14 días y se puede renovar."
3. "La sala de lectura abre de 9 a 18 h."
4. "El jardín de la biblioteca fue plantado en 1990."    ← más lejos
```

> ⚠️ Cercanía ilustrativa, escrita a mano; no es la salida de un modelo real.

- La pregunta y los fragmentos **no comparten casi palabras** ("llevar a casa" frente a "retirar"), pero el significado es cercano.
- El sistema trae los **más cercanos** (por ejemplo, 1 y 2) y deja los demás fuera: eso es **seleccionar**.

**Ampliación de la consulta**

Una consulta muy corta puede quedar lejos de lo útil. Se **enriquece** antes de buscar:

| Consulta original | Consulta ampliada |
|---|---|
| `notas estudiantes` | `política de calificaciones, evaluación académica, escala de notas, resultados de estudiantes` |

Así la búsqueda acierta más fragmentos relevantes.

**Importante**: el embedding **ayuda a elegir**, pero no garantiza que el fragmento sea **correcto ni actual**. Esa revisión forma parte de la ingeniería de contexto.

## ✅ Resultado esperado

El estudiante explica cómo se eligen fragmentos por cercanía y por qué conviene ampliar una consulta muy corta.

## 🎲 Dinámica: Ordena por cercanía / Enriquece la consulta

Se entregan 5 fragmentos y una pregunta: los equipos los ordenan de más cerca a más lejos. Luego enriquecen la consulta «horarios».
