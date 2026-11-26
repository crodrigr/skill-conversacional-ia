package com.curso.asistente.paso4;

import java.util.ArrayList;
import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import org.springframework.stereotype.Component;

/** Few-shot: los ejemplos viajan como turnos de usuario y asistente. */
@Component
public class Clasificador {

    private static final List<String> CATEGORIAS = List.of("Positiva", "Negativa", "Neutra");

    private static final List<Mensaje> EJEMPLOS = List.of(
            Mensaje.usuario("El préstamo fue rapidísimo y me atendieron muy bien."),
            Mensaje.asistente("Positiva"),
            Mensaje.usuario("Esperé 40 minutos y nadie me ayudó."),
            Mensaje.asistente("Negativa"),
            Mensaje.usuario("La biblioteca abre de lunes a sábado."),
            Mensaje.asistente("Neutra"),
            Mensaje.usuario("No estuvo mal, aunque esperaba más."),
            Mensaje.asistente("Neutra"));

    private final ModeloLenguaje modelo;

    public Clasificador(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    public String clasificar(String opinion) {
        var mensajes = new ArrayList<Mensaje>();
        mensajes.add(Mensaje.sistema(
                "Clasifica la opinión como Positiva, Negativa o Neutra. Responde solo con la categoría."));
        mensajes.addAll(EJEMPLOS);
        mensajes.add(Mensaje.usuario(opinion));

        return normalizar(modelo.responder(mensajes));
    }

    /** El modelo puede responder de más: el código comprueba la salida. */
    static String normalizar(String salida) {
        return CATEGORIAS.stream()
                .filter(c -> salida.toLowerCase().startsWith(c.toLowerCase()))
                .findFirst()
                .orElse("Sin clasificar");
    }
}
