package com.curso.asistente.paso6;

import java.util.List;
import java.util.stream.Collectors;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import com.curso.asistente.paso3.PlantillaSistema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Ingeniería de contexto: system prompt + fragmentos seleccionados + pregunta. */
@RestController
public class ContextoController {

    private final ModeloLenguaje modelo;
    private final PlantillaSistema plantilla;
    private final BuscadorContexto buscador;

    public ContextoController(ModeloLenguaje modelo, PlantillaSistema plantilla,
                              BuscadorContexto buscador) {
        this.modelo = modelo;
        this.plantilla = plantilla;
        this.buscador = buscador;
    }

    @PostMapping("/api/preguntar")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        var fragmentos = buscador.buscar(texto);

        var datos = fragmentos.stream()
                .map(f -> "- " + f.texto())
                .collect(Collectors.joining("\n"));

        var mensajes = List.of(
                Mensaje.sistema(plantilla.prompt() + "\n[Documentos]\n" + datos),
                Mensaje.usuario(texto));

        // Se devuelven los fragmentos usados: eso es trazabilidad
        return new Respuesta(modelo.responder(mensajes), fragmentos);
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta, List<BuscadorContexto.Fragmento> fragmentos) {
    }
}
