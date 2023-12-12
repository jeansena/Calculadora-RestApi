package com.calculadorarest.calculadora.matematica;

public class simplesCalculos {

    // metodo soma
    public Double soma(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    // Metodo para subritair
    public Double subritair(Double numberOne, Double numerTwo) {
        return numberOne - numerTwo;
    }

    // metodo para multiplicar
    public Double multiplicar(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    // metodo para dividir
    public Double dividir(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    // metodo para a media da soma
    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    // metodo da raiz quadrada
    public Double raizquadrada(Double number) {
        return Math.sqrt(number);
    }
}