package com.curso.asistente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.curso.asistente.modelo.Mensaje;
import com.curso.asistente.modelo.ModeloLenguaje;
import com.curso.asistente.paso3.PlantillaSistema;
import com.curso.asistente.paso4.Clasificador;
import com.curso.asistente.paso5.Similitud;
import com.curso.asistente.paso6.BuscadorContexto;
import org.junit.jupiter.api.Test;

/** Pruebas sin Ollama: un modelo falso permite comprobar lo que hace NUESTRO código. */
class AsistenteTest {

    static class ModeloFalso implements ModeloLenguaje {
        final List<Mensaje> recibidos = new ArrayList<>();
        String respuesta = "Positiva";

        @Override
        public String responder(List<Mensaje> mensajes) {
            recibidos.addAll(mensajes);
            return respuesta;
        }

        @Override
        public double[] embedding(String texto) {
            // Un "mapa" de dos ejes: multas y club de lectura
            var t = texto.toLowerCase();
            return new double[] {t.contains("multa") ? 1 : 0.1, t.contains("club") ? 1 : 0.1};
        }
    }

    @Test
    void laPlantillaCompletaTodosLosCampos() {
        var prompt = new PlantillaSistema("Prueba", "formal", "de 8 a 12 h").prompt();

        assertTrue(prompt.contains("biblioteca Prueba"));
        assertTrue(prompt.contains("de 8 a 12 h"));
        assertFalse(prompt.contains("{"));
    }

    @Test
    void elFewShotEnviaSistemaEjemplosYLaOpinionAlFinal() {
        var modelo = new ModeloFalso();

        var categoria = new Clasificador(modelo).clasificar("Me encantó");

        assertEquals("Positiva", categoria);
        assertEquals("system", modelo.recibidos.getFirst().role());
        assertEquals(10, modelo.recibidos.size());
        assertEquals("Me encantó", modelo.recibidos.getLast().content());
    }

    @Test
    void unaSalidaInesperadaNoSeDaPorBuena() {
        var modelo = new ModeloFalso();
        modelo.respuesta = "Creo que el cliente está contento";

        assertEquals("Sin clasificar", new Clasificador(modelo).clasificar("Me encantó"));
    }

    @Test
    void elCosenoDistingueIgualesDeDistintos() {
        assertEquals(1.0, Similitud.coseno(new double[] {1, 2}, new double[] {2, 4}), 1e-9);
        assertEquals(0.0, Similitud.coseno(new double[] {1, 0}, new double[] {0, 1}), 1e-9);
    }

    @Test
    void elBuscadorTraeSoloLosFragmentosPedidosYElMasCercanoPrimero() throws Exception {
        var fragmentos = new BuscadorContexto(new ModeloFalso(), 2).buscar("¿Cuánto es la multa?");

        assertEquals(2, fragmentos.size());
        assertTrue(fragmentos.getFirst().texto().contains("multa"));
    }
}
