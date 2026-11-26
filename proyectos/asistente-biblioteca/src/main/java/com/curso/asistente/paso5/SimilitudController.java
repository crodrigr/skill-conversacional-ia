package com.curso.asistente.paso5;

import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.modelo.Validar;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimilitudController {

    private final ModeloLenguaje modelo;

    public SimilitudController(ModeloLenguaje modelo) {
        this.modelo = modelo;
    }

    @PostMapping("/api/similitud")
    public Resultado comparar(@RequestBody Textos textos) {
        var a = modelo.embedding(Validar.texto(textos.a(), "a"));
        var b = modelo.embedding(Validar.texto(textos.b(), "b"));
        return new Resultado(a.length, Similitud.coseno(a, b));
    }

    public record Textos(String a, String b) {
    }

    public record Resultado(int dimensiones, double similitud) {
    }
}
