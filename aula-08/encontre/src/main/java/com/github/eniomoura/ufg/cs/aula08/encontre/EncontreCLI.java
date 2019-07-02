package com.github.eniomoura.ufg.cs.aula08.encontre;

import java.io.IOException;

public class EncontreCLI {

    private static final int NUMERO_PARAMETROS = 2;

    public static void main(final String[] args) throws IOException {
        validateArgs(args);
        System.console().printf("%s\n",
            EncontreController.encontre(args[0], args[1]));
    }

    static void validateArgs(String[] args) throws IllegalArgumentException{
        if (args.length < NUMERO_PARAMETROS) {
            if (args.length == 0) {
                throw new IllegalArgumentException("É esperado um argumento com um nome de arquivo.");
            }
            throw new IllegalArgumentException("É esperado um argumento com um nome de arquivo.");
        }
    }
}