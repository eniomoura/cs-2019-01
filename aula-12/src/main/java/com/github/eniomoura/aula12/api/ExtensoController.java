package com.github.eniomoura.aula12.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** Função utilizada como lógica principal do Spring Boot. */
@RestController
public final class ExtensoController {

    /** Requisição cross-origin efetuada no caminho '/ds' do servidor.
     * @param numero Um número inteiro que será escrito por extenso
     * pelo método writeInFull
     * @return Um objeto ResponseModel contendo a resposta de
     * writeInFull, a ser recebido pelo Spring Boot.
     */
    @CrossOrigin
    @GetMapping("ds")
    public ResponseModel writeInFull(
            @RequestParam("numero") final String numero) {
                validaEntrada(numero);
            return new ResponseModel(
                ExtensoUtils.writeInFull(Integer.parseInt(numero)));
    }

    /** Testa a entrada obtida e encerra a requisição
     * com 'IllegalArgumentException' caso a entrada não for válida.
     * @param numero O número a ser validado
     * @throws IllegalArgumentException Causa essa exceção se a entrada
     * não for válida.
     */
    protected static void validaEntrada(final String numero)
    throws IllegalArgumentException {
        try {
            Integer.parseInt(numero);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                "O número inserido não é válido.", ex);
        }
    }
}
