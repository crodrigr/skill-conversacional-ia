# 💡 Ejemplo 02 — Reglas vs. LLM

## 🌍 Contexto

Una librería tiene un chatbot de reglas y otro con LLM. Les hacemos una pregunta inesperada.

## 🗨️ Prompt

```text
Quiero regalarle un libro a mi abuelo que ama el mar pero no sabe leer bien. ¿Qué me recomiendas?
```

## ✅ Resultado esperado (respuestas de referencia)

**🤖 Chatbot de reglas** (guion: palabras clave "libro", "precio", "horario"):

> Detecté la palabra "libro". ¿Quieres consultar el precio o el horario?

**🧠 Asistente con LLM:**

> Podrías regalarle un libro ilustrado sobre el mar o un audiolibro de aventuras marinas, que se disfrutan aunque la lectura sea difícil. También funcionan los libros de fotografía de barcos y costas.

## 🔍 Análisis

- El de reglas solo reconoce palabras que sus autores previeron.
- El LLM generó una respuesta nueva combinando lo aprendido sobre libros, el mar y accesibilidad.
- El LLM suena más útil, pero **no garantiza** que los títulos o datos sean reales: hay que verificarlos.

## 🎲 Dinámica

Votación: ¿cuál responde mejor? ¿Cuál es más fácil de controlar?
