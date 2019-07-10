/** Path para a requisição (URL) */
const PATH = "http://localhost:8080/ds";

/** Executa uma requisição XMLHTTP e calcula via Spring Boot
 * a diferença entre duas datas calculada no programa Java.
 * Após calculado, o valor é colocado no campo de resultado. */
function atualizaDiferencaDatas() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiDiferencaDaResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = dds;
        }
    };
    let data1 = formataData(document.getElementById("data1").value);
    let data2 = formataData(document.getElementById("data2").value);
    xhttp.open("GET", getRequestUrl(data1, data2), true);
    xhttp.send();
}

/** Consulta a data de hoje e a insere nos dois campos de data */
function dataCorrente() {
    document.getElementById("data1").valueAsDate = new Date();
    document.getElementById("data2").valueAsDate = new Date();
}

/** Funções para integração (satisfazer contrato do servidor)
 * @param {*} resposta uma ResponseModel da requisição contendo
 * a diferença entre duas datas como um JSON do tipo '{"difference":0}'
 * @returns a diferenca calculada pela requisição
 */
function extraiDiferencaDaResposta(resposta) {
    return JSON.parse(resposta).difference;
}

/** Recebe uma data de um campo de data, e retorna uma string
 * com a mesma data no formato 'dd/mm/aaaa'
 * @param {*} data uma data no formato lido de um campo HTML tipo date
 * @returns uma string com a mesma data no formato 'dd/mm/aaaa'
 */
function formataData(data) {
    let [a, m, d] = data.split("-");
    return `${d}/${m}/${a}`;
}

/** Retorna a URL completa da requisição, montada.
 * @param {*} data1 primeira data passada como parametro
 * @param {*} data2 segunda data passada como parametro
 * @returns a URL completa da requisição XMLHTTP.
 */
function getRequestUrl(data1, data2){
    console.log(PATH + "?data1=" + data1 + "&data2=" + data2);
    return PATH + "?data1=" + data1 + "&data2=" + data2;
}

module.exports = {
    atualizaDiferencaDatas,
    dataCorrente,
    extraiDiferencaDaResposta,
    formataData,
    getRequestUrl
};