/*Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada. */

package Src.Exercicios.Questão6;

public class Fatura {
  private int id;
  private String descricao;
  private int qtd;
  private double preco;
}
