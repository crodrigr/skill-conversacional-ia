package com.curso.asistente.paso4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Respuesta;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Los tres roles. El modelo no recuerda: el historial se envía en cada turno. */
@RestController
public class ConversacionController {

    private static final String SISTEMA =
            "Eres el asistente de la biblioteca Casa del Libro. Responde en español y en una frase.";

    private final ModeloLenguaje modelo;

    public ConversacionController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/conversacion")
    public Respuesta conversar(@RequestBody Peticion peticion) {
        return new Respuesta(modelo.responder(armar(peticion)));
    }

    public static List<Mensaje> armar(Peticion peticion) {
        var mensajes = new ArrayList<Mensaje>();
        mensajes.add(Mensaje.sistema(SISTEMA));

        var historial = peticion.historial() == null ? List.<Mensaje>of() : peticion.historial();
        for (var turno : historial) {
            // El usuario nunca puede aportar mensajes con rol "system"
            if (!Set.of("user", "assistant").contains(String.valueOf(turno.role()))) {
                throw new IllegalArgumentException("En el historial solo se admiten user y assistant");
            }
            mensajes.add(turno);
        }

        mensajes.add(Mensaje.usuario(Validar.texto(peticion.mensaje(), "mensaje")));
        return mensajes;
    }

    public record Peticion(List<Mensaje> historial, String mensaje) {
    }
}
