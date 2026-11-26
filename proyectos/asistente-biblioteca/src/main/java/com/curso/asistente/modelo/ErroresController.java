package com.curso.asistente.modelo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;

@RestControllerAdvice
public class ErroresController {

    @ExceptionHandler(RestClientException.class)
    ProblemDetail modeloNoDisponible(RestClientException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE,
                "No se pudo usar el modelo. ¿Está Ollama encendido y los modelos descargados?");
    }

    @ExceptionHandler(IllegalArgumentException.class)
    ProblemDetail datoInvalido(IllegalArgumentException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
