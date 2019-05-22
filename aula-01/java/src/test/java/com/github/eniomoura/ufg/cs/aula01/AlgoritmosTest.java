package com.github.eniomoura.ufg.cs.aula01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmosTest {

    @Test
    public void testaPropriedade3025(){
        assertEquals(true, Algoritmos.propriedade3025(3025));
    }

    @Test
    public void testaPropriedade153(){
        assertEquals(true, Algoritmos.propriedade153(153));
    }

    @Test
    public void testaDiaDaSemana(){
        assertEquals(3, Algoritmos.diaDaSemana(11, 4, 2019));
    }

    @Test
    public void testaMod() {
        assertEquals(2, Algoritmos.mod(5, 3));
    }

    @Test
    public void testaSomaNaturais(){
        assertEquals(6, Algoritmos.somaNaturais(3));
    }

    @Test
    public void testaFatorial(){
        assertEquals(6, Algoritmos.fatorial(3));
    }

    @Test
    public void testaProduto(){
        assertEquals(12, Algoritmos.produto(4, 3));
    }

    @Test
    public void testaPotencia(){
        assertEquals(27, Algoritmos.potencia(3, 3));
    }

    @Test
    public void testaPi(){
        assertEquals(3.14, Algoritmos.pi(1000000), 1);
    }

    @Test
    public void testaLogaritmoNatural(){
        assertEquals(8.66, Algoritmos.logaritmoNatural(3, 3), 1);
    }

    @Test
    public void testaRazaoAurea(){
        assertEquals(1.63, Algoritmos.razaoAurea(3, 4, 3), 1);
    }

    @Test
    public void testaQuadradoPerfeito(){
        assertEquals(true, Algoritmos.quadradoPerfeito(9));
    }

    @Test
    public void testaRaiz(){
        assertEquals(3, Algoritmos.raiz(9, 3), 1);
    }

    @Test
    public void testaPrimo() {
        assertEquals(true, Algoritmos.primo(3));
    }

    @Test
    public void testaCrivoErastotenes() {
        assertArrayEquals(new int[]{2,3}, Algoritmos.crivoErastotenes(new int[]{2, 3}, 2));
    }

    @Test
    public void testaMdc() {
        assertEquals(27, Algoritmos.mdc(81, 54));
    }

    @Test
    public void testaMdc2() {
        assertEquals(27, Algoritmos.mdc2(81, 54));
    }

    @Test
    public void testaHorner() {
        assertEquals(432, Algoritmos.horner(3, 2, 5, 6, 7));
    }

    @Test
    public void testaFibonacci() {
        assertEquals(2, Algoritmos.fibonacci(3));
    }

    @Test
    public void testaCpf() {
        assertEquals(true, Algoritmos.cpf(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }

    @Test
    public void testaCpf2() {
        assertEquals(true, Algoritmos.cpf2(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }
}