package com.github.eniomoura.ufg.cs.aula08.inteiro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArquivoUtilsTest {
    @Test
    public void entradaInvalida(){
        assertThrows(IllegalArgumentException.class, () -> InteiroCLI.parametrosValidos(null));
    }
}