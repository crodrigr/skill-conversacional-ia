# 🟡 Ejercicio 06 — Caza los errores

## 📊 Dificultad

🟡 Intermedio

## 🎓 Resultados de aprendizaje

OA-5

## 🧩 Problema

Este few-shot clasifica reseñas de una librería ficticia:

```text
Reseña: "Excelente atención" → POSITIVA
Reseña: "Muy buena selección de libros" → positiva
Reseña: "Me atendieron de maravilla" → Positiva
Reseña: "Atención correcta" → Negativa
Reseña: "Los precios están bien" → Positiva
Reseña: "Llegué y estaba cerrado" →
```

## 🪜 Pasos

1. Lista **todos los defectos** que encuentres.
2. Corrige la lista y escribe la versión final (puedes cambiar o añadir ejemplos).
3. Explica qué efecto tendría la lista original en el resultado.

## 📏 Criterios de evaluación

- Detecta: mayúsculas inconsistentes (POSITIVA/positiva/Positiva), todos o casi todos de una categoría, una etiqueta dudosa ("Atención correcta" → Negativa), ausencia de caso neutro o negativo claro.
- La versión final tiene variedad, formato consistente y etiquetas correctas.
- Explica el sesgo hacia "Positiva" y las salidas inconsistentes.
