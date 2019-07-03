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
    expect(funcoes.countChars('abca')).toBe(4);
});

test("palavra mais frequente", () => {
    expect(funcoes.mostFrequentWord("ana banana gosta de banana")).toBe("banana");
});

test("numeros mais frequentes", () => {
    expect(funcoes.mostFrequentNumbers(10)[0]).toBeLessThan(10);
});