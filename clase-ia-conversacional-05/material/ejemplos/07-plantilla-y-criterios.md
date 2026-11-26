# 💡 Ejemplo 07 — Plantilla y criterios de calidad

## 🌍 Contexto

La biblioteca ficticia «Casa del Libro» tiene tres sucursales y atiende en dos idiomas. No quiere escribir un manual distinto desde cero para cada una.

## 🧠 Concepto

Una **plantilla** es un system prompt con **campos variables** que se completan para cada asistente (sucursal, idioma, rol). Así las instrucciones son **permanentes** en su estructura y **dinámicas** en sus datos. Para validarlo se usan **criterios de calidad**: especificidad, trazabilidad y defensa en profundidad.

🔗 **Analogía**: un **manual base con huecos** que se rellenan en cada sucursal.

## 🧭 Explicación paso a paso

**La plantilla (para leer)**

```text
[Rol y objetivo]
Actúa como {rol} y realiza {tareas principales}. Tu objetivo es
{resultado deseado}. No realices {exclusiones claras}.

[Tono y estilo]
Mantén un tono {formal/cercano/experto/creativo}, con estilo
{conciso/detallado/académico}. Prioriza {claridad, trazabilidad, empatía}.

[Políticas y ética]
- Veracidad: proporciona solo información contrastable; si falta
  evidencia, dilo explícitamente.
- Seguridad: evita contenido dañino, violento o discriminatorio.
- Neutralidad: mantén imparcialidad en temas sensibles.

[Límites]
No ofrezcas {asesoría legal/financiera/médica} personalizada.
No inventes datos. Si no sabes, indica la falta de información.

[Procedimiento]
1) Comprende la consulta y valida supuestos.
2) Explica brevemente el enfoque.
3) Entrega la solución estructurada (listas/tablas).
4) Añade consideraciones, límites y fuentes (si aplica).
5) Propón pasos siguientes o alternativas.
```

**Los campos cambian; la estructura no**

| Campo | Sucursal Centro | Sucursal Norte |
|---|---|---|
| `{rol}` | asistente de préstamos | asistente de préstamos |
| `{idioma}` | español | español e inglés |
| `{horario}` | lunes a sábado, 9–18 h | lunes a viernes, 8–16 h |

**Criterios de calidad**

| Criterio | Pregunta |
|---|---|
| 🎯 **Especificidad** | ¿El propósito está descrito con precisión, sin ambigüedad? |
| 🧾 **Trazabilidad** | ¿El modelo sabe cuándo citar fuentes o declarar incertidumbre? |
| 🛡️ **Defensa en profundidad** | ¿Hay límites éticos y operativos explícitos, y otras capas fuera del prompt? |

## ✅ Resultado esperado

El estudiante completa los campos de una plantilla para un asistente ficticio y la revisa con los tres criterios.

## 🎲 Dinámica: Completa los campos

Se entrega la plantilla con campos en blanco y la ficha de una sucursal. Los equipos completan `{rol}`, `{tono}` y `{límites}` en voz alta.
