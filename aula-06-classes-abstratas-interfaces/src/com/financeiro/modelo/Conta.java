package com.financeiro.modelo;

/**
 * Classe Abstrata Conta.
 * CONCEITO:
 * 1. NÃO pode ser instanciada diretamente com 'new Conta(...)'.
 * 2. Serve como modelo/molde base para subclasses especializadas.
 * 3. Pode conter métodos concretos (com corpo) e métodos abstratos (sem corpo).
 */
public abstract class Conta {
    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f na conta %d.%n", valor, numero);
        }
    }

    /**
     * Método Abstrato: Não tem corpo nesta classe!
     * Obriga cada tipo específico de conta a definir suas próprias regras e taxas de saque.
     */
    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
}
