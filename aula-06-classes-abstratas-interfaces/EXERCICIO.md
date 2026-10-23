# 📝 Aula 06 — Exercício Prático: Contratos e Classes Abstratas
**Carga Horária Estimada**: 4 horas (1h Teoria e Demonstração + 1h Análise de Código + 2h Hands-on)

---

## 🎯 Objetivo Pedagógico
Compreender quando escolher uma **Classe Abstrata** (relação "é-um" com reuso de estrutura) vs. uma **Interface** (relação "faz-um" / contrato comportamental).

---

## 🚀 Desafio Prático: Gerenciador de Tributos e Seguro de Vida

### 1. Criar a Classe `SeguroDeVida`
* O seguro não é uma Conta Bancária, portanto **não deve herdar de Conta**!
* Deve assinar o contrato: `implements Tributavel`.
* Atributos privados: `numeroApolice` (String), `titular` (String), `valorPremio` (double).
* Construtor para inicialização.
* Regra do imposto (`getValorImposto()`): Taxa fixa de R$ 42,00 + 2% do `valorPremio`.

### 2. Criar a Classe `CalculadorDeImpostos`
* Criar no pacote `com.financeiro.modelo`.
* Possui o atributo: `private double totalImpostos = 0;`
* Possui o método:
  ```java
  public void registrar(Tributavel t)
  ```
* O método deve somar o imposto do objeto recebido (`t.getValorImposto()`) no seu acumulador e emitir o comprovante fiscal.

### 3. Validação no `Main.java`
* Instancie um `CalculadorDeImpostos`.
* Registre no calculador:
  1. Uma `ContaCorrente` com saldo de R$ 10.000,00.
  2. Um `SeguroDeVida` com prêmio de R$ 500.000,00.
* Imprima o valor total de impostos recolhidos pelo sistema.

---

## ❓ Questão Teórica para Fixação:
> *Por que a classe `ContaPoupanca` não pode ser passada para o método `registrar(Tributavel t)` do `CalculadorDeImpostos`? O que garante essa restrição em tempo de compilação?*
