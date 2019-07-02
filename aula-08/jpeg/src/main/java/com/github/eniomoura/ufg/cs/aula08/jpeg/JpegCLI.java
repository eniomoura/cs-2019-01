package com.github.eniomoura.ufg.cs.aula08.jpeg;

import java.io.IOException;

public class JpegCLI {
    public static void main(final String[] args) throws IOException {
        validateArgs(args);
        System.console().printf("%s\n", JpegController.readFile(args[0]));
    }

    public static void validateArgs(String[] args){
        if (args.length == 0) {
            throw new IllegalArgumentException("Nenhum argumento foi "
                    + "fornecido.");
        }
    }
}
