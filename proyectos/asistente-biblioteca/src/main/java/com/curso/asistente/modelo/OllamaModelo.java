package com.curso.asistente.modelo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class OllamaModelo implements ModeloLenguaje {

    private final RestClient http;
    private final String modeloChat;
    private final String modeloEmbedding;

    public OllamaModelo(@Value("${ollama.url}") String url,
                        @Value("${ollama.modelo-chat}") String modeloChat,
                        @Value("${ollama.modelo-embedding}") String modeloEmbedding) {
        this.http = RestClient.create(url);
        this.modeloChat = modeloChat;
        this.modeloEmbedding = modeloEmbedding;
    }

    @Override
    public String responder(List<Mensaje> mensajes) {
        var peticion = Map.of(
                "model", modeloChat,
                "messages", mensajes,
                "stream", false,
                // temperature 0 y semilla fija: respuestas más repetibles
                "options", Map.of("temperature", 0, "seed", 42));

        var respuesta = http.post().uri("/api/chat")
                .body(peticion)
                .retrieve()
                .body(RespuestaChat.class);

        return respuesta.message().content().strip();
    }

    @Override
    public double[] embedding(String texto) {
        var respuesta = http.post().uri("/api/embed")
                .body(Map.of("model", modeloEmbedding, "input", texto))
                .retrieve()
                .body(RespuestaEmbedding.class);

        return respuesta.embeddings().get(0);
    }

    record RespuestaChat(Mensaje message) {
    }

    record RespuestaEmbedding(List<double[]> embeddings) {
    }
}
