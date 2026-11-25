# 📚 Explicación conceptual — Ingeniería de Contexto en Modelos IA

## 🎯 Objetivo

Entender, sin programar, qué es el contexto de un modelo, cómo se limita y se mide, qué técnicas existen para elegir qué entra y cómo diseñar el contexto de un asistente.

---

## 🌍 B1 · Contexto e ingeniería de contexto

### 🧠 Concepto: Contexto

El **contexto** es todo lo que el modelo recibe y "ve" antes de responder.

- No es solo tu pregunta: incluye instrucciones, historial, datos, herramientas y más.
- Anthropic lo define como el conjunto de tokens incluidos en una inferencia.
- Muchos errores no son del modelo, sino de lo que recibió.

🔗 **Analogía**: el **escritorio del empleado**: lo que hay encima es lo que puede consultar.

📎 Ver en la práctica: [Ejemplo 01 — Contexto frente a prompt engineering](01-contexto-vs-prompt-engineering.md)

### 🧠 Concepto: Ingeniería de contexto

La **ingeniería de contexto** es elegir, ordenar y mantener la información que ve el modelo: **qué entra, cuándo, con qué formato y con qué prioridad**.

- Es más amplia que el prompt engineering, que queda incluido.
- Se vuelve clave en asistentes y agentes.
- Philipp Schmid la resume así: el contexto es todo lo que el modelo ve antes de responder.

🔗 **Analogía**: **ordenar el escritorio** antes de atender.

📎 Ver en la práctica: [Ejemplo 01 — Contexto frente a prompt engineering](01-contexto-vs-prompt-engineering.md)

---

## 🌍 B2 · Tokenización y ventana

### 🧠 Concepto: Tokenización

La **tokenización** divide el texto en **tokens**, los fragmentos que el modelo procesa.

- Un token puede ser una palabra, parte de ella o un signo.
- Cada modelo tiene su propio tokenizador.
- Las divisiones del material son ilustrativas.

🔗 **Analogía**: cortar el texto en **hojas**.

📎 Ver en la práctica: [Ejemplo 02 — Tokens y ventana de contexto](02-tokens-y-ventana-de-contexto.md)

### 🧠 Concepto: Ventana de contexto

La **ventana de contexto** es el máximo de tokens que el modelo considera a la vez.

- Más tokens significa más costo y más espera.
- Si no cabe, hay que seleccionar, resumir o guardar fuera.
- Más texto no siempre mejora la respuesta.

🔗 **Analogía**: el **tamaño del escritorio**.

📎 Ver en la práctica: [Ejemplo 02 — Tokens y ventana de contexto](02-tokens-y-ventana-de-contexto.md)

---

## 🌍 B3 · Embeddings y espacio semántico

### 🧠 Concepto: Espacio semántico y modelo de embedding

Un **modelo de embedding** convierte textos y preguntas en vectores; en el **espacio semántico**, lo parecido queda **cerca**.

- Sirve para elegir qué fragmentos traer al contexto.
- Ayuda a elegir, pero no garantiza que el fragmento sea correcto ni actual.
- Repaso de la clase de embeddings con un nuevo enfoque.

🔗 **Analogía**: un **mapa de barrios**: la pregunta cae en un punto y se traen los vecinos.

📎 Ver en la práctica: [Ejemplo 03 — Embeddings y espacio semántico para el contexto](03-embeddings-y-espacio-semantico-para-el-contexto.md)

### 🧠 Concepto: Ampliación de la consulta

La **ampliación de la consulta** mejora la pregunta antes de buscar.

- Una consulta corta puede quedar lejos de lo útil.
- Se añaden términos relacionados.
- Mejora la recuperación de fragmentos relevantes.

🔗 **Analogía**: buscar en el archivo con **más palabras clave**.

📎 Ver en la práctica: [Ejemplo 03 — Embeddings y espacio semántico para el contexto](03-embeddings-y-espacio-semantico-para-el-contexto.md)

---

## 🌍 B4 · Elementos y técnicas

### 🧠 Concepto: Elementos del contexto

El contexto se compone de **siete elementos**: instrucciones del sistema, mensaje del usuario, historial, datos externos, memoria, herramientas y estado de la tarea.

- No todo lo disponible debe entrar.
- La memoria puede ser de corto plazo, largo plazo, episódica o semántica.
- El estado evita perder el hilo en tareas largas.

🔗 **Analogía**: el escritorio con su **manual, nota del cliente, cuaderno, archivo, libreta, caja de herramientas y hoja de seguimiento**.

📎 Ver en la práctica: [Ejemplo 04 — Elementos del contexto](04-elementos-del-contexto.md)

### 🧠 Concepto: Selección y compresión

**Seleccionar** es elegir solo lo relevante; **comprimir** es resumir sin perder lo importante.

- Reducen ruido, costo y confusión.
- LangChain agrupa las estrategias en escribir, seleccionar, comprimir y aislar.
- Un resumen del historial suele bastar.

🔗 **Analogía**: dejar encima del escritorio solo las hojas útiles y resumir la pila en una **nota**.

📎 Ver en la práctica: [Ejemplo 05 — Técnicas de contexto](05-tecnicas-de-contexto.md)

### 🧠 Concepto: Recuperación, ejemplos y aislamiento

**Recuperar** es traer información externa antes de responder (la idea de RAG); los **ejemplos en contexto** muestran el patrón; **aislar** es guardar fuera lo pesado.

- RAG se presenta solo como idea.
- Los ejemplos vienen de la clase de prompt engineering.
- Lo aislado se muestra solo cuando hace falta.

🔗 **Analogía**: ir al **archivo**, mostrar un caso del manual y dejar el resto en el **sótano**.

📎 Ver en la práctica: [Ejemplo 05 — Técnicas de contexto](05-tecnicas-de-contexto.md)

### 🧠 Concepto: Evaluación del contexto

El contexto **se mide**: precisión, relevancia, tokens, tiempo, costo, errores, alucinaciones y satisfacción.

- Más información no garantiza mejores respuestas.
- Sin medir no se sabe si una estrategia mejora o empeora.
- Se prueba con casos reales.

🔗 **Analogía**: revisar si el escritorio ordenado **realmente** ayuda.

📎 Ver en la práctica: [Ejemplo 05 — Técnicas de contexto](05-tecnicas-de-contexto.md)

---

## 🌍 B5 · Problemas, principios, caso y plantilla

### 🧠 Concepto: Problemas comunes

Siete problemas: contexto **insuficiente, excesivo, contradictorio, desactualizado, ruidoso**, historial largo sin resumir y herramientas mal descritas.

- Cada uno tiene su consecuencia y su corrección.
- Se detectan con la lista de verificación.
- Suelen explicar errores atribuidos al modelo.

🔗 **Analogía**: papeles que faltan, sobran, se contradicen o están vencidos.

📎 Ver en la práctica: [Ejemplo 06 — Problemas, principios y lista de verificación](06-problemas-principios-y-lista-de-verificacion.md)

### 🧠 Concepto: Principios de un buen contexto

Seis principios: **relevancia, suficiencia, orden, priorización, actualización y trazabilidad**.

- No todo pesa igual: reglas y políticas antes que el historial.
- Un dato viejo puede ser correcto y aun así equivocado.
- Trazabilidad: indicar de dónde viene la información.

🔗 **Analogía**: el **reglamento de orden** del escritorio.

📎 Ver en la práctica: [Ejemplo 06 — Problemas, principios y lista de verificación](06-problemas-principios-y-lista-de-verificacion.md)

### 🧠 Concepto: Arquitectura, agentes y plantilla

El contexto se **arma** con un flujo (entrada, intención, recuperación, filtrado, construcción, modelo, evaluación y memoria) y una **plantilla** de ocho apartados. Los **agentes** son el puente al siguiente paso.

- La plantilla evita olvidar piezas.
- En los agentes el contexto cambia en cada paso.
- 🌉 Puente: se verán en una sección posterior.

🔗 **Analogía**: preparar la **carpeta del cliente** y archivar lo aprendido.

📎 Ver en la práctica: [Ejemplo 07 — El caso del asistente del LMS](07-caso-asistente-del-lms.md)

📎 Ver en la práctica: [Ejemplo 08 — La plantilla de contexto](08-plantilla-de-contexto.md)

---

## 📌 Resumen

- **Contexto** = todo lo que el modelo ve; la **ingeniería de contexto** incluye al prompt engineering.
- Los **tokens** y la **ventana** limitan lo que cabe: más texto no es mejor.
- Los **embeddings** ayudan a elegir qué recuperar.
- Siete **elementos**; seis **técnicas**: seleccionar, comprimir, recuperar, ampliar la consulta, ejemplos en contexto, aislar.
- Revisa con los **principios**, la **lista de verificación** y la **plantilla**.
