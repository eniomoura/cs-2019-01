package com.github.eniomoura.exemplo.aula11.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class CalendarioUtils {
    public static int calculateDifference(LocalDate date1, LocalDate date2) {
        Long difference = date1.until(date2, ChronoUnit.DAYS);
        return difference.intValue();
    }
}