package com.github.eniomoura.exemplo.aula11.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Classe container do ponto de entrada do programa. */
@SpringBootApplication
public final class Application {

    /** Construtor privado para explicitar classe utilitária. */
    private Application() {
    }

    /** Função main, serve apenas para inicializar o Spring Boot.
     * @param args A requisição recebe parâmetros 'data1' e 'data2'.
     * Verificar documentação da DiaDaSemanaController.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
