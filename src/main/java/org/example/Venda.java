package org.example;

public class Venda {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void aplicarDescontoPercentual(float preco, float percentual) {
        CalculadoraPreco calculadora = new CalculadoraPreco(preco, percentual);
        this.valor = calculadora.calcular(new CalculoDescontoPercentual());
    }

    public void aplicarDescontoFixo(float preco, float desconto) {
        CalculadoraPreco calculadora = new CalculadoraPreco(preco, desconto);
        this.valor = calculadora.calcular(new CalculoDescontoFixo());
    }

    public void calcularTotalPeriodo(float preco, float meses) {
        CalculadoraPreco calculadora = new CalculadoraPreco(preco, meses);
        this.valor = calculadora.calcular(new CalculoTotalPeriodo());
    }

    public void calcularParcela(float total, float parcelas) {
        CalculadoraPreco calculadora = new CalculadoraPreco(total, parcelas);
        this.valor = calculadora.calcular(new CalculoParcela());
    }

}