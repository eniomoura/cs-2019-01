package com.github.eniomoura.exemplo.aula11.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/** Classe utilitária com funções de manipulação de datas. */
public final class CalendarioUtils {

    /** Construtor privado para explicitar classe utilitária. */
    private CalendarioUtils() {
    }

    /** Método calcula a diferença entre duas datas e retorna o valor em dias.
     * @param date1 Primeiro operando, uma data no formato 'dd/MM/aaaa'
     *              para o cálculo da diferença.
     * @param date2 Segundo operando, uma data no formato 'dd/MM/aaaa'
     *              para o cálculo da diferença.
     * @return A diferença entre as duas datas.
     */
    public static int calculateDifference(
        final LocalDate date1, final LocalDate date2) {
        Long difference = date1.until(date2, ChronoUnit.DAYS);
        return difference.intValue();
    }
}
