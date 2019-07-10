package com.github.eniomoura.aula12.api;

/** Classe definindo o formato de objeto de resposta JSON. */
public final class ResponseModel {
    /** Número por extenso. */
    private final String extenso;

    /** Construtor do modelo.
     * @param numeroExtenso o valor do número extenso no momento
     * de instanciação do modelo. */
    public ResponseModel(final String numeroExtenso) {
        this.extenso = numeroExtenso;
    }

    /** Getter para a variável difference.
     * @return O valor de difference. */
    public String getExtenso() {
        return extenso;
    }
}
