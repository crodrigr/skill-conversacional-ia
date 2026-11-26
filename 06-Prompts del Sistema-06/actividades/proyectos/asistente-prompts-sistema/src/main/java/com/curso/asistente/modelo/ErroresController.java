package com.curso.asistente.modelo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;

@RestControllerAdvice
public class ErroresController {

    @ExceptionHandler(IllegalArgumentException.class)
    ProblemDetail datoInvalido(IllegalArgumentException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler(IllegalStateException.class)
    ProblemDetail modeloSinConfigurar(IllegalStateException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE, e.getMessage());
    }

    @ExceptionHandler(RestClientResponseException.class)
    ProblemDetail openRouterRechazo(RestClientResponseException e) {
        var codigo = e.getStatusCode().value();
        var motivo = switch (codigo) {
            case 401 -> "la clave no es válida";
            case 429 -> "llegaste al límite de peticiones; espera un momento";
            default -> "revisa el modelo configurado e inténtalo de nuevo";
        };
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE,
                "OpenRouter respondió " + codigo + ": " + motivo);
    }

    @ExceptionHandler(RestClientException.class)
    ProblemDetail sinConexion(RestClientException e) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.SERVICE_UNAVAILABLE,
                "No se pudo conectar con OpenRouter. Revisa tu conexión.");
    }
}
