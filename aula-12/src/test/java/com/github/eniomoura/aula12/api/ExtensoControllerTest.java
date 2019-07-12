package com.github.eniomoura.aula12.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExtensoControllerTest {

    ExtensoController ec = new ExtensoController();

    @Test
    public void especiaisTest() {
        assertEquals(new ResponseModel("zero").getExtenso() , ec.writeInFull("0").getExtenso());
        assertEquals(new ResponseModel("onze").getExtenso() , ec.writeInFull("11").getExtenso());
        assertEquals(new ResponseModel("cem").getExtenso() , ec.writeInFull("100").getExtenso());
    }

    @Test
    public void umDigitoTest() {
        assertEquals(new ResponseModel("um").getExtenso() , ec.writeInFull("1").getExtenso());
    }

    @Test
    public void doisDigitosTest() {
        assertEquals(new ResponseModel("vinte").getExtenso() , ec.writeInFull("20").getExtenso());
        assertEquals(new ResponseModel("vinte e um").getExtenso() , ec.writeInFull("21").getExtenso());
    }

    @Test
    public void tresDigitosTest() {
        assertEquals(new ResponseModel("duzentos").getExtenso() , ec.writeInFull("200").getExtenso());
        assertEquals(new ResponseModel("duzentos e dois").getExtenso() , ec.writeInFull("202").getExtenso());
        assertEquals(new ResponseModel("duzentos e dez").getExtenso() , ec.writeInFull("210").getExtenso());
        assertEquals(new ResponseModel("duzentos e onze").getExtenso() , ec.writeInFull("211").getExtenso());
        assertEquals(new ResponseModel("duzentos e vinte").getExtenso() , ec.writeInFull("220").getExtenso());
        assertEquals(new ResponseModel("duzentos e vinte e dois").getExtenso() , ec.writeInFull("222").getExtenso());
    }

    @Test
    public void quatroDigitosTest() {
        assertEquals(new ResponseModel("dois mil").getExtenso() , ec.writeInFull("2000").getExtenso());
        assertEquals(new ResponseModel("dois mil e dois").getExtenso() , ec.writeInFull("2002").getExtenso());
        assertEquals(new ResponseModel("dois mil e dez").getExtenso() , ec.writeInFull("2010").getExtenso());
        assertEquals(new ResponseModel("dois mil e vinte").getExtenso() , ec.writeInFull("2020").getExtenso());
        assertEquals(new ResponseModel("dois mil e vinte e dois").getExtenso() , ec.writeInFull("2022").getExtenso());
        assertEquals(new ResponseModel("dois mil e duzentos").getExtenso() , ec.writeInFull("2200").getExtenso());
        assertEquals(new ResponseModel("dois mil duzentos e um").getExtenso() , ec.writeInFull("2201").getExtenso());
        assertEquals(new ResponseModel("dois mil duzentos e onze").getExtenso() , ec.writeInFull("2211").getExtenso());
        assertEquals(new ResponseModel("dois mil duzentos e vinte").getExtenso() , ec.writeInFull("2220").getExtenso());
        assertEquals(new ResponseModel("dois mil duzentos e vinte e dois").getExtenso() , ec.writeInFull("2222").getExtenso());
    }

    @Test
    public void entradasInvalidas(){
        assertThrows(IllegalArgumentException.class,
            () -> ec.writeInFull("-1"));
    }
}
