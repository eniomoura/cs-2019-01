const funcoes = require("../vetor");

test("teste menor temperatura", () => {
    expect(funcoes.lesserTemperature([1, 2, 3])).toBe(1);
});

test("teste soma impares", () => {
    expect(funcoes.oddSum([1, 2, 3])).toBe(4);
});

test("teste valores iguais", () => {
    expect(funcoes.equalValueCount([1, 2, 3], 2)).toBe(1);
});

test("contar letras", () => {
    expect(funcoes.countChars([1, 2, 3], 2)).toBe(1);
});
