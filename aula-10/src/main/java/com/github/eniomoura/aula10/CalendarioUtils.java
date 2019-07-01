package com.github.eniomoura.aula10;

public final class CalendarioUtils {
    static final int INDICE_ALVO = 0;
    static final int INDICE_BISSEXTO = 1;
    static final int INDICE_REFERENCIA = 2;
    static final int INDICE_DIA_DA_SEMANA = 3;

    /** construtor private explicitando classe utilitaria. */
    private CalendarioUtils() {
    }
    public static int executar(final String[] args)
    throws IllegalArgumentException {
        try {
            if (
                ValidacoesUtils.validarArgumentos(args)
                && ValidacoesUtils.validarData(
                    Integer.parseInt(args[INDICE_BISSEXTO]),
                    Integer.parseInt(args[INDICE_REFERENCIA]))
                && ValidacoesUtils.validarData(
                    Integer.parseInt(args[INDICE_BISSEXTO]),
                    Integer.parseInt(args[INDICE_DIA_DA_SEMANA]))
            ) {
                return CalculaDiaUtils.getDiaDaSemana(args);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
