package com.curso.asistente.paso4;

import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasificadorController {

    private final Clasificador clasificador;

    public ClasificadorController(Clasificador clasificador) {
        this.clasificador = clasificador;
    }

    @PostMapping("/api/clasificar")
    public Resultado clasificar(@RequestBody Opinion opinion) {
        var texto = Validar.texto(opinion.opinion(), "opinion");
        return new Resultado(clasificador.clasificar(texto));
    }

    public record Opinion(String opinion) {
    }

    public record Resultado(String categoria) {
    }
}
