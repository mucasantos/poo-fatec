package com.empresa.modelo;

/**
 * Aula 05 - Superclasse (Classe-Mãe).
 * Reúne o estado e comportamento comuns a todos os funcionários.
 */
public class Funcionario {
    private String nome;
    private String matricula;
    
    // PROTECTED: permite acesso direto pelas subclasses (Gerente, Desenvolvedor)
    // mantendo protegido contra o mundo externo (classes fora do pacote).
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    /**
     * Regra padrão de bonificação (5% do salário base).
     * Subclasses podem sobrescrever (@Override) esse comportamento.
     */
    public double calcularBonificacao() {
        return this.salarioBase * 0.05;
    }

    public double getSalarioFinal() {
        return this.salarioBase + calcularBonificacao();
    }

    public void exibirHolerite() {
        System.out.println("------------------------------------------");
        System.out.printf("👤 Funcionário: %s (Matrícula: %s)%n", nome, matricula);
        System.out.printf("💼 Cargo: %s%n", this.getClass().getSimpleName());
        System.out.printf("💵 Salário Base: R$ %.2f%n", salarioBase);
        System.out.printf("🎁 Bonificação: R$ %.2f%n", calcularBonificacao());
        System.out.printf("💰 Total a Receber: R$ %.2f%n", getSalarioFinal());
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
