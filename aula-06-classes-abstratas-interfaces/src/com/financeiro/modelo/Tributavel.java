package com.financeiro.modelo;

/**
 * Interface Tributavel.
 * CONCEITO: Um contrato que obriga qualquer classe assinante a fornecer
 * o cálculo de seu imposto devido.
 */
public interface Tributavel {
    // Em interfaces, atributos são implicitamente public static final
    double ALIQUOTA_PADRAO = 0.02; // 2%

    // Método abstrato: quem assinar o contrato DEVE implementar
    double getValorImposto();

    // Método default (Java 8+): comportamento padrão com implementação concreta
    default void emitirComprovanteFiscal() {
        System.out.printf("🧾 [Comprovante Fiscal] Imposto recolhido de R$ %.2f%n", getValorImposto());
    }
}
