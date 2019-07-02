package com.github.eniomoura.aula10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarUtilsTest {
    @Test
    public void dataDeInteresseInvalida() {
        assertEquals(-1, CalendarUtils.run(
            new String[]{"19000229", "2016", "20190626", "2"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"2010101", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"100000101", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20161301", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20160001", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20160931", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20160900", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"01110101", "1", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190230", "2019", "20190626", "2"}));
    }

    @Test
    public void dataDeReferenciaInvalida() {
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "1", "20190230", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "1", "20190132", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "1", "20191131", "1"}));
    }

    @Test
    public void anoBissextoInvalido() {
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "0", "23450101", "1"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "-100", "23450101", "1"}));
    }

    @Test
    public void diaDaSemanaInvalido() {
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "2016", "20190101", "-2"}));
        assertEquals(-1, CalendarUtils.run(
            new String[]{"20190626", "2016", "20201231", "8"}));
    }

    @Test
    public void entradasValidas() {
        assertEquals(1, CalendarUtils.run(
            new String[]{"20190625", "2000", "20190626", "2"}));
        assertEquals(1, CalendarUtils.run(
            new String[]{"20160301", "2016", "20160228", "6"}));
        assertEquals(2, CalendarUtils.run(
            new String[]{"20160928", "2016", "20160928", "2"}));
    }
}
