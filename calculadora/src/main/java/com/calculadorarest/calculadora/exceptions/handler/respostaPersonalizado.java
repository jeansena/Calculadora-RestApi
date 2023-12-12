package com.calculadorarest.calculadora.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.calculadorarest.calculadora.exceptions.excecaoResponse;
import com.calculadorarest.calculadora.exceptions.excecaoSemSuporte;

@ControllerAdvice
@RestController
public class respostaPersonalizado extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<excecaoResponse> manipularExcecoes(Exception ex, WebRequest request) {

        excecaoResponse excecaoResponse = new excecaoResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(excecaoResponse, HttpStatus.INTERNAL_SERVER_ERROR);

        // handle All Exceptions -- manipular todas as exceções
    }

    @ExceptionHandler(excecaoSemSuporte.class)
    public final ResponseEntity<excecaoResponse> solicitacaoIncorreta(Exception ex, WebRequest request) {

        excecaoResponse excecaoResponse = new excecaoResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(excecaoResponse, HttpStatus.BAD_REQUEST);
        // handle Bad Request Exceptions -- lidar com exceções de solicitação incorreta
    }

}
// Handler -- treinador
// Customized Response Entity Exception Handler
// Manipulador de exceção de entidade de resposta personalizado