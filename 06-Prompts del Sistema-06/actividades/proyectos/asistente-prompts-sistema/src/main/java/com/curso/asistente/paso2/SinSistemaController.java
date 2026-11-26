package com.curso.asistente.paso2;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Pregunta;
import com.curso.asistente.modelo.Respuesta;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Solo el mensaje del usuario: el modelo no sabe quién es ni qué reglas seguir. */
@RestController
public class SinSistemaController {

    private final ModeloLenguaje modelo;

    public SinSistemaController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/sin-sistema")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        return new Respuesta(modelo.responder(List.of(Mensaje.usuario(texto))));
    }
}
