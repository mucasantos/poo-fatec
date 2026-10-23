package com.loja.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstração dos 3 tipos de relacionamentos:
 * 1. AGREGAÇÃO: Pedido tem um Cliente (mas o cliente existe fora do pedido).
 * 2. COMPOSIÇÃO: Pedido é composto por uma lista de ItemPedido gerenciada por ele.
 * 3. DEPENDÊNCIA: O método aplicarCupom depende de um objeto CupomDesconto.
 */
public class Pedido {
    private int numero;
    private Cliente cliente;                // 1. AGREGAÇÃO
    private List<ItemPedido> itens;         // 2. COMPOSIÇÃO

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Na Composição, a criação e gestão dos itens é de responsabilidade do Pedido
    public void adicionarItem(String produto, int quantidade, double precoUnitario) {
        ItemPedido novoItem = new ItemPedido(produto, quantidade, precoUnitario);
        this.itens.add(novoItem);
    }

    public double calcularTotalBruto() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    // 3. DEPENDÊNCIA: O objeto CupomDesconto é passado apenas como parâmetro pontual.
    // O pedido usa o método do cupom, mas não o mantém como variável de instância permanente.
    public double calcularTotalComDesconto(CupomDesconto cupom) {
        double bruto = calcularTotalBruto();
        if (cupom != null && cupom.getPercentualDesconto() > 0) {
            double desconto = bruto * cupom.getPercentualDesconto();
            System.out.printf("🏷️ Cupom '%s' aplicado (-%.0f%% = R$ %.2f de desconto)%n",
                    cupom.getCodigo(), (cupom.getPercentualDesconto() * 100), desconto);
            return bruto - desconto;
        }
        return bruto;
    }

    public void exibirResumo() {
        System.out.println("==================================================");
        System.out.println("📦 RESUMO DO PEDIDO #" + numero);
        System.out.println("👤 Cliente: " + cliente);
        System.out.println("📋 Itens do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println("   - " + item);
        }
        System.out.printf("💰 Total Bruto: R$ %.2f%n", calcularTotalBruto());
        System.out.println("==================================================");
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
