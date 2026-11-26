# 💡 Ejemplo 03 — One-shot

## 🌍 Contexto

El Café del Parque recibe pedidos por correo y quiere pasarlos a una **línea con formato fijo**. En zero-shot, cada respuesta sale distinta.

## 🧠 Concepto

**One-shot prompting** es dar al modelo **un solo ejemplo** (una entrada y la salida que esperas) antes de la tarea real. El ejemplo sirve para **fijar el formato, el tono o el criterio**.

🔗 **Analogía**: al empleado nuevo le dices "hazlo **como este caso**" y le muestras uno resuelto.

## 🧭 Explicación paso a paso

**Zero-shot**

```text
Extrae los datos de este correo: "Hola, soy Marta Gil. Quiero 3 cafés
molidos para el viernes."
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
La clienta Marta Gil quiere comprar tres cafés molidos y los necesita
para el viernes.
```

**One-shot** (añade un ejemplo)

```text
Extrae los datos del correo con este formato: Cliente | Producto | Cantidad | Entrega

Ejemplo
Correo: "Soy Luis Paz. Necesito 2 bolsas de café en grano para el martes."
Salida: Luis Paz | café en grano | 2 | martes

Ahora tú
Correo: "Hola, soy Marta Gil. Quiero 3 cafés molidos para el viernes."
Salida:
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Marta Gil | café molido | 3 | viernes
```

**Qué fija un ejemplo**

| Fija | Ejemplo |
|---|---|
| 📐 **Formato** | Las cuatro columnas separadas por `|` |
| 🗣️ **Tono** | Respuestas breves y neutras |
| ⚖️ **Criterio** | "Café en grano" y "café molido" se escriben tal cual |

**El riesgo: copiar el ejemplo**

Con **un solo** ejemplo, el modelo puede **imitarlo de más**. Si el correo nuevo no menciona la fecha:

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Marta Gil | café molido | 3 | martes
```

Copió "martes" del ejemplo en lugar de indicar que **no hay fecha**. Se corrige con una instrucción ("si falta un dato, escribe *sin dato*") o con **más ejemplos** (few-shot).

## ✅ Resultado esperado

El estudiante explica qué fija un ejemplo y reconoce el riesgo de que el modelo lo copie.

## 🎲 Dinámica: ¿Qué copió el modelo? / Elige el mejor ejemplo

Se comparan dos salidas y el grupo señala qué fue copiado del ejemplo. Luego votan cuál de tres ejemplos es el mejor para la tarea.
