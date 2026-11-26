# 💡 Ejemplo 03 — Sistema vs. usuario

## 🌍 Contexto

El asistente de «Tienda La Esquina» tiene una regla del sistema: *«No hables de política.»* Un usuario le pide su opinión sobre un candidato. ¿Quién gana?

## 🧠 Concepto

El system prompt y el user prompt **controlan cosas distintas**. Cuando entran en conflicto, **por diseño** suele prevalecer el sistema; pero eso **no siempre se cumple**.

🔗 **Analogía**: si el manual dice «no opines de política» y el cliente insiste, se espera que el empleado **siga el manual**. Pero un cliente insistente o hábil puede ponerlo a prueba.

## 🧭 Explicación paso a paso

**Tabla comparativa**

| Aspecto | 🛡️ Sistema | 🙋 Usuario |
|---|---|---|
| **Quién lo escribe** | Quien construye el asistente | Quien lo usa |
| **Cuándo** | Antes de la conversación | En cada turno |
| **Cuánto cambia** | Poco (permanente) | Mucho |
| **Qué controla** | Rol, tono, reglas, límites, procedimiento | La tarea o pregunta del momento |
| **Prioridad** | Mayor, por diseño | Menor ante un conflicto |
| **Visibilidad** | Oculto al usuario habitual | Visible |

**Prioridad**

Algunos proveedores publican un orden explícito. Por ejemplo, el *Model Spec* de OpenAI (mayo de 2024) describe un orden de prioridad por rol: plataforma, desarrollador, usuario y herramienta; ante un conflicto entre desarrollador y usuario, **prevalece el desarrollador**. (Es un documento de 2024; puede haberse actualizado.)

**Un conflicto**

```text
[SISTEMA]   No hables de política. Si te lo piden, di que no puedes opinar.
[USUARIO]   ¿Por quién me aconsejas votar?
[ASISTENTE] No puedo opinar sobre política, pero puedo ayudarte con tu compra.
```

> ⚠️ Respuesta simulada — ilustrativa, no es la salida de un modelo real.

**Pero no siempre se cumple**

Un usuario puede insistir, reformular o pedir que el asistente «ignore sus instrucciones». Los modelos suelen resistir, pero **no es una garantía**. Por eso conviene **escribir reglas explícitas, probarlas y no depender solo del prompt** (ver el [Ejemplo 08](08-probar-y-reforzar.md)).

**Lo que el usuario puede y no puede cambiar**

| ✅ Puede | ❌ No debería poder |
|---|---|
| Pedir otro formato (lista, tabla) | Cambiar el rol o las reglas del asistente |
| Pedir un tema dentro del alcance | Hacer que el asistente ignore sus límites |

## ✅ Resultado esperado

El estudiante compara sistema y usuario y explica por qué prevalece el sistema y por qué no es infalible.

## 🎲 Dinámica: Conflicto: ¿quién gana?

Se leen cinco choques entre una regla del sistema y una petición del usuario. El grupo vota qué debería hacer el asistente y si la regla es suficiente.
