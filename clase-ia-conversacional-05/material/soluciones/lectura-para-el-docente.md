# 🧑‍🏫 Lectura para el docente — Prompts del Sistema

> Material solo para el docente. Está escrito en lenguaje sencillo: si lo lees una vez (≈ 40 minutos), podrás dictar la sección con tranquilidad.

## 🎯 Cómo usar esta lectura

1. Lee primero **"La idea en una página"**.
2. Antes de cada bloque, lee su sección: *lo esencial*, *lo que puedes decir en voz alta*, *errores comunes* y *si te preguntan…*.
3. Ten a mano el [glosario](../ejemplos/glosario.md).
4. **No necesitas saber más** de lo que está aquí. Para lo que no sepas, ve a "Cuando no sepas".

## 🧭 La idea en una página

- El **system prompt** es la instrucción que recibe el modelo **antes** de cualquier mensaje del usuario. Fija su **rol, comportamiento y estilo**. Es el **manual del puesto**.
- El **mensaje del usuario** cambia en cada turno; el system prompt **permanece**.
- En una conversación hay tres roles: **sistema**, **usuario** y **asistente**. En cada turno se **reenvía el historial relevante**.
- En un **agente autónomo** (que decide y actúa con poca supervisión) el manual es aún más importante: define **alcance, tono, límites éticos y expectativas**.
- Un system prompt bien hecho **tiende a** dar respuestas más consistentes; **no es una garantía**.
- Se escribe con **cuatro componentes**: objetivo, tono y estilo, restricciones y procedimiento. Se prueba con casos difíciles.
- **Nunca** lleva secretos. Lo crítico se controla **fuera del modelo**.

### 📚 Qué está verificado y qué no

| Idea | Estado |
|---|---|
| Anthropic: el mensaje del sistema se pasa en un parámetro `system` que fija el rol; usuario y asistente alternan turnos | ✅ Se puede citar (guías de prompting de Anthropic) |
| OpenAI: roles `developer`/`system` y `user`; en modelos recientes `developer` reemplaza a `system` | ✅ Se puede citar (referencia de la API) |
| OpenAI Model Spec (mayo de 2024): prioridad plataforma > desarrollador > usuario > herramienta; ante conflicto gana el desarrollador | ✅ Se puede citar, indicando que es un documento de 2024 |
| OWASP Top 10 para LLM 2025 (LLM07): los system prompts pueden filtrarse o alterarse; no incluir secretos; no usar el prompt como único control de seguridad | ✅ Se puede citar |
| «El system prompt reduce alucinaciones» o «garantiza el comportamiento ético» | ❌ **No hay garantía**: se dice siempre «tiende a» |

**No des cifras** de longitudes ni precios. Cada proveedor nombra los roles a su manera: usamos «sistema, usuario y asistente» como forma general.

---

## 🌍 B1 · ¿Qué es un system prompt?

### 🔑 Lo esencial

- Es la instrucción **previa** al mensaje del usuario; define rol, comportamiento y estilo.
- Es **oculto** para el usuario habitual, pero **no inviolable**.
- Ejemplos: asistente general, escritura creativa, programación y atención al cliente.

### 🗣️ Lo que puedes decir en voz alta

- «El mensaje fue el mismo; **cambió el manual**.»
- «El cliente en el mostrador cambia; el manual del puesto es el mismo.»

### ⚠️ Errores comunes

- Creer que «oculto» significa **seguro**.
- Pensar que el system prompt es una «configuración técnica»: es **texto en lenguaje natural**.

### ❓ Si te preguntan…

- **¿Puedo ver el system prompt de un asistente?** A veces sí, a veces no; por eso no se ponen secretos.
- **¿Es lo mismo que el prompt del Módulo anterior?** Es el mismo tipo de texto, pero fijo y puesto **antes** de la conversación.

---

## 🌍 B2 · Usuario, asistente y sistema

### 🔑 Lo esencial

- Tres roles: **sistema** (reglas), **usuario** (pregunta), **asistente** (responde). Usuario y asistente se **alternan**.
- El modelo **no recuerda** por sí mismo: se le **reenvía el historial relevante**.
- Ante un conflicto, **por diseño** suele ganar el sistema, pero **no siempre**.

### 🗣️ Lo que puedes decir en voz alta

- «El empleado relee el cuaderno antes de contestar para no contradecirse.»
- «Algunos proveedores publican su orden de prioridad; aun así, conviene probarlo.»

### ⚠️ Errores comunes

- Creer que el usuario **siempre** puede cambiar las reglas, o que **nunca** puede.
- Confundir **historial** con **memoria** (el historial es de esta conversación).

### ❓ Si te preguntan…

- **¿El rol «developer» es lo mismo que «system»?** En algunos proveedores, los modelos recientes usan «developer» en lugar de «system»; la idea es la misma. No hace falta entrar en detalle.

---

## 🌍 B3 · Agentes autónomos

### 🔑 Lo esencial

- **Agentic workflow**: la IA **decide y actúa** con poca supervisión (atención al cliente, investigación, código, redacción).
- Cuatro funciones del system prompt: **alcance, tono, límites éticos y expectativas**.
- Sin límites, un agente puede recomendar de más, inventar o salirse del alcance.

### 🗣️ Lo que puedes decir en voz alta

- «Cuanto más solo atiende el empleado, más claro tiene que estar el manual.»
- «El asistente financiero del ejemplo es ficticio y **no es asesoría**.»

### ⚠️ Errores comunes

- Creer que un agente es «una IA más inteligente»: es una IA con **más autonomía**.

### ❓ Si te preguntan…

- **¿Y las herramientas y la memoria?** Se verán en otra sección; hoy solo vemos cómo el manual guía al agente.

---

## 🌍 B4 · Ejecución y consistencia

### 🔑 Lo esencial

- Sin system prompt: **inconsistencia, pérdida del rol, invenciones**.
- Con uno bueno: **tiende** a haber resultados más confiables y menos errores.
- Las **salvaguardas** (veracidad, neutralidad, no hacer daño) orientan, pero **no son garantía**: **defensa en profundidad**.
- Cuatro componentes: **objetivo, tono y estilo, restricciones, procedimiento**.

### 🗣️ Lo que puedes decir en voz alta

- «El manual ayuda, pero además necesitamos cámaras, supervisor y caja fuerte.»
- «Cada componente responde una pregunta: ¿qué haces?, ¿cómo hablas?, ¿qué nunca haces?, ¿cómo procedes?»

### ⚠️ Errores comunes

- Prometer que un system prompt «evita todas las alucinaciones».
- Escribir reglas **contradictorias** («sé breve» y «explica todo en detalle»).

### ❓ Si te preguntan…

- **¿Qué es la inyección de instrucciones?** Cuando un usuario intenta que el modelo ignore o revele sus reglas. Es un riesgo conocido: por eso no se confía solo en el prompt.

---

## 🌍 B5 · Plantilla, criterios y cierre

### 🔑 Lo esencial

- **Plantilla** con campos (`{rol}`, `{empresa}`, `{idioma}`): estructura fija y datos dinámicos.
- **Criterios**: especificidad, trazabilidad, defensa en profundidad.
- **Probar** con casos: normal, fuera de alcance, saltarse reglas, dato faltante, petición riesgosa; **reforzar** y volver a probar.
- **Sin secretos**; lo crítico se controla **fuera del modelo**.

### 🗣️ Lo que puedes decir en voz alta

- «Una vez que escribes el manual, lo pruebas como un simulacro.»
- «Si algo no debe ocurrir, no lo dejes solo en el texto: haz que el sistema **no lo permita**.»

### ⚠️ Errores comunes

- Poner una clave «porque nadie la verá».
- Probar con **un solo** caso fácil.

### ❓ Si te preguntan…

- **¿Cuántos casos de prueba?** Varios y variados; no hay cifra fija.
- **¿Puedo usar esto con mi empresa?** Sí, pero **sin datos confidenciales** en asistentes externos y con revisión.

---

## 🆘 Cuando no sepas

- «Buena pregunta. No tengo ese detalle a mano; lo verificamos y lo traemos en la próxima clase.»
- «Eso depende del proveedor y del modelo; lo importante es **probarlo con casos reales**.»
- «No quiero inventar una cifra: prefiero decir que no la sé.»
- Para dudas técnicas, vuelve a **la idea en una página** y al [glosario](../ejemplos/glosario.md).
