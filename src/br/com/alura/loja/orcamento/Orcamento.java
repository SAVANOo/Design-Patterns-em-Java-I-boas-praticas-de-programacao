package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    public Orcamento(BigDecimal valor){
        this.valor = valor;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
}
