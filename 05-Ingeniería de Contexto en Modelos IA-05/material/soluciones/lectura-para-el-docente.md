# 🧑‍🏫 Lectura para el docente — Ingeniería de Contexto en Modelos IA

> Material solo para el docente. Está escrito en lenguaje sencillo: si lo lees una vez (≈ 40 minutos), podrás dictar la sección con tranquilidad.

## 🎯 Cómo usar esta lectura

1. Lee primero **"La idea en una página"**.
2. Antes de cada bloque, lee su sección: *lo esencial*, *lo que puedes decir en voz alta*, *errores comunes* y *si te preguntan…*.
3. Ten a mano el [glosario](../ejemplos/glosario.md).
4. **No necesitas saber más** de lo que está aquí. Para lo que no sepas, ve a "Cuando no sepas".

## 🧭 La idea en una página

- El **contexto** es **todo lo que el modelo ve** antes de responder: no solo tu pregunta.
- La **ingeniería de contexto** es decidir **qué entra, cuándo, en qué orden y con qué formato**. El prompt engineering **queda incluido**.
- La **ventana de contexto** es limitada: más texto cuesta más, tarda más y puede confundir.
- Cuatro ideas para gestionar el contexto: **seleccionar, comprimir, recuperar y aislar**.
- Los **embeddings** ayudan a **elegir qué fragmentos recuperar**.
- Un contexto se puede **revisar**: problemas comunes, principios y una lista de verificación.
- Muchos fallos de un asistente son fallos de **contexto**, no del modelo.

### 📚 Qué está verificado y qué no

| Idea | Estado |
|---|---|
| Anthropic define el contexto como el conjunto de tokens incluidos en una inferencia, y la ingeniería de contexto como las estrategias para curar y mantener ese conjunto (entrada de su blog de ingeniería, 2025) | ✅ Se puede citar |
| LangChain agrupa las estrategias en **escribir, seleccionar, comprimir y aislar** (entrada del 2 de julio de 2025) | ✅ Se puede citar |
| Philipp Schmid: el contexto es todo lo que el modelo ve antes de responder; muchos fallos de agentes son fallos de contexto | ✅ Se puede citar la idea central |
| «El arte y la ciencia de llenar la ventana de contexto» | ⚠️ No se atribuye a nadie en concreto |
| Prompting Guide y RAG | ❌ No se cita; solo se dice que RAG es una técnica de contexto |

**No des cifras** de tamaños de ventana ni de precios: cambian con los modelos.

---

## 🌍 B1 · Contexto e ingeniería de contexto

### 🔑 Lo esencial

- Contexto = **todo lo que el modelo recibe** al responder: instrucciones, tu pregunta, historial, datos, herramientas...
- Un **escritorio** es una buena imagen: si está vacío, abarrotado o con papeles contradictorios, la respuesta sale mal.
- Prompt engineering = **cómo pides**. Ingeniería de contexto = **qué necesita ver el modelo**.

### 🗣️ Lo que puedes decir en voz alta

- «El modelo es el mismo; lo que cambió fue lo que podía ver.»
- «El prompt no desaparece: es una parte del contexto.»

### ⚠️ Errores comunes

- Creer que la ingeniería de contexto **reemplaza** al prompt engineering.
- Pensar que contexto es solo «más texto».

### ❓ Si te preguntan…

- **¿Quién inventó el término?** Es una disciplina emergente; no se lo atribuyas a nadie.
- **¿Es lo mismo que RAG?** No: RAG es **una técnica** dentro de la ingeniería de contexto.

---

## 🌍 B2 · Tokenización y ventana

### 🔑 Lo esencial

- El modelo lee **tokens**: trozos de texto. A veces una palabra, a veces una parte, a veces un signo.
- La **ventana** es cuántos tokens caben a la vez.
- Más tokens: **más costo, más espera** y a veces **más confusión**.
- Si no cabe: **seleccionar, resumir o guardar fuera**.

### 🗣️ Lo que puedes decir en voz alta

- «La regla de trozos del taller es solo para practicar; cada modelo corta a su manera.»
- «Un escritorio más grande no significa que convenga llenarlo.»

### ⚠️ Errores comunes

- Creer que un token es **siempre una palabra**.
- Creer que si la ventana es grande, **hay que usarla toda**.

### ❓ Si te preguntan…

- **¿Cuántos tokens tiene una página?** Depende del idioma y del modelo. No des una cifra: pide que lo midan con una herramienta.
- **¿Por qué se cobra por tokens?** Porque el trabajo del modelo crece con la cantidad de texto.

---

## 🌍 B3 · Embeddings y espacio semántico

### 🔑 Lo esencial

- Un **embedding** es el significado de un texto como un conjunto de números; en el **espacio semántico**, lo parecido queda **cerca**.
- Un **modelo de embedding** hace esa conversión para la pregunta y los fragmentos.
- Se usa para **elegir qué traer** al contexto.
- **Ampliar la consulta** (añadirle términos) ayuda a encontrar más fragmentos útiles.

### 🗣️ Lo que puedes decir en voz alta

- «Es lo que vimos en la clase de embeddings, ahora con un uso concreto: decidir qué ponemos sobre el escritorio.»
- «Que algo esté cerca no significa que sea correcto o actual.»

### ⚠️ Errores comunes

- Creer que el embedding **entiende**. Mide cercanía de significado.
- Pensar que el fragmento más cercano **siempre** es el correcto.

### ❓ Si te preguntan…

- **¿Es lo mismo que una base de datos vectorial?** Se verá más adelante; por ahora, es donde se guardan los vectores para buscar.

---

## 🌍 B4 · Elementos y técnicas

### 🔑 Lo esencial

- **Siete elementos**: instrucciones del sistema, mensaje, historial, datos externos, memoria, herramientas, estado de la tarea.
- **Memoria**: corto plazo, largo plazo, episódica, semántica (mención).
- **Técnicas**: seleccionar, comprimir, recuperar (idea de RAG), ampliar la consulta, ejemplos en contexto, aislar.
- Evaluar: **si no se mide, no se sabe** si mejora.

### 🗣️ Lo que puedes decir en voz alta

- «Aislar es guardar en el archivo lo pesado y subir al escritorio solo lo necesario.»
- «Comprimir es dejar una nota que resume la pila, no tirar la pila sin leer.»

### ⚠️ Errores comunes

- Confundir **historial** con **memoria**: el historial es de esta conversación; la memoria se guarda entre conversaciones.
- Enviar documentos completos «por si acaso».

### ❓ Si te preguntan…

- **¿Cuánto historial se manda?** Lo relevante o un resumen; no hay cifra fija.
- **¿Qué es una herramienta?** Algo que el modelo puede consultar o ejecutar (buscar, calcular). Debe estar **bien descrita**.

---

## 🌍 B5 · Problemas, principios, caso y plantilla

### 🔑 Lo esencial

- **Siete problemas**: insuficiente, excesivo, contradictorio, desactualizado, ruidoso, historial largo, herramientas mal descritas.
- **Seis principios**: relevancia, suficiencia, orden, priorización, actualización, trazabilidad.
- **Plantilla** de ocho apartados y **lista de verificación** de doce preguntas.
- **Agentes**: el contexto cambia en cada paso (se verá más adelante).

### 🗣️ Lo que puedes decir en voz alta

- «Antes de culpar al modelo, revisa el escritorio.»
- «La calidad de la respuesta depende de la calidad del contexto.»

### ⚠️ Errores comunes

- Creer que más reglas siempre es mejor: si se contradicen, hay que **priorizar**.
- No actualizar: un dato viejo puede ser correcto y aun así equivocado.

### ❓ Si te preguntan…

- **¿Qué es un agente?** Un sistema que no solo responde: planifica, usa herramientas y mantiene estado. Lo veremos en otra sección.
- **¿Puedo usarlo con datos reales?** En el taller, no: solo datos ficticios.

---

## 🆘 Cuando no sepas

- «Buena pregunta. No tengo ese detalle a mano; lo verificamos y lo traemos en la próxima clase.»
- «Eso depende del modelo; lo importante es **probarlo con casos reales**.»
- «No quiero inventar una cifra: prefiero decir que no la sé.»
- Para dudas técnicas, vuelve a **la idea en una página** y al [glosario](../ejemplos/glosario.md).
