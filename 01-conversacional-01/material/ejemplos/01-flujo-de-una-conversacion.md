# 💡 Ejemplo 01 — El flujo de una conversación y sus piezas

## 🌍 Contexto

Le escribes a un asistente: *"Recomiéndame una película de aventuras"*. Y luego: *"¿Y alguna más corta?"*. ¿Cómo sabe a qué te refieres con "más corta"?

## 🧠 Concepto

Una IA conversacional sigue un flujo y **usa el historial** para dar sentido a mensajes cortos.

## 🧭 Explicación paso a paso

| Paso | Qué ocurre | En el ejemplo |
|---|---|---|
| 📥 1. Entrada | Recibe tu mensaje | "¿Y alguna más corta?" |
| 🔍 2. Interpretación | Lo lee junto con el historial | "más corta" → que la película sea más corta |
| ✍️ 3. Generación | Construye la respuesta token a token | Prepara una lista de películas breves |
| 📤 4. Respuesta | Te la muestra | Lista de 3 películas |
| 🧾 5. Historial | Guarda el intercambio | Servirá para el siguiente mensaje |

## ✅ Resultado esperado

Sin historial, "¿Y alguna más corta?" no tiene sentido. El historial es lo que convierte frases sueltas en una conversación.

## 🎲 Dinámica

Ordena las cinco tarjetas del flujo en tu equipo en 3 minutos.

---

## 🧩 Las piezas de una IA conversacional

Una IA conversacional **no es una sola cosa**: es un conjunto de piezas que trabajan juntas, como un engranaje.

| Pieza | Qué hace | Cuándo aparece |
|---|---|---|
| 🎙️ **Speech-to-Text (STT)** | Convierte la voz en texto | Solo si hablas |
| 🔍 **Comprensión del lenguaje (NLU)** | Entiende el mensaje completo, aunque no uses las palabras exactas | Siempre |
| 🎯 **Detección de intención** | Descubre **qué quieres lograr** | Siempre |
| 📦 **Extracción de valores (slots)** | Saca los datos útiles: fechas, nombres, lugares, cantidades | Siempre |
| 🧾 **Contexto y múltiples turnos** | Recuerda lo dicho antes para dar coherencia | Siempre |
| 🧭 **Política de diálogo** | Decide el siguiente paso: preguntar, confirmar, retomar un tema | Siempre |
| 🔊 **Text-to-Speech (TTS)** | Convierte la respuesta en voz | Solo si el asistente habla |

## 🧭 Explicación paso a paso — un pedido por voz

Dices: *"Quiero pedir una pizza grande de pepperoni para el viernes a las 8 de la noche"*.

1. **STT**: tu voz se convierte en ese texto.
2. **NLU + intención**: el sistema concluye que quieres **pedir comida**.
3. **Slots** (los datos que extrae):

| Dato | Valor |
|---|---|
| Producto | pizza |
| Tamaño | grande |
| Sabor | pepperoni |
| Día | viernes |
| Hora | 20:00 |

4. **Política de diálogo**: falta la dirección, así que **pregunta**: *"¿A qué dirección la llevamos?"*.
5. **Contexto**: si luego dices *"mejor que sea mediana"*, el sistema sabe que hablas de **esa pizza** y cambia solo el tamaño.
6. **TTS**: la respuesta se convierte en voz.

## 📖 Ideas clave

- Con **voz** es más difícil: la gente cuenta historias largas antes de llegar al punto y **no hay historial visible** como en un chat.
- Un chat **escrito** no necesita STT ni TTS.
- Los asistentes con LLM suelen realizar **varias de estas piezas con un solo modelo**, pero la idea de fondo sigue siendo la misma: entender, decidir, responder.

## ✅ Resultado esperado

El estudiante nombra al menos cinco piezas, explica la diferencia entre **intención** (qué quiere) y **slots** (con qué datos) y dice por qué el contexto importa en varios turnos.

## 🎲 Dinámica: Detective de intenciones

En equipos: para cada frase, identifica la **intención** y los **datos (slots)**.

1. *"Necesito una cita con el dentista el martes por la tarde."*
2. *"¿Cómo estará el clima en Lima este fin de semana?"*
3. *"Reserva una mesa para cuatro personas hoy a las 9."*
