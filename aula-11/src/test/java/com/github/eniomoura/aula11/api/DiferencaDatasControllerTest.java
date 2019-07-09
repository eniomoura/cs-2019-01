package com.github.eniomoura.aula11.api;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

public class DiferencaDatasControllerTest {

    DiferencaDatasController ddc = new DiferencaDatasController();

    @Test
    public void entradasIguaisController() {
        assertEquals(0 , 
            ddc.calculateDifference("08/07/2019", "08/07/2019").getDifference());
    }

    @Test
    public void diferencaPositivaController() {
        assertEquals(1 ,
            ddc.calculateDifference("08/07/2019", "09/07/2019").getDifference());
    }

    @Test
    public void diferencaNegativaController() {
        assertEquals(-1 ,
            ddc.calculateDifference("09/07/2019", "08/07/2019").getDifference());
    }

    @Test
    public void validatorTest(){
        assertThrows(IllegalArgumentException.class,
            () -> DiferencaDatasController.validaDatas(null, null));
    }
}