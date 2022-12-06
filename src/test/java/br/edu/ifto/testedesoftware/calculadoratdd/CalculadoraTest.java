package br.edu.ifto.testedesoftware.calculadoratdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    @DisplayName("adicao deve somar fatores")
    public void deveSomarFatores() {
        assertEquals(4., Calculadora.adicao(2., 2.));
    }

    @Test
    @DisplayName("subtracao deve subtrair fatores")
    public void deveSubtrairFatores() {
        assertEquals(0., Calculadora.subtracao(2., 2.));
    }

    @Test
    @DisplayName("multiplicacao deve multiplicar fatores")
    public void deveMultiplicarFatores() {
        assertEquals(4., Calculadora.multiplicacao(2., 2.));
    }

    @Test
    @DisplayName("divisao deve dividir dividendo e divisor")
    public void deveDividirDividendoPorDivisor() {
        assertEquals(1., Calculadora.divisao(2., 2.));
    }

    @Test
    @DisplayName("divisao deve gerar exceção de divisão por zero")
    public void deveLidarComDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.divisao(2., 0.);
        });
    }
}
