# 💡 Ejemplo 07 — El caso del asistente del LMS

## 🌍 Contexto

Una institución ficticia quiere un asistente dentro de su LMS que responda sobre cursos, matrículas y notas. Veamos cómo se construye su contexto, paso a paso.

## 🧠 Concepto

Un sistema de contexto **recupera, filtra, ordena y arma** la información antes de llamar al modelo, y luego **evalúa y guarda** lo útil.

🔗 **Analogía**: antes de atender, el empleado **prepara la carpeta** del cliente; después, **archiva** lo aprendido.

## 🧭 Explicación paso a paso

**Prompt básico**

```text
Responde la pregunta del estudiante sobre sus notas.
```

Insuficiente: el modelo no conoce al estudiante, el curso ni las políticas.

**Contexto diseñado (datos ficticios)**

```text
Rol:     Asistente académico del LMS.
Usuario: Estudiante matriculado en «Bases de Datos».
Pregunta: ¿Por qué mi nota final aparece en 3.8?

Datos recuperados:
- Actividad 1: 4.0, peso 20 %
- Proyecto: 3.5, peso 40 %
- Examen final: 4.0, peso 40 %
- Escala: 0.0 a 5.0 · Nota mínima para aprobar: 3.0

Reglas:
- Explica el cálculo.
- No modifiques notas.
- Si ves inconsistencias, recomienda contactar al docente.

Formato: respuesta breve, con la fórmula.
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Actividad 1: 4.0 × 20 % = 0.8
Proyecto:    3.5 × 40 % = 1.4
Examen final: 4.0 × 40 % = 1.6
Total: 0.8 + 1.4 + 1.6 = 3.8
Por lo tanto, la nota final registrada es 3.8.
```

**La calidad de la respuesta depende de la calidad del contexto.**

**La arquitectura básica (para leer)**

```text
Usuario → Entrada → Análisis de intención → Recuperación de contexto
   → Filtrado y priorización → Construcción del contexto
   → Modelo → Respuesta → Evaluación y actualización de memoria
```

| Fase | Función |
|---|---|
| Entrada | Recibe la solicitud |
| Análisis de intención | Determina qué quiere lograr el usuario |
| Recuperación | Busca información relevante |
| Filtrado y priorización | Elimina ruido y ordena por importancia |
| Construcción | Arma el mensaje final |
| Inferencia | El modelo genera la respuesta |
| Evaluación y memoria | Revisa la calidad y guarda lo útil |

**🌉 Puente a los agentes**

Un **agente** no solo responde: también planifica, usa herramientas y mantiene estado. Su contexto cambia en **cada paso**. No basta con un prompt inicial. Se verá en una sección posterior.

## ✅ Resultado esperado

El estudiante explica qué datos faltaban en el prompt básico y ubica cada fase de la arquitectura.

## 🎲 Dinámica

Pregunta: «¿qué datos faltaban?». Los equipos listan lo que el modelo necesitaba para responder.
