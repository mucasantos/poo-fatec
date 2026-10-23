package com.loja.app;

import com.loja.modelo.Cliente;
import com.loja.modelo.CupomDesconto;
import com.loja.modelo.Pedido;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 04: ASSOCIAÇÃO, AGREGAÇÃO, COMPOSIÇÃO E DEPENDÊNCIA ===\n");

        // 1. AGREGAÇÃO: O cliente existe independentemente
        Cliente cliente = new Cliente("Beatriz Lima", "123.456.789-00");

        // 2. Criando o Pedido vinculado ao cliente
        Pedido pedido = new Pedido(5001, cliente);

        // 3. COMPOSIÇÃO: Itens criados e pertencentes exclusivamente ao pedido
        pedido.adicionarItem("Notebook Gamer", 1, 4500.00);
        pedido.adicionarItem("Mouse Sem Fio", 2, 75.50);
        pedido.adicionarItem("Suporte Articulado", 1, 120.00);

        pedido.exibirResumo();

        // 4. DEPENDÊNCIA: Usando cupom como parâmetro temporário de método
        CupomDesconto cupom = new CupomDesconto("FATEC10", 0.10); // 10%
        double totalFinal = pedido.calcularTotalComDesconto(cupom);

        System.out.printf("💵 Total a pagar com desconto: R$ %.2f%n%n", totalFinal);

        System.out.println("💡 PROVA DE CONCEITO NA MEMÓRIA:");
        System.out.println("Se 'pedido' for descartado (pedido = null), os itens somem da memória.");
        System.out.println("Mas o cliente continua existindo: " + cliente.getNome() + "!");
    }
}
