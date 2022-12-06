package br.edu.ifto.testedesoftware.calculadoratdd;

public class Calculadora {
    public static double adicao(double fator1, double fator2) {
        return fator1 + fator2;
    }

    public static double subtracao(double fator1, double fator2) {
        return fator1 - fator2;
    }

    public static double multiplicacao(double fator1, double fator2) {
        return fator1 * fator2;
    }

    public static double divisao(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        
        return dividendo / divisor;
    }
}
