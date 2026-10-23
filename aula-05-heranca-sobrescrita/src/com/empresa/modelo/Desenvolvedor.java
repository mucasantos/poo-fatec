package com.empresa.modelo;

/**
 * Subclasse Desenvolvedor.
 */
public class Desenvolvedor extends Funcionario {
    private int quantidadeCertificacoes;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int quantidadeCertificacoes) {
        super(nome, matricula, salarioBase);
        this.quantidadeCertificacoes = quantidadeCertificacoes;
    }

    /**
     * SOBRESCRITA (@Override):
     * Dev recebe 10% de base + R$ 300,00 por certificação técnica.
     */
    @Override
    public double calcularBonificacao() {
        double bonusBase = super.calcularBonificacao(); // Reutiliza os 5% da classe-mãe
        double adicionalCertificacoes = this.quantidadeCertificacoes * 300.0;
        return bonusBase + adicionalCertificacoes;
    }

    public int getQuantidadeCertificacoes() {
        return quantidadeCertificacoes;
    }
}
