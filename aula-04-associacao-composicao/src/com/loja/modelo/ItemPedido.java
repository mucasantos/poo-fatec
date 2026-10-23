package com.loja.modelo;

/**
 * Representa um Item pertencente a um Pedido.
 * CONCEITO: COMPOSIÇÃO
 * O ItemPedido só existe como parte integrante de um Pedido.
 * Se o Pedido for destruído, seus itens deixam de fazer sentido e são destruídos com ele.
 */
public class ItemPedido {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    @Override
    public String toString() {
        return String.format("%s | Qtd: %d | Unit: R$ %.2f | Subtotal: R$ %.2f",
                nomeProduto, quantidade, precoUnitario, getSubtotal());
    }
}
