package com.curso.asistente.paso5;

public final class Similitud {

    private Similitud() {
    }

    /** Similitud del coseno: cuanto más cerca de 1, más parecidos. */
    public static double coseno(double[] a, double[] b) {
        double producto = 0;
        double normaA = 0;
        double normaB = 0;
        for (int i = 0; i < a.length; i++) {
            producto += a[i] * b[i];
            normaA += a[i] * a[i];
            normaB += b[i] * b[i];
        }
        return producto / (Math.sqrt(normaA) * Math.sqrt(normaB));
    }
}
