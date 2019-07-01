package com.github.eniomoura.aula10;

/**
 * 
 */
public final class ValidacoesUtils {
    /**
     * Maior valor para um dia.
     */
    public static final int MAIOR_DIA = 31;

    /**
     * Valor correspondente ao mês de janeiro.
     */
    public static final int JANEIRO = 1;

    /**
     * Valor correspondente ao mês de fevereiro.
     */
    public static final int FEVEREIRO = 2;

    /**
     * Valor correspondente ao mês de dezembro.
     */
    public static final int DEZEMBRO = 12;

    /**
     * Total de dias em uma semana.
     */
    public static final int DIAS_DA_SEMANA = 7;

    public static final int NUM_ARGUMENTOS = 4;

    /**
     * Primeiro ano gregoriano do Império Britânico
     * (https://gist.github.com/coffeemug/6168031)
     */
    public static final int CALENDARIO_GREGORIANO = 1753;

    public ValidacoesUtils() {
    }

    public static boolean validarArgumentos(final String[] args){
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
    public static boolean validarDataReferencia(final String[] args){
        if (Integer.parseInt(args[CalendarioUtils.INDICE_BISSEXTO]) < 1) {
            throw new IllegalArgumentException();
        }
        return true;
    }
    public static boolean validarDataInteresse(final String[] args){
        return true;
    }
}
