/**
 * algoritmo 1 da lista.
 *
 * @param {number} n numero para checar a propriedade
 * @returns propriedade falsa ou verdadeira
 */
function propriedade3025(n) {
    if (0 < n && n < 9999 && Number.isInteger(n)) {
        const i = Math.floor(n / 100);
        const j = Math.floor(n % 100);
        return (i + j) * (i + j) == n;
    } else {
        throw new RangeError("Argumento Inválido");
    }
}

/**
 *  algoritmo 2 da lista.
 *
 * @param {number} cdu numero para checar a propriedade
 * @returns propriedade falsa ou verdadeira
 */
function propriedade153(cdu) {
    if (100 <= cdu && cdu <= 999) {
        let c = parseInt(cdu / 100);
        let du = parseInt(cdu % 100);
        let d = parseInt(du / 10);
        let u = parseInt(du % 10);
        return (c * c * c + d * d * d + u * u * u == cdu).toString();
    } else {
        throw new RangeError("Valor fora da faixa");
    }
}

/**
 * algoritmo 3 da lista.
 *
 * @param {number} d dia do mes (1...31)
 * @param {number} m mes (1...12)
 * @param {number} a ano (MIN_YEAR...MAX_YEAR)
 * @returns dia da semana (1...7)
 */
function diaDaSemana(d, m, a) {
    if (1 <= d && d <= 31 && 1 <= m && m <= 12 && a > 1753) {
        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }
        let s = d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400;
        return parseInt(s % 7);
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 4 da lista.
 *
 * @param {number} x numero a ser processado
 * @param {number} y limite para ser truncado o modulo
 * @returns valor limitado pelo modulo
 */
function mod(x, y) {
    if (0 <= y && 0 < x) {
        let s = x;
        while (y <= s) {
            s = s - y;
        }
        return s;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 5 da lista.
 *
 * @param {number} n quantos numeros devem ser somados
 * @returns resultado da soma
 */
function somaNaturais(n) {
    if (0 <= n) {
        let i = 2;
        let s = 1;
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 6 da lista.
 *
 * @param {number} n numero a ser levado a fatorial
 * @returns resultado da fatorial
 */
function fatorial(n) {
    if (1 <= n) {
        let i = 2;
        let f = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 *  algoritmo 7 da lista.
 *
 * @param {number} a primeiro operando do produto
 * @param {number} b segundo operando do produto
 * @returns produto de a e b
 */
function produto(a, b) {
    if (0 <= a && 0 <= b) {
        let totalParcelas = a;
        let parcela = b;
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        let i = 1;
        let s = 0;
        while (i <= totalParcelas) {
            s += parcela;
            i += 1;
        }
        return s;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 *  algoritmo 8 da lista.
 *
 * @param {number} x primeiro operando da potencia
 * @param {number} y segundo operando da potencia
 * @returns a elevado na b potencia
 */
function potencia(x, y) {
    if (0 < x && 0 <= y) {
        let potencia = 1;
        let i = 1;
        while (i <= y) {
            potencia = produto(potencia, x);
            i += 1;
        }
        return potencia;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 9 da lista.
 *
 * @param {*} n coeficiente de precisao do calculo
 * @returns aproximacao de pi
 */
function pi(n) {
    if (1 <= n) {
        let i = 1;
        let s = -1;
        let d = -1;
        let p = 0;
        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + (4 * s) / d;
            i = i + 1;
        }
        return p;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 10 da lista.
 *
 * @param {*} n valor a ser aplicado o ln
 * @param {*} k coeficiente de precisao do calculo
 * @returns aproximacao do ln(n)
 */
function logaritmoNatural(n, k) {
    if (1 <= n && 2 <= k) {
        let i = 2;
        let e = 1 + n;
        let numerador = 2;
        let denominador = 1;
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

/**
 * algoritmo 11 da lista.
 *
 * @param {*} x primeiro operando inteiro positivo
 * @param {*} y segundo operando inteiro positivo
 * @param {*} k terceiro operando inteiro positivo
 * @returns aproximacao da razao aurea baseada em x, y e k
 */
function razaoAurea(x, y, k) {
    if (0 <= x && x < y && 0 < k) {
        let c = y;
        let a = x;
        let i = 1;
        while (i <= k) {
            let t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 12 da lista.
 *
 * @param {*} n numero a verificar a propriedade
 * @returns retorna verdadeiro se a propriedade e verificada
 */
function quadradoPerfeito(n) {
    if (1 < n) {
        let i = 1;
        let s = 1;
        while (s < n) {
            i += 2;
            s += i;
        }
        return s == n;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 13 da lista.
 *
 * @param {*} n primeiro operando da radiciacao
 * @param {*} i segundo operando da radiciacao
 * @returns raiz i-esima de n
 */
function raiz(n, i) {
    if (0 < n) {
        let r = 1;
        while (0 <= i) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 14 da lista.
 *
 * @param {*} n numero a verificar a propriedade
 * @returns retorna verdadeiro se a propriedade e verificada
 */
function primo(n) {
    if (n > 1) {
        let i = 2;
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

/**
 * algoritmo 15 da lista.
 *
 * @param {*} a vetor a calcular o crivo
 * @param {*} n valor a usar como argumento para o crivo
 * @returns retorna o vetor com os numeros primos
 */
function crivoErastotenes(a, n) {
    let i;
    for (i = 0; i < a.length; i++) {
        if ((n > 1 && !(i > 2 && i > n)) || a[i] == 0) {
            i = 2;
            let limite = Math.abs(Math.sqrt(n));
            while (i <= limite) {
                if (a[i] == 0) {
                    let multiplo = i + 1;
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

/**
 * algoritmo 16 da lista.
 *
 * @param {*} a primeiro operando do mdc
 * @param {*} b segundo operando do mdc
 * @returns retorna o minimo divisor comum entre a e b
 */
function mdc(a, b) {
    if (b < a && 0 < b) {
        while (b != 0) {
            let m = a % b;
            a = b;
            b = m;
        }
        return a;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 17 da lista.
 *
 * @param {*} a primeiro operando do mdc
 * @param {*} b segundo operando do mdc
 * @returns retorna o minimo divisor comum entre a e b
 */
function mdc2(a, b) {
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
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 18 da lista.
 * @param {*} arguments coeficientes do polinomio avaliado
 * @returns resultado do somatorio de horner
 */
function horner(/*x, g, ag, ag-1, ..., a0*/) {
    if (1 <= arguments[1]) {
        let p = arguments[3];
        let i = arguments[1] - 1;
        while (0 <= i) {
            p *= arguments[0] + arguments[i + 2];
            i = i - 1;
        }
        return p;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 19 da lista.
 *
 * @param {*} n numero de iteracoes da soma de fibonacci
 * @returns n-esimo valor de fibonacci na sequencia
 */
function fibonacci(n) {
    if (0 <= n) {
        let a = 0;
        let c = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        let i = 2;
        while (i <= n) {
            let t = c;
            c += a;
            a = t;
            i += 1;
        }
        return c;
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 20 da lista.
 *
 * @param {*} d vetor contendo os numeros do cpf a ser validado
 * @returns retorna true se o cpf e valido
 */
function cpf(d) {
    if (d.length == 11) {
        let j =
            d[0] +
            2 * d[1] +
            3 * d[2] +
            4 * d[3] +
            5 * d[4] +
            6 * d[5] +
            7 * d[6] +
            8 * d[7] +
            9 * d[8];
        let k =
            d[1] +
            2 * d[2] +
            3 * d[3] +
            4 * d[4] +
            5 * d[5] +
            6 * d[6] +
            7 * d[7] +
            8 * d[8] +
            9 * d[9];
        let dj = (j % 11) % 10;
        let dk = (k % 11) % 10;
        return dj == d[9] && dk == d[10];
    } else {
        throw new Error("Argumento Inválido");
    }
}

/**
 * algoritmo 21 da lista.
 *
 * @param {*} d vetor contendo os numeros do cpf a ser validado
 * @returns retorna true se o cpf e valido
 */
function cpf2(d) {
    if (d.length == 11) {
        let c = 8;
        let p = d[8];
        let s = d[8];
        while (0 <= c) {
            p += d[c];
            s += p;
            c -= 1;
        }
        let j = (s % 11) % 10;
        let k = ((s - p + 9 * d[9]) % 11) % 10;
        return j == d[9] && k == d[10];
    } else {
        throw new Error("Argumento Inválido");
    }
}

module.exports = {
    propriedade3025,
    cpf,
    cpf2,
    crivoErastotenes,
    diaDaSemana,
    fatorial,
    fibonacci,
    horner,
    logaritmoNatural,
    mdc,
    mdc2,
    mod,
    pi,
    potencia,
    primo,
    produto,
    propriedade153,
    quadradoPerfeito,
    raiz,
    razaoAurea,
    somaNaturais
};
