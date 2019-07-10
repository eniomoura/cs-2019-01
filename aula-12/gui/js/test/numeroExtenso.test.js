const funcoes = require("../diferencaDatas");

test("extraiDiferencaDaResposta", () => {
    expect(funcoes.extraiDiferencaDaResposta("{\"difference\":0}")).toBe(0);
});

test("formataData", () => {
    expect(funcoes.formataData("2019-07-09")).toBe("09/07/2019");
});

test("getRequestUrl", () => {
    expect(funcoes.getRequestUrl("09/07/2019", "09/07/2019"))
        .toBe("http://localhost:8080/ds?data1=09/07/2019&data2=09/07/2019");
});
