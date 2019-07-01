package com.github.eniomoura.aula10;

import com.github.eniomoura.aula10.Calendario;

public final class ProgramaCalendario {

    /** construtor private explicitando classe utilitaria. */
    private ProgramaCalendario() {
    }

    public static void main(final String[] args) {

        logger.info("iniciado");
        System.out.println(Calendario.diaDaSemanaParaHoje());;
    }

}
