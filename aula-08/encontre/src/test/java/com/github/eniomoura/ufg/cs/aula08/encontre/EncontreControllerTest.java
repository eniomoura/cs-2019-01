package com.github.eniomoura.ufg.cs.aula08.encontre;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public final class EncontreControllerTest {

    private String getFilePath(String string) throws URISyntaxException {
        URL res = getClass().getClassLoader().getResource(string);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void testEncontraPalavra() throws IOException, URISyntaxException {
        assertEquals("Encontradas: 3\r\n"
                + "L1 C10: this is a test file used to test\r\n"
                + "L2 C29: if the program can count the tests\r\n"
                + "L3 C27: written here with the unit test case.\r\n", EncontreController.encontre(
                getFilePath("textfile.txt"), "test"));
        assertEquals("Encontradas: 0\r\n", EncontreController.encontre(
                getFilePath("textfile.txt"), "not found"));
    }
    
    @Test
    public void testmatchCounter() {
        assertEquals(2, EncontreController.matchCounter("the lazy fox jumps over the brown fox", "fox"));
        assertEquals(0, EncontreController.matchCounter("the lazy fox jumps over the brown fox", "teste"));
    }

    @Test
    public void testExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> EncontreController.encontre(getFilePath(
                        "emptyfile.txt"), "palavra"));
    }

}
