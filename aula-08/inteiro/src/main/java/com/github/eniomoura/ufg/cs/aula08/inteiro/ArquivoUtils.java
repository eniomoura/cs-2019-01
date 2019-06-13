package com.github.eniomoura.ufg.cs.aula08.inteiro;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ArquivoUtils {
    public static File fileReference;

    final static boolean existe(){
        return fileReference.exists();
    }

    final static boolean podeLer() {
        return fileReference.canRead();
    }

    final static byte[] primeirosBytes(int quantidade) {
        byte[] rvalue = new byte[(int) fileReference.length()];
        try {
            RandomAccessFile file = new RandomAccessFile(fileReference, "r");
            file.readFully(rvalue);
        }catch (IOException e){
            System.err.println("Erro inesperado na leitura do arquivo '" +
                    fileReference.getAbsolutePath()+"'.");
            e.printStackTrace();
        }
        return rvalue;
    }
}
