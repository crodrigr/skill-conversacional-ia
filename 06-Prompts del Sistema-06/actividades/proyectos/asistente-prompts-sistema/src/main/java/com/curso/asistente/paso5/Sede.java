package com.curso.asistente.paso5;

import java.util.Arrays;

/** Los datos que cambian. El usuario elige la sede, pero no escribe estos textos. */
public enum Sede {

    CENTRO("Centro", "lunes a sábado de 9 a 18 h", "amable y breve"),
    NORTE("Norte", "lunes a viernes de 8 a 16 h", "formal y preciso");

    public final String nombre;
    public final String horario;
    public final String tono;

    Sede(String nombre, String horario, String tono) {
        this.nombre = nombre;
        this.horario = horario;
        this.tono = tono;
    }

    public static Sede de(String texto) {
        return Arrays.stream(values())
                .filter(sede -> sede.name().equalsIgnoreCase(texto))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Sede desconocida: usa centro o norte"));
    }
}
