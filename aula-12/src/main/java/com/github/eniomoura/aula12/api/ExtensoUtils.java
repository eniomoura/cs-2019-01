package com.github.eniomoura.aula12.api;

/** Classe utilitária com funções de manipulação de datas. */
public final class ExtensoUtils {

    private static int milhar;
    private static int centena;
    private static int dezena;
    private static int unidade;

    /** Construtor privado para explicitar classe utilitária. */
    private ExtensoUtils() {
    }

    /** Método recebe um número inteiro, e retorna uma
     * string com o número escrito por extenso.
     * @param numero Um número inteiro.
     * @return Uma string com o número escrito em extenso.
     */
    public static String writeInFull(final int numero){
        milhar = (numero / 1000) % 10;
        centena = (numero / 100) % 10;
        dezena = (numero / 10) % 10;
        unidade = numero % 10;
        String extenso = "";
        if(getEspeciais(numero)==null){
            if(numero == 0){
                return "zero";
            }else if (numero > 0 && numero < 10) {
                extenso = getUnidade(numero);
            }else if(numero < 100 && numero > 9) {
                return assembleDoisDigitos(numero);
            }else if (numero < 1000 && numero > 99) {
                return assembleTresDigitos(numero);
            }else if(numero < 10000 && numero>=1000){
                return assembleQuatroDigitos(numero);
            }else{
                throw new IllegalArgumentException(
                    "O número inserido deve estar entre 0 e 1000.");
                }
        }else{
            return getEspeciais(numero);
        }

		return extenso;
    }

    public static String assembleDoisDigitos(final int numero){
        if (unidade == 0) {
            return getDezena(numero);
        } else {
            return getDezena(numero) + " e" + getUnidade(numero);
        }
    }

    public static String assembleTresDigitos(final int numero){
        if (dezena == 1) {
            return getCentena(numero) + " e" + getEspeciais(numero%100);
        }else if (dezena == 0) {
            return getCentena(numero) + " e" + getUnidade(numero);
        } else if (unidade == 0) {
            if(getDezena(numero)==null){
                return getCentena(numero) + " e" + getEspeciais(unidade);
            }else{
                return getCentena(numero) + " e" + getDezena(numero);
            }
        } else {
            return getCentena(numero) + " e" + getDezena(numero) + " e"
                + getUnidade(numero);
        }
    }

    public static String assembleQuatroDigitos(final int numero){
        if (centena == 0 && dezena == 0 && unidade == 0) { //2000
            return getMilhar(numero);
        } else if (getEspeciais(numero%1000)!=null) { //2100
            return getMilhar(numero) + " e" + getEspeciais(numero%1000);
        } else if (getEspeciais(numero%100)!=null) { //22
            return getMilhar(numero) + getCentena(numero) + " e" + getEspeciais(numero%100);
        } else if (centena == 0 && dezena == 0) { //2002
            return getMilhar(numero) + " e" + getUnidade(numero);
        } else if (centena == 0 && unidade == 0) { //2020
            return getMilhar(numero) + " e" + getDezena(numero);
        } else if (dezena == 0 && unidade == 0) { //2200
            return getMilhar(numero) + " e" + getCentena(numero);
        } else if (centena == 0) { //2022
            return getMilhar(numero) + " e" + getDezena(numero) + " e" + getUnidade(numero);
        } else if (dezena == 0) { //2202
            return getMilhar(numero) + getCentena(numero) + " e" + getUnidade(numero);
        } else if (unidade == 0) { //2220
            return getMilhar(numero) + getCentena(numero) + " e" + getDezena(numero);
        } else { //2222
            return getMilhar(numero) + getCentena(numero) + " e" + getDezena(numero) + " e" + getUnidade(numero);
        }
    }

    public static String getEspeciais(final int numero){
        switch (numero) {
        case 10:
            return " dez";
        case 11:
            return " onze";
        case 12:
            return " doze";
        case 13:
            return " treze";
        case 14:
            return " quatorze";
        case 15:
            return " quinze";
        case 16:
            return " dezesseis";
        case 17:
            return " dezessete";
        case 18:
            return " dezoito";
        case 19:
            return " dezenove";
        case 100:
            return " cem";
        default:
            return null;
        }
    }

    public static String getMilhar(final int numero){
		switch (milhar) {
		case 0:
			return " ";
		case 1:
			return " mil";
		case 2:
			return " dois mil";
		case 3:
			return " três mil";
		case 4:
			return " quatro mil";
		case 5:
			return " cinco mil";
		case 6:
			return " seis mil";
		case 7:
			return " sete mil";
		case 8:
			return " oito mil";
		case 9:
			return " nove mil";
        default:
            return null;
		}
    }
    
    public static String getCentena(final int numero){
		switch (centena) {
		case 1:
			return " cento";
		case 2:
			return " duzentos";
		case 3:
			return " trezentos";
		case 4:
			return " quatrocentos";
		case 5:
			return " quinhentos";
		case 6:
			return " seissentos";
		case 7:
			return " setecentos";
		case 8:
			return " oitocentos";
		case 9:
			return " novecentos";
        default:
            return null;
		}
    }
    
    public static String getDezena(final int numero){
        switch (dezena) {
        case 2:
            return " vinte";
        case 3:
            return " trinta";
        case 4:
            return " quarenta";
        case 5:
            return " cinquenta";
        case 6:
            return " sessenta";
        case 7:
            return " setenta";
        case 8:
            return " oitenta";
        case 9:
            return " noventa";
        default:
            return null;
        }
    }
    
    public static String getUnidade(final int numero){
        switch (unidade) {
        case 0:
            return " zero";
        case 1:
            return " um";
        case 2:
            return " dois";
        case 3:
            return " três";
        case 4:
            return " quatro";
        case 5:
            return " cinco";
        case 6:
            return " seis";
        case 7:
            return " sete";
        case 8:
            return " oito";
        case 9:
            return " nove";
        default:
            return null;
        }
    }
}