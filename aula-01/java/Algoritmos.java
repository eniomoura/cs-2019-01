import java.util.Arrays;

public class Algoritmos {
    //MÉTODO MAIN
    public static void main(String[] args) {
        System.out.println("propriedade3025: " + propriedade3025(3025));
        System.out.println("propriedade153: " + propriedade153(153));
        System.out.println("diaDaSemana: " + diaDaSemana(11, 4, 2019));
        System.out.println("mod: " + mod(5, 3));
        System.out.println("somaNaturais: " + somaNaturais(3));
        System.out.println("fatorial: " + fatorial(3));
        System.out.println("produto: " + produto(4, 3));
        System.out.println("potencia: " + potencia(3, 3));
        System.out.println("pi: " + pi(1000000));
        System.out.println("logaritmoNatural: " + logaritmoNatural(3, 3));
        System.out.println("razaoAurea: " + razaoAurea(3, 4, 3));
        System.out.println("quadradoPerfeito: " + quadradoPerfeito(9));
        System.out.println("raiz: " + raiz(9, 3));
        System.out.println("primo: " + primo(3));
        System.out.println("crivoErastotenes: " + Arrays.toString(crivoErastotenes(new int[]{2, 3}, 2)));
        System.out.println("mdc: " + mdc(81, 54));
        System.out.println("mdc2: " + mdc2(81, 54));
        System.out.println("horner: " + horner(3, 2, 5, 6, 7));
        System.out.println("fibonacci: " + fibonacci(3));
        System.out.println("cpf: " + cpf(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
        System.out.println("cpf2: " + cpf2(new int[]{9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3}));
    }

    static Boolean propriedade3025(int n) {
        if (n <= 0 || n > 9999) {
            throw new IllegalArgumentException("Argumento Inválido");
        }

        int i = n / 100;
        int j = n % 100;
        return ((i + j) * (i + j) == n);
    }

    static Boolean propriedade153(int cdu) {
        if (100 <= cdu &&
                cdu <= 999
        ) {
            int c = cdu / 100;
            int du = cdu % 100;
            int d = du / 10;
            int u = du % 10;
            return ((c * c * c) + (d * d * d) + (u * u * u) == cdu);
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int diaDaSemana(int d, int m, int a) {
        if (1 <= d &&
                d <= 31 &&
                1 <= m &&
                m <= 12 &&
                a > 1753
        ) {
            if (m == 1 || m == 2) {
                m = m + 12;
                a = a - 1;
            }
            int s = d + (2 * m) + ((3 * (m + 1)) / 5) + a + (a / 4) - (a / 100) + (a / 400);
            return s % 7;

        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int mod(int x, int y) {
        if (0 <= y &&
                0 < x
        ) {
            int s = x;
            while (y <= s) {
                s = s - y;
            }
            return s;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int somaNaturais(int n) {
        if (0 <= n) {
            int i = 2;
            int s = 1;
            while (i <= n) {
                s = s + i;
                i = i + 1;
            }
            return s;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int fatorial(int n) {
        if (1 <= n) {
            int i = 2;
            int f = 1;
            while (i <= n) {
                f = f * i;
                i = i + 1;
            }
            return f;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int produto(int a, int b) {
        if (0 <= a &&
                0 <= b
        ) {
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
            throw new Error("Argumento Inválido");
        }
    }

    static int potencia(int x, int y) {
        if (0 < x &&
                0 <= y
        ) {
            int potencia = 1;
            int i = 1;
            while (i <= y) {
                potencia = produto(potencia, x);
                i += 1;
            }
            return potencia;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static double pi(int n) {
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
            throw new Error("Argumento Inválido");
        }
    }

    static double logaritmoNatural(int n, int k) {
        if (1 <= n &&
                2 <= k
        ) {
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
            throw new Error("Argumento Inválido");
        }
    }

    static double razaoAurea(int x, int y, int k) {
        if (
                0 <= x &&
                        x < y &&
                        0 < k
        ) {
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
            throw new Error("Argumento Inválido");
        }

    }

    static Boolean quadradoPerfeito(int n) {
        if (
                1 < n
        ) {
            int i = 1;
            int s = 1;
            while (s < n) {
                i += 2;
                s += i;
            }
            return s == n;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static double raiz(int n, int i) {
        if (
                0 < n
        ) {
            double r = 1;
            while (0 <= i) {
                r = (r + n / r) / 2;
                i = i - 1;
            }
            return r;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static Boolean primo(int n) {
        if (
                n > 1
        ) {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    return false;
                }
                i += 1;
            }
            return true;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int[] crivoErastotenes(int[] a, int n) {
        int i;
        int multiplo;
        for (i = 0; i < a.length; i++) {
            if (
                    n > 1 &&
                            !(i > 2 && i > n) ||
                            a[i] == 0
            ) {
                i = 2;
                double limite = Math.abs(Math.sqrt(n));
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
                throw new Error("Argumento Inválido");
            }
        }
        if (i == a.length + 1) {
            return a;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int mdc(int a, int b) {
        if (
                b < a &&
                        0 < b
        ) {
            while (b != 0) {
                int m = a % b;
                a = b;
                b = m;
            }
            return a;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int mdc2(int a, int b) {
        if (
                b < a &&
                        0 < b
        ) {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int horner(int... arguments) {
        int p, i;
        if (
                1 <= arguments[1]
        ) {
            p = arguments[3];
            i = arguments[1] - 1;
            while (0 <= i) {
                p *= arguments[0] + arguments[i + 2];
                i = i - 1;
            }
            return p;
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static int fibonacci(int n) {
        int a, c, t, i;
        if (
                0 <= n
        ) {
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
            throw new Error("Argumento Inválido");
        }
    }

    static Boolean cpf(int[] d) {
        int j, k, dj, dk;
        if (
                d.length == 11
        ) {
            j = d[0] + (2 * d[1]) + (3 * d[2]) + (4 * d[3]) + (5 * d[4]) + (6 * d[5]) + (7 * d[6]) + (8 * d[7]) + (9 * d[8]);
            k = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
            dj = ((j % 11) % 10);
            dk = ((k % 11) % 10);
            return (dj == d[9] && dk == d[10]);
        } else {
            throw new Error("Argumento Inválido");
        }
    }

    static Boolean cpf2(int[] d) {
        int c, p, s, j, k;
        if (
                d.length == 11
        ) {
            c = 8;
            p = d[8];
            s = d[8];
            while (0 <= c) {
                p += d[c];
                s += p;
                c -= 1;
            }
            j = ((s % 11) % 10);
            k = ((s - p + 9 * d[9]) % 11) % 10;
            return (j == d[9] && k == d[10]);
        } else {
            throw new Error("Argumento Inválido");
        }
    }
}