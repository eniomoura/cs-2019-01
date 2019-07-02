package com.github.eniomoura.ufg.cs.aula08.jpeg;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JpegController {
    public static final String FIRST_HEX = "ff";
    public static final String SECOND_HEX = "d8";
    public static final String PENULTIMATE_HEX = "ff";
    public static final String LAST_HEX = "d9";

    private static InputStream is;
    private static String firstHex;
    private static String secondHex;

    public static boolean readFile(final String caminhoArquivo) throws IOException {
        final File checkFile = new File(caminhoArquivo);
        if (checkFile.length() == 0){
            return false;
        }
        is = Files.newInputStream(Paths.get(caminhoArquivo));
        firstHex = String.format("%02x", is.read());
        secondHex = String.format("%02x", is.read());
        return verifyBytes();
    }

    public static boolean verifyBytes() throws IOException{
        if (firstHex.equals(FIRST_HEX)
        && secondHex.equals(SECOND_HEX)) {
            String penultimateHex = "";
            String lastHex = "";
            int nextHex = 0;
            while ((nextHex = is.read()) != -1) {
                penultimateHex = lastHex;
                lastHex = String.format("%02x", nextHex);
            }
            if (penultimateHex.equals(PENULTIMATE_HEX)
            && lastHex.equals(LAST_HEX)) {
                is.close();
                return true;
            }
        }
        return false;
    }
}
