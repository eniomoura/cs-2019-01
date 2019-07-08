package com.github.eniomoura.exemplo.aula11.api;

/** Classe definindo o formato de objeto de resposta JSON. */
public final class ResponseModel {
    /** Diferença entre datas em dias. */
    private final int difference;

    /** Construtor do modelo.
     * @param initialDifference a diferença entre datas no momento
     * de instanciação do modelo. */
    public ResponseModel(final int initialDifference) {
        this.difference = initialDifference;
    }

    /** Getter para a variável difference.
     * @return O valor de difference. */
    public int getDifference() {
        return difference;
    }
}
