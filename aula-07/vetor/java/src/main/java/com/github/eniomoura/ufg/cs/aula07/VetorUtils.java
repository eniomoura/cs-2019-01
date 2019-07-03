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

    public static float lesserTemperature(final float[] temperatures) {
        float lesserTemperature = temperatures[0];
        for (float temp : temperatures) {
            if (lesserTemperature > temp) {
                lesserTemperature = temp;
            }
        }
        return lesserTemperature;
    }

    public static int OddSum(final int[] integers) {
        int oddSum = 0;
        for (int integer : integers) {
            if (integer % 2 == 1) {
                oddSum += integer;
            }
        }
        return oddSum;
    }

    public static int equalValueCount(final double[] numbers,
                                      final double equalTo) {
        int equalValueCount = 0;
        for (double number : numbers) {
            if (number == equalTo) {
                equalValueCount++;
            }
        }
        return equalValueCount;
    }


    public static int countChars(final String chars) {
        int returnValue = 0;
        char[] charArray = chars.toCharArray();
        for (char character : charArray) {  
            if (Character.isLetter(character)) {
                returnValue++;
            }
        }
        return returnValue;
    }
}
