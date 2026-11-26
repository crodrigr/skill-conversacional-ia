package com.curso.asistente.paso7;

import java.util.regex.Pattern;

/** Control fuera del modelo: se revisa la respuesta antes de entregarla. */
public final class Guardian {

    static final String BLOQUEADA = "No puedo compartir esa información.";

    // Títulos de la plantilla: si aparecen, el modelo está mostrando sus instrucciones
    private static final Pattern FUGA = Pattern.compile(
            "\\[(Objetivo|Tono y estilo|Datos|Restricciones|Procedimiento)]", Pattern.CASE_INSENSITIVE);

    private Guardian() {
    }

    public static String revisar(String respuesta) {
        return FUGA.matcher(respuesta).find() ? BLOQUEADA : respuesta;
    }
}
