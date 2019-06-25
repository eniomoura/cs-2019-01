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
        assertEquals(4, AlgoritmosUtils.diaDaSemana(11, 1, 2019));
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
    public void testaPrimoVerdadeiro() {
        assertEquals(true, AlgoritmosUtils.primo(3));
    }

    @Test
    public void testaPrimoFalso() {
        assertEquals(false, AlgoritmosUtils.primo(4));
    }

    @Test
    public void testaCrivoErastotenes() {
        assertArrayEquals(new int[]{2, 0, 1, 1, 1, 1}, AlgoritmosUtils.crivoErastotenes(new int[]{2, 0, 3, 4, 5, 6}, 5));
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
        assertEquals(360, AlgoritmosUtils.horner(3, 2, 5, 6, 7));
    }

    @Test
    public void testaFibonacciNormal() {
        assertEquals(2, AlgoritmosUtils.fibonacci(3));
    }

    @Test
    public void testaFibonacciExtremo() {
        assertEquals(0, AlgoritmosUtils.fibonacci(0));
    }


    @Test
    public void testaCpf() {
        assertEquals(true, AlgoritmosUtils.cpf(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }

    @Test
    public void testaCpf2() {
        assertEquals(true, AlgoritmosUtils.cpf2(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }

    @Test
    public void testaMain(){
        AlgoritmosUtils.main(new String[0]);
    }

    @Test
    public void invalidoPropriedade3025(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.propriedade3025(-99999));
    }

    @Test
    public void invalidoPropriedade153(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.propriedade153(-99999));
    }

    @Test
    public void invalidoDiaDaSemana(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.diaDaSemana(32, 9999, 2016));
    }

    @Test
    public void invalidoMod() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.mod(-9, -9));
    }

    @Test
    public void invalidoSomaNaturais(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.somaNaturais(-9));
    }

    @Test
    public void invalidoFatorial(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fatorial(-9));
    }

    @Test
    public void invalidoProduto(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.produto(-9, -9));
    }

    @Test
    public void invalidoPotencia(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.potencia(-9, -9));
    }

    @Test
    public void invalidoPi(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.pi(-9));
    }

    @Test
    public void invalidoLogaritmoNatural(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.logaritmoNatural(-9, -9));
    }

    @Test
    public void invalidoRazaoAurea(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.razaoAurea(-9, -9, -9));
    }

    @Test
    public void invalidoQuadradoPerfeito(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.quadradoPerfeito(-9));
    }

    @Test
    public void invalidoRaiz(){
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.raiz(-9, -9));
    }

    @Test
    public void invalidoPrimoVerdadeiro() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.primo(-9));
    }

    @Test
    public void invalidoCrivoErastotenes() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.validaCrivo(new int[]{2, 0, 3, 4, 5, 6}, -9));
    }
    
    @Test
    public void invalidoMdc() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.mdc(-9, -9));
    }

    @Test
    public void invalidoMdc2() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.mdc2(-9, -9));
    }

    @Test
    public void invalidoHorner() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.horner());
    }

    @Test
    public void invalidoFibonacci() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.fibonacci(-9));
    }

    @Test
    public void invalidoCpf() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf(new int[]{9}));
    }

    @Test
    public void invalidoCpf2() {
        assertThrows(IllegalArgumentException.class, () -> AlgoritmosUtils.cpf2(new int[]{9}));
    }
}