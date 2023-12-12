package com.calculadorarest.calculadora.exceptions;

import java.util.Date;

//essa classe e mais utililada para detalhar as mensagem de erros
public class excecaoResponse {

    private Date timestamp;
    private String message;
    private String details;

    public excecaoResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
