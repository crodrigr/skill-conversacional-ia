# 💡 Ejemplo 05 — Word2Vec

## 🌍 Contexto

Antes de los LLM, un equipo de Google propuso una forma muy eficiente de aprender embeddings de palabras.

## 🧠 Concepto

**Word2Vec** (Tomas Mikolov y colaboradores, Google, 2013) aprende un vector por palabra **adivinando palabras** a partir de su contexto.

🔗 **Analogía**: es como un juego de adivinar la palabra oculta en una frase, repetido millones de veces.

## 🧭 Explicación paso a paso

**Dos variantes**

| Variante | Qué adivina | Ejemplo con "El gato bebe ___ en su plato" |
|---|---|---|
| **CBOW** | La palabra del medio a partir de su contexto | contexto: *el, gato, bebe, en, su, plato* → **leche** |
| **Skip-gram** | El contexto a partir de la palabra del medio | palabra: *leche* → *bebe, gato, plato…* |

**¿Qué se obtiene?**

- Al entrenar, el modelo acomoda las palabras para acertar mejor. Como *leche* y *agua* aparecen en contextos parecidos, quedan **cerca**.
- El resultado es **una tabla**: cada palabra tiene **un vector fijo**.

**Ventajas**

- Rápido y ligero.
- Capta bien relaciones de significado (similitud y analogías).

**Limitaciones**

- **Un solo vector por palabra**: "banco" tiene el mismo vector en todas las frases.
- No distingue sentidos ni usa el resto de la frase.
- Las palabras que no vio en el entrenamiento no tienen vector.

## ✅ Resultado esperado

El estudiante explica la idea de Word2Vec, diferencia CBOW de Skip-gram y menciona su limitación principal.

## 🎲 Dinámica: La palabra oculta

Se proyectan frases con un hueco. Los equipos proponen la palabra (CBOW) y luego, dada una palabra, listan las palabras que suelen rodearla (Skip-gram).
