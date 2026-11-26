# 💡 Ejemplo 05 — Diseñar buenos ejemplos

## 🌍 Contexto

Un few-shot es tan bueno como sus ejemplos. El Café del Parque probó dos listas para clasificar opiniones y obtuvo resultados muy distintos.

## 🧠 Concepto

**Diseñar ejemplos** es elegir pocos casos que **enseñen el criterio completo**: variados, correctos, con el mismo formato y con algún caso difícil.

🔗 **Analogía**: es armar el **manual del empleado nuevo**. Un manual con casos repetidos, contradictorios o escritos de otra forma lo confunde.

## 🧭 Explicación paso a paso

**La lista de verificación**

| Pregunta | Qué buscar |
|---|---|
| 🌈 ¿Son **variados**? | Cubren todas las categorías, no solo la más común |
| ✅ ¿Son **correctos**? | Cada salida es la que de verdad esperas |
| 📐 ¿Tienen **formato consistente**? | Todos escritos igual: mismas etiquetas, mismo orden |
| 🧗 ¿Incluyen un **caso límite**? | Al menos uno difícil (ni claramente bueno ni malo) |
| ⚖️ ¿Están **equilibrados**? | Una cantidad parecida de cada etiqueta |
| ✂️ ¿Son **breves**? | Cada ejemplo ocupa espacio y cuesta tokens |

**Siete errores comunes**

| # | Error | Efecto |
|---|---|---|
| 1 | Ejemplos **contradictorios** ("Muy rico" → Positiva y también → Negativa) | Resultados inconsistentes |
| 2 | Todos de **una sola categoría** | El modelo tiende a responder siempre esa |
| 3 | **Formato distinto** entre ejemplos | La salida sale desordenada |
| 4 | Solo **casos fáciles** | Falla en los casos difíciles |
| 5 | Una **etiqueta equivocada** | El error se repite |
| 6 | Ejemplos **muy largos o demasiados** | Gasto de tokens y de ventana de contexto sin ganar nada |
| 7 | El caso parecido a la nueva entrada **siempre al final** | La respuesta puede inclinarse hacia él: prueba cambiar el orden |

**¿Cuántos ejemplos?**

- Con **3 a 6** ejemplos bien elegidos suele ser suficiente para una tarea simple.
- Más ejemplos ayudan cada vez menos y **suben el costo**.
- Si los ejemplos no mejoran el resultado, revisa su **calidad** antes de añadir más.

> Estas cifras son una orientación didáctica, no una regla: depende de la tarea y del modelo. Lo que importa es **probar**.

**Antes y después**

| Lista A (defectuosa) | Lista B (mejorada) |
|---|---|
| "Muy rico" → Positiva | "Delicioso y trato excelente" → Positiva |
| "Excelente" → Positiva | "Tardaron 40 minutos y llegó frío" → Negativa |
| "Me encantó" → Positiva | "Abren de lunes a sábado" → Neutra |
| "Muy rico" → Negativa | "No estuvo mal, esperaba más" → Neutra |

## ✅ Resultado esperado

El estudiante revisa una lista de ejemplos con la lista de verificación y corrige al menos tres defectos.

## 🎲 Dinámica: Caza errores

Se proyecta la lista A. Los equipos marcan cuántos errores encuentran y los nombran con la tabla de errores comunes.
