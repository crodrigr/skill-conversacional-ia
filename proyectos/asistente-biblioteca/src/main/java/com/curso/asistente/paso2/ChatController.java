package com.curso.asistente.paso2;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Zero-shot: solo el mensaje del usuario, sin system prompt ni ejemplos. */
@RestController
public class ChatController {

    private final ModeloLenguaje modelo;

    public ChatController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/chat")
    public Respuesta chat(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        return new Respuesta(modelo.responder(List.of(Mensaje.usuario(texto))));
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta) {
    }
}
