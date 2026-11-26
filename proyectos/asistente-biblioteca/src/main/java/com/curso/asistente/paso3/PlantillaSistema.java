package com.curso.asistente.paso3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** System prompt con campos variables: estructura fija, datos dinámicos. */
@Component
public class PlantillaSistema {

    private static final String PLANTILLA = """
            [Objetivo]
            Eres el asistente de la biblioteca {nombre}. Respondes sobre préstamos y horarios.
            No das consejos médicos, legales ni financieros.

            [Tono y estilo]
            Tono {tono}. Responde en español, en dos frases como máximo.

            [Datos]
            Horario: {horario}.

            [Restricciones]
            No inventes datos. Si no tienes el dato, responde: "No tengo ese dato".
            Si el tema no es de la biblioteca, di que solo puedes ayudar con la biblioteca.

            [Procedimiento]
            1) Entiende la consulta. 2) Responde con los datos. 3) Ofrece más ayuda.
            """;

    private final String prompt;

    public PlantillaSistema(@Value("${asistente.nombre}") String nombre,
                            @Value("${asistente.tono}") String tono,
                            @Value("${asistente.horario}") String horario) {
        this.prompt = PLANTILLA
                .replace("{nombre}", nombre)
                .replace("{tono}", tono)
                .replace("{horario}", horario);
    }

    public String prompt() {
        return prompt;
    }
}
