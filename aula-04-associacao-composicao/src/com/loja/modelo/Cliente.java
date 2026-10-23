package com.loja.modelo;

/**
 * Representa um Cliente da loja.
 * CONCEITO: AGREGAÇÃO
 * O Cliente tem existência independente do Pedido.
 * Se o Pedido for cancelado ou apagado, o Cliente continua existindo no sistema.
 */
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}
