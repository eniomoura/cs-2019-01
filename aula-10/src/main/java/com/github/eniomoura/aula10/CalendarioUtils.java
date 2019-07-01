package com.github.eniomoura.aula10;

/**
 * Implementação do cálculo de dia da semana.
 *
 * <p>Implementação do algoritmo criado por
 * LARSEN, K. S. Computing the Day of the week,
 * Dr. Dobb´s Journal, april, 1995.
 */
public final class CalendarioUtils {
    public static final int INDICE_DATA_SAIDA = 0;
    public static final int INDICE_BISSEXTO = 1;
    public static final int INDICE_DATA_ENTRADA = 2;
    public static final int INDICE_DIA_DA_SEMANA = 3;

    /** construtor private explicitando classe utilitaria. */
    private CalendarioUtils() {
    }
    public static int executar(final String[] args)
    throws IllegalArgumentException {
        try {
            if (
                ValidacoesUtils.validarArgumentos(args)
                && ValidacoesUtils.validarDataReferencia(args)
                && ValidacoesUtils.validarDataInteresse(args)
            ) {
                return DiaDaSemanaUtils.getDiaDaSemana(args);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
