# 💡 Ejemplo 06 — GloVe

## 🌍 Contexto

Otro equipo, esta vez de la Universidad de Stanford, propuso aprovechar **todo el texto a la vez** y no solo ventanas pequeñas.

## 🧠 Concepto

**GloVe** (*Global Vectors*; Jeffrey Pennington, Richard Socher y Christopher Manning, Stanford, 2014) construye vectores a partir de **cuántas veces aparecen juntas** las palabras en todo el texto.

🔗 **Analogía**: es como un registro de una biblioteca que anota cuántas veces dos palabras comparten una página.

## 🧭 Explicación paso a paso

**1. La tabla de coocurrencia** (ilustrativa)

Cuántas veces aparecen juntas en un texto de ejemplo:

| | leche | pan | ladra | maúlla |
|---|---:|---:|---:|---:|
| **gato** | 8 | 1 | 0 | 9 |
| **perro** | 6 | 2 | 9 | 0 |
| **auto** | 0 | 0 | 0 | 0 |

**2. Qué muestra**

- *gato* y *perro* comparten contextos (leche) pero se diferencian en otros (maúlla / ladra).
- *auto* casi no coincide con ninguna: queda lejos.

**3. Del conteo al vector**

GloVe usa estos conteos globales para que **la relación entre vectores refleje qué tan seguido aparecen juntas las palabras**.

**Word2Vec frente a GloVe**

| | Word2Vec | GloVe |
|---|---|---|
| Aprende de | Ventanas locales de contexto (adivinando) | Conteos globales de todo el texto |
| Vector por palabra | **Uno** | **Uno** |
| Año | 2013 | 2014 |
| Limitación común | No distinguen los sentidos de una palabra | No distinguen los sentidos de una palabra |

## ✅ Resultado esperado

El estudiante explica la idea de GloVe con una tabla de coocurrencia sencilla y compara Word2Vec y GloVe.

## 🎲 Dinámica: Cuenta con tarjetas

Con tarjetas de frases cortas, cada equipo cuenta cuántas veces aparecen juntas dos palabras y completa una tabla de coocurrencia.

## 🎲 Dinámica: ¿Cuántos vectores tiene «banco»?

Con Word2Vec o GloVe, "banco" (de parque o de dinero) tiene **un solo vector**. ¿Qué problema trae para entender "me senté en el banco" y "fui al banco a retirar dinero"?
