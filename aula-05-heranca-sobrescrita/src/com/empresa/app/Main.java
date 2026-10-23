package com.empresa.app;

import com.empresa.modelo.Desenvolvedor;
import com.empresa.modelo.Funcionario;
import com.empresa.modelo.Gerente;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 05: HERANÇA E SOBRESCRITA DE MÉTODOS (@Override) ===\n");

        Funcionario f1 = new Funcionario("Lucas Silva", "F-101", 3000.00);
        Gerente g1 = new Gerente("Mariana Costa", "G-202", 8000.00, 1500.00);
        Desenvolvedor d1 = new Desenvolvedor("Rodrigo Faro", "D-303", 5500.00, 3);

        f1.exibirHolerite();
        g1.exibirHolerite();
        d1.exibirHolerite();

        System.out.println("\n💡 OBSERVAÇÃO PEDAGÓGICA:");
        System.out.println("O método 'exibirHolerite()' foi escrito UMA ÚNICA VEZ na classe-mãe Funcionario,");
        System.out.println("mas ao ser executado em Gerente e Desenvolvedor, ele acionou automaticamente");
        System.out.println("a lógica de bonificação específica de cada subclasse graças ao @Override!");
    }
}
