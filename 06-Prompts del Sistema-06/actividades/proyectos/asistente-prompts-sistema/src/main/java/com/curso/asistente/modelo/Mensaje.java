package com.curso.asistente.modelo;

/** Un turno de la conversación: role = system, user o assistant. */
public record Mensaje(String role, String content) {

    public static Mensaje sistema(String texto) {
        return new Mensaje("system", texto);
    }

    public static Mensaje usuario(String texto) {
        return new Mensaje("user", texto);
    }

    public static Mensaje asistente(String texto) {
        return new Mensaje("assistant", texto);
    }
}
