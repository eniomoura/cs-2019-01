/** Path para a requisição (URL) */
const PATH = "http://localhost:8080/ds";

/** Executa uma requisição XMLHTTP e recebe via Spring Boot
 * um número por extenso concatenado no programa Java.
 * Após calculado, o valor é colocado no campo de resultado. */
function atualizaNumeroExtenso() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiExtensoDaResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = dds;
        }
    };
    let numero = formataData(document.getElementById("numero").value);
    xhttp.open("GET", getRequestUrl(numero), true);
    xhttp.send();
}

/** Insere o valor 0 no input ao carregar a página. */
function loadDefaultValue() {
    document.getElementById("inputNumero").value = 0;
}

/** Funções para integração (satisfazer contrato do servidor)
 * @param {*} resposta uma ResponseModel da requisição contendo
 * a diferença entre duas datas como um JSON do tipo '{"extenso":"zero"}'
 * @returns a diferenca calculada pela requisição
 */
function extraiExtensoDaResposta(resposta) {
    return JSON.parse(resposta).extenso;
}

/** Retorna a URL completa da requisição, montada.
 * @param {*} numero o número passado como parâmetro
 * @returns a URL completa da requisição XMLHTTP.
 */
function getRequestUrl(numero){
    return PATH + "?numero=" + numero;
}

module.exports = {
    atualizaNumeroExtenso,
    loadDefaultValue,
    extraiExtensoDaResposta,
    getRequestUrl
};