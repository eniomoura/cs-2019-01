package com.github.eniomoura.aula11.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

/** Função utilizada como lógica principal do Spring Boot. */
@RestController
public final class DiferencaDatasController {

    /** Requisição cross-origin efetuada no caminho '/ds' do servidor.
     * Utiliza o método localDateFromString para obter a data
     * no formato LocalDate, e utiliza o método CalculateDifference
     * para obter a diferença entre as datas.
     * @param firstDate Primeiro operando, uma string no formato 'dd/MM/aaaa'
     * para ser convertida em LocalDate e executada calculateDifference sobre.
     * @param secondDate Segundo operando, uma string no formato 'dd/MM/aaaa'
     * para ser convertida em LocalDate e executada calculateDifference sobre.
     * @return Um objeto ResponseModel contendo a resposta de
     * calculateDifference, a ser recebido pelo Spring Boot.
     */
    @CrossOrigin
    @GetMapping("ds")
    public ResponseModel calculateDifference(
            @RequestParam("data1") final String firstDate,
            @RequestParam("data2") final String secondDate) {
            final LocalDate parsedFirstDate =
                CalendarioUtils.localDateFromString(firstDate);
            final LocalDate parsedSecondDate =
                CalendarioUtils.localDateFromString(secondDate);
            validaDatas(firstDate, secondDate);
            return new ResponseModel(
                CalendarioUtils.calculateDifference(
                    parsedFirstDate, parsedSecondDate));
    }

    /** Testa as entradas obtidas e encerra a requisição
     * com 'IllegalArgumentException' caso as datas não foram válidas.
     * @param firstDate String da primeira data a ser validada.
     * @param secondDate String da segunda data a ser validada.
     * @throws IllegalArgumentException Causa essa exceção se a entrada
     * não for válida.*/
    protected static void validaDatas(final String firstDate,
                                      final String secondDate)
    throws IllegalArgumentException {
        if (firstDate == null || secondDate == null) {
            throw new IllegalArgumentException(
                "É necessário passar duas datas no formato 'dd/MM/yyyy.");
        }
    }
}
