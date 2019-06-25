package com.github.eniomoura.ufg.cs.aula08.inteiro;

import java.io.File;
import java.io.IOException;

/**
 * Classe contendo os processamentos necessários para input e output
 * da linha de comando para o uso do programa.
 */
public final class InteiroCLI {

    /** construtor private explicitando classe utilitaria. */
    private InteiroCLI() {
    }

    /**
     * Ponto de entrada do programa.
     *
     * @param args : parâmetros de CLI
     */
    public static void main(final String[] args) {
        validarParametro(args);
        final String arquivo = args[0];
        final int quantidade = 4;
        ArquivoUtils.existe();
        ArquivoUtils.podeLer();
        ArquivoUtils.setFileReference(new File(arquivo));
        byte[] quatroPrimeiros = ArquivoUtils.primeirosBytes(quantidade);
        System.out.printf("0x%02X", quatroPrimeiros);

    }

    /**
     *
     * @param parametro vetor de parâmetros de CLI
     * @return retorna true se válido, joga exception se não válido
     */
    private static boolean validarParametro(final String[] parametro) {
        if (parametro.length > 0) {
            File temp = new File(parametro[0]);
            try {
                temp.getCanonicalPath();
                return true;
            } catch (IOException e) {
                System.err.println("O primeiro argumento deve ser um caminho de arquivo.");
                throw new IllegalArgumentException();
            }
        } else {
            System.err.println("Falta um argumento com o caminho do arquivo.");
            throw new IllegalArgumentException();
        }
    }
}
