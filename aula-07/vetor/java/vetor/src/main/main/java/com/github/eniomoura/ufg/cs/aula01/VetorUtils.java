/**
 *
 *
 * @author Enio Moura
 */

package com.github.eniomoura.ufg.cs.aula07;

/**
 * Classe contendo as operações com vetores solicitadas na aula 07.
 * A solicitação pode ser encontrada em:
 * https://docs.google.com/document/d/1XD-_ijqayIgXrMeVmYiwxlMy1oA3CZriIEmQL62ijeY/edit
 */
public final class VetorUtils {

    /** construtor private explicitando classe utilitaria. */
    private VetorUtils() {
    }

    public static float menorTemperatura(final float[] temps) {
        float rValue = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (rValue > temps[i]) {
                rValue = temps[i];
            }
        }
        return rValue;
    }

    public static int somaImpares(final int[] inteiros) {
        int rValue = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] % 2 == 1) {
                rValue = rValue + inteiros[i];
            }
        }
        return rValue;
    }

    public static int numValoresIguais(final double[] numeros, final double igualA) {
        int rValue = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == igualA) {
                rValue++;
            }
        }
        return rValue;
    }


    public static int numLetras(final String caracteres) {
        int rValue = 0;
        for (int i = 0; i < caracteres.length(); i++) {
            if (Character.isLetter(caracteres.charAt(i))) {
                rValue++;
            }
        }
        return rValue;
    }
}
