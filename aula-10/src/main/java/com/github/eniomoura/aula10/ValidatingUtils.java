package com.github.eniomoura.aula10;

/**
 *
 */
public final class ValidatingUtils {
    /** construtor private explicitando classe utilitaria. */
    private ValidatingUtils() {
    }

    public static boolean validateArgs(final String[] args) {
        if (args.length != GeneralUtils.ARGUMENT_COUNT) {
            throw new IllegalArgumentException();
        }
        for (final String arg : args) {
            if (Integer.parseInt(arg) < 0) {
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

    public static boolean validateInput(
        final int leapYear,
        final String date) {
        final int minLeapYear = 1;
        if (leapYear < minLeapYear) {
            throw new IllegalArgumentException();
        }
        validateDate(
            date, leapYear
        );
        return true;
    }

    public static boolean validateTargetDate(final String[] args) {
        return true;
    }

    public static boolean validateWeekDay(final String date) {
        final int parsedDate = Integer.parseInt(date);
        if (parsedDate > GeneralUtils.SUNDAY) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static void validateDate(
        final String date,
        final int leapYear) {
        if (date.length() != GeneralUtils.DIGIT_COUNT) {
            throw new IllegalArgumentException();
        }
        validateDayBounds(date);
        validateMonthBounds(date);
        validateFirstDigit(date);
        if (GeneralUtils.getMonthFromDate(date)
        == GeneralUtils.FEBRUARY) {
            validateLeapDay(date, leapYear);
        } else if (GeneralUtils.getDayFromDate(date)
        == GeneralUtils.LONG_MONTH_LEN) {
            validateLongMonth(date);
        }
    }

    private static void validateFirstDigit(final String date) {
        if (Integer.parseInt(date.substring(0, 1)) == 0) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateMonthBounds(final String date) {
        final int month = GeneralUtils.getMonthFromDate(date);
        if (month < GeneralUtils.JANUARY || month > GeneralUtils.DECEMBER) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateDayBounds(final String date) {
        final int day = GeneralUtils.getDayFromDate(date);
        if (day < 1 || day > GeneralUtils.LONG_MONTH_LEN) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateLongMonth(final String date) {
        final int month = GeneralUtils.getMonthFromDate(date);
        if (GeneralUtils.getMonthLength(month)
        == GeneralUtils.SHORT_MONTH_LEN) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateLeapDay(final String date,
                                         final int leapYear) {
        final int day = GeneralUtils.getDayFromDate(date);
        final int year = GeneralUtils.getYearFromDate(date);
        if (day > GeneralUtils.LAST_FEB_NON_LEAP) {
            if (year == leapYear) {
                if (day > GeneralUtils.LAST_FEB_LEAP) {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
