package org.example;

public class CalculoDescontoPercentual implements CalculoPreco {

    public float calcular(float valor1, float valor2) {
        return valor1 - (valor1 * valor2 / 100);
    }
}