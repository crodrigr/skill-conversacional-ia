# 💡 Ejemplo 08 — La plantilla de contexto

## 🌍 Contexto

Para no olvidar ninguna pieza, se usa una **plantilla** con ocho apartados.

## 🧠 Concepto

La **plantilla de contexto** organiza lo que el modelo debe ver: rol, objetivo, solicitud, contexto, restricciones, herramientas, formato y criterios de calidad.

🔗 **Analogía**: el **formulario de encargo** del empleado: si falta un campo, quedan dudas.

## 🧭 Explicación paso a paso

**La plantilla**

```text
# Rol del modelo
[El papel que debe asumir]

# Objetivo de la tarea
[Qué debe lograr]

# Solicitud del usuario
[La pregunta o instrucción original]

# Contexto relevante
[Datos, documentos, reglas o historial necesarios]

# Restricciones
[Límites, prohibiciones o condiciones]

# Herramientas disponibles
[Herramientas o APIs que puede usar]

# Formato esperado
[Estructura de la respuesta]

# Criterios de calidad
[Cómo se evaluará si la respuesta es correcta]
```

**Un ejemplo aplicado (ficticio)**

```text
# Rol del modelo
Eres un experto en bases de datos y diseño de LMS.

# Objetivo
Revisar si el módulo de evaluación está bien organizado.

# Solicitud del usuario
Revisar las tablas para evaluar con notas numéricas y con logros.

# Contexto relevante
El sistema atiende varias instituciones. Unas usan escala numérica y otras
logros. Hay cursos, estudiantes, matrículas, periodos y actividades.

# Restricciones
No elimines el soporte para logros. Propón catálogos cuando haya valores
repetibles. Justifica cada decisión.

# Formato esperado
1. Diagnóstico 2. Problemas 3. Propuesta 4. Ejemplo práctico

# Criterios de calidad
Cada propuesta indica el problema que resuelve.
```

**Cómo usarla**

- No siempre se llenan los ocho con la misma extensión.
- Lo que cambia entre consultas (datos, historial) se **recupera**; lo estable (rol, reglas) se queda fijo.
- Revisa el resultado con la [lista de verificación](06-problemas-principios-y-lista-de-verificacion.md).

## ✅ Resultado esperado

El estudiante completa la plantilla para un asistente ficticio con al menos seis apartados coherentes.

## 🎲 Dinámica

Se completa un apartado en voz alta entre todos (por ejemplo, «restricciones» del asistente de la biblioteca). Se retoma en el **Reto 4** del [taller](../../actividades/talleres/taller-01.md).
