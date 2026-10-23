# 📝 Aula 05 — Exercício Prático: Herança e Especialização de Classes
**Carga Horária Estimada**: 4 horas (1h Teoria e Demonstração + 1h Análise de Código + 2h Hands-on)

---

## 🎯 Objetivo Pedagógico
Compreender como a **Herança (`extends`)** viabiliza o reuso de código e como a **Sobrescrita (`@Override`)** permite adaptar comportamentos genéricos para entidades especializadas.

---

## 🚀 Desafio Prático: Especializações de Cargos

Implemente as seguintes melhorias no projeto:

### 1. Criar a Subclasse `Diretor`
* Deve herdar de `Gerente` (`Diretor extends Gerente` — demonstrando múltiplos níveis de herança).
* Atributo privado adicional: `participacaoLucros` (double).
* No construtor, chame `super(...)` passando os dados necessários.
* Sobrescreva o método `calcularBonificacao()`:
  * A bonificação do Diretor deve ser a bonificação que o Gerente já calcula (`super.calcularBonificacao()`) **somada** à sua `participacaoLucros`.

### 2. Implementar Reajuste Salarial na Superclasse
* Adicione o método na classe `Funcionario`:
  ```java
  public void aplicarDissidio(double percentual)
  ```
* Se o percentual for positivo, acrescente ao `salarioBase`.
* Esse método deve ficar disponível automaticamente para `Gerente`, `Desenvolvedor` e `Diretor` sem precisar ser reescrito neles!

### 3. Validação no `Main.java`
* Instancie um `Diretor` com salário base de R$ 15.000,00, bônus de R$ 3.000,00 e PLR de R$ 8.000,00.
* Aplique um dissídio de 5% a todos os colaboradores.
* Exiba os holerites atualizados demonstrando os novos cálculos.

---

## ❓ Questão Teórica para Fixação:
> *Qual a diferença fundamental entre Sobrecarga (Overload) e Sobrescrita (Override) de métodos em Java? Cite a anotação que o compilador utiliza para nos proteger contra erros de digitação.*
