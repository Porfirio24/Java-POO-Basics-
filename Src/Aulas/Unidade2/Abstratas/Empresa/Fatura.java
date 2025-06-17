package Src.Aulas.Unidade2.Abstratas.Empresa;

public class Fatura implements Pagavel {
  private float preco;
  private int qtd;
  
  public Fatura(float preco, int qtd){
  this.preco = preco;
  this.qtd = qtd;
  }

  public float obterValorPagamento(){
  return preco * qtd;
  }

  public String toString(){
  return "Preço: " + preco + "Quantidade: " + qtd + "valor total: " + obterValorPagamento();
  }
}
