package com.github.eniomoura.exemplo.aula11.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public final class DiaDaSemanaController {
    @CrossOrigin
    @RequestMapping("ds")
    public int diferencaDatas(
        @RequestParam(value = "data1") final String data1,
        @RequestParam(value = "data2") final String data2) {
        LocalDate primeiraData = localDateFromString(data1);
        LocalDate segundaData = localDateFromString(data2);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (primeiraData == null) {
            primeiraData = LocalDate.now();
        }
        if (segundaData == null) {
            primeiraData = LocalDate.now();
        }
        return CalendarioUtils.calculateDifference(primeiraData, segundaData);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência de
     * caracteres.
     * 
     * Função retirada do recurso exemplo disponível em:
     * https://github.com/kyriosdata/exemplo
     * 
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência não
     *         está no formato esperado (por exemplo, "01-01-2018")
     */
    public LocalDate localDateFromString(String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
