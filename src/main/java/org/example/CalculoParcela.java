package org.example;

public class CalculoParcela implements CalculoPreco {

    public float calcular(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Parcelamento em zero parcelas");
        }
        else {
            return valor1 / valor2;
        }
    }
}