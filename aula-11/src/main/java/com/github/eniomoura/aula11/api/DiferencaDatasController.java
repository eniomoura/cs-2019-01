package com.github.eniomoura.aula11.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/** Função utilizada como lógica principal do Spring Boot. */
@RestController
public final class DiferencaDatasController {

    /** Requisição cross-origin efetuada no caminho '/ds' do servidor.
     * Retorna a diferença entre duas datas, 'data1' e 'data2'.
     * @param data1 Primeiro operando, uma data no formato 'dd/MM/aaaa'
     *              para o cálculo da diferença.
     * @param data2 Segundo operando, uma data no formato 'dd/MM/aaaa'
     *              para o cálculo da diferença.
     * @return A diferença entra as datas 'data1' e 'data2'.
     */
    @CrossOrigin
    @GetMapping("ds")
    public ResponseModel diferencaDatas(
            @RequestParam("data1") final String data1,
            @RequestParam("data2") final String data2) {
            final LocalDate primeiraData = localDateFromString(data1);
            final LocalDate segundaData = localDateFromString(data2);
            if (primeiraData == null || segundaData == null) {
                throw new IllegalArgumentException(
                    "É necessário passar duas datas no formato 'dd/MM/yyyy.");
            }
            ResponseModel response = new ResponseModel(
                CalendarioUtils.calculateDifference(primeiraData, segundaData));
            LogManager.getLogger(DiferencaDatasController.class).info(
                response + ", diferenca em dias: " + response.getDifference());
            return response;
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência de
     * caracteres.
     *
     * Função retirada e modificada a partir do recurso exemplo disponível em:
     * https://github.com/kyriosdata/exemplo
     *
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null},
     * se a sequência não está no formato esperado (por exemplo, "01-01-2018")
     */
    public LocalDate localDateFromString(final String data) {
        try {
            final DateTimeFormatter fmt = DateTimeFormatter.ofPattern(
                "dd/MM/yyyy");
            return LocalDate.parse(data, fmt);
        } catch (IllegalArgumentException | DateTimeParseException exp) {
            return null;
        }
    }
}
