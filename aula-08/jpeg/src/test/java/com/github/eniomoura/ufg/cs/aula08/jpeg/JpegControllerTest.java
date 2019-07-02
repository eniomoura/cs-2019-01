package com.github.eniomoura.ufg.cs.aula08.jpeg;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public final class JpegControllerTest {
    private String getFilePath(String string) throws URISyntaxException {
        URL res = getClass().getClassLoader().getResource(string);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void testValid() throws IOException, URISyntaxException {
        assertTrue(JpegController.readFile(getFilePath("imagem.jpg")));
    }

    @Test
    public void testInvalid() throws IOException, URISyntaxException {
        assertFalse(JpegController.readFile(getFilePath("notJpeg")));
        assertFalse(JpegController.readFile(getFilePath("emptyfile.txt")));
    }
}
