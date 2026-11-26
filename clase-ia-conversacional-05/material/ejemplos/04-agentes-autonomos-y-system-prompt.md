# 💡 Ejemplo 04 — Agentes autónomos y system prompt

## 🌍 Contexto

El asistente financiero de «Banco Aurora» (ficticio) atiende consultas con poca supervisión humana. Si falla, el costo es alto. ¿Qué debe decir su manual?

## 🧠 Concepto

Un **agentic workflow** (flujo agéntico) es un proceso donde la IA actúa como un **agente autónomo**: toma decisiones y completa tareas **con poca supervisión**. Cuanto más autónomo, **más importante** es el system prompt, que funciona como el **manual de operaciones**.

🔗 **Analogía**: un empleado que **atiende solo**, sin jefe al lado. Necesita un manual más claro: hasta dónde puede llegar, cómo debe hablar y qué nunca hace.

## 🧭 Explicación paso a paso

**Cuatro escenarios de agentic workflows**

| Escenario | Qué hace el agente |
|---|---|
| 🛎️ **Atención al cliente** | Gestiona tickets y ofrece soluciones |
| 🔎 **Asistente de investigación** | Resume artículos, recupera información y genera reportes |
| 💻 **Asistente de código** | Identifica errores y sugiere optimizaciones |
| ✍️ **Herramienta de redacción** | Genera, reescribe y propone mejoras |

**Las cuatro funciones del system prompt**

| Función | Qué hace | Ejemplo |
|---|---|---|
| 🎯 **Definir el alcance** | Limita la acción a lo relevante | «Solo responde sobre cuentas y servicios del banco» |
| 🗣️ **Fijar tono y personalidad** | Formal, empático, breve o detallado | «Tono profesional y claro» |
| 🚧 **Marcar límites éticos** | Restringe contenido dañino, sesgado o engañoso | «No des recomendaciones personalizadas» |
| 🤝 **Gestionar expectativas** | Respuestas estructuradas y consistentes | «Indica siempre que la información es general» |

**El caso del asistente financiero (ficticio)**

```text
Eres un asistente financiero de IA de Banco Aurora (ficticio). Proporcionas
información general de inversión basada en datos objetivos. No das
recomendaciones personalizadas ni predicciones del mercado. Si te piden
una, explica que no puedes darla y sugiere hablar con un asesor autorizado.
```

> ⚠️ Texto ilustrativo: no constituye asesoría financiera.

**¿Qué podría salir mal sin límites?**

- El agente **recomienda** invertir en algo a una persona concreta.
- **Inventa** datos o predice el mercado con seguridad.
- Se sale del **alcance** (por ejemplo, da consejos médicos).
- Usa un **tono** inadecuado con un cliente enojado.

## ✅ Resultado esperado

El estudiante identifica agentic workflows, nombra las cuatro funciones y explica por qué un agente autónomo necesita límites.

## 🎲 Dinámica: ¿Es un agente? / Marca las cuatro funciones

Se leen seis escenarios y el grupo decide cuáles son agentes autónomos. Luego se subrayan, en el system prompt de Banco Aurora, las cuatro funciones.
