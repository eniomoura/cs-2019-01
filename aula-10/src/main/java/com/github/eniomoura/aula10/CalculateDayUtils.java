package com.github.eniomoura.aula10;

public final class CalculateDayUtils {

    /** construtor private explicitando classe utilitaria. */
    private CalculateDayUtils() {
    }

    public static int getWeekDay(final String[] args) {
        final int leapYear = Integer.parseInt(
                        args[GeneralUtils.LEAP_INDEX]),
                  weekDay = Integer.parseInt(
                        args[GeneralUtils.WEEKDAY_INDEX]);
        final String ref = args[GeneralUtils.REF_INDEX],
                     targetDate = args[GeneralUtils.REF_INDEX];
        final int iterationDirection = targetDate.compareTo(ref);
        String referenceDate = ref;
        int returnValue = weekDay;
        if (iterationDirection > 0) {
            while (!targetDate.equals(referenceDate)) {
                referenceDate = decrementDay(referenceDate, leapYear);
                returnValue = decrementWeekDay(returnValue);
            }
        }
        if (iterationDirection < 0) {
            while (!targetDate.equals(referenceDate)) {
                referenceDate = incrementDay(referenceDate,
                leapYear);
                returnValue = incrementWeekDay(returnValue);
            }
        }
        return returnValue;
    }

    public static String decrementDay(final String date,
                                    final int leapYear) {
        int year = GeneralUtils.getYearFromDate(date);
        int month = GeneralUtils.getMonthFromDate(date);
        int day = GeneralUtils.getDayFromDate(date);
        if (GeneralUtils.JANUARY == month) {
            if (day == 1) {
                day = GeneralUtils.LONG_MONTH_LENGTH;
                month = decrementMonth(month);
                year--;
            } else {
                day--;
            }
        } else if (GeneralUtils.MARCH == month) {
            if (day == 1) {
                day = isLeapYear(leapYear, year)
                        ? GeneralUtils.LAST_FEB_LEAP
                        : GeneralUtils.LAST_FEB_NON_LEAP;
                month = decrementMonth(month);
            } else {
                day--;
            }
        } else if (GeneralUtils.getMonthLength(decrementMonth(month))
        == GeneralUtils.LONG_MONTH_LENGTH) {
            if (day == 1) {
                day = GeneralUtils.LONG_MONTH_LENGTH;
                month = decrementMonth(month);
            } else {
                day--;
            }
        } else if (GeneralUtils.getMonthLength(decrementMonth(month))
        == GeneralUtils.SHORT_MONTH_LENGTH) {
            if (day == 1) {
                day = GeneralUtils.SHORT_MONTH_LENGTH;
                month = decrementMonth(month);
            } else {
                day--;
            }
        }
        return String.format("%04d%02d%02d", year, month, day);
    }

    public static String incrementDay(final String date,
                                     final int leapYear) {
        int year = GeneralUtils.getYearFromDate(date);
        int month = GeneralUtils.getMonthFromDate(date);
        int day = GeneralUtils.getDayFromDate(date);
        if (GeneralUtils.DECEMBER == month) {
            if (day == GeneralUtils.LONG_MONTH_LENGTH) {
                day = 1;
                month = incrementMonth(month);
                year++;
            } else {
                day++;
            }
        } else if (GeneralUtils.FEBRUARY == month) {
            if (isLeapYear(leapYear, year)) {
                if (day == GeneralUtils.LAST_FEB_LEAP) {
                    day = 1;
                    month = incrementMonth(month);
                } else {
                    day++;
                }
            } else if (day == GeneralUtils.LAST_FEB_NON_LEAP) {
                day = 1;
                month = incrementMonth(month);
            } else {
                day++;
            }
        } else if (GeneralUtils.getMonthLength(month)
        == GeneralUtils.SHORT_MONTH_LENGTH) {
            if (day == GeneralUtils.SHORT_MONTH_LENGTH) {
                day = 1;
                month = incrementMonth(month);
            } else {
                day++;
            }
        } else if (GeneralUtils.getMonthLength(month)
        == GeneralUtils.LONG_MONTH_LENGTH) {
            if (day == GeneralUtils.LONG_MONTH_LENGTH) {
                day = 1;
                month = incrementMonth(month);
            } else {
                day++;
            }
        }
        return String.format("%04d%02d%02d", year, month, day);
    }

    public static int decrementWeekDay(final int weekDay) {
        int newWeekDay = weekDay;
        if (newWeekDay == GeneralUtils.MONDAY) {
            return GeneralUtils.SUNDAY;
        }
        return --newWeekDay;
    }

    public static boolean isLeapYear(final int leapYear,
                                     final int year) {
        final int leapYearPeriodicity = 4;
        final int century = 100;
        final int fourCenturies = 400;
        if ((leapYear - year) % leapYearPeriodicity == 0) {
            return year % century == 0
                || year % fourCenturies == 0;
        }
        return false;
    }

    public static int incrementWeekDay(final int weekDay) {
        int newWeekDay = weekDay;
        if (newWeekDay == GeneralUtils.SUNDAY) {
            return GeneralUtils.MONDAY;
        }
        return ++newWeekDay;
    }

    public static int decrementMonth(final int month) {
        int newMonth = month;
        if (newMonth == GeneralUtils.JANUARY) {
            return GeneralUtils.DECEMBER;
        }
        return --newMonth;
    }

    public static int incrementMonth(final int month) {
        int newMonth = month;
        if (newMonth == GeneralUtils.DECEMBER) {
            return GeneralUtils.JANUARY;
        }
        return ++newMonth;
    }
}
