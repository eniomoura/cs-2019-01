var isLetter = require('is-letter');

function lesserTemperature(temps) {
    returnValue = temps[0];
    for (let temp of temps) {
        if (returnValue > temp) {
            returnValue = temp;
        }
    }
    return returnValue;
}

function oddSum(integers) {
    returnValue = 0;
    for (let integer of integers) {
        if (integer % 2 == 1) {
            returnValue = returnValue + integer;
        }
    }
    return returnValue;
}

function equalValueCount(numbers, equalTo) {
    returnValue = 0;
    for (let number of numbers) {
        if (number == equalTo) {
            returnValue++;
        }
    }
    return returnValue;
}

function countChars(chars){
    returnValue = 0;
    for (i = 0; i < chars.length; i++) {
        if (isLetter(chars.charAt(i))) {
            returnValue++;
        }
    }
    return returnValue;
}

function mostFrequentWord(string) {
    let frequency = new Map();
    let words = string.split(" ");
    let mostOccurrences = 0;
    for(let word of words){
        if(frequency.get(word)){
            frequency.set(word, frequency.get(word) + 1);
        } else {
            frequency.set(word, 1);
        }
    }
    let returnValue;
    for(let word of words){
        if(frequency.get(word) > mostOccurrences){
            mostOccurrences = frequency.get(word);
            returnValue = word;
        }
    }
    return returnValue;
}

function mostFrequentNumbers(range) {
    let array = new Array();
    for(let i = 0; i < 1000000; i++){
        array[i] = Math.floor(Math.random() * (range + 1));
    }
    array.sort();
    let numbersMap = new Map();
    for(let number of array){
        if(numbersMap.get(number)){
            numbersMap.set(number, numbersMap.get(number) + 1);
        } else {
            numbersMap.set(number, 1);
        }
    }
    let occurrences = 0;
    for(let number of array){
        if(numbersMap.get(number) > occurrences){
            occurrences = numbersMap.get(number);
        }
    }
    let returnValue = new Array();
    let i = 0;
    for(let j of array){
        if(numbersMap.get(j) == occurrences && returnValue[i - 1] != j){
            returnValue[i] = j;
            i++;
        }
    }
    returnValue.sort();
    return returnValue;
}

module.exports = { lesserTemperature, oddSum, equalValueCount, countChars, mostFrequentWord, mostFrequentNumbers };
