package com.github.eniomoura.aula11.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

/** Classe utilitária com funções de manipulação de datas. */
public final class CalendarioUtils {

    /** Construtor privado para explicitar classe utilitária. */
    private CalendarioUtils() {
    }

    /** Método calcula a diferença entre duas datas e retorna o valor em dias.
     * Se a primeira data for posterior à segunda,
     * o valor retornado será negativo.
     * @param firstDate Uma data no formato 'dd/MM/aaaa'
     * para o cálculo da diferença.
     * @param secondDate Uma data no formato 'dd/MM/aaaa'
     * para o cálculo da diferença.
     * @return O número em dias, negativo, zero ou positivo, se a primeira
     * data é menor, igual ou maior que a segunda, respectivamente.
     */
    public static int calculateDifference(
        final LocalDate firstDate, final LocalDate secondDate) {
        final Long difference = firstDate.until(secondDate, ChronoUnit.DAYS);
        return difference.intValue();
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência de
     * caracteres.
     *
     * Função retirada e modificada a partir do recurso exemplo disponível em:
     * https://github.com/kyriosdata/exemplo
     *
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null},
     * se a sequência não está no formato esperado (por exemplo, "01-01-2018")
     */
    public static LocalDate localDateFromString(final String data) {
        try {
            final DateTimeFormatter fmt = DateTimeFormatter.ofPattern(
                "dd/MM/yyyy");
            return LocalDate.parse(data, fmt);
        } catch (IllegalArgumentException | DateTimeParseException exp) {
            return null;
        }
    }
}
