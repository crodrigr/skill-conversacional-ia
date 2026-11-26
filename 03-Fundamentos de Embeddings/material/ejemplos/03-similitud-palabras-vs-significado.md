# 💡 Ejemplo 03 — Similitud: palabras vs. significado

## 🌍 Contexto

Una persona escribe "insomnio" en el buscador de un sistema de ayuda. El texto que le sirve dice "consejos para dormir mejor".

## 🧠 Concepto

Con embeddings se compara el **significado**, no las letras: se mide **qué tan cerca** están dos vectores.

🔗 **Analogía**: dos personas que viven en el mismo barrio se parecen en lo que tienen cerca, aunque se llamen distinto.

## 🧭 Explicación paso a paso

**1. Búsqueda por palabras exactas**

| Consulta | Texto | ¿Comparten palabras? | Resultado |
|---|---|---|---|
| insomnio | Consejos para dormir mejor por la noche | no | ❌ no lo encuentra |

**2. Búsqueda por significado (embeddings)**

| Consulta | Texto | ¿Qué tan cerca? | Resultado |
|---|---|---|---|
| insomnio | Consejos para dormir mejor por la noche | muy cerca | ✅ lo encuentra |
| insomnio | Horarios de trenes y buses | lejos | ❌ lo descarta |

**3. ¿Cómo se mide la cercanía?**

- 📐 **Distancia**: qué tan separados están los puntos en el mapa.
- 🧭 **Ángulo** (la **similitud del coseno**): si los dos vectores **apuntan hacia el mismo lado**, se parecen. Es la medida más usada con textos. No necesitas la fórmula: la idea es "¿apuntan igual?".

## 📖 Ideas clave

- **Cerca = parecido; lejos = distinto.**
- Una **puntuación de similitud** más alta significa más parecido.
- Funciona incluso sin **ninguna palabra en común**.

## ✅ Resultado esperado

El estudiante explica por qué la búsqueda por significado encuentra lo que la búsqueda por palabras no encuentra, y nombra las dos formas de medir cercanía.

## 🎲 Dinámica: ¿Se parecen?

El docente lee dos frases sin palabras en común y el grupo vota 👍 (cerca) o 👎 (lejos). Ejemplos: "mi perrito nuevo" / "cómo cuidar a un cachorro recién llegado"; "dolor lumbar" / "ejercicios para fortalecer la espalda"; "dolor lumbar" / "horarios de trenes".
