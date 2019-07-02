package com.github.eniomoura.aula10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarioUtilsTest {
    @Test
    public void entradasValidas() {
        assertEquals(1, CalendarUtils.run(
            new String[]{"20160301", "2016", "20160228", "6"}));
        assertEquals(2, CalendarUtils.run(
            new String[]{"20160928", "2016", "20160928", "2"}));
        }
}
