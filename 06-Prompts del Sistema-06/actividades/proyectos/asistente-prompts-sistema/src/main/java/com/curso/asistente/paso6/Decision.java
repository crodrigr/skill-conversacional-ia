package com.curso.asistente.paso6;

/** Lo que el agente decidió hacer. */
public record Decision(Accion accion, String texto) {

    public enum Accion { RESPONDER, DERIVAR }

    /** Si el modelo no respeta el formato, se deriva a una persona: ante la duda, lo seguro. */
    public static Decision leer(String salida) {
        var limpia = salida.strip();
        if (limpia.startsWith("RESPONDER:")) {
            return new Decision(Accion.RESPONDER, limpia.substring("RESPONDER:".length()).strip());
        }
        if (limpia.startsWith("DERIVAR:")) {
            return new Decision(Accion.DERIVAR, limpia.substring("DERIVAR:".length()).strip());
        }
        return new Decision(Accion.DERIVAR, "El modelo no siguió el formato");
    }
}
