/**
 *
 *
 * @author Enio Moura
 */

package com.github.eniomoura.ufg.cs.aula07;

import java.util.HashMap;
import java.util.Map;

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
        for (final float temp : temperatures) {
            if (lesserTemperature > temp) {
                lesserTemperature = temp;
            }
        }
        return lesserTemperature;
    }

    public static int OddSum(final int[] integers) {
        int oddSum = 0;
        for (final int integer : integers) {
        final int divisor = 2;
        final int odd = 1;
        if (integer % divisor == odd) {
            oddSum += integer;
        }
        }
        return oddSum;
    }

    public static int equalValueCount(final double[] numbers,
                                      final double equalTo) {
        int equalValueCount = 0;
        for (final double number : numbers) {
            if (number == equalTo) {
                equalValueCount++;
            }
        }
        return equalValueCount;
    }


    public static int countChars(final String chars) {
        int returnValue = 0;
        final char[] charArray = chars.toCharArray();
        for (final char character : charArray) {
            if (Character.isLetter(character)) {
                returnValue++;
            }
        }
        return returnValue;
    }

    public static String mostFrequentWord(final String string){
        final Map<String, Integer> frequency = new HashMap<String, Integer>();
        final String[] words = string.split(" ");
        for (final String word : words) {
            if (frequency.get(word) == null) {
                frequency.put(word, 1);
            } else {
                frequency.put(word, frequency.get(word) + 1);
            }
        }
        int mostOccurrences = 0;
        String mostFrequentWord = words[0];
        for (final String word : words) {
            if (frequency.get(word) > mostOccurrences) {
                mostOccurrences = frequency.get(word);
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}
