package com.github.eniomoura.aula10;

import java.time.LocalDate;

/**
 * Reúne uma data e o dia da semana correspondente.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API.
 */
public class DiaDaSemana {

    private final LocalDate data;
    private final String diaDaSemana;

    public DiaDaSemana(LocalDate data, String diaDaSemana) {
        this.data = data;
        this.diaDaSemana = diaDaSemana;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }
}
