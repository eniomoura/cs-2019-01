package com.github.eniomoura.ufg.cs.aula01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgoritmosTest {

    @Test
    public void diaMenorQueUmInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> Algoritmos.diaDaSemana(0, 8, 2016));
    }
}