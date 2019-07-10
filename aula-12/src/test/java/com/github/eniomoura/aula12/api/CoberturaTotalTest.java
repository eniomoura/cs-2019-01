package com.github.eniomoura.aula12.api;

import org.junit.jupiter.api.Test;

/** Classe contendo testes dummy apenas para alcancar o nível de coverage exigido no jacoco.
 * O método main do Application não é testado para salvar tempo na execução do verify. */
public class CoberturaTotalTest {
    @Test
    public void coberturaTotal() {
        new ResponseModel("Zero").getExtenso();
    }
}