# 📝 Aula 08 — Exercício Prático: Modelagem UML e Codificação Completa
**Carga Horária Estimada**: 4 horas (1h Teoria e Leitura UML + 1h Mapeamento UML->Java + 2h Hands-on)

---

## 🎯 Objetivo Pedagógico
Capacitar o aluno a ler um cenário do mundo real, desenhar um **Diagrama de Classes UML** com as setas corretas e, em seguida, codificar o sistema em Java com fidelidade ao modelo.

Material consulta: [https://www.alura.com.br/conteudo/ciclo-vida-aplicacoes-modelando-desenvolvendo-implantando-software?srsltid=AYCX9vJL2gq-Z-NFdkVm8hgI-pyhRB58YYzUQcGARUDT4QjCappMe2-g]
---

## 🚀 Desafio Prático: Sistema de Estacionamento Rotativo

### Cenário:
O estacionamento precisa gerenciar a entrada e saída de veículos.
1. Existe uma classe abstrata `Veiculo` com atributos privados `placa` (String) e `horaEntrada` (int).
2. As subclasses `Carro` e `Moto` herdam de `Veiculo`.
3. Existe uma interface `Tarifavel` com o método `double calcularValor(int horaSaida)`.
   * Para `Carro`, a hora custa R$ 10,00.
   * Para `Moto`, a hora custa R$ 6,00.
4. O estacionamento possui um `Ticket` composto que registra a vaga ocupada.
5. Um `Cliente` associado ao veículo com `nome` e `telefone`.

---

## 📋 Entregáveis:
1. **Diagrama UML**: Desenhe o diagrama em formato Mermaid (ou em papel/ferramenta visual) com visibilidade (`+`, `-`, `#`), herança e interface.
2. **Código Java**: Codifique todas as classes respeitando 100% o que foi modelado no diagrama.
3. **Classe `Main`**: Demonstre o cálculo do valor a pagar para uma moto e para um carro que ficaram 3 horas no estacionamento.
