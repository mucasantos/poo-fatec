# 📝 Aula 04 — Exercício Prático: Modelando Relacionamentos em Java
**Carga Horária Estimada**: 4 horas (1h Teoria e Demonstração + 1h Análise de Código + 2h Hands-on)

---

## 🎯 Objetivo Pedagógico
Compreender e diferenciar na prática os 4 tipos de relacionamentos entre objetos:
1. **Associação Simples**: objetos que se conhecem.
2. **Agregação**: relação "tem-um" fraca, onde as partes têm ciclo de vida independente (ex: Cliente e Pedido).
3. **Composição**: relação "tem-um" forte, onde as partes dependem do todo para existir (ex: Item e Pedido).
4. **Dependência**: relação "usa-um" temporária, passada apenas por parâmetro de método.

---

## 🚀 Desafio Prático: Sistema de Gestão de Frota e Entregas

Você deve estender o sistema adicionando as seguintes classes no pacote `com.loja.modelo`:

### 1. Classe `Endereco` (Agregação)
* **Atributos privados**: `logradouro` (String), `numero` (int), `cidade` (String), `cep` (String).
* **Construtor** com todos os atributos.
* Getters e método `toString()`.
* **Relação**: Um `Cliente` pode ter um `Endereco` de entrega associado a ele.

### 2. Classe `FreteCalculadora` (Dependência)
* Não possui atributos de estado.
* Possui o método: `public double calcular(String cep, double pesoKg)`.
  * Regra: Se o CEP começar com "0" (São Paulo Capital), o valor base é R$ 15,00 + (R$ 2,50 * pesoKg).
  * Para os demais CEPs, o valor base é R$ 30,00 + (R$ 4,00 * pesoKg).

### 3. Integração com a classe `Pedido`
* Adicione um método em `Pedido`:
  ```java
  public double fecharPedido(CupomDesconto cupom, FreteCalculadora calculadoraFrete, double pesoTotalKg)
  ```
* O método deve:
  1. Calcular o total bruto com os itens do pedido.
  2. Aplicar o desconto do cupom (se houver).
  3. Chamar a calculadora de frete usando o CEP do endereço do cliente.
  4. Retornar e imprimir o valor final: `(Total com desconto) + Frete`.

---

## 🧪 Roteiro de Teste no `Main.java`
1. Instancie um endereço para o cliente.
2. Crie um pedido com pelo menos 3 itens.
3. Instancie a calculadora de frete e o cupom.
4. Chame o método `fecharPedido(...)` e imprima o extrato detalhado.

---

## ❓ Questão Teórica para Fixação (Entregar com o código):
> *Se o objeto `Pedido` for destruído da memória pelo Garbage Collector, o que acontece com os objetos `ItemPedido` e com o objeto `Cliente`? Explique relacionando com os conceitos de Composição e Agregação.*
