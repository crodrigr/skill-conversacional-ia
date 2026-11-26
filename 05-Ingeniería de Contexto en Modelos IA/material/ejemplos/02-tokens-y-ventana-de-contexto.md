# 💡 Ejemplo 02 — Tokens y ventana de contexto

## 🌍 Contexto

Una biblioteca ficticia quiere que su asistente conozca el reglamento completo. ¿Cabe todo en una sola consulta?

## 🧠 Concepto

**Tokenización**: el modelo no lee letras ni palabras completas, sino **tokens**, fragmentos de texto que pueden ser una palabra, una parte de ella o un signo. **Ventana de contexto**: la cantidad máxima de tokens que el modelo puede considerar a la vez.

🔗 **Analogía**: el texto se corta en **hojas** (tokens) y la ventana es el **tamaño del escritorio**: solo caben cierto número de hojas.

## 🧭 Explicación paso a paso

**Del texto a los tokens**

> ⚠️ División ilustrativa: cada modelo tiene su propio tokenizador, y los cortes reales pueden ser otros.

```text
Texto:   "La biblioteca prestará libros."
Tokens:  La | bibli | oteca | prestar | á | libros | .
```

- Un token **no siempre es una palabra**: las palabras largas o poco comunes suelen dividirse.
- Los signos de puntuación también cuentan.
- El mismo texto puede dar **distinta cantidad** de tokens según el modelo.

**Por qué importan los tokens**

| Aspecto | Qué ocurre |
|---|---|
| 💰 **Costo** | Se suele cobrar por tokens (entrada y salida) |
| ⏱️ **Latencia** | Más tokens, respuesta más lenta |
| 🪟 **Límite** | Si no cabe, se corta o se rechaza |
| 🌫️ **Confusión** | Más texto no significa mejor respuesta: puede aparecer ruido |

Anthropic señala que el contexto es un **recurso finito**: más tokens no dan más precisión de forma indefinida, y a partir de cierto punto el modelo recuerda peor los datos (ideas generales, sin cifras).

**¿Qué hacer cuando el reglamento no cabe?**

1. **Seleccionar** solo la sección que responde la pregunta.
2. **Resumir** lo que es largo (por ejemplo, el historial).
3. **Guardar fuera** lo pesado y traerlo solo cuando haga falta.

Estas tres ideas se desarrollan en el [Ejemplo 05](05-tecnicas-de-contexto.md).

## ✅ Resultado esperado

El estudiante explica qué es un token, por qué la ventana es limitada y qué opciones hay cuando el texto no cabe.

## 🎲 Dinámica: Parte la frase en tokens / ¿Cabe o no cabe?

Los equipos parten una frase en "trozos" y comparan. Luego se muestran tres textos con su número de trozos y una ventana de 50: ¿cuáles caben?
