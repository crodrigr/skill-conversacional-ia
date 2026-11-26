# 💡 Ejemplo 08 — El asistente de «Tienda La Esquina»

## 🌍 Contexto

**Tienda La Esquina** (ficticia) quiere un asistente que responda consultas de clientes. Datos de la tienda: abre de lunes a sábado de 9 a 20 h y cierra los domingos; acepta devoluciones **hasta 15 días** con el ticket; el envío a domicilio es gratis en compras desde 50 dólares.

## 🧠 Concepto

**Personalizar** un asistente con prompting es combinar el **contexto de tu negocio**, un **rol** y, si hace falta, **ejemplos** del estilo y criterio que quieres.

🔗 **Analogía**: es la **hoja de bienvenida** del empleado nuevo: quién es la tienda, qué datos importan y cómo se responde.

## 🧭 Explicación paso a paso

**Nivel 1 — Zero-shot**

```text
Eres el asistente de Tienda La Esquina. Responde con amabilidad y brevedad.
Datos: abre de lunes a sábado de 9 a 20 h, cierra los domingos. Devoluciones
hasta 15 días con ticket. Envío gratis desde 50 dólares.
Si no sabes algo, di que no lo sabes.

Cliente: ¿Abren el domingo?
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
No, los domingos estamos cerrados. Abrimos de lunes a sábado, de 9 a 20 h.
```

**Nivel 2 — One-shot** (fija el tono)

```text
...(mismo texto)...
Ejemplo
Cliente: ¿Cuánto tarda el envío?
Asistente: No tengo ese dato. Te recomiendo escribirnos para confirmarlo. 😊

Cliente: ¿Tienen la camisa azul en talla M?
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
No tengo ese dato. Te recomiendo escribirnos para confirmarlo. 😊
```

**Nivel 3 — Few-shot** (fija el criterio: qué responder y cuándo derivar)

```text
...(mismo texto)...
Cliente: ¿Puedo devolver algo que compré hace 10 días?
Asistente: Sí, aceptamos devoluciones hasta 15 días con el ticket.

Cliente: ¿Cuánto tarda el envío?
Asistente: No tengo ese dato. Te recomiendo escribirnos para confirmarlo.

Cliente: ¿Hacen descuento por compras grandes?
Asistente: No tengo ese dato. Te recomiendo escribirnos para confirmarlo.

Cliente: ¿Puedo devolver una camisa que compré hace 20 días?
```

> ⚠️ Salida simulada — ilustrativa, no es la salida de un modelo real.

```text
Lo siento, las devoluciones se aceptan hasta 15 días con el ticket.
```

**Qué muestra este caso**

- El **contexto** (los datos de la tienda) está **dentro del prompt**.
- Los **ejemplos** enseñan qué hacer cuando el dato **no está**: derivar en vez de inventar.
- Si la tienda tuviera **cientos de políticas y productos**, no cabrían en el prompt: ahí aparece **RAG** (ver [Ejemplo 07](07-limitaciones-y-puente.md)).

## ✅ Resultado esperado

El estudiante escribe el prompt de un asistente ficticio con contexto, rol y ejemplos, y explica por qué eligió ese nivel.

## 🎲 Dinámica

Se usa como modelo del **Reto 4** del [taller](../../actividades/talleres/taller-01.md).
