# 💡 Ejemplo 06 — Problemas, principios y lista de verificación

## 🌍 Contexto

Muchos errores de un asistente no se deben a que el modelo sea incapaz, sino a que recibió información **incompleta, desordenada, contradictoria o irrelevante**.

## 🧠 Concepto

Un buen diseño de contexto sigue **principios** y se revisa con una **lista de verificación**. Los **problemas comunes** son síntomas de que algo falló en el contexto.

🔗 **Analogía**: revisar el escritorio antes de empezar: ¿está lo que hace falta?, ¿sobra algo?, ¿hay papeles que se contradicen?, ¿están al día?

## 🧭 Explicación paso a paso

**Siete problemas comunes**

| Problema | Descripción | Consecuencia | Corrección |
|---|---|---|---|
| **Insuficiente** | Faltan datos clave | Respuestas incompletas | Añadir los datos que faltan |
| **Excesivo** | Se envía demasiado | Más costo y confusión | Seleccionar |
| **Contradictorio** | Datos que se oponen | Respuestas inconsistentes | Resolver o priorizar la fuente |
| **Desactualizado** | Información vieja | Errores de hechos | Actualizar |
| **Ruidoso** | Datos irrelevantes | Pérdida de precisión | Filtrar |
| **Historial largo sin resumir** | Se acumula conversación | Peor rendimiento | Resumir |
| **Herramientas mal descritas** | El modelo no sabe cuándo usarlas | Uso incorrecto | Describir mejor nombre, uso y parámetros |

**Seis principios**

| Principio | Idea |
|---|---|
| 🎯 **Relevancia** | Solo lo relacionado con la tarea |
| ⚖️ **Suficiencia** | La información mínima necesaria para responder bien |
| 📑 **Orden** | Rol, objetivo, pregunta, datos, reglas, restricciones, formato |
| 🥇 **Priorización** | No todo pesa igual: sistema > políticas > datos > mensaje > historial resumido > ejemplos |
| 🔄 **Actualización** | Un dato viejo puede ser correcto y aun así equivocado |
| 🧾 **Trazabilidad** | Poder decir de dónde viene la información («Reglamento académico, sección 4.2») |

**Cinco errores frecuentes**

1. Confundir **contexto con cantidad** de texto.
2. Enviar **documentos completos** sin filtrar.
3. **No resumir** el historial.
4. **No definir prioridades** entre instrucciones contradictorias.
5. **No evaluar**.

**Lista de verificación**

| Pregunta | Sí / No |
|---|---|
| ¿El modelo conoce su rol? | |
| ¿La tarea está claramente definida? | |
| ¿El contexto contiene la información necesaria? | |
| ¿Se eliminó la información irrelevante? | |
| ¿Se resumió el historial largo? | |
| ¿Las reglas de negocio están explícitas? | |
| ¿Las herramientas están bien descritas? | |
| ¿El formato de salida está definido? | |
| ¿Se indica qué debe evitar el modelo? | |
| ¿Hay forma de evaluar la respuesta? | |
| ¿El contexto está actualizado? | |
| ¿Las fuentes son confiables? | |

## ✅ Resultado esperado

El estudiante detecta al menos tres problemas en un contexto defectuoso, propone una corrección y aplica la lista de verificación.

## 🎲 Dinámica: Diagnostica

Siete tarjetas, cada una con un contexto distinto con un problema. Los equipos nombran el problema y su corrección.
