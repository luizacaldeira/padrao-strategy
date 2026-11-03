package org.example;

public class CalculadoraPreco {

    private float valor1;
    private float valor2;

    public CalculadoraPreco(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(CalculoPreco calculo) {
        return calculo.calcular(valor1, valor2);
    }
}