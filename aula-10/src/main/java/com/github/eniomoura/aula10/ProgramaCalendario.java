package com.github.eniomoura.aula10;

public final class ProgramaCalendario {

    public static final int EXECUTION_ERROR = -1;

    /** construtor private explicitando classe utilitaria. */
    private ProgramaCalendario() {
    }

    public static void main(final String[] args) {
        try {
            final int output = CalendarioUtils.executar(args);
            System.exit(output);
        } catch (IllegalArgumentException ex) {
            System.exit(EXECUTION_ERROR);
        }
    }
}
