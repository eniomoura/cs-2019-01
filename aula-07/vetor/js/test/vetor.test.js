const funcoes = require("../vetor");

test("teste menor temperatura", () => {
    expect(funcoes.menorTemperatura([1, 2, 3]).toBe(1));
});

test("teste soma impares", () => {
    expect(funcoes.somaImpares([1, 2, 3])).toBe(4);
});

test("teste valores iguais", () => {
    expect(funcoes.numValoresIguais([1, 2, 3], 2)).toBe(1);
});
