package com.github.eniomoura.ufg.cs.aula08.inteiro;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Classe contendo os processamentos necessários para manipulações de arquivo
 * necessárias para o programa.
 */
public final class ArquivoUtils {

    /** Referência do arquivo com o qual estamos trabalhando. */
    private static File fileReference;

    /** construtor private explicitando classe utilitaria. */
    private ArquivoUtils() {
    }

    /**
     * @return retorna true se a fileReference passada existe
     */
    static boolean existe() {
        return fileReference.exists();
    }

    /**
     * @return retorna true se a fileReference passada pode ser lida
     */
    static boolean podeLer() {
        return fileReference.canRead();
    }

    /**
     * retorna um vetor com os primeiros bytes do arquivo.
     * @param quantidade quantidade de bytes a ser retornada
     * @return retorna os <code>quantidade</code> primeiros bytes do arquivo.
     * @throws IOException exceção é recebida por quem chama ao acontecer erro de I/O.
     */
    static byte[] primeirosBytes(final int quantidade) throws IOException {
        RandomAccessFile file;
        final byte[] rvalue = new byte[quantidade];
            file = new RandomAccessFile(fileReference, "r");
            file.readFully(rvalue);
            file.close();
        return rvalue;
    }

    /**
     * @return o fileReference
     */
    public static File getFileReference() {
        return fileReference;
    }

    /**
     * @param refToSet o fileReference a ser setado
     */
    public static void setFileReference(final File refToSet) {
        ArquivoUtils.fileReference = refToSet;
    }
}
