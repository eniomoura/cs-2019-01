package com.github.eniomoura.aula12.api;

import java.util.AbstractMap;
import java.util.Map;

/** Classe utilitária com funções de manipulação de datas. */
public final class ExtensoUtils {

    /** Dígito mais dominante do número inserido. */
    private static int milhar;
    /** Segundo dígito mais dominante do número inserido. */
    private static int centena;
    /** Terceiro dígito mais dominante do número inserido. */
    private static int dezena;
    /** Quarto dígito mais dominante do número inserido. */
    private static int unidade;

    /** Lista de nomes por extenso para unidades. */
    private static final Map<Integer, String> UNIDADES = Map.of(
        1, " um",
        2, " dois",
        3, " três",
        4, " quatro",
        5, " cinco",
        6, " seis",
        7, " sete",
        8, " oito",
        9, " nove"
    );

    /** Lista de nomes por extenso para dezenas. */
    private static final Map<Integer, String> DEZENAS = Map.of(
        2, " vinte",
        3, " trinta",
        4, " quarenta",
        5, " cinquenta",
        6, " sessenta",
        7, " setenta",
        8, " oitenta",
        9, " noventa"
    );

    /** Lista de nomes por extenso para centenas. */
    private static final Map<Integer, String> CENTENAS = Map.of(
        1, " cento",
        2, " duzentos",
        3, " trezentos",
        4, " quatrocentos",
        5, " quinhentos",
        6, " seissentos",
        7, " setecentos",
        8, " oitocentos",
        9, " novecentos"
    );

    /** Lista de nomes por extenso para milhares. */
    private static final Map<Integer, String> MILHARES = Map.of(
        1, " mil",
        2, " dois mil",
        3, " três mil",
        4, " quatro mil",
        5, " cinco mil",
        6, " seis mil",
        7, " sete mil",
        8, " oito mil",
        9, " nove mil"
    );

    /**
     * Lista de nomes por extenso para números com
     * pronúncia por extenso diferentes do padrão.
     */
    private static final Map<Integer, String> ESPECIAIS = Map.ofEntries(
        new AbstractMap.SimpleEntry<>(10, " dez"),
        new AbstractMap.SimpleEntry<>(11, " onze"),
        new AbstractMap.SimpleEntry<>(12, " doze"),
        new AbstractMap.SimpleEntry<>(13, " treze"),
        new AbstractMap.SimpleEntry<>(14, " quatorze"),
        new AbstractMap.SimpleEntry<>(15, " quinze"),
        new AbstractMap.SimpleEntry<>(16, " dezesseis"),
        new AbstractMap.SimpleEntry<>(17, " dezessete"),
        new AbstractMap.SimpleEntry<>(18, " dezoito"),
        new AbstractMap.SimpleEntry<>(19, " dezenove"),
        new AbstractMap.SimpleEntry<>(100, " cem")
    );

    /** Construtor privado para explicitar classe utilitária. */
    private ExtensoUtils() {
    }

    /**
     * Método recebe um número inteiro, e retorna uma string
     * com o número escrito por extenso.
     * @param numero Um número inteiro.
     * @return Uma string com o número escrito em extenso.
     */
    public static String writeInFull(final int numero) {
        milhar = (numero / 1000) % 10;
        centena = (numero / 100) % 10;
        dezena = (numero / 10) % 10;
        unidade = numero % 10;
        if (getEspeciais(numero) == null) {
            if (numero == 0) {
                return "zero";
            } else if (numero > 0 && numero < 10_000) {
                return assembleString(numero);
            } else {
                throw new IllegalArgumentException(
                    "O número inserido deve estar entre 0 e 1000.");
            }
        } else {
            return getEspeciais(numero);
        }
    }

    /**
     * Método que monta a string a ser retornada pela requisição.
     * @param numero o número a ser retornado por extenso.
     * @return O número por extenso.
     */
    public static String assembleString(final int numero) {
        final int rangeUnidades = 9;
        final int rangeCentenas = 99;
        final int mil = 1000;
        if (numero <= rangeUnidades) {
            return getUnidade();
        } else if (numero <= rangeCentenas && numero > rangeUnidades) {
            return assembleDoisDigitos(numero);
        } else if (numero < mil && numero > rangeCentenas) {
            return assembleTresDigitos(numero);
        } else if (numero >= mil) {
            return assembleQuatroDigitos(numero);
        }
        throw new IllegalArgumentException(
            "O número inserido deve estar entre 0 e 1000.");
    }

    /**
     * Método retorna um número por extenso, se ele tiver dois dígitos.
     * @param numero o número de dois dígitos a ser retornado por extenso.
     * @return o número por extenso.
     */
    public static String assembleDoisDigitos(final int numero) {
        if (unidade == 0) {
            return getDezena();
        } else {
            return getDezena() + " e" + getUnidade();
        }
    }

    /**
     * Método retorna um número por extenso, se ele tiver três dígitos.
     * @param numero o número de três dígitos a ser retornado por extenso.
     * @return o número por extenso.
     */
    public static String assembleTresDigitos(final int numero) {
        final int um = 1;
        if (dezena == um) {
            return getCentena() + " e" + getEspeciais(numero % 100);
        } else if (dezena == 0) {
            if (unidade == 0) {
                return getCentena();
            } else {
                return getCentena() + " e" + getUnidade();
            }
        } else if (unidade == 0) {
            if (getDezena() == null) {
                return getCentena() + " e" + getEspeciais(unidade);
            } else {
                return getCentena() + " e" + getDezena();
            }
        } else {
            return getCentena() + " e" + getDezena() + " e" + getUnidade();
        }
    }

    /**
     * Método retorna um número por extenso, se ele tiver quatro dígitos.
     * @param numero o número de quatro dígitos a ser retornado por extenso.
     * @return o número por extenso.
     */
    public static String assembleQuatroDigitos(final int numero) {
        if (centena == 0 && dezena == 0 && unidade == 0) {
            return getMilhar();
        } else if (getEspeciais(numero % 1000) != null) {
            return getMilhar() + " e" + getEspeciais(numero % 1000);
        } else if (getEspeciais(numero % 100) != null) {
            return getMilhar() + getCentena() + " e"
                + getEspeciais(numero % 100);
        } else if (centena == 0 && dezena == 0) {
            return getMilhar() + " e" + getUnidade();
        } else if (centena == 0 && unidade == 0) {
            return getMilhar() + " e" + getDezena();
        } else if (dezena == 0 && unidade == 0) {
            return getMilhar() + " e" + getCentena();
        } else if (centena == 0) {
            return getMilhar() + " e" + getDezena() + " e" + getUnidade();
        } else if (dezena == 0) {
            return getMilhar() + getCentena() + " e" + getUnidade();
        } else if (unidade == 0) {
            return getMilhar() + getCentena() + " e" + getDezena();
        } else {
            return getMilhar() + getCentena() + " e" + getDezena()
                + " e" + getUnidade();
        }
    }

    /**
     * Método retorna o valor por extenso de um número não-padrão.
     * @param numero número não padrão (11, 12, 100)
     * @return o valor por extenso.
     */
    public static String getEspeciais(final int numero) {
        return ESPECIAIS.get(numero);
    }

    /**
     * Método retorna o valor por extenso de um componente módulo
     * de 1000 do número processado.
     * @return o valor por extenso.
     */
    public static String getMilhar() {
        return MILHARES.get(milhar);
    }

    /**
     * Método retorna o valor por extenso de um componente módulo
     * de 100 do número processado.
     * @return o valor por extenso.
     */
    public static String getCentena() {
        return CENTENAS.get(centena);
    }

    /**
     * Método retorna o valor por extenso de um componente módulo
     * de 10 do número processado.
     * @return o valor por extenso.
     */
    public static String getDezena() {
        return DEZENAS.get(dezena);
    }

    /**
     * Método retorna o valor por extenso do dígito menos significante do número
     * processado.
     * @return o valor por extenso.
     */
    public static String getUnidade() {
        return UNIDADES.get(unidade);
    }
}