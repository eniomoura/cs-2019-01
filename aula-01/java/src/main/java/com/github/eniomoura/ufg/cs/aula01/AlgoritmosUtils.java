/**
 *
 *
 * @author Enio Moura
 */

package com.github.eniomoura.ufg.cs.aula01;
import java.math.BigDecimal;

/**
 * Classe contendo os algoritmos listados para implementação.
 * Os algoritmos podem ser encontrados em:
 * https://drive.google.com/file/d/1zCxtSyjkEvF6T3ieJ0r3_BJii9kx-FMI/view
 */
final class AlgoritmosUtils {
    // region CONSTANTES
    /** constante definindo maior numero de 4 casas. */
    static final int MAX_4_CASAS = 9999;
    /** constante definindo maior numero de 3 casas. */
    static final int MAX_3_CASAS = 999;
    /** constante definindo numero do mes de dezembro. */
    static final int DEZEMBRO = 12;
    /** constante definindo o tamanho de um CPF. */
    static final int CPF_LENGTH = 11;
    /** constante definindo o numero maximo de dias em um mes. */
    static final int MAX_DAYS_OF_MONTH = 31;
    /** constante definindo o numero maximo de dias em um mes. */
    static final int MAX_DAYS_OF_WEEK = 7;
    /** constante definindo o ano minimo valido para o programa. */
    static final int MIN_YEAR = 1753;
    /** mensagem de erro para argumentos invalidos. */
    static final String ILLEGAL_ARG_MSG = "Argumento Inválido";
    // endregion

    // region MÉTODO MAIN
    /**
     * Ponto de entrada do programa.
     *
     * @param args : parâmetros de CLI
     */
    public static void main(final String[] args) {
    }
    // endregion

    // region AlgoritmosUtils

    /** construtor private explicitando classe utilitaria. */
    private AlgoritmosUtils() {
    }

    /**
     * algoritmo 1 da lista.
     *
     * @param n numero para checar a propriedade
     * @return propriedade falsa ou verdadeira
     */
    static boolean propriedade3025(final int n) {
        if (n <= 0 || n > MAX_4_CASAS) {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }

        final int i = n / 100;
        final int j = n % 100;
        return (i + j) * (i + j) == n;
    }

    /**
     * algoritmo 2 da lista.
     *
     * @param cdu numero para checar a propriedade
     * @return propriedade falsa ou verdadeira
     */
    static boolean propriedade153(final int cdu) {
        final int minValue = 100;
        if (minValue <= cdu && cdu <= MAX_3_CASAS) {
            final int c = cdu / 100;
            final int du = cdu % 100;
            final int d = du / 10;
            final int u = du % 10;
            return (c * c * c) + (d * d * d) + (u * u * u) == cdu;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 3 da lista.
     *
     * @param d dia do mes (1...31)
     * @param m mes (1...12)
     * @param a ano (MIN_YEAR...MAX_YEAR)
     * @return dia da semana (1...7)
     */
    static int diaDaSemana(final int d, final int m, final int a) {
        validaDiaDaSemana(d, m, a);
        int localM = m;
        int localA = a;
        if (localM == 1 || localM == 2) {
            localM = localM + DEZEMBRO;
            localA -= 1;
        }
        final int s = d + (2 * localM) + ((3 * (localM + 1)) / 5) + localA + (localA / 4) - (localA / 100)
                + (localA / 400);
        return s % MAX_DAYS_OF_WEEK;
    }

    /**
     * algoritmo 4 da lista.
     *
     * @param x numero a ser processado
     * @param y limite para ser truncado o modulo
     * @return valor limitado pelo modulo
     */
    static int mod(final int x, final int y) {
        if (0 <= y && 0 < x) {
            int s = x;
            while (y <= s) {
                s = s - y;
            }
            return s;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 5 da lista.
     *
     * @param n quantos numeros devem ser somados
     * @return resultado da soma
     */
    static int somaNaturais(final int n) {
        if (0 <= n) {
            int i = 2;
            int s = 1;
            while (i <= n) {
                s += i;
                i = i + 1;
            }
            return s;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 6 da lista.
     *
     * @param n numero a ser levado a fatorial
     * @return resultado da fatorial
     */
    static int fatorial(final int n) {
        final boolean validInput = 1 <= n;
        if (validInput) {
            int i = 2;
            int f = 1;
            while (i <= n) {
                f *= i;
                i = i + 1;
            }
            return f;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 7 da lista.
     * @param a primeiro operando do produto
     * @param b segundo operando do produto
     * @return produto de a e b
     */
    static int produto(final int a, final int b) {
        int totalParcelas;
        int parcela;
        if (0 <= a && 0 <= b) {
            if (b < a) {
                totalParcelas = b;
                parcela = a;
            } else {
                totalParcelas = a;
                parcela = b;
            }
            int i = 1;
            int s = 0;
            while (i <= totalParcelas) {
                s += parcela;
                i += 1;
            }
            return s;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 8 da lista.
     * @param x primeiro operando da potencia
     * @param y segundo operando da potencia
     * @return a elevado na b potencia
     */
    static int potencia(final int x, final int y) {
        if (0 < x && 0 <= y) {
            final int inicial = 1;
            int potencia = inicial;
            int i = inicial;
            while (i <= y) {
                if (potencia == inicial) {
                    potencia = produto(1, x);
                } else {
                    potencia = produto(potencia, x);
                }
                i += 1;
            }
            return potencia;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 9 da lista.
     * @param n coeficiente de precisao do calculo
     * @return aproximacao de pi
     */
    static double pi(final int n) {
        final boolean validInput = 1 <= n;
        if (validInput) {
            double i = 1;
            double s = -1;
            double d = -1;
            double p = 0;
            final int numerador = 4;
            while (i <= n) {
                d += 2;
                s *= -1;
                p += numerador * s / d;
                i += 1;
            }
            return p;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 10 da lista.
     * @param n valor a ser aplicado o ln
     * @param k coeficiente de precisao do calculo
     * @return aproximacao do ln(n)
     */
    static double logaritmoNatural(final int n, final int k) {
        if (1 <= n && 2 <= k) {
            double i = 2;
            double e = 1 + n;
            double numerador = 2;
            double denominador = 1;
            while (i <= k) {
                numerador *= numerador;
                denominador *= i;
                e += numerador / denominador;
                i = i + 1;
            }
            return e;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 11 da lista.
     * @param x primeiro operando inteiro positivo
     * @param y segundo operando inteiro positivo
     * @param k terceiro operando inteiro positivo
     * @return aproximacao da razao aurea baseada em x, y e k
     */
    static double razaoAurea(final int x, final int y, final int k) {
        validaRazaoAurea(x, y, k);
        double c = y;
        double a = x;
        double i = 1;
        double t;
        while (i <= k) {
            t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    }

    /**
     * algoritmo 12 da lista.
     * @param n numero a verificar a propriedade
     * @return retorna verdadeiro se a propriedade e verificada
     */
    static Boolean quadradoPerfeito(final int n) {
        final boolean validInput = 1 < n;
        if (validInput) {
            int i = 1;
            int s = 1;
            while (s < n) {
                i += 2;
                s += i;
            }
            return s == n;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 13 da lista.
     * @param n primeiro operando da radiciacao
     * @param i segundo operando da radiciacao
     * @return raiz i-esima de n
     */
    static double raiz(final int n, final int i) {
        int localI = i;
        if (0 < n) {
            double r = 1;
            while (0 <= localI) {
                final boolean rInicial = new BigDecimal(Double.toString(r)).compareTo(new BigDecimal("1")) == 0;
                if (rInicial) {
                    r = new BigDecimal((1 + n / 1) / 2).doubleValue();
                } else {
                    r = (r + n / r) / (double) 2;
                }
                localI = localI - 1;
            }
            return r;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 14 da lista.
     * @param n numero a verificar a propriedade
     * @return retorna verdadeiro se a propriedade e verificada
     */
    static Boolean primo(final int n) {
        final boolean validInput = n > 1;
        if (validInput) {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    return false;
                }
                i += 1;
            }
            return true;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 15 da lista.
     * @param a vetor a calcular o crivo
     * @param n valor a usar como argumento para o crivo
     * @return retorna o vetor com os numeros primos
     */
    static int[] crivoErastotenes(final int[] a, final int n) {
        validaCrivo(a, n);
        int multiplo;
        int i = 1;
        while (i <= Math.sqrt(n)) {
            if (a[i] == 0) {
                multiplo = i + 1;
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + 1;
                }
            }
            i = i + 1;
        }
        return a;
    }

    /**
     * algoritmo 16 da lista.
     * @param a primeiro operando do mdc
     * @param b segundo operando do mdc
     * @return retorna o minimo divisor comum entre a e b
     */
    static int mdc(final int a, final int b) {
        int localA = a;
        int localB = b;
        if (localB < localA && 0 < localB) {
            while (localB != 0) {
                final int m = localA % localB;
                localA = localB;
                localB = m;
            }
            return localA;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 17 da lista.
     * @param a primeiro operando do mdc
     * @param b segundo operando do mdc
     * @return retorna o minimo divisor comum entre a e b
     */
    static int mdc2(final int a, final int b) {
        int localA = a;
        int localB = b;
        if (localB < localA && 0 < localB) {
            while (localA != localB) {
                if (localA > localB) {
                    localA = localA - localB;
                } else {
                    localB = localB - localA;
                }
            }
            return localA;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 18 da lista.
     * @param arguments coeficientes do polinomio avaliado
     * @return resultado do somatorio de horner
     */
    static int horner(final int... arguments) {
        int p,
            i;
        final int minArguments = 5;
        final boolean validaInput = arguments.length >= minArguments && 1 <= arguments[1];
        if (validaInput) {
            p = arguments[2];
            i = arguments[1] - 1;
            while (0 <= i) {
                p *= arguments[0] + arguments[i + 2];
                i = i - 1;
            }
            return p;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 19 da lista.
     * @param n numero de iteracoes da soma de fibonacci
     * @return n-esimo valor de fibonacci na sequencia
     */
    static int fibonacci(final int n) {
        int a,
            c,
            t,
            i;
        if (0 <= n) {
            a = 0;
            c = 1;
            if (n == 0 || n == 1) {
                return n;
            }
            i = 2;
            while (i <= n) {
                t = c;
                c += a;
                a = t;
                i += 1;
            }
            return c;
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 20 da lista.
     * @param d vetor contendo os numeros do cpf a ser validado
     * @return retorna true se o cpf e valido
     */
    static Boolean cpf(final int[] d) {
        if (d.length == CPF_LENGTH) {
            final int j = d[0] + (2 * d[1]) + (3 * d[2])
                  + (4 * d[3]) + (5 * d[4]) + (6 * d[5])
                  + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
            final int k = d[1] + (2 * d[2]) + (3 * d[3])
                  + (4 * d[4]) + (5 * d[5]) + (6 * d[6])
                  + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
            final int dj = (j % CPF_LENGTH) % 10;
            final int dk = (k % CPF_LENGTH) % 10;
            return dj == d[9] && dk == d[10];
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * algoritmo 21 da lista.
     * @param d vetor contendo os numeros do cpf a ser validado
     * @return retorna true se o cpf e valido
     */
    static Boolean cpf2(final int[] d) {
        int c;
        int p;
        int s;
        final int j;
        final int k;
        if (d.length == CPF_LENGTH) {
            c = 8;
            p = d[8];
            s = d[8];
            while (0 <= c) {
                p += d[c];
                s += p;
                c -= 1;
            }
            j = (s % CPF_LENGTH) % 10;
            k = ((s - p + 9 * d[9]) % CPF_LENGTH) % 10;
            return j == d[9] && k == d[10];
        } else {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }
    // endregion

    // region Validações
    /**
     * joga uma IllegalArgumentException se a data informada for invalida.
     * @param d dia do mes
     * @param m mes (1...12)
     * @param a ano (MIN_YEAR...MAX_YEAR)
     */
    static void validaDiaDaSemana(final int d, final int m, final int a) {
        if (d < 1 || d > MAX_DAYS_OF_MONTH || m < 1 || m > DEZEMBRO && a < MIN_YEAR) {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * verifica se a entrada da razao aurea e valida.
     * @param x primeiro operando inteiro positivo
     * @param y segundo operando inteiro positivo
     * @param k terceiro operando inteiro positivo
     */
    static void validaRazaoAurea(final int x, final int y, final int k) {
        if (!(0 <= x && x < y && 0 < k)) {
            throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
        }
    }

    /**
     * verifica se a entrada do crivo de erastotenes e valido.
     * @param a vetor a calcular o crivo
     * @param n valor a usar como argumento para o crivo
     */
    static void validaCrivo(final int[] a, final int n) {
        for (int i = 0; i < a.length; i++) {
            if (!(n > 1 && !(i > 2 && i > n) || a[i] == 0)) {
                throw new IllegalArgumentException(ILLEGAL_ARG_MSG);
            }
        }
    }

    // endregion

}
