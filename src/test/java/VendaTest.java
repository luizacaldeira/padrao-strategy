import org.example.Venda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveAplicarDescontoPercentualNaVenda() {
        Venda venda = new Venda();
        venda.aplicarDescontoPercentual(100.0f, 10.0f);
        assertEquals(90.0f, venda.getValor(), 0.01f);
    }

    @Test
    void deveAplicarDescontoFixoNaVenda() {
        Venda venda = new Venda();
        venda.aplicarDescontoFixo(100.0f, 20.0f);
        assertEquals(80.0f, venda.getValor(), 0.01f);
    }

    @Test
    void deveCalcularTotalPeriodoDaVenda() {
        Venda venda = new Venda();
        venda.calcularTotalPeriodo(100.0f, 12.0f);
        assertEquals(1200.0f, venda.getValor(), 0.01f);
    }

    @Test
    void deveCalcularParcelaDaVenda() {
        Venda venda = new Venda();
        venda.calcularParcela(1200.0f, 12.0f);
        assertEquals(100.0f, venda.getValor(), 0.01f);
    }

    @Test
    void naoDeveCalcularParcelaComZeroParcelas() {
        try {
            Venda venda = new Venda();
            venda.calcularParcela(1200.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Parcelamento em zero parcelas", e.getMessage());
        }
    }

}
