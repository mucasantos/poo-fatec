package com.financeiro.app;

import com.financeiro.modelo.ContaCorrente;
import com.financeiro.modelo.ContaPoupanca;
import com.financeiro.modelo.Tributavel;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 06: CLASSES ABSTRATAS E INTERFACES ===\n");

        // 1. Não podemos fazer: Conta c = new Conta(...); -> ERRO DE COMPILAÇÃO!
        ContaCorrente cc = new ContaCorrente(101, "Fernanda Reis", 5000.00);
        ContaPoupanca cp = new ContaPoupanca(102, "Bruno Meireles", 3000.00);

        System.out.println("--- Testando Métodos Abstratos Implementados ---");
        cc.sacar(200.0); // cobra R$ 1,50
        cp.sacar(200.0); // isento de taxa

        System.out.println("\n--- Testando Contrato de Interface Tributavel ---");
        // Polimorfismo com interface: referenciamos pelo contrato Tributavel
        Tributavel itemTributavel = cc;
        System.out.printf("Imposto calculado da CC: R$ %.2f%n", itemTributavel.getValorImposto());
        itemTributavel.emitirComprovanteFiscal(); // método default da interface

        System.out.println("\n💡 REGRAS PEDAGÓGICAS:");
        System.out.println("• Classe Abstrata: garante herança estrutural e compartilhamento de estado/código.");
        System.out.println("• Interface: define capacidades/contratos independentes da árvore de herança.");
    }
}
