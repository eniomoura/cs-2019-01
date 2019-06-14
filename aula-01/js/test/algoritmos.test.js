const funcoes = require("../algoritmos");

test("3025 satisfaz (caso classico)", () => {
    expect(funcoes.propriedade3025(3025)).toBe(true);
});

test("3024 nao satisfaz", () => {
    expect(funcoes.propriedade3025(3024)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => {
        funcoes.propriedade3025();
    }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => {
        funcoes.propriedade3025("abcd");
    }).toThrow();
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcoes.propriedade3025(-1);
    }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcoes.propriedade3025(10000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcoes.propriedade3025(10.3)).toThrow(RangeError);
});

test("propriedade 153 para o 153", () => {
    expect(funcoes.propriedade153(153)).toBeTruthy();
});

test("dia da semana 11/4/2019", () => {
    expect(funcoes.diaDaSemana(11, 4, 2019)).toBe(3);
});

test("testa 5%3=2", () => {
    expect(funcoes.mod(5, 3)).toBe(2);
});

test("testa 1+2+3=6 (soma naturais)", () => {
    expect(funcoes.somaNaturais(3)).toBe(6);
});

test("testa 1*2*3=9 (fatorial)", () => {
    expect(funcoes.fatorial(3)).toBe(6);
});

test("testa 4*3=12 (produto)", () => {
    expect(funcoes.produto(4, 3)).toBe(12);
});

test("testa 3^3=27 (potencia)", () => {
    expect(funcoes.potencia(3, 3)).toBe(27);
});

test("testa geracao de pi para 1000000 iteracoes", () => {
    expect(funcoes.pi(1000000)).toBeCloseTo(3.14);
});

test("testa ln3^3 de ser próximo de 8.66", () => {
    expect(funcoes.logaritmoNatural(3, 3)).toBeCloseTo(8.66, 1);
});

test("testa valor esperado da razão aurea", () => {
    expect(funcoes.razaoAurea(3, 4, 3)).toBeCloseTo(1.63, 1);
});

test("testa se 9 é quadrado perfeito", () => {
    expect(funcoes.quadradoPerfeito(9)).toBeTruthy();
});

test("testa valor esperado da raiz de 9", () => {
    expect(funcoes.raiz(9, 3)).toBeCloseTo(3);
});

test("verifica se 3 é primo", () => {
    expect(funcoes.primo(3)).toBeTruthy();
});

test("verifica valor esperado do crivo de erastótenes", () => {
    expect(funcoes.crivoErastotenes([2, 3], 2)).toEqual([2, 3]);
});

test("verifica se 27 é o mdc entre 81 e 54 com o primeiro metodo", () => {
    expect(funcoes.mdc(81, 54)).toBe(27);
});

test("verifica se 27 é o mdc entre 81 e 54 com o segundo metodo", () => {
    expect(funcoes.mdc2(81, 54)).toBe(27);
});

test("verifica se 432 é a saída esperada para horner 3,2,5,6,7", () => {
    expect(funcoes.horner(3, 2, 5, 6, 7)).toBe(432);
});

test("verifica se 2 é o segundo numero da sequencia de fibonacci", () => {
    expect(funcoes.fibonacci(3)).toBe(2);
});

test("verifica se o cpf 930.919.850-83 é válido com o primeiro método (é)", () => {
    expect(funcoes.cpf([9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3])).toBeTruthy();
});

test("verifica se o cpf 930.919.850-83 é válido com o segundo método (é)", () => {
    expect(funcoes.cpf2([9, 3, 0, 9, 1, 9, 8, 5, 0, 8, 3])).toBeTruthy();
});
