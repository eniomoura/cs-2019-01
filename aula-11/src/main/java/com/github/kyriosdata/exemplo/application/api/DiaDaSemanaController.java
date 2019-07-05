package com.github.kyriosdata.exemplo.application.api;

import com.github.kyriosdata.exemplo.domain.Calendario;
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
        @RequestParam(value = "data1",
                      defaultValue = "não fornecida") final String data1,
        @RequestParam(value = "data2",
                      defaultValue = "não fornecida") final String data2) {

        LocalDate primeiraData = localDateFromString(data1);
        LocalDate segundaData = localDateFromString(data2);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (primeiraData == null) {
            primeiraData = LocalDate.now();
        }
        if (segundaData == null) {
            primeiraData = LocalDate.now();
        }

        int dias = Calendario.calculaDiferenca(primeiraData, segundaData);

        return dias;
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
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
