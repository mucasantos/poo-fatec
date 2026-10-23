package com.financeiro.modelo;

/**
 * Herda de Conta E implementa a interface Tributavel.
 * Demonstra a capacidade do Java de ter herança única de classe + múltiplos contratos via interfaces.
 */
public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        // Cobra taxa de operação de R$ 1,50 por saque em Conta Corrente
        double valorComTaxa = valor + 1.50;
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            System.out.printf("✅ Saque de R$ %.2f efetuado (taxa: R$ 1,50) | Novo saldo: R$ %.2f%n",
                    valor, this.saldo);
            return true;
        }
        System.out.println("❌ Saldo insuficiente para saque com taxa na Conta Corrente.");
        return false;
    }

    // Cumprindo o contrato da interface Tributavel
    @Override
    public double getValorImposto() {
        // Imposto de 1% sobre o saldo total em conta corrente
        return this.saldo * 0.01;
    }
}
