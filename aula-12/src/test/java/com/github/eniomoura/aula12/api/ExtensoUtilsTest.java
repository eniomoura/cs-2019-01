package com.github.eniomoura.aula12.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExtensoUtilsTest {
    @Test
    public void especiaisTest() {
        assertEquals("zero" , ExtensoUtils.writeInFull(0));
        assertEquals("onze" , ExtensoUtils.writeInFull(11));
        assertEquals("cem" , ExtensoUtils.writeInFull(100));
    }

    @Test
    public void umDigitoTest() {
        assertEquals("um" , ExtensoUtils.writeInFull(1));
    }

    @Test
    public void doisDigitosTest() {
        assertEquals("vinte" , ExtensoUtils.writeInFull(20));
        assertEquals("vinte e um" , ExtensoUtils.writeInFull(21));
    }

    @Test
    public void tresDigitosTest() {
        assertEquals("duzentos" , ExtensoUtils.writeInFull(200));
        assertEquals("duzentos e dois" , ExtensoUtils.writeInFull(202));
        assertEquals("duzentos e dez" , ExtensoUtils.writeInFull(210));
        assertEquals("duzentos e onze" , ExtensoUtils.writeInFull(211));
        assertEquals("duzentos e vinte" , ExtensoUtils.writeInFull(220));
        assertEquals("duzentos e vinte e dois" , ExtensoUtils.writeInFull(222));
    }

    @Test
    public void quatroDigitosTest() {
        assertEquals("dois mil" , ExtensoUtils.writeInFull(2000));
        assertEquals("dois mil e dois" , ExtensoUtils.writeInFull(2002));
        assertEquals("dois mil e dez" , ExtensoUtils.writeInFull(2010));
        assertEquals("dois mil e vinte" , ExtensoUtils.writeInFull(2020));
        assertEquals("dois mil e vinte e dois" , ExtensoUtils.writeInFull(2022));
        assertEquals("dois mil e duzentos" , ExtensoUtils.writeInFull(2200));
        assertEquals("dois mil duzentos e um" , ExtensoUtils.writeInFull(2201));
        assertEquals("dois mil duzentos e onze" , ExtensoUtils.writeInFull(2211));
        assertEquals("dois mil duzentos e vinte" , ExtensoUtils.writeInFull(2220));
        assertEquals("dois mil duzentos e vinte e dois" , ExtensoUtils.writeInFull(2222));
    }

    @Test
    public void entradasInvalidas(){
        assertThrows(IllegalArgumentException.class,
            () -> ExtensoUtils.writeInFull(-1));
    }
}
