package com.curso.asistente.modelo;

import java.util.List;

/** Lo que la aplicación necesita de un modelo. Así las pruebas pueden usar uno falso. */
public interface ModeloLenguaje {

    String responder(List<Mensaje> mensajes);
}
