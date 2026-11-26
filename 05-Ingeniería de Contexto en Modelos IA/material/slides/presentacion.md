# Ingeniería de Contexto en Modelos IA

Módulo 02 · Personalización de un Sistema Experto

---

# 🎯 ¿Qué lograrás hoy?

- Explicar qué es el contexto
- Entender tokens y ventana
- Aplicar técnicas para elegir qué entra
- Diseñar el contexto de un asistente

---

# 📅 La ruta de hoy

| Parte | Tiempo |
|---|---|
| 🗂️ El contexto | 20 min |
| 🧩 Tokens y ventana | 20 min |
| 🗺️ Embeddings | 20 min |
| 🧰 Técnicas | 35 min |
| ✅ Caso y plantilla | 25 min |
| 🛠️ Taller | 60 min |

---

# 🎲 El mismo pedido, con y sin información

Dos respuestas a la misma pregunta.

**¿Qué cambió?**

⏱️ 7 minutos

---

# 🔁 Antes de empezar

- 🧩 **Token** · 🪟 **Ventana**
- 🗺️ **Embedding**
- ✍️ **Prompt**

---

# 🗂️ ¿Qué es el contexto?

**Todo lo que el modelo ve** antes de responder.

No solo tu pregunta.

---

# 🖥️ El escritorio del empleado

Lo que hay encima es lo que puede consultar.

Vacío, abarrotado o contradictorio → **malas respuestas**.

---

# 🛠️ Ingeniería de contexto

Elegir y mantener **qué información** ve el modelo, **cuándo** y **en qué orden**.

*(idea de Anthropic, 2025)*

---

# ⚖️ Prompt vs. contexto

| | Prompt | Contexto |
|---|---|---|
| Enfoque | Cómo pedir | Qué necesita ver |
| Unidad | Un prompt | Todo el sistema |

El prompt **queda incluido**.

---

# 🎲 ¿Prompt o contexto?

Cinco tareas.

👍 **prompt** · ✋ **contexto**

⏱️ 3 minutos

---

# 🧩 Tokens

El modelo lee **fragmentos**, no palabras.

`La | bibli | oteca | prestar | á | libros | .`

*(división ilustrativa)*

---

# 🎲 Parte la frase en tokens

Corten una frase en "trozos" con la regla del grupo.

**¿Siempre es una palabra?**

⏱️ 4 minutos

---

# 🪟 La ventana de contexto

El **tamaño del escritorio**:
cuántos tokens caben a la vez.

---

# 💰 Más tokens, más…

💰 costo · ⏱️ espera · 🌫️ confusión

Y si no cabe, **se corta**.

---

# 🎲 ¿Cabe o no cabe?

Tres textos y una ventana de 50 trozos.

**¿Cuáles caben?**

⏱️ 4 minutos

---

# 🧭 Si no cabe

1. **Seleccionar** lo útil
2. **Resumir** lo largo
3. **Guardar fuera** lo pesado

---

# 🗺️ Repaso: embeddings

Un **vector** que representa el **significado**.

🔗 Coordenadas en un mapa.

---

# 🧲 Espacio semántico

Lo parecido queda **cerca**.

La pregunta cae en un punto: traemos a sus **vecinos**.

---

# 🎲 Ordena por cercanía

Una pregunta y cinco fragmentos.

**De más cerca a más lejos.**

⏱️ 5 minutos

---

# 🧭 Modelo de embedding

Convierte **preguntas y fragmentos** en vectores comparables.

Ayuda a **elegir**; no garantiza que sea **correcto**.

---

# 🔍 Ampliar la consulta

`notas estudiantes`

→ `política de calificaciones, escala de notas, resultados`

---

# 🎲 Enriquece la consulta

Mejoren la consulta **«horarios»**.

⏱️ 4 minutos *(prescindible)*

---

# 🧱 Siete elementos del contexto

Instrucciones · Mensaje · Historial · Datos externos · Memoria · Herramientas · Estado

---

# 🎲 ¿De dónde viene cada pieza?

Tarjetas con piezas del asistente.

**Clasifíquenlas en los siete elementos.**

⏱️ 7 minutos

---

# 🧠 Cuatro memorias

⏳ **Corto plazo** · 🗓️ **Largo plazo**
📖 **Episódica** · 📚 **Semántica**

*(mención)*

---

# 🧰 Cuatro estrategias

**Escribir · Seleccionar · Comprimir · Aislar**

*(LangChain, 2025)*

---

# 🎯 Seleccionar

❌ Todo el manual
✅ Solo la sección de la pregunta

---

# 🗜️ Comprimir

20 mensajes →
*«Diseña un LMS; falta estandarizar notas.»*

---

# 🎲 Resume el historial

Ocho mensajes, **dos líneas**.

**¿Qué conservan?**

⏱️ 5 minutos

---

# 📥 Recuperar (idea de RAG)

Primero **buscar** en los documentos.
Después **responder** con lo encontrado.

---

# 🧩 Ejemplos en contexto

Mostrar el patrón:
*caso 1 → salida · caso 2 → salida · nuevo caso*

---

# 🗄️ Aislar

**Fuera**: lo pesado.
**Dentro**: solo lo necesario.

---

# 🎲 ¿Dentro o fuera?

Ocho objetos.

**Cada uno, a su lugar.**

⏱️ 3 minutos

---

# 📏 Evaluar el contexto

Precisión · tokens · tiempo · costo · errores

**Si no se mide, no se sabe.**

---

# ⚠️ Siete problemas

Insuficiente · Excesivo · Contradictorio
Desactualizado · Ruidoso
Historial largo · Herramientas mal descritas

---

# 🎲 Diagnostica

Siete tarjetas, un problema cada una.

**Nómbrenlo y corríjanlo.**

⏱️ 6 minutos

---

# 🎓 El caso del LMS

«¿Por qué mi nota es 3.8?»

Sin datos: respuesta vaga.
Con notas y pesos: **el cálculo**.

---

# 🔄 Cómo se arma

Entrada → intención → recuperar
→ filtrar → construir → modelo
→ evaluar y guardar

---

# 🌉 Y después: agentes

Un agente planifica y usa herramientas.

Su contexto cambia **en cada paso**.

---

# 📝 La plantilla

Rol · Objetivo · Solicitud · Contexto
Restricciones · Herramientas · Formato · Calidad

---

# 🧭 Principios

🎯 Relevancia · ⚖️ Suficiencia · 📑 Orden
🥇 Prioridad · 🔄 Actualización · 🧾 Trazabilidad

---

# 📌 Lo que te llevas

- Contexto = todo lo que ve el modelo
- Los tokens limitan la ventana
- Seleccionar, resumir, recuperar, aislar
- Más texto ≠ mejor
- Mide y revisa

---

# ❓ Quiz relámpago

10 preguntas · 6 minutos

---

# 🛠️ Ahora, el taller

Equipos de 3–4 · 4 retos · 60 minutos
