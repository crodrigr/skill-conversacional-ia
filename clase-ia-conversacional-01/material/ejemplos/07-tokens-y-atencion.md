# 💡 Ejemplo 07 — Tokens, embeddings y atención

## 🌍 Contexto

Un modelo no ve palabras como tú. Veamos cómo "lee" una frase y cómo decide qué palabras importan.

## 🧭 Explicación paso a paso

**1. Tokenización** (ilustrativa; cada modelo parte distinto)

```text
Frase:  Me encanta aprender inteligencia artificial
Tokens: [Me] [ encanta] [ apren] [der] [ inteligencia] [ artificial]
```

**2. Atención.** Frase ambigua:

> *Me senté en el banco del parque a descansar.*

- Para interpretar **banco**, el modelo "mira" a *senté* y *parque*.
- Esas pistas apuntan a un asiento, no a una entidad financiera.

**3. Generación token a token**

```text
"Me senté en el banco del" → parque (45 %) · jardín (20 %) · pueblo (10 %) · …
```

Elige uno entre los probables, lo añade y repite.

## ✅ Resultado esperado

- La atención aprovecha el contexto para resolver ambigüedades.
- Como se elige entre opciones probables, **la misma pregunta puede dar respuestas distintas**.
- Los porcentajes son ilustrativos.

## 🎲 Dinámica

Votación: ¿qué palabras te dieron la pista de qué "banco" era?

---

## 🧬 Embeddings: el significado como un mapa

Para un modelo, las palabras son al inicio solo símbolos. Un **embedding** convierte cada token en una lista de números (un **vector**) que lo ubica en un "mapa de significado".

- *perro* y *gato* quedan **cerca** (son animales domésticos).
- *perro* y *avión* quedan **lejos**.

## 🐕 Atención: ¿a quién se refiere "su"?

> *El perro que estaba en el parque corrió hacia su dueño.*

- Con **self-attention**, cada palabra se "conecta" con las demás y les da más o menos importancia.
- Así el modelo entiende que **"su" se refiere al perro**, no al parque, aunque estén separados por varias palabras.
- Esto es lo que distingue a los Transformers de las arquitecturas anteriores, que tenían dificultades con palabras lejanas.

## 🏗️ El Transformer por dentro (6 pasos)

Ejemplo de entrada: *"El perro corre en el…"*

| Paso | Qué ocurre | 🔗 Analogía |
|---|---|---|
| 1. **Entrada** | Llega el texto | Llega la receta escrita |
| 2. **Embedding** | Cada token se convierte en un vector | Cada palabra se ubica en el mapa |
| 3. **Self-attention** | Cada palabra mira a las demás y pondera su importancia | Subrayar las pistas |
| 4. **Feed-forward** | Una red neuronal refina lo que dejó la atención | Repasar y pulir los apuntes |
| 5. **Capas repetidas** | Los pasos 3 y 4 se repiten muchas veces; más capas = patrones más ricos | Releer varias veces cada vez entendiendo más |
| 6. **Salida** | Se produce el resultado según la tarea | La respuesta final |

Según la tarea, la salida puede ser:

- **Predecir la siguiente palabra**: "El perro corre en el…" → *parque*.
- **Clasificar un texto**: positivo o negativo.
- **Traducir**: *dog* → *perro*.

> 💡 **Nota**: en la literatura técnica se habla de *encoder* (construye representaciones del texto) y *decoder* (genera texto). Muchos asistentes conversacionales actuales se basan en bloques que generan texto token a token. Para este curso basta la idea de **capas repetidas de atención + feed-forward**.

## 🎲 Dinámica: Armemos el Transformer

Con 6 tarjetas, cada equipo ordena los pasos y lee en voz alta qué hace cada uno con la frase *"El perro corre en el…"*.
