# 💡 Ejemplo 04 — Analogías vectoriales y sesgos

## 🌍 Contexto

Los mapas de embeddings guardan **relaciones** entre palabras, no solo cercanías.

## 🧠 Concepto

Las **analogías vectoriales** usan la diferencia entre vectores: la "dirección" de una relación se puede aplicar a otra palabra.

🔗 **Analogía**: si sabes cómo ir de "hombre" a "mujer" en el mapa, puedes dar el mismo paso desde "rey".

## 🧭 Explicación paso a paso

**1. El ejemplo clásico**

```text
rey − hombre + mujer ≈ reina
```

Es el ejemplo central del artículo *Linguistic Regularities in Continuous Space Word Representations* (Mikolov, Yih y Zweig, 2013).

**2. Otras relaciones que suelen aparecer**

| Pregunta | Respuesta típica |
|---|---|
| París es a Francia como Lima es a… | Perú |
| perro es a cachorro como gato es a… | gatito |

**3. Límites**

- **Es aproximado**: a veces acierta y a veces no.
- Depende del modelo, de los datos y del idioma.
- Se calcula **cerca de** un punto; no hay una respuesta exacta.

**4. Los sesgos también viajan**

Los embeddings se aprenden de textos escritos por personas, y **heredan sus estereotipos**. Un estudio de 2016 (Bolukbasi y colaboradores) mostró que embeddings entrenados con noticias completaban "hombre es a programador como mujer es a…" con una ocupación doméstica, reflejando un estereotipo.

> ⚠️ El modelo no "piensa" eso: **refleja lo que leyó**. Por eso hay que revisar los resultados antes de usarlos en decisiones.

## ✅ Resultado esperado

El estudiante explica qué muestra la analogía rey/reina, por qué no siempre funciona y por qué los sesgos son un riesgo real.

## 🎲 Dinámica

Predicción en voz alta: ¿qué creen que dará "perro es a cachorro como gato es a…"? ¿Y si la analogía tuviera un estereotipo? ¿Cómo lo detectarían?
