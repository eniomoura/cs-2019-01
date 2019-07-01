package com.github.eniomoura.aula10;

/**
 *
 */
public final class ValidacoesUtils {
    /**
     * Maior valor para um dia.
     */
    static final int MAIOR_DIA = 31;

    static final int JANEIRO = 1;
    static final int FEVEREIRO = 2;
    static final int MARCO = 3;
    static final int ABRIL = 4;
    static final int MAIO = 5;
    static final int JUNHO = 6;
    static final int JULHO = 7;
    static final int AGOSTO = 8;
    static final int SETEMBRO = 9;
    static final int OUTUBRO = 10;
    static final int NOVEMBRO = 11;
    static final int DEZEMBRO = 12;

    static final int SEGUNDA = 0;
    static final int DOMINGO = 6;

    /**
     * Total de dias em uma semana.
     */
    static final int DIAS_DA_SEMANA = 7;

    static final int NUM_ARGUMENTOS = 4;

    /**
     * Primeiro ano gregoriano do Império Britânico
     * (https://gist.github.com/coffeemug/6168031)
     */
    static final int CALENDARIO_GREGORIANO = 1753;

    /** construtor private explicitando classe utilitaria. */
    private ValidacoesUtils() {
    }

    public static boolean validarArgumentos(final String[] args) {
        if (args.length != NUM_ARGUMENTOS) {
            throw new IllegalArgumentException();
        }
        for (final String arg : args) {
            if (Integer.parseInt(arg) < 0) {
                throw new IllegalArgumentException();
            }
        }
        return true;
    }
    public static boolean validarData(
        final int bissexto,
        final int diaDaSemana) {
        if (bissexto < 1) {
            throw new IllegalArgumentException();
        }
        if (diaDaSemana > DOMINGO) {
            throw new IllegalArgumentException();
        }
        
        return true;
    }
    public static boolean validarDataInteresse(final String[] args) {
        return true;
    }
}
