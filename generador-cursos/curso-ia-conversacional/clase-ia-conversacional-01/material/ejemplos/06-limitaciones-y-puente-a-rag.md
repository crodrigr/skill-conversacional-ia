# 💡 Ejemplo 06 — Limitaciones y puente a RAG

## 🌍 Contexto

Un LLM suena seguro aunque no lo esté. Veamos dos fallos típicos y una idea para mitigar uno.

## 🗨️ Prompt

```text
¿Cuál es la política de devoluciones de la tienda Casa Aurora, abierta el mes pasado?
```

## ✅ Resultado esperado (respuesta de referencia)

> Casa Aurora acepta devoluciones dentro de 30 días con el ticket de compra y el producto sin uso.

## 🔍 Análisis

- **Alucinación**: el modelo inventó una política que no conoce.
- **Datos desactualizados**: la tienda abrió después de su entrenamiento; no podía saberlo.
- **Seguridad aparente**: el tono es firme, pero no hay evidencia.
- **Qué hacer**: verificar en la fuente oficial.

## 🌉 Puente: examen a libro abierto

Si antes de responder el sistema **recupera** el documento oficial de devoluciones y se lo da al modelo para **generar** la respuesta, es mucho más probable que sea correcta. Eso es **RAG**.

- Evita reentrenar el modelo cada vez que cambia una política.
- Depende de la calidad y privacidad de las fuentes consultadas.
- Se estudia en un módulo posterior.
