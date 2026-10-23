package com.financeiro.modelo;

/**
 * Conta Poupança:
 * Herda de Conta, mas NÃO implementa Tributavel (isenta de impostos no Brasil).
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        // Poupança não cobra taxa de saque
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("✅ Saque de R$ %.2f efetuado sem taxas | Novo saldo: R$ %.2f%n",
                    valor, this.saldo);
            return true;
        }
        System.out.println("❌ Saldo insuficiente na Conta Poupança.");
        return false;
    }

    public void renderJuros(double taxaPercentual) {
        double rendimento = this.saldo * taxaPercentual;
        this.saldo += rendimento;
        System.out.printf("📈 Rendimento de R$ %.2f aplicado na Poupança %d.%n", rendimento, getNumero());
    }
}
