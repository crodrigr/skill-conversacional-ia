# 💡 Ejemplo 01 — El prompt y su estructura

## 🌍 Contexto

Una cafetería ficticia, el **Café del Parque**, quiere que un asistente escriba un aviso para su pizarra. Dos personas piden lo mismo, pero de forma distinta.

## 🧠 Concepto

Un **prompt** es todo lo que le entregas al modelo: la instrucción y la información que necesita para responder. **La forma de pedir cambia la calidad de la respuesta.**

🔗 **Analogía**: es la **nota de encargo** que le dejas a alguien. Con "haz algo con el café" no sabrá qué hacer; con una nota clara, acierta.

## 🧭 Explicación paso a paso

**Pedido A (vago)**

```text
Escribe sobre el café.
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
El café es una bebida muy popular en todo el mundo. Se produce en
muchos países y tiene una larga historia...
```

**Pedido B (con estructura)**

```text
Eres el encargado de la pizarra del Café del Parque.
Escribe un aviso de 3 líneas para anunciar el capuchino de temporada.
Contexto: es un capuchino con canela, solo esta semana, cuesta 3 dólares.
Formato: una línea de título y dos líneas de texto.
Evita: signos de exclamación y más de 25 palabras.
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Capuchino de canela
Solo esta semana en el Café del Parque.
Pruébalo hoy por 3 dólares.
```

**Las cinco piezas de un buen prompt**

| Pieza | Pregunta que responde | En el pedido B |
|---|---|---|
| 🎭 **Rol** | ¿Quién eres? | Encargado de la pizarra |
| 🎯 **Tarea** | ¿Qué debes hacer? | Escribir un aviso de 3 líneas |
| 📚 **Contexto** | ¿Qué debes saber? | Capuchino de canela, esta semana, 3 dólares |
| 📐 **Formato** | ¿Cómo lo entrego? | Título y dos líneas |
| 🚫 **Restricciones** | ¿Qué debo evitar? | Sin exclamaciones, máximo 25 palabras |

No siempre hacen falta las cinco: son una **lista de verificación**, no una regla fija.

## ✅ Resultado esperado

El estudiante explica por qué el pedido B funciona mejor e identifica las cinco piezas en un prompt dado.

## 🎲 Dinámica: Pedir mal vs. pedir bien

Se leen los dos pedidos y las dos salidas. El grupo dice qué datos del pedido B cambiaron el resultado. Después, **Arma el prompt**: con tarjetas ordenan las cinco piezas.
