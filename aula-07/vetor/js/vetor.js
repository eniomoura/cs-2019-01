function lesserTemperature(temps) {
    returnValue = temps[0];
    for (i = 1; i < temps.length; i++) {
        if (returnValue > temps[i]) {
            returnValue = temps[i];
        }
    }
    return returnValue;
}

function oddSum(integers) {
    returnValue = 0;
    for (i = 0; i < integers.length; i++) {
        if (integers[i] % 2 == 1) {
            returnValue = returnValue + integers[i];
        }
    }
    return returnValue;
}

function equalValueCount(numbers, equalTo) {
    returnValue = 0;
    for (i = 0; i < numbers.length; i++) {
        if (numbers[i] == equalTo) {
            returnValue++;
        }
    }
    return returnValue;
}

function countChars(chars){
    returnValue = 0;
    for (i = 0; i < chars.length; i++) {  
        if (Character.isLetter(chars.charAt(i))) {
            returnValue++;
        }
    }
    return returnValue;
}

module.exports = { menorTemperatura: lesserTemperature, somaImpares, numValoresIguais, countChars };
