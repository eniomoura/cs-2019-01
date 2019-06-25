function menorTemperatura(temperaturas) {
    returnValue = temperaturas[0];
    for (i = 1; i < temperaturas.length; i++) {
        if (returnValue > temperaturas[i]) {
            returnValue = temperaturas[i];
        }
    }
    return returnValue;
}

function somaImpares(inteiros) {
    returnValue = 0;
    for (i = 0; i < inteiros.length; i++) {
        if (inteiros[i] % 2 == 1) {
            returnValue = returnValue + inteiros[i];
        }
    }
    return returnValue;
}

function numValoresIguais(numeros, igualA) {
    returnValue = 0;
    for (i = 0; i < numeros.length; i++) {
        if (numeros[i] == igualA) {
            returnValue++;
        }
    }
    return returnValue;
}

module.exports = { menorTemperatura, somaImpares, numValoresIguais, numLetras };
