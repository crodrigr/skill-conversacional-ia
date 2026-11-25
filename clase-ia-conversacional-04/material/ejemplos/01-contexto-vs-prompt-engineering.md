# 💡 Ejemplo 01 — Contexto frente a prompt engineering

## 🌍 Contexto

Una estudiante pregunta al asistente de un LMS ficticio: *«¿Por qué mi nota final es 3.8?»*. El mismo modelo, con **dos contextos distintos**, responde de forma muy diferente.

## 🧠 Concepto

El **contexto** es **todo lo que el modelo "ve" antes de responder**: instrucciones, mensaje, historial, datos, herramientas y más. Anthropic lo define como el conjunto de tokens que se incluyen cuando se hace una inferencia con un modelo de lenguaje, y llama **ingeniería de contexto** a las estrategias para elegir y mantener ese conjunto, incluida la información que queda fuera del prompt.

🔗 **Analogía**: el **escritorio del empleado**. Lo que hay sobre él es lo que puede consultar para responder. Un escritorio vacío, abarrotado o con papeles contradictorios da malas respuestas, aunque el empleado sea excelente.

## 🧭 Explicación paso a paso

**Contexto A (solo el prompt)**

```text
Responde la pregunta del estudiante sobre sus notas.
Pregunta: ¿Por qué mi nota final es 3.8?
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
La nota final depende de varios factores, como las actividades y los
exámenes. Te recomiendo revisar el reglamento de tu curso.
```

**Contexto B (con información)**

```text
Rol: asistente académico del LMS. No modifiques notas.
Pregunta: ¿Por qué mi nota final es 3.8?
Datos del curso Bases de Datos (ficticios):
- Actividad 1: 4.0, peso 20 %
- Proyecto: 3.5, peso 40 %
- Examen final: 4.0, peso 40 %
Formato: respuesta breve con el cálculo.
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
4.0 × 20 % = 0.8 · 3.5 × 40 % = 1.4 · 4.0 × 40 % = 1.6
Total: 0.8 + 1.4 + 1.6 = 3.8
```

El modelo es el mismo. **Cambió lo que podía ver.**

**Prompt engineering frente a ingeniería de contexto**

| Aspecto | Prompt engineering | Ingeniería de contexto |
|---|---|---|
| **Enfoque** | Redactar mejores instrucciones | Diseñar todo lo que el modelo ve |
| **Unidad de trabajo** | Un prompt | El sistema completo de contexto |
| **Alcance** | El texto de entrada | Instrucciones, datos, memoria, herramientas, historial y estado |
| **Uso típico** | Tareas puntuales | Asistentes, agentes y flujos complejos |
| **Pregunta central** | ¿Cómo pido la tarea? | ¿Qué necesita ver el modelo para resolverla? |
| **Ejemplo** | «Resume este texto en 5 puntos» | Recuperar documentos, filtrarlos, resumir el historial y aplicar reglas |

El prompt engineering **sigue siendo importante**: queda **incluido** dentro de la ingeniería de contexto.

Philipp Schmid lo resume así: el contexto no es solo el prompt, es **todo lo que el modelo ve antes de responder**, y muchos fallos de un agente son fallos de contexto, no del modelo.

## ✅ Resultado esperado

El estudiante explica por qué falló el contexto A y distingue una tarea de prompt engineering de otra que pide ingeniería de contexto.

## 🎲 Dinámica: El mismo pedido, con y sin información / ¿Prompt o contexto?

Se leen los contextos A y B y el grupo dice qué cambió. Luego se votan cinco tareas: «resume este texto» (prompt) o «responde con mis notas» (contexto).
