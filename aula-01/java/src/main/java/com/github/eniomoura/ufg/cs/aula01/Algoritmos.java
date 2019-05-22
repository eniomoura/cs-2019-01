package com.github.eniomoura.ufg.cs.aula01;

final class Algoritmos {
    //region MÉTODO MAIN
    public static void main(final String[] args) {
    }
    //endregion

    //region Algoritmos

    static final int MAX_4_CASAS = 9999;
    static final int MAX_3_CASAS = 999;
    static final int DEZEMBRO = 12;
    static final int QUATROCENTOS = 400;
    static final int CPF_LENGTH = 11;
    static final int MAX_DAYS_OF_MONTH = 31;
    static final int MIN_YEAR = 1753;

    private Algoritmos() {
    }

    static boolean propriedade3025(final int n) {
        if (n <= 0 || n > MAX_4_CASAS) {
            throw new IllegalArgumentException("Argumento Inválido");
        }

        final int i = n / 100;
        final int j = n % 100;
        return ((i + j) * (i + j) == n);
    }

    static Boolean propriedade153(final int cdu) {
        if (100 <= cdu && cdu <= MAX_3_CASAS) {
            final int c = cdu / 100;
            final int du = cdu % 100;
            final int d = du / 10;
            final int u = du % 10;
            return ((c * c * c) + (d * d * d) + (u * u * u) == cdu);
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int diaDaSemana(final int d, int m, int a) {
        validaDiaDaSemana(d, m, a);
        if (m == 1 || m == 2) {
            m = m + DEZEMBRO;
            a = a - 1;
        }
        final int s = d + (2 * m) + ((3 * (m + 1)) / 5) +
                a + (a / 4) - (a / 100) + (a / QUATROCENTOS);
        return s % 7;
    }

    static int mod(final int x, final int y) {
        if (0 <= y && 0 < x) {
            int s = x;
            while (y <= s) {
                s = s - y;
            }
            return s;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int somaNaturais(final int n) {
        if (0 <= n) {
            int i = 2;
            int s = 1;
            while (i <= n) {
                s = s + i;
                i = i + 1;
            }
            return s;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int fatorial(final int n) {
        if (1 <= n) {
            int i = 2;
            int f = 1;
            while (i <= n) {
                f = f * i;
                i = i + 1;
            }
            return f;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int produto(final int a, final int b) {
        if (0 <= a && 0 <= b) {
            int totalParcelas = a;
            int parcela = b;
            if (b < a) {
                totalParcelas = b;
                parcela = a;
            }
            int i = 1;
            int s = 0;
            while (i <= totalParcelas) {
                s += parcela;
                i += 1;
            }
            return s;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int potencia(final int x, final int y) {
        if (0 < x && 0 <= y) {
            int potencia = 1;
            int i = 1;
            while (i <= y) {
                potencia = produto(potencia, x);
                i += 1;
            }
            return potencia;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static double pi(final int n) {
        if (1 <= n) {
            double i = 1;
            double s = -1;
            double d = -1;
            double p = 0;
            while (i <= n) {
                d = d + 2;
                s = -1 * s;
                p = p + 4 * s / d;
                i = i + 1;
            }
            return p;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static double logaritmoNatural(final int n, final int k) {
        if (1 <= n && 2 <= k) {
            double i = 2;
            double e = 1 + n;
            double numerador = 2;
            double denominador = 1;
            while (i <= k) {
                numerador = numerador * numerador;
                denominador = denominador * i;
                e = e + numerador / denominador;
                i = i + 1;
            }
            return e;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static double razaoAurea(final int x, final int y, final int k) {
        if (0 <= x && x < y && 0 < k) {
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
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static Boolean quadradoPerfeito(final int n) {
        if (1 < n) {
            int i = 1;
            int s = 1;
            while (s < n) {
                i += 2;
                s += i;
            }
            return s == n;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static double raiz(final int n, int i) {
        if (0 < n) {
            double r = 1;
            while (0 <= i) {
                r = (r + n / r) / 2;
                i = i - 1;
            }
            return r;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static Boolean primo(final int n) {
        if (n > 1) {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    return false;
                }
                i += 1;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int[] crivoErastotenes(final int[] a, final int n) {
        int i;
        int multiplo;
        for (i = 0; i < a.length; i++) {
            if (n > 1 && !(i > 2 && i > n) || a[i] == 0) {
                i = 2;
                final double limite = Math.abs(Math.sqrt(n));
                while (i <= limite) {
                    if (a[i] == 0) {
                        multiplo = i + 1;
                        while (multiplo <= n) {
                            a[multiplo] = 1;
                            multiplo = multiplo + 1;
                        }
                    }
                    i = i + 1;
                }
            } else {
                throw new IllegalArgumentException("Argumento Inválido");
            }
        }
        if (i == a.length + 1) {
            return a;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int mdc(int a, int b) {
        if (b < a && 0 < b) {
            while (b != 0) {
                final int m = a % b;
                a = b;
                b = m;
            }
            return a;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int mdc2(int a, int b) {
        if (b < a && 0 < b) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static int horner(final int... arguments) {
        // TODO verificar se argumentos fornecidos conforme exigência
        int p,
                i;
        if (1 <= arguments[1]) {
            p = arguments[3];
            i = arguments[1] - 1;
            while (0 <= i) {
                p *= arguments[0] + arguments[i + 2];
                i = i - 1;
            }
            return p;
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

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
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static Boolean cpf(final int[] d) {
        if (d.length == CPF_LENGTH) {
            final int j = d[0] + (2 * d[1]) + (3 * d[2])
                  + (4 * d[3]) + (5 * d[4]) + (6 * d[5])
                  + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
            final int k = d[1] + (2 * d[2]) + (3 * d[3])
                  + (4 * d[4]) + (5 * d[5]) + (6 * d[6])
                  + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
            final int dj = ((j % CPF_LENGTH) % 10);
            final int dk = ((k % CPF_LENGTH) % 10);
            return (dj == d[9] && dk == d[10]);
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

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
            j = ((s % CPF_LENGTH) % 10);
            k = ((s - p + 9 * d[9]) % CPF_LENGTH) % 10;
            return (j == d[9] && k == d[10]);
        } else {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }
    //endregion

    //region Validações

    static void validaDiaDaSemana(final int d, final int m, final int a) {
        if (d < 1 || d > MAX_DAYS_OF_MONTH) {
            if (m < 1 || m > DEZEMBRO) {
                if (a < MIN_YEAR) {
                    throw new IllegalArgumentException("Argumento Inválido");
                }
            }
        }
    }

    static void validaRazaoAurea(final int x, final int y, final int k) {
        if (0 <= x && x < y && 0 < k) {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static void validaCrivo(final int[] a, final int n) {
        int i;
        int multiplo;
        for (i = 0; i < a.length; i++) {
            if (n > 1 && !(i > 2 && i > n) || a[i] == 0) {
                i = 2;
                final double limite = Math.abs(Math.sqrt(n));
                while (i <= limite) {
                    if (a[i] == 0) {
                        multiplo = i + 1;
                        while (multiplo <= n) {
                            a[multiplo] = 1;
                            multiplo = multiplo + 1;
                        }
                    }
                    i = i + 1;
                }
            } else {
                throw new IllegalArgumentException("Argumento Inválido");
            }
        }
        if (i != a.length + 1) {
            throw new IllegalArgumentException("Argumento Inválido");
        }
    }

    static void validaHorner(final int... arguments) {
        // TODO implementar esse algoritmo
    }

    //endregion

}
