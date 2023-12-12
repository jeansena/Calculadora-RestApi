package com.calculadorarest.calculadora.converterNumero;

public class NumeroConvertidor {

    public static Double convertePraDouble(String strNumber) {

        // fazer a verificação se o valor for nulo
        if (strNumber == null)
            return 0D;

        // BR 10,25 no brasil e usado virgula
        // US 10.25 no US e usado ponto
        String number = strNumber.replaceAll(",", ".");
        // conveter number que e uma String e Double
        if (ENumerico(number))
            return Double.parseDouble(number);
        return 0D; // OD no caso retorna um zero Double
    }

    public static boolean ENumerico(String Strinumber) {
        // fazer a verificação se o valor for nulo
        if (Strinumber == null)
            return false;

        String number = Strinumber.replaceAll(",", ".");
        // aqui vai verificar os numeros
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
