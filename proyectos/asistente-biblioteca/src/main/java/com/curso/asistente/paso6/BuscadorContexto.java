package com.curso.asistente.paso6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;

import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.paso5.Similitud;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/** Selección de contexto: solo entran los fragmentos más cercanos a la pregunta. */
@Component
public class BuscadorContexto {

    private final ModeloLenguaje modelo;
    private final int cuantos;
    private final List<String> textos;
    private List<Indexado> indice;

    public BuscadorContexto(ModeloLenguaje modelo,
                            @Value("${contexto.fragmentos}") int cuantos) throws IOException {
        this.modelo = modelo;
        this.cuantos = cuantos;
        this.textos = new ClassPathResource("biblioteca.txt")
                .getContentAsString(StandardCharsets.UTF_8)
                .lines()
                .filter(linea -> !linea.isBlank())
                .toList();
    }

    public List<Fragmento> buscar(String pregunta) {
        // nomic-embed-text pide indicar si el texto es una consulta o un documento
        var consulta = modelo.embedding("search_query: " + pregunta);
        return indice().stream()
                .map(i -> new Fragmento(i.texto(), Similitud.coseno(consulta, i.vector())))
                .sorted(Comparator.comparingDouble(Fragmento::similitud).reversed())
                .limit(cuantos)
                .toList();
    }

    /** Los documentos se convierten en vectores una sola vez, en la primera búsqueda. */
    private synchronized List<Indexado> indice() {
        if (indice == null) {
            indice = textos.stream()
                    .map(t -> new Indexado(t, modelo.embedding("search_document: " + t)))
                    .toList();
        }
        return indice;
    }

    private record Indexado(String texto, double[] vector) {
    }

    public record Fragmento(String texto, double similitud) {
    }
}
