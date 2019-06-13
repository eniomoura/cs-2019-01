package com.github.eniomoura.ufg.cs.aula08.inteiro;

import java.io.File;
import java.io.IOException;

public class InteiroCLI {
    public static void main (String[] args){
        validarParametro(args);
        final String arquivo = args[0];
        final int quantidade = 4;
        ArquivoUtils.existe();
        ArquivoUtils.podeLer();
        ArquivoUtils.fileReference = new File(arquivo);
        byte[] quatroPrimeiros = ArquivoUtils.primeirosBytes(quantidade);
        System.out.printf("0x%02X", quatroPrimeiros);

    }

    final private static boolean validarParametro(String[] parametro) {
        if(parametro.length>0) {
            File temp = new File(parametro[0]);
            try {
                temp.getCanonicalPath();
                return true;
            } catch (IOException e) {
                System.err.println("O primeiro argumento deve ser um caminho de arquivo.");
                throw new IllegalArgumentException();
            }
        }else{
            System.err.println("Falta um argumento com o caminho do arquivo.");
            throw new IllegalArgumentException();
        }
    }
}
