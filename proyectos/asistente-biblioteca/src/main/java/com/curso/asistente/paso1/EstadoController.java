package com.curso.asistente.paso1;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {

    @GetMapping("/api/estado")
    public Map<String, String> estado() {
        return Map.of("estado", "ok");
    }
}
