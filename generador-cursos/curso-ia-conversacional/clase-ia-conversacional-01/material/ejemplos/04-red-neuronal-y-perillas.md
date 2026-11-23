# 💡 Ejemplo 04 — La red neuronal y sus perillas

## 🌍 Contexto

Queremos que una red decida si un correo es spam mirando tres pistas.

## 🧠 Concepto

Cada pista entra a la red con un **peso** (qué tanta importancia tiene).

## 🧭 Explicación paso a paso

1. **Entradas**: ¿contiene "premio"? ¿viene de un desconocido? ¿tiene muchos enlaces?
2. **Capa oculta**: combina las pistas ("desconocido + premio" suena sospechoso).
3. **Salida**: "spam" o "no spam".
4. **Primer intento**: la red se equivoca.
5. **Ajuste**: se comparan su respuesta y la correcta, y se **suben o bajan los pesos**.
6. **Repetición**: millones de correos después, acierta casi siempre.

🔗 **Analogía**: el portero con un volumen distinto para cada voz; aprende a quién escuchar más.

## 🎲 Dinámica: La red neuronal humana

- 🧍 Entradas (4 personas) → 🧍🧍🧍 capa oculta → 🧍 salida.
- Cada entrada recibe una tarjeta (pista) y la pasa con un "volumen" (1, 2 o 3 palmadas).
- La capa oculta suma lo que escucha y decide si pasa señal.
- Si la salida acierta, se mantiene; si no, se ajustan los volúmenes.

## ✅ Resultado esperado

El grupo comprueba que **nadie programó la regla**: surgió de ajustar volúmenes. Un LLM funciona igual, con **miles de millones** de perillas llamadas **parámetros**.
