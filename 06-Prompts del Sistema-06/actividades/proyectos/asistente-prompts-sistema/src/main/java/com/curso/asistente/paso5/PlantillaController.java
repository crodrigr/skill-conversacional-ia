package com.curso.asistente.paso5;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Pregunta;
import com.curso.asistente.modelo.Respuesta;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Instrucciones dinámicas: el system prompt se arma en cada petición. */
@RestController
public class PlantillaController {

    private final ModeloLenguaje modelo;

    public PlantillaController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/sedes/{sede}")
    public Respuesta preguntar(@PathVariable String sede, @RequestBody Pregunta pregunta) {
        var mensajes = List.of(
                Mensaje.sistema(PlantillaSistema.para(Sede.de(sede))),
                Mensaje.usuario(Validar.texto(pregunta.mensaje(), "mensaje")));
        return new Respuesta(modelo.responder(mensajes));
    }
}
