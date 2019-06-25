package com.github.eniomoura.ufg.cs.aula08.inteiro;

import java.io.File;
import java.io.IOException;
import org.apache.commons.codec.binary.Hex;

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
     * @param args parâmetros de CLI
     * @throws IOException a execução do programa falha se um erro imprevisto ocorrer na leitura do arquivo.
     */
    public static void main(final String[] args) throws IOException {
        if (!parametrosValidos(args)) {
            throw new IllegalArgumentException("O primeiro argumento deve ser um caminho de arquivo.");
        }
        final String arquivo = args[0];
        final int quantidade = 4;
        ArquivoUtils.setFileReference(new File(arquivo));
        ArquivoUtils.existe();
        ArquivoUtils.podeLer();
        final byte[] quatroPrimeiros = ArquivoUtils.primeirosBytes(quantidade);
        System.console().printf(Hex.encodeHexString(quatroPrimeiros));
    }

    /**
     *
     * @param parametro vetor de parâmetros de CLI
     * @return retorna true se válido, joga exception se não válido
     */
    private static boolean parametrosValidos(final String[] parametro) {
        if (parametro.length > 0) {
            final File temp = new File(parametro[0]);
            try {
                temp.getCanonicalPath();
                return true;
            } catch (IOException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}
