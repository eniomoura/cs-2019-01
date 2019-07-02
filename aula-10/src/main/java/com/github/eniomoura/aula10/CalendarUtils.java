package com.github.eniomoura.aula10;

public final class CalendarUtils {
    /** construtor private explicitando classe utilitaria. */
    private CalendarUtils() {
    }
    public static int run(final String[] args) {
        try {
            ValidatingUtils.validateArgs(args);
            ValidatingUtils.validateWeekDay(
                args[GeneralUtils.WEEKDAY_INDEX]);
            ValidatingUtils.validateInput(
                Integer.parseInt(args[GeneralUtils.LEAP_INDEX]),
                args[GeneralUtils.REF_INDEX]);
            ValidatingUtils.validateInput(
                Integer.parseInt(args[GeneralUtils.LEAP_INDEX]),
                args[GeneralUtils.TARGET_INDEX]);
            return CalculateDayUtils.getWeekDay(args);
        } catch (IllegalArgumentException ex) {
            return -1;
        }
    }
}
