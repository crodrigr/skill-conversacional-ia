package com.curso.asistente.paso3;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Pregunta;
import com.curso.asistente.modelo.Respuesta;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** El mismo mensaje del paso 2, precedido por un system prompt. */
@RestController
public class ConSistemaController {

    static final String SISTEMA = """
            Eres el asistente de la biblioteca Casa del Libro.
            Abre de lunes a sábado de 9 a 18 h.
            Responde en español, con amabilidad y en dos frases como máximo.
            """;

    private final ModeloLenguaje modelo;

    public ConSistemaController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/con-sistema")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        var mensajes = List.of(
                Mensaje.sistema(SISTEMA),   // va primero y no cambia
                Mensaje.usuario(texto));    // cambia en cada petición
        return new Respuesta(modelo.responder(mensajes));
    }
}
