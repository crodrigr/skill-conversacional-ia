# 💡 Ejemplo 05 — Consistencia y ética

## 🌍 Contexto

Dos asistentes de soporte atienden la misma queja. Uno tiene un manual claro; el otro no tiene ninguno. Sus respuestas, a lo largo del día, se parecen o no.

## 🧠 Concepto

Sin system prompt, un asistente tiende a responder de forma **inconsistente** y a **perder el rol**. Con uno bien diseñado, tiende a ser más **confiable y predecible**. Además, el system prompt puede incluir **salvaguardas éticas**. Pero son **tendencias**, **no garantías**.

🔗 **Analogía**: un empleado sin manual improvisa: hoy es formal, mañana bromista, y a veces inventa. Con manual, es más constante. Pero un manual **no impide** que alguien lo quiera saltar.

## 🧭 Explicación paso a paso

**Síntomas de la ausencia de un system prompt**

| Síntoma | Ejemplo |
|---|---|
| 🎭 **Desalineación del rol** | Un asistente de biblioteca que opina de fútbol |
| 🔀 **Inconsistencia** | El mismo reclamo recibe un tono formal una vez y casual otra |
| 🌫️ **Invenciones** | Responde con seguridad algo que no sabe |

**Efectos de uno bien diseñado (tendencias)**

| Efecto | Qué se espera |
|---|---|
| ✅ **Resultados confiables** | Salidas alineadas con el propósito |
| 🔻 **Menos errores e invenciones** | Al adherirse a reglas explícitas, como «si falta un dato, indícalo» |
| 🤝 **Más confianza del usuario** | La predictibilidad mejora la experiencia |

> «Tiende a», «ayuda a»: **no hay garantía** de que el modelo siempre cumpla.

**Salvaguardas habituales (ficticias, como reglas de ejemplo)**

| Salvaguarda | Regla de ejemplo |
|---|---|
| 🔎 **Veracidad** | «Proporciona solo información contrastable; si falta evidencia, dilo.» |
| ⚖️ **Neutralidad ante sesgos** | «Mantente neutral y factual en temas políticos o sociales.» |
| 🛡️ **Seguridad y no daño** | «No generes contenido dañino, violento o discriminatorio.» |

**Por qué no son una garantía**

- Un usuario puede **reformular** o **pedir que ignore** las reglas.
- Un system prompt puede **filtrarse o alterarse** mediante ataques de **inyección de instrucciones**.
- Por eso OWASP, en su lista de riesgos para modelos de lenguaje (2025), recomienda **no usar el prompt como único control** y aplicar los controles críticos **fuera del modelo** (por ejemplo, permisos).

**Defensa en profundidad**

```text
Capa 1: reglas explícitas en el system prompt (orientan)
Capa 2: pruebas con casos difíciles (detectan fallas)
Capa 3: controles fuera del modelo: permisos, límites, revisión humana
```

## ✅ Resultado esperado

El estudiante reconoce los síntomas de un asistente sin manual, nombra tres salvaguardas y explica por qué no son una garantía.

## 🎲 Dinámica: Detecta el síntoma

Se leen tres respuestas de un asistente sin system prompt. El grupo señala qué síntoma muestra cada una.
