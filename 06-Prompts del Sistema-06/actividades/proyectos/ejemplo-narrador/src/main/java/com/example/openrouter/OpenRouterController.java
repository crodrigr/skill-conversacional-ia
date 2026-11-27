package com.example.openrouter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
public class OpenRouterController {

    @Value("${openrouter.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> request) {

        String question = request.get("question");

        // Construir el prompt
        Map<String, Object> body = Map.of(
            "model", "openrouter/free",
            "messages", List.of(
                Map.of(
                    "role", "system",
                    "content", "Eres un narrador de cuentos infantiles. " +
                               "Usas un tono lúdico y frases cortas."
                ),
                Map.of(
                    "role", "user",
                    "content", question
                )
            )
        );

        // Consumir la API de OpenRouter
        Map response = restClient.post()
            .uri("https://openrouter.ai/api/v1/chat/completions")
            .header("Authorization", "Bearer " + apiKey)
            .header("Content-Type", "application/json")
            .body(body)
            .retrieve()
            .body(Map.class);

        // Extraer la respuesta del modelo
        List<Map<String, Object>> choices =
            (List<Map<String, Object>>) response.get("choices");

        Map<String, Object> message =
            (Map<String, Object>) choices.get(0).get("message");

        return message.get("content").toString();
    }
}
