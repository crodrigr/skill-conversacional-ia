# 💡 Ejemplo 05 — Tokens y atención

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
