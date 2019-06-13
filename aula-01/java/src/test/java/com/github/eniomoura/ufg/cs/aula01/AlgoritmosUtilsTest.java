package com.github.eniomoura.ufg.cs.aula01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmosUtilsTest {

    @Test
    public void testaPropriedade3025(){
        assertEquals(true, AlgoritmosUtils.propriedade3025(3025));
    }

    @Test
    public void testaPropriedade153(){
        assertEquals(true, AlgoritmosUtils.propriedade153(153));
    }

    @Test
    public void testaDiaDaSemana(){
        assertEquals(3, AlgoritmosUtils.diaDaSemana(11, 4, 2019));
    }

    @Test
    public void testaMod() {
        assertEquals(2, AlgoritmosUtils.mod(5, 3));
    }

    @Test
    public void testaSomaNaturais(){
        assertEquals(6, AlgoritmosUtils.somaNaturais(3));
    }

    @Test
    public void testaFatorial(){
        assertEquals(6, AlgoritmosUtils.fatorial(3));
    }

    @Test
    public void testaProduto(){
        assertEquals(12, AlgoritmosUtils.produto(4, 3));
    }

    @Test
    public void testaPotencia(){
        assertEquals(27, AlgoritmosUtils.potencia(3, 3));
    }

    @Test
    public void testaPi(){
        assertEquals(3.14, AlgoritmosUtils.pi(1000000), 1);
    }

    @Test
    public void testaLogaritmoNatural(){
        assertEquals(8.66, AlgoritmosUtils.logaritmoNatural(3, 3), 1);
    }

    @Test
    public void testaRazaoAurea(){
        assertEquals(1.63, AlgoritmosUtils.razaoAurea(3, 4, 3), 1);
    }

    @Test
    public void testaQuadradoPerfeito(){
        assertEquals(true, AlgoritmosUtils.quadradoPerfeito(9));
    }

    @Test
    public void testaRaiz(){
        assertEquals(3, AlgoritmosUtils.raiz(9, 3), 1);
    }

    @Test
    public void testaPrimo() {
        assertEquals(true, AlgoritmosUtils.primo(3));
    }

    @Test
    public void testaCrivoErastotenes() {
        assertArrayEquals(new int[]{2,3}, AlgoritmosUtils.crivoErastotenes(new int[]{2, 3}, 2));
    }
    
    @Test
    public void testaMdc() {
        assertEquals(27, AlgoritmosUtils.mdc(81, 54));
    }

    @Test
    public void testaMdc2() {
        assertEquals(27, AlgoritmosUtils.mdc2(81, 54));
    }

    @Test
    public void testaHorner() {
        assertEquals(432, AlgoritmosUtils.horner(3, 2, 5, 6, 7));
    }

    @Test
    public void testaFibonacci() {
        assertEquals(2, AlgoritmosUtils.fibonacci(3));
    }

    @Test
    public void testaCpf() {
        assertEquals(true, AlgoritmosUtils.cpf(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }

    @Test
    public void testaCpf2() {
        assertEquals(true, AlgoritmosUtils.cpf2(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }
}