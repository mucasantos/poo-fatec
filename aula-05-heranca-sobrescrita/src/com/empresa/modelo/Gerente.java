package com.empresa.modelo;

/**
 * Subclasse Gerente.
 * Relação "É-UM": Todo Gerente é um Funcionário.
 */
public class Gerente extends Funcionario {
    private double bonusGratificacao;

    public Gerente(String nome, String matricula, double salarioBase, double bonusGratificacao) {
        // Chamada obrigatória ao construtor da classe-mãe
        super(nome, matricula, salarioBase);
        this.bonusGratificacao = bonusGratificacao;
    }

    /**
     * SOBRESCRITA (@Override):
     * Gerente tem bonificação padrão de 15% + seu bônus de gratificação fixo.
     */
    @Override
    public double calcularBonificacao() {
        // Acesso direto ao 'salarioBase' por ser protected
        return (this.salarioBase * 0.15) + this.bonusGratificacao;
    }

    public double getBonusGratificacao() {
        return bonusGratificacao;
    }
}
