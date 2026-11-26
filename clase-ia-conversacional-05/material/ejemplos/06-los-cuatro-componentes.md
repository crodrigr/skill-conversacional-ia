# 💡 Ejemplo 06 — Los cuatro componentes

## 🌍 Contexto

Un system prompt eficaz **ordena** el comportamiento del modelo. Se construye con cuatro componentes.

## 🧠 Concepto

Los **cuatro componentes** de un system prompt efectivo son: **definición del objetivo**, **tono y estilo**, **restricciones y límites** e **instrucciones paso a paso**.

🔗 **Analogía**: el manual del puesto tiene cuatro capítulos: **para qué existe el puesto**, **cómo se habla**, **qué nunca se hace** y **cómo se atiende, paso a paso**.

## 🧭 Explicación paso a paso

**1. 🎯 Definición del objetivo — declarar el propósito**

Debe quedar claro **qué hace y qué no hace** el agente.

- «Eres un asistente de investigación jurídica que resume jurisprudencia y aporta referencias factuales, **sin ofrecer asesoría legal**.»
- «Eres un chatbot financiero que entrega información general, **sin recomendaciones personalizadas**.»

*Razón*: prevenir desvíos y respuestas fuera de lo esperado.

**2. 🗣️ Tono y estilo — fijar la personalidad**

| Modalidad | Cuándo |
|---|---|
| Formal | Corporativo o legal |
| Cercano | Asistentes conversacionales |
| Experto | Soporte técnico |
| Creativo | Narración e ideación |

- «Responde de forma profesional y concisa.»
- «Usa un tono amable y cercano, cuidando la claridad y la empatía.»
- «Escribe con estilo académico, citando fuentes cuando corresponda.»

*Razón*: alinear la voz con la audiencia y el canal.

**3. 🚧 Restricciones y límites — lo que no debe hacer**

- «No brindes diagnósticos ni consejos médicos personalizados.»
- «No participes en debates políticos ni emitas opiniones sobre temas sensibles.»
- «Evita inventar información; indica *no disponible* si faltan datos.»

*Razón*: minimizar salidas inseguras, sesgadas o impropias.

**4. 🪜 Instrucciones paso a paso — guiar el razonamiento**

Para un asistente de código:

1. Explica brevemente el objetivo del fragmento.
2. Presenta un fragmento limpio y optimizado.
3. Incluye un ejemplo mínimo de uso.
4. Sugiere mejoras o buenas prácticas.

*Razón*: respuestas estructuradas, útiles y accionables.

**Un buen system prompt, completo (ficticio)**

```text
Eres el asistente de la biblioteca Casa del Libro.            ← objetivo
Respondes sobre préstamos y horarios; no das asesoría médica.
Hablas con tono amable y breve.                               ← tono y estilo
No inventes datos: si falta información, di «no disponible».  ← restricciones
Procedimiento: 1) entiende la consulta, 2) responde en 3     ← procedimiento
líneas máximo, 3) ofrece ayuda adicional.
```

## ✅ Resultado esperado

El estudiante identifica los cuatro componentes en un system prompt y redacta uno propio.

## 🎲 Dinámica: Completa el objetivo / Mejora el system prompt vago

Se da un objetivo a medias («Eres un asistente…») para completar con lo que **hace y no hace**. Luego se mejora «Ayuda a la gente» añadiendo los cuatro componentes.
