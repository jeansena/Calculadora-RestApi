package com.calculadorarest.calculadora.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorarest.calculadora.converterNumero.NumeroConvertidor;
import com.calculadorarest.calculadora.exceptions.excecaoSemSuporte;
import com.calculadorarest.calculadora.matematica.simplesCalculos;

/**
 * aqui e que faz as requisições no navegador
 * e chama as outras classes
 */
@RestController
public class matematicaController {

    // chama o metodo para instancia a class
    private simplesCalculos matemtica = new simplesCalculos();

    // metodo para chamada no navegador
    // pode gera uma exceção
    // da forma que o usuario passa os dado na url
    @RequestMapping(value = "/soma/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double soma(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1) || !NumeroConvertidor.ENumerico(number2)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.soma(NumeroConvertidor.convertePraDouble(number1),
                NumeroConvertidor.convertePraDouble(number2));
    }

    // metodo para subitrair
    @RequestMapping(value = "/subritair/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subritair(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1) || !NumeroConvertidor.ENumerico(number2)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.subritair(NumeroConvertidor.convertePraDouble(number1),
                NumeroConvertidor.convertePraDouble(number2));
    }

    // metodo para multiplicar
    @RequestMapping(value = "/multiplicar/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplicar(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1) || !NumeroConvertidor.ENumerico(number2)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.multiplicar(NumeroConvertidor.convertePraDouble(number1),
                NumeroConvertidor.convertePraDouble(number2));
    }

    // metodo para dividir
    @RequestMapping(value = "/dividir/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double dividir(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1) || !NumeroConvertidor.ENumerico(number2)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.dividir(NumeroConvertidor.convertePraDouble(number1),
                NumeroConvertidor.convertePraDouble(number2));
    }

    // metodo para calcular a media
    @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double media(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1) || !NumeroConvertidor.ENumerico(number2)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.media(NumeroConvertidor.convertePraDouble(number1),
                NumeroConvertidor.convertePraDouble(number2));
    }

    @RequestMapping(value = "/raizquadrada/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double raizquadrada(@PathVariable(value = "numberOne") String number1,
            @PathVariable(value = "numberTwo") String number2) throws Exception {

        if (!NumeroConvertidor.ENumerico(number1)) {
            // Exceção de operação matemática sem suporte
            throw new excecaoSemSuporte("digite um valor numerico");
        }

        return matemtica.raizquadrada(NumeroConvertidor.convertePraDouble(number1));
        // NumeroConvertidor.convertePraDouble(number2));
    }

}
