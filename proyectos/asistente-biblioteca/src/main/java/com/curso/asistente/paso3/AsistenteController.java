package com.curso.asistente.paso3;

import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** El mismo mensaje del paso 2, ahora con system prompt. */
@RestController
public class AsistenteController {

    private final ModeloLenguaje modelo;
    private final PlantillaSistema plantilla;

    public AsistenteController(ModeloLenguaje modelo, PlantillaSistema plantilla) {
        this.modelo = modelo;
        this.plantilla = plantilla;
    }

    /** Solo para aprender: en una aplicación real no se expone el system prompt. */
    @GetMapping("/api/asistente/prompt")
    public String prompt() {
        return plantilla.prompt();
    }

    @PostMapping("/api/asistente")
    public Respuesta preguntar(@RequestBody Pregunta pregunta) {
        var texto = Validar.texto(pregunta.mensaje(), "mensaje");
        var mensajes = List.of(
                Mensaje.sistema(plantilla.prompt()),
                Mensaje.usuario(texto));
        return new Respuesta(modelo.responder(mensajes));
    }

    public record Pregunta(String mensaje) {
    }

    public record Respuesta(String respuesta) {
    }
}
