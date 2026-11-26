package com.curso.asistente.modelo;

public final class Validar {

    private Validar() {
    }

    public static String texto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El campo '" + campo + "' es obligatorio");
        }
        return valor.strip();
    }
}
