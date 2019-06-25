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

    public static float menorTemperatura(final float[] temperaturas) {
        float returnValue = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (returnValue > temperaturas[i]) {
                returnValue = temperaturas[i];
            }
        }
        return returnValue;
    }

    public static int somaImpares(final int[] inteiros) {
        int returnValue = 0;
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] % 2 == 1) {
                returnValue = returnValue + inteiros[i];
            }
        }
        return returnValue;
    }

    public static int numValoresIguais(final double[] numeros, final double igualA) {
        int returnValue = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == igualA) {
                returnValue++;
            }
        }
        return returnValue;
    }


    public static int numLetras(final String caracteres) {
        int returnValue = 0;
        for (int i = 0; i < caracteres.length(); i++) {
            if (Character.isLetter(caracteres.charAt(i))) {
                returnValue++;
            }
        }
        return returnValue;
    }
}
