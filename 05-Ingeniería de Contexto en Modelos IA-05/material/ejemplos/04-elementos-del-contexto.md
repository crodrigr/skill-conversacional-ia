# 💡 Ejemplo 04 — Elementos del contexto

## 🌍 Contexto

El asistente académico de un LMS ficticio debe responder preguntas sobre cursos, matrículas y notas. ¿Qué piezas hay sobre su escritorio?

## 🧠 Concepto

El contexto se compone de **siete elementos**: instrucciones del sistema, mensaje del usuario, historial, datos externos, memoria, herramientas y estado de la tarea.

🔗 **Analogía**: el escritorio tiene un **manual de la casa**, la **nota del cliente**, el **cuaderno de la charla**, las **carpetas del archivo**, la **libreta de preferencias**, la **caja de herramientas** y la **hoja de seguimiento**.

## 🧭 Explicación paso a paso

| # | Elemento | Qué es | Ejemplo en el LMS |
|---|---|---|---|
| 1 | **Instrucciones del sistema** | Rol, límites, estilo y reglas permanentes | «Eres asistente académico; no modifiques notas» |
| 2 | **Mensaje del usuario** | La solicitud directa | «¿Por qué mi nota final es 3.8?» |
| 3 | **Historial** | Mensajes anteriores (no todos hacen falta) | Los mensajes sobre el mismo curso |
| 4 | **Datos externos** | Documentos, bases de datos, APIs | Notas y pesos del curso |
| 5 | **Memoria** | Información que se conserva entre interacciones | «Prefiere respuestas breves» |
| 6 | **Herramientas** | Lo que el modelo puede consultar o ejecutar | `buscar_estudiante` |
| 7 | **Estado de la tarea** | El avance actual de un proceso | «Fase: definir criterios» |

**Cuatro tipos de memoria**

| Tipo | Descripción | Ejemplo |
|---|---|---|
| **Corto plazo** | Activa durante la conversación o tarea | El tema actual |
| **Largo plazo** | Persiste entre sesiones | Preferencias de formato |
| **Episódica** | Registro de eventos previos | Último proyecto discutido |
| **Semántica** | Hechos estables | «Trabaja con PostgreSQL» |

**Una herramienta bien descrita**

```text
Herramienta: buscar_estudiante
Uso: recuperar información académica de un estudiante por documento.
Entrada: documento_estudiante
Salida: nombre, programa, estado académico, promedio.
```

**Un estado de tarea (para leer)**

```json
{
  "tarea": "generar rúbrica",
  "fase_actual": "definición de criterios",
  "criterios_aprobados": ["claridad", "coherencia"],
  "pendiente": "asignar niveles de desempeño"
}
```

El estado evita que el modelo **pierda el hilo** en tareas largas. No hace falta escribirlo: basta con **entender qué guarda**.

**Una idea clave**: no todo lo disponible debe entrar. Por ejemplo, del historial solo se envía lo **relevante** o un **resumen**.

## ✅ Resultado esperado

El estudiante nombra los siete elementos, diferencia historial de memoria y clasifica piezas de un caso.

## 🎲 Dinámica: ¿De dónde viene cada pieza?

Se reparten tarjetas con piezas del contexto del asistente (reglas, pregunta, notas, preferencia, herramienta...) y los equipos las clasifican en los siete elementos.
