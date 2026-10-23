package com.loja.modelo;

/**
 * Representa um Cupom de Desconto.
 * CONCEITO: DEPENDÊNCIA
 * O Pedido não guarda o cupom como um atributo permanente;
 * ele apenas DEPENDE do cupom temporariamente ao executar o método de cálculo de desconto.
 */
public class CupomDesconto {
    private String codigo;
    private double percentualDesconto; // Ex: 0.10 para 10%

    public CupomDesconto(String codigo, double percentualDesconto) {
        this.codigo = codigo;
        this.percentualDesconto = percentualDesconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }
}
