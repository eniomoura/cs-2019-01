package com.github.eniomoura.aula11.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiferencaDatasControllerTest {

    DiferencaDatasController ddc = new DiferencaDatasController();

    @Test
    public void entradasIguaisController() {
        assertEquals(0 , 
            ddc.diferencaDatas("08/07/2019", "08/07/2019").getDifference());
    }

    @Test
    public void diferencaPositivaController() {
        assertEquals(1 ,
            ddc.diferencaDatas("08/07/2019", "09/07/2019").getDifference());
    }

    @Test
    public void diferencaNegativaController() {
        assertEquals(-1 ,
            ddc.diferencaDatas("09/07/2019", "08/07/2019").getDifference());
    }

    @Test
    public void entradasInvalidasController() {
        assertThrows(IllegalArgumentException.class,
            () -> ddc.diferencaDatas("", ""));
        assertThrows(IllegalArgumentException.class,
            () -> ddc.diferencaDatas("teste", "teste"));
        assertThrows(IllegalArgumentException.class,
            () -> ddc.diferencaDatas("99/99/9999", "99/99/9999"));
    }
}