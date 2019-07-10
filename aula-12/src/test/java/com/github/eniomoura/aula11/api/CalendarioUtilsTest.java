package com.github.eniomoura.aula11.api;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

public class CalendarioUtilsTest {

    DiferencaDatasController ddc = new DiferencaDatasController();

    @Test
    public void entradasIguaisUtils() {
        assertEquals(0 , 
            CalendarioUtils.calculateDifference(
                CalendarioUtils.localDateFromString("08/07/2019"),
                CalendarioUtils.localDateFromString("08/07/2019")));
    }

    @Test
    public void diferencaPositivaUtils() {
        assertEquals(1 , 
            CalendarioUtils.calculateDifference(
                CalendarioUtils.localDateFromString("08/07/2019"),
                CalendarioUtils.localDateFromString("09/07/2019")));
    }

    @Test
    public void diferencaNegativaUtils() {
        assertEquals(-1 , 
            CalendarioUtils.calculateDifference(
                CalendarioUtils.localDateFromString("09/07/2019"),
                CalendarioUtils.localDateFromString("08/07/2019")));
    }
    
	@Test
    public void entradasInvalidasUtils() {
        assertThrows(DateTimeParseException.class,
            () -> CalendarioUtils.calculateDifference(LocalDate.parse(""), LocalDate.parse("")));
        assertThrows(DateTimeParseException.class,
            () -> CalendarioUtils.calculateDifference(LocalDate.parse("teste"), LocalDate.parse("teste")));
        assertThrows(DateTimeParseException.class,
            () -> CalendarioUtils.calculateDifference(LocalDate.parse("99/99/9999"), LocalDate.parse("99/99/9999")));
    }
}