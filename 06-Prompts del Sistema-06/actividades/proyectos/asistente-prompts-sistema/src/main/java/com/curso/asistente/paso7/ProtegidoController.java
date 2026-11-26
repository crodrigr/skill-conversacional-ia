package com.curso.asistente.paso7;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Pregunta;
import com.curso.asistente.modelo.Respuesta;
import com.curso.asistente.modelo.Validar;
import com.curso.asistente.paso5.PlantillaSistema;
import com.curso.asistente.paso5.Sede;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Defensa en profundidad: reglas en el prompt + revisión en el código. */
@RestController
public class ProtegidoController {

    private static final int LARGO_MAXIMO = 500;

    private final ModeloLenguaje modelo;

    public ProtegidoController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/protegido")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        if (texto.length() > LARGO_MAXIMO) {
            throw new IllegalArgumentException("El mensaje admite hasta " + LARGO_MAXIMO + " caracteres");
        }
        var mensajes = List.of(
                Mensaje.sistema(PlantillaSistema.para(Sede.CENTRO)),
                Mensaje.usuario(texto));
        return new Respuesta(Guardian.revisar(modelo.responder(mensajes)));
    }
}
