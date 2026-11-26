package com.curso.asistente.paso6;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Pregunta;
import com.curso.asistente.modelo.Validar;
import com.curso.asistente.paso5.PlantillaSistema;
import com.curso.asistente.paso5.Sede;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Mini agente: el modelo decide, el código actúa. */
@RestController
public class AgenteController {

    private static final String REGLAS_AGENTE = """

            [Decisión]
            Empieza SIEMPRE tu respuesta con una de estas dos palabras:
            RESPONDER: si puedes resolver la consulta con los datos.
            DERIVAR: si es una queja, un pago, un dato personal o algo que no tienes.
            Después de DERIVAR: escribe el motivo en una frase.
            """;

    private final ModeloLenguaje modelo;
    private final AtomicInteger tickets = new AtomicInteger();

    public AgenteController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/agente")
    public Resultado atender(@RequestBody Pregunta pregunta) {
        var mensajes = List.of(
                Mensaje.sistema(PlantillaSistema.para(Sede.CENTRO) + REGLAS_AGENTE),
                Mensaje.usuario(Validar.texto(pregunta.mensaje(), "mensaje")));
        var decision = Decision.leer(modelo.responder(mensajes));

        // La acción la ejecuta el código, no el modelo
        Integer ticket = decision.accion() == Decision.Accion.DERIVAR ? tickets.incrementAndGet() : null;
        return new Resultado(decision.accion(), decision.texto(), ticket);
    }

    public record Resultado(Decision.Accion accion, String texto, Integer ticket) {
    }
}
