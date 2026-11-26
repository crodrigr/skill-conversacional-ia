# 💡 Ejemplo 02 — Del texto al vector

## 🌍 Contexto

¿Cómo llega una frase a convertirse en un vector que se pueda comparar?

## 🧠 Concepto

Un embedding se obtiene en tres pasos: **partir** el texto, **convertir** cada pieza en un vector y, si hace falta, **combinar** los vectores.

🔗 **Analogía**: es como convertir una receta en una lista de ingredientes con sus cantidades.

## 🧭 Explicación paso a paso

| Paso | Qué ocurre | Ejemplo |
|---|---|---|
| 1. **Texto** | Llega la frase | "El perro ladra en el parque" |
| 2. **Tokens** | Se parte en trozos | `El` `perro` `ladra` `en` `el` `parque` |
| 3. **Vectores** | Cada token pasa a ser un vector | perro → (2, 8) … |
| 4. **Combinar** | Se obtiene un vector para la frase o el documento | frase → un solo vector |

**¿De dónde salen los vectores?** El modelo **aprende** a ubicar las palabras durante su entrenamiento, con una regla muy simple:

> **Las palabras que aparecen en contextos parecidos reciben vectores cercanos.**

🔗 **Analogía**: *"Dime con quién andas y te diré quién eres"*. Una palabra se conoce por las palabras que la rodean.

**Ejemplo con huecos**

- "El ___ ladra en el parque."
- "Mi ___ ronronea en el sofá."

*perro* y *gato* aparecen rodeados de palabras parecidas (mascota, parque, sofá, comida…), así que quedan **cerca**. *Avión* casi nunca aparece en esos contextos, así que queda **lejos**.

**Embeddings de distintos tamaños**

- De **palabras**: un vector por palabra.
- De **oraciones**: un vector para una frase completa.
- De **documentos**: un vector para un párrafo o un texto largo.

## ✅ Resultado esperado

El estudiante ordena los pasos texto → tokens → vectores → comparar y explica que el vector se aprende por contexto.

## 🎲 Dinámica: Completa la frase

Se tapa una palabra de varias frases. Los equipos dicen qué palabras caben. Las que caben comparten contexto, y por eso estarán cerca.
