package com.github.eniomoura.aula11.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Classe container do ponto de entrada do programa.
 * Não é criado o construtor privado sugerido pelo Checkstyle,
 * pois isso causaria um problema com o Spring Boot.*/
@SpringBootApplication
public class Application {

    /** Função main, serve apenas para inicializar o Spring Boot.
     * @param args A requisição recebe parâmetros 'data1' e 'data2'.
     * Verificar documentação da DiaDaSemanaController.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
