package com.github.eniomoura.aula10;

public final class CalculaDiaUtils {

    /** construtor private explicitando classe utilitaria. */
    private CalculaDiaUtils() {
    }

    public static int getDiaDaSemana(final String[] args) {
        final int bissexto = Integer.parseInt(
                        args[CalendarioUtils.INDICE_BISSEXTO]),
                  diaDaSemana = Integer.parseInt(
                        args[CalendarioUtils.INDICE_DIA_DA_SEMANA]);
        final String referencia = args[CalendarioUtils.INDICE_REFERENCIA],
                     dataAlvo = args[CalendarioUtils.INDICE_REFERENCIA];
        final int comparacao = comparaDatas(dataAlvo, referencia);
        final String aux = referencia;
        final int rValue = diaDaSemana;

        if (comparacao == 1) {
            while (!dataAlvo.equals(referencia)) {
                referencia = subtraiDia(referencia,
                bissexto);
                rValue = subtraiDiaDaSemana(rValue);
            }
        }

        if (comparacao == -1) {
            while (!dataAlvo.equals(referencia)) {
                referencia = adicionaDia(referencia,
                bissexto);
                rValue = adicionaDiaDaSemana(rValue);
            }
        }
        return rValue;
    }

}
