package com.github.eniomoura.aula10;

public final class GeneralUtils {

    /** construtor private explicitando classe utilitaria. */
    private GeneralUtils() {
    }
    /** Valor de retorno caso o processamento retornar erro */
    static final int EXECUTION_ERROR = -1;
    /** Número de parâmetros de CLI para o programa */
    static final int ARGUMENT_COUNT = 4;
    /** Índice do parâmetro de data alvo na array de parâmetros */
    static final int TARGET_INDEX = 0;
    /** Índice do parâmetro de ano bissexto na array de parâmetros */
    static final int LEAP_INDEX = 1;
    /** Índice do parâmetro de data de referência na array de parâmetros */
    static final int REF_INDEX = 2;
    /** Índice do parâmetro de dia da semana na array de parâmetros */
    static final int WEEKDAY_INDEX = 3;
    /** Número de dígitos dos parâmetros de datas */
    static final int DIGIT_COUNT = 8;
    /** Menor ano bissexto possível */
    static final int FIRST_LEAP_YEAR = 1;
    /** Número de dias dos meses mais longos */
    static final int LONG_MONTH_LENGTH = 31;
    /** Número de dias dos meses mais curtos (30 dias) */
    static final int SHORT_MONTH_LENGTH = 30;
    /** Último dia de fevereiro em ano normal. */
    static final int LAST_FEB_NON_LEAP = 28;
    /** Último dia de fevereiro em ano bissexto. */
    static final int LAST_FEB_LEAP = 29;
    /** Número de dias em uma semana */
    static final int WEEKDAYS = 7;
    static final int JANUARY = 1;
    static final int FEBRUARY = 2;
    static final int MARCH = 3;
    static final int APRIL = 4;
    static final int MAY = 5;
    static final int JUNE = 6;
    static final int JULY = 7;
    static final int AUGUST = 8;
    static final int SEPTEMBER = 9;
    static final int OCTOBER = 10;
    static final int NOVEMBER = 11;
    static final int DECEMBER = 12;
    static final int MONDAY = 0;
    static final int SUNDAY = 6;
    private static final int YEAR_LENGTH = 4;
    private static final int DAY_MONTH_LENGTH = 2;

    public static int getYearFromDate(final String date) {
        final int year = Integer.parseInt(date.substring(0, YEAR_LENGTH));
        return year;
    }

    public static int getMonthFromDate(final String date) {
        final int month = Integer.parseInt(
            date.substring(YEAR_LENGTH, YEAR_LENGTH + DAY_MONTH_LENGTH));
        return month;
    }

    public static int getDayFromDate(final String data) {
        final int day = Integer.parseInt(
            data.substring(
                YEAR_LENGTH + DAY_MONTH_LENGTH,
                YEAR_LENGTH + DAY_MONTH_LENGTH * 2));
        return day;
    }

    public static int getMonthLength(final int month) {
        switch (month) {
            case JANUARY:
            return LONG_MONTH_LENGTH;
            case MARCH:
            return LONG_MONTH_LENGTH;
            case APRIL:
            return SHORT_MONTH_LENGTH;
            case MAY:
            return LONG_MONTH_LENGTH;
            case JUNE:
            return SHORT_MONTH_LENGTH;
            case JULY:
            return LONG_MONTH_LENGTH;
            case AUGUST:
            return LONG_MONTH_LENGTH;
            case SEPTEMBER:
            return SHORT_MONTH_LENGTH;
            case OCTOBER:
            return LONG_MONTH_LENGTH;
            case NOVEMBER:
            return SHORT_MONTH_LENGTH;
            case DECEMBER:
            return LONG_MONTH_LENGTH;
            default:
            throw new IllegalArgumentException();
        }
    }
}
