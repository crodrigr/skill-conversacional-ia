# Prompts del Sistema

Módulo 02 · Personalización de un Sistema Experto

---

# 🎯 ¿Qué lograrás hoy?

- Explicar qué es un system prompt
- Distinguir sistema, usuario y asistente
- Entender cómo guía a un agente
- Escribir y probar uno propio

---

# 📅 La ruta de hoy

| Parte | Tiempo |
|---|---|
| 📜 Qué es | 20 min |
| 🎭 Los tres roles | 25 min |
| 🤖 Agentes | 25 min |
| 🧱 Consistencia | 30 min |
| 📝 Plantilla y cierre | 20 min |
| 🛠️ Taller | 60 min |

---

# 🎲 El mismo mensaje, dos asistentes

«Cuéntame algo sobre el sol.»

Dos respuestas muy distintas.

**¿Qué las diferencia?**

⏱️ 7 minutos

---

# 🔁 Antes de empezar

- ✍️ **Prompt**: la instrucción
- 🗂️ **Contexto**: todo lo que ve el modelo
- 🛡️ **Instrucciones del sistema**: un elemento del contexto

---

# 📜 ¿Qué es un system prompt?

La instrucción que recibe el modelo **antes** de cualquier mensaje del usuario.

Define **rol, comportamiento y estilo**.

🔗 El **manual del puesto**.

---

# 🆚 System vs. user prompt

| System | User |
|---|---|
| Reglas, tono, límites | La pregunta del momento |
| **Permanece** | **Cambia** cada vez |

---

# 🙈 «Oculto» no es «secreto»

El usuario **normalmente no lo ve**.

Pero puede filtrarse.

**Nunca pongas claves ni datos personales.**

---

# 🧩 Cuatro ejemplos

🧑‍💼 General · 📖 Creativo
💻 Programación · 🛎️ Atención al cliente

Cada uno fija **rol y tono**.

---

# 🎲 ¿De qué asistente es?

Cuatro system prompts.
Cuatro casos de uso.

**Únanlos.**

⏱️ 3 minutos

---

# 🎭 Tres roles

🛡️ **Sistema**: las reglas
🙋 **Usuario**: pregunta
🤖 **Asistente**: responde

---

# 🔄 El ciclo

```text
[SISTEMA]    reglas
[USUARIO]    pregunta
[ASISTENTE]  respuesta
[USUARIO]    otra pregunta…
```

---

# 🎲 ¿Quién dijo qué?

Cinco líneas de una conversación.

**Etiqueten cada una.**

⏱️ 4 minutos

---

# 📒 El historial se reenvía

El modelo **no recuerda por sí mismo**.

En cada turno recibe el historial **relevante**.

Así evita contradecirse.

---

# 🎲 ¿Qué se reenvía?

Una conversación larga.

**¿Qué necesita ver para la última pregunta?**

⏱️ 4 minutos *(prescindible)*

---

# 📊 Sistema vs. usuario

| | Sistema | Usuario |
|---|---|---|
| Escribe | Quien construye | Quien usa |
| Cambia | Poco | Mucho |
| Prioridad | Mayor | Menor |

---

# 🥇 Prioridad por diseño

Ante un choque, **suele ganar el sistema**.

Algunos proveedores publican un orden explícito de prioridades.

---

# ⚠️ Pero no siempre

El usuario puede **insistir** o **reformular**.

El modelo puede **fallar**.

No es una garantía.

---

# 🎲 Conflicto: ¿quién gana?

Cinco choques entre regla y petición.

**Voten qué hace el asistente.**

⏱️ 5 minutos

---

# 🤖 Agentic workflow

La IA **decide y actúa**
con **poca supervisión**.

Más autonomía → más importa el manual.

---

# 🧪 Cuatro escenarios

🛎️ Atención al cliente · 🔎 Investigación
💻 Código · ✍️ Redacción

---

# 🎲 ¿Es un agente?

Seis escenarios.

👍 **agente** · ✋ **no**

⏱️ 4 minutos

---

# 🧰 Cuatro funciones

🎯 **Alcance** · 🗣️ **Tono**
🚧 **Límites éticos** · 🤝 **Expectativas**

---

# 🎲 Marca las cuatro funciones

Un system prompt del asistente financiero.

**Subrayen cada función.**

⏱️ 6 minutos

---

# 🏦 El caso financiero

Información **general**.
Sin recomendaciones personalizadas.
Sin predicciones.

*(ficticio · no es asesoría)*

---

# 💥 ¿Qué podría salir mal?

Recomendar a una persona · inventar datos
salirse del alcance · tono inadecuado

---

# 🌫️ Sin system prompt

🎭 Pierde el rol
🔀 Responde distinto cada vez
🌫️ Inventa

---

# 🎲 Detecta el síntoma

Tres respuestas.

**¿Qué síntoma muestra cada una?**

⏱️ 4 minutos *(prescindible)*

---

# 📈 Uno bueno ayuda a…

✅ resultados confiables
🔻 menos invenciones
🤝 más confianza

**Tendencias, no garantías.**

---

# 🛡️ Salvaguardas

🔎 **Veracidad**
⚖️ **Neutralidad**
🚫 **No hacer daño**

Reglas dentro del prompt.

---

# ❓ ¿Es una garantía?

**No.**

Se puede eludir o filtrar.

**Defensa en profundidad**: reglas + pruebas + controles fuera del modelo.

---

# 🎯 Componente 1: objetivo

Qué **hace** y qué **no hace**.

> «Resume jurisprudencia, **sin dar asesoría legal**.»

---

# 🎲 Completa el objetivo

«Eres un asistente de…»

**Añadan lo que hace y lo que no.**

⏱️ 4 minutos

---

# 🗣️ Componente 2: tono y estilo

Formal · Cercano · Experto · Creativo

La voz debe coincidir con la **audiencia**.

---

# 🚧 Componente 3: restricciones

> «No des diagnósticos.»
> «Si falta un dato, di *no disponible*.»

Lo que **no** debe hacer.

---

# 🪜 Componente 4: procedimiento

1. Entiende
2. Explica el enfoque
3. Entrega estructurado
4. Ofrece siguientes pasos

---

# 🎲 Mejora el system prompt vago

«Ayuda a la gente.»

**Añadan los cuatro componentes.**

⏱️ 5 minutos

---

# 📝 La plantilla

Rol · Tono · Políticas · Límites · Procedimiento

Con **campos**: `{rol}` `{empresa}` `{idioma}`

Estructura fija, datos **dinámicos**.

---

# 🎲 Completa los campos

Una ficha de sucursal.

**Rellenen `{rol}`, `{tono}`, `{límites}`.**

⏱️ 4 minutos

---

# ✅ Criterios de calidad

🎯 **Especificidad**
🧾 **Trazabilidad**
🛡️ **Defensa en profundidad**

---

# 🧪 Probar y reforzar

Casos: normal · fuera de alcance
saltarse reglas · dato faltante · petición riesgosa

Detecta, refuerza, **vuelve a probar**.

---

# 🔐 Sin secretos

❌ Claves, contraseñas, datos personales.

Lo crítico se controla **fuera del modelo**.

---

# 📌 Lo que te llevas

- System prompt = el manual del puesto
- Sistema, usuario y asistente
- Más autonomía, más límites
- Cuatro componentes + plantilla
- Pruébalo; no es una garantía

---

# ❓ Quiz relámpago

10 preguntas · 6 minutos

---

# 🛠️ Ahora, el taller

Equipos de 3–4 · 4 retos · 60 minutos
