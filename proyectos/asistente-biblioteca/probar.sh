#!/usr/bin/env bash
# Prueba todos los pasos. La aplicación debe estar encendida: mvn spring-boot:run
URL=${URL:-http://localhost:8080}

get()  { echo; echo "== GET $1";  curl -s "$URL$1"; echo; }
post() { echo; echo "== POST $1  $2"; curl -s -X POST "$URL$1" -H 'Content-Type: application/json' -d "$2"; echo; }

get  /api/estado
post /api/chat       '{"mensaje":"¿A qué hora abre la biblioteca?"}'
post /api/asistente  '{"mensaje":"¿A qué hora abre la biblioteca?"}'
post /api/asistente  '{"mensaje":"¿Qué medicina tomo para el dolor de cabeza?"}'
post /api/clasificar '{"opinion":"El capuchino estaba frío y la mesa sucia."}'
post /api/clasificar '{"opinion":"Me ayudaron enseguida, excelente trato."}'
post /api/clasificar '{"opinion":"El mostrador está en el segundo piso."}'
post /api/similitud  '{"a":"Quiero devolver un libro","b":"Quiero regresar un libro prestado"}'
post /api/similitud  '{"a":"Quiero devolver un libro","b":"Necesito regresar un préstamo"}'
post /api/similitud  '{"a":"Quiero devolver un libro","b":"Mañana va a llover"}'
post /api/preguntar  '{"mensaje":"¿Cuánto pago si me atraso 3 días?"}'
post /api/preguntar  '{"mensaje":"¿Cuántos libros puedo llevar a casa?"}'
post /api/preguntar  '{"mensaje":"¿Cuándo se reúne el club de lectura?"}'
post /api/chat       '{"mensaje":""}'
