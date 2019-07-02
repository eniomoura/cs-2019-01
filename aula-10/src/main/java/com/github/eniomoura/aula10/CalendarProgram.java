package com.github.eniomoura.aula10;

public final class CalendarProgram {

    /** construtor private explicitando classe utilitaria. */
    private CalendarProgram() {
    }

    public static void main(final String[] args) {
        try {
            final int output = CalendarUtils.run(args);
            System.exit(output);
        } catch (IllegalArgumentException ex) {
            System.exit(GeneralUtils.EXECUTION_ERROR);
        }
    }
}
