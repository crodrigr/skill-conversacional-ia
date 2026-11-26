# 🟢 Ejercicio 01 — ¿Qué ve el modelo?

## 📊 Dificultad

🟢 Básico

## 🎓 Resultados de aprendizaje

OA-1

## 🧩 Problema

Un asistente ficticio de una tienda va a responder una consulta. Esta es la lista de cosas que existen en el sistema:

1. Las reglas escritas en las instrucciones del sistema.
2. La pregunta del cliente.
3. Una base de datos de 5 000 productos que **no se envía** al modelo.
4. Los últimos 3 mensajes de la charla, que sí se envían.
5. El resultado de buscar el producto que el cliente nombró (se envía).
6. Lo que el cliente pensó pero no escribió.

## 🪜 Pasos

1. Marca cuáles **ve** el modelo al responder.
2. Explica con una frase qué es el **contexto**.
3. ¿Qué le pasaría al asistente si necesita un dato de la base de datos que no se envió?

## 📏 Criterios de evaluación

- Ve: 1, 2, 4 y 5. No ve: 3 y 6.
- Define contexto como todo lo que el modelo recibe al responder.
- Reconoce que sin el dato no puede responder bien (se debe recuperar o enviar).
