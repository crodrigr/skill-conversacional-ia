package com.curso.asistente.modelo;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class OpenRouterModelo implements ModeloLenguaje {

    private static final Logger log = LoggerFactory.getLogger(OpenRouterModelo.class);

    private final RestClient http;
    private final String clave;
    private final String modelo;

    public OpenRouterModelo(@Value("${openrouter.url}") String url,
                            @Value("${openrouter.api-key}") String clave,
                            @Value("${openrouter.modelo}") String modelo) {
        this.http = RestClient.create(url);
        this.clave = clave;
        this.modelo = modelo;
    }

    @Override
    public String responder(List<Mensaje> mensajes) {
        if (clave.isBlank()) {
            throw new IllegalStateException("Falta la variable de entorno OPENROUTER_API_KEY");
        }

        var respuesta = http.post().uri("/chat/completions")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + clave)
                // temperature 0: respuestas más repetibles
                .body(Map.of("model", modelo, "messages", mensajes, "temperature", 0))
                .retrieve()
                .body(Respuesta.class);

        if (respuesta == null || respuesta.choices() == null || respuesta.choices().isEmpty()
                || respuesta.choices().getFirst().message().content() == null) {
            throw new IllegalStateException("El modelo no devolvió texto. Vuelve a intentarlo.");
        }
        // Con openrouter/free el modelo puede cambiar de una llamada a otra
        log.info("Respondió el modelo {}", respuesta.model());
        return respuesta.choices().getFirst().message().content().strip();
    }

    record Respuesta(String model, List<Opcion> choices) {
    }

    record Opcion(Mensaje message) {
    }
}
