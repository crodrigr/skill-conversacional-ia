# 🧑‍🏫 Lectura para el docente — Para entender todo sin ser experto

> Material solo para el docente. Está escrito en lenguaje sencillo: si lo lees una vez (≈ 40 minutos), podrás dictar el módulo con tranquilidad.

## 🎯 Cómo usar esta lectura

1. Lee primero **"La idea en una página"**.
2. Antes de cada bloque, lee su sección: *lo esencial*, *lo que puedes decir en voz alta*, *errores comunes* y *si te preguntan…*.
3. Ten a mano el [glosario](../ejemplos/glosario.md) durante la clase.
4. **No necesitas saber más** de lo que está aquí. Si te preguntan algo que no sabes, hay una frase para eso (ver "Cuando no sepas").

## 🧭 La idea en una página

- Una **IA conversacional** es un programa con el que se habla en lenguaje normal.
- Las antiguas seguían un **guion** escrito por personas. Las actuales usan un **LLM**: un modelo que **aprendió** el lenguaje leyendo muchísimo texto.
- Un LLM hace una sola cosa, una y otra vez: **adivinar la siguiente pieza de texto** (un *token*) que mejor encaja.
- Lo hace con una **red neuronal**: millones de "perillas" (*pesos*) ajustadas durante el entrenamiento.
- Los **Transformers** añadieron la **atención**: cada pieza del texto mira a las demás para entender el contexto.
- Como **predice** y no "sabe", a veces **inventa** (alucinaciones) y no conoce lo posterior a su entrenamiento.
- Por eso: **útil, pero verificar**.

---

## 🌍 B1 · IA conversacional y orígenes

### Lo esencial

- Conversar con una máquina es un viejo sueño: **Alan Turing** (1950) propuso un juego para saber si una máquina podía hacerse pasar por una persona.
- **ELIZA** (1966) simulaba a un terapeuta repitiendo tus frases como preguntas. No entendía nada, y aun así la gente se emocionaba: es el **efecto ELIZA**.
- Un asistente moderno sigue un flujo: recibe tu mensaje, lo interpreta con lo hablado antes (el **historial**), genera la respuesta y la muestra.
- Por dentro es un **engranaje de piezas**, no un solo programa:
  - **STT** (voz → texto) y **TTS** (texto → voz): solo existen si el asistente habla.
  - **NLU**: entender el mensaje completo, aunque no se usen las palabras exactas.
  - **Intención**: *qué quiere lograr* la persona ("pedir una pizza").
  - **Slots**: *los datos* de esa petición (tamaño, día, hora). Piensa en los casilleros de un formulario.
  - **Contexto / múltiples turnos**: recordar lo dicho antes.
  - **Política de diálogo**: decidir el siguiente paso (preguntar un dato que falta, confirmar, retomar un tema).

### Lo que puedes decir en voz alta

- "Este programa no tiene ojos ni oídos: solo recibe texto y devuelve texto."
- "Si no recordara lo que dijimos, cada mensaje sería una conversación nueva."
- "En 1966 ya había un chatbot, pero seguía reglas. Hoy aprenden de ejemplos."
- "Es como un restaurante: quien toma el pedido, la cocina, el camarero que recuerda tu mesa y el jefe de sala que organiza todo."

### Errores comunes

- Creer que "IA" y "chatbot" son lo mismo: el chatbot es una aplicación; la IA es la tecnología.
- Creer que ChatGPT fue el primer chatbot: fue el que popularizó los LLM en 2022.

### Si te preguntan…

- **¿Qué diferencia hay entre intención y slot?** La intención es la **acción** (reservar); los slots son los **datos** (cuántas personas, a qué hora).
- **¿Hoy se hace todo eso por separado?** Antes sí, en módulos distintos. Hoy los asistentes con LLM suelen resolver varias piezas con **un solo modelo**, pero entender las piezas ayuda a saber qué se espera de ellos.
- **¿Por qué es más difícil por voz?** La gente cuenta historias antes de llegar al punto, hay ruido y no hay un historial visible.
- **¿El test de Turing ya se superó?** Hay sistemas que a veces engañan a personas en conversaciones cortas, pero no hay un consenso científico sobre qué significa "superarlo". Lo importante: sonar humano no es lo mismo que entender.
- **¿Por qué hay respuestas tan "humanas"?** Porque aprendieron de millones de textos escritos por personas.

---

## 🌍 B2 · LLM, Machine Learning y Deep Learning

### Lo esencial

- **IA** es el campo grande. Dentro está el **Machine Learning** (aprender de ejemplos). Dentro, el **Deep Learning** (usa redes neuronales de muchas capas). Y un **LLM** es un modelo de Deep Learning especializado en lenguaje.
- **Programar tradicionalmente**: tú escribes las reglas. **Machine Learning**: das ejemplos y el sistema descubre las reglas.
- Un **LLM** es "grande" por dos razones: lee muchísimo texto y tiene muchísimos **parámetros**.
- Su tarea de base: dado un texto, **calcular qué token es más probable que siga**.

### Lo que puedes decir en voz alta

- "Es como el autocompletar de tu teléfono, pero entrenado con muchísimo más."
- "No busca la respuesta en una enciclopedia: la **construye** palabra por palabra."

### Cómo se construye (versión sencilla)

1. Se junta y limpia mucho texto.
2. **Preentrenamiento**: el modelo practica predecir el siguiente token millones de veces. Aquí "aprende el idioma".
3. **Ajuste**: se le enseña con ejemplos de conversaciones a responder como asistente.
4. **Alineación**: personas califican respuestas y se le enseña a preferir las útiles y seguras. (Se suele llamar *aprendizaje por refuerzo con feedback humano*; no hace falta que lo menciones.)
5. Se prueba y se publica. **Después no se actualiza solo.**

### Errores comunes

- "El modelo busca en internet." No necesariamente: responde con lo que aprendió. Algunos asistentes tienen una herramienta de búsqueda aparte.
- "Sabe cosas como yo." Reproduce patrones del texto.

### Si te preguntan…

- **¿Cuántos datos usa?** Cantidades enormes de texto, del orden de miles de millones de palabras o más. No des cifras exactas: varían por modelo y muchos no las publican.
- **¿Se entrena con mis conversaciones?** Depende del servicio y de su configuración de privacidad. Recomienda revisar las opciones de cada herramienta.
- **¿Piensa?** No como una persona. Si "entiende" o no es un debate abierto entre especialistas; para este curso basta: **predice texto muy bien**.

---

## 🌍 B3 · Redes neuronales

### Lo esencial

- Una **red neuronal** es una cadena de "neuronas" artificiales en **capas**. Cada neurona recibe números, los multiplica por unos **pesos** y pasa el resultado a la siguiente capa.
- Un **peso** es como el volumen con que se escucha cada conexión.
- **Entrenar** = ajustar los pesos para equivocarse menos: la red responde, se compara con la respuesta correcta y se corrige un poquito. Se repite millones de veces.
- El nombre técnico de ese ajuste es *retropagación*; solo si te lo piden.
- Los **parámetros** de un modelo son esos pesos: los grandes tienen miles de millones o más.

### Lo que puedes decir en voz alta

- "Nadie escribió la regla. La regla **apareció** de ajustar volúmenes."
- "Una sola neurona no hace mucho. La magia es la cantidad."

### Errores comunes

- Comparar la red con un cerebro humano: se inspira *libremente* en él, pero **no funciona igual**.
- Sobre el "umbral": cada neurona pasa su señal a la siguiente solo si es lo bastante fuerte; es la regla simple de la que sale todo lo demás.
- Pensar que aprende mientras conversas: normalmente **ya está entrenada**.

### Si te preguntan…

- **¿Por qué "profundo"?** Por las muchas capas.
- **¿Se sabe por qué responde lo que responde?** Se conoce cómo se construye, pero explicar por qué produce una respuesta concreta es difícil; es un tema de investigación.

---

## 🌍 B4 · Transformers

### Lo esencial

- Un **token** es un trozo de texto: puede ser una palabra, parte de una palabra o un signo. En español suelen hacer falta más tokens por palabra que en inglés.
- Cada token se convierte en números que representan su significado (**embedding**), como una **ubicación en un mapa**: *perro* queda cerca de *gato* y lejos de *avión*.
- La **atención** deja que cada token "mire" a los demás de la frase para decidir qué importa. Así distingue el "banco" del parque del "banco" del dinero.
- Se presentó en 2017 en el artículo *Attention Is All You Need*, de investigadores de Google.
- **Generar** es repetir: calcular probabilidades del siguiente token, elegir uno entre los probables, añadirlo, repetir.
- **El Transformer por dentro (6 pasos)**: entrada → embedding → *self-attention* → *feed-forward* → **capas repetidas** → salida.
  - **Feed-forward**: una red neuronal pequeña que *refina* lo que dejó la atención.
  - **Capas repetidas**: la atención y el feed-forward se repiten muchas veces; cuantas más capas, más patrones complejos puede captar.
  - **Salida**: según la tarea, predecir la siguiente palabra, clasificar o traducir.
- **Ejemplo estrella**: en *"El perro que estaba en el parque corrió hacia su dueño"*, la atención conecta *su* con *perro* y no con *parque*, aunque estén lejos.

### Lo que puedes decir en voz alta

- "La atención es como subrayar con un marcador las palabras que dan pistas."
- "Elige entre opciones probables, no siempre la primera: por eso la respuesta cambia."

### Errores comunes

- Creer que el modelo lee letra por letra o palabra por palabra: lee **tokens**.
- Creer que el Transformer "entiende" porque "piensa": solo **mide relaciones** entre tokens con números.
- Si hablas de *encoder* y *decoder*: no los necesitas. El encoder construye representaciones del texto y el decoder genera texto; muchos asistentes actuales se basan en bloques que generan texto. Di solo "capas repetidas".
- Creer que la variación es un fallo: es parte del diseño. Existe un ajuste (*temperatura*) que controla cuánta variedad hay.

### Si te preguntan…

- **¿Por qué se equivoca en cuentas o contando letras?** Porque trabaja con tokens y probabilidades, no calcula como una calculadora; algunos asistentes llaman a herramientas aparte para esto.
- **¿Por qué "olvida"?** Solo puede tener en cuenta una cantidad limitada de texto a la vez (*ventana de contexto*); lo que queda fuera no lo ve.

---

## 🌍 B5 · Actores, usos y límites

### Lo esencial

- Los LLM los construyen **laboratorios y empresas** (por ejemplo OpenAI, Google, Anthropic, Meta, Mistral), con **investigadores, ingenieros y personas que evalúan respuestas**, y también una **comunidad abierta**.
- Se usan para atender clientes, enseñar, redactar y resumir, programar, traducir y analizar documentos.
- **Límites**: alucinaciones (inventa con seguridad), datos desactualizados, sesgos (heredados del texto con que aprendió) y falta de comprensión humana.
- **RAG**: darle al modelo documentos para consultar antes de responder: "examen a libro abierto". Solo es un adelanto.

### Lo que puedes decir en voz alta

- "Suena seguro, pero **seguridad no es verdad**."
- "Para temas de salud, leyes o dinero, siempre una persona experta."
- "Úsalo como un **borrador** o un **ayudante**, no como el árbitro final."

### Errores comunes

- Decir "la IA siempre acierta" o "la IA siempre miente": ni lo uno ni lo otro.
- Dar datos personales a un asistente sin pensar.

### Si te preguntan…

- **¿Quitará empleos?** Se debate; lo más probable es que **cambie tareas** en muchos trabajos. No predigas: invita a pensar qué tareas podrían ayudar.
- **¿Es seguro compartir información?** Mejor no compartir datos personales ni confidenciales y revisar las condiciones de cada herramienta.
- **¿Cuál es el mejor asistente?** Cambia rápido; para este curso, cualquiera sirve.

---

## 🛠️ Taller: qué hacer cuando algo no sale como esperabas

| Situación | Qué decir |
|---|---|
| "No me inventó nada" | "Bien, no siempre ocurre. Probemos con algo más específico o poco conocido." |
| "Respondió distinto a mi compañero" | "Exacto: eso es la generación probabilística." |
| "No olvidó el dato" | "Puede ocurrir si la conversación aún es corta. Probemos alargarla." |
| "No tengo acceso a un asistente" | Usar las transcripciones del anexo del taller. |
| "Escribió datos reales" | Recordar la regla de datos ficticios y borrar la conversación. |

## 🙋 Cuando no sepas

Frases útiles:

- "Buena pregunta. No tengo certeza; lo investigo y lo traigo en la próxima sesión."
- "Es un tema en el que los especialistas aún discuten."
- "Probemos preguntárselo al asistente y **verifiquemos** su respuesta entre todos." (Convierte tu duda en una lección sobre verificar.)

## 📚 Para profundizar (opcional)

- Alan Turing, *Computing Machinery and Intelligence* (1950).
- Joseph Weizenbaum, artículo sobre ELIZA (1966).
- Vaswani et al., *Attention Is All You Need* (2017).
- 3Blue1Brown, serie de videos sobre redes neuronales y Transformers (muy visuales, sin necesidad de matemáticas previas).
- Andrej Karpathy, charla *Intro to Large Language Models* (video de divulgación).
- Jay Alammar, *The Illustrated Transformer* (explicación ilustrada).

## 📌 Checklist antes de clase

- [ ] Leí "La idea en una página".
- [ ] Preparé las tarjetas de las dinámicas (guía docente).
- [ ] Probé mi asistente con los prompts del taller.
- [ ] Tengo el glosario a mano.
- [ ] Pensé una frase para "cuando no sepa".
