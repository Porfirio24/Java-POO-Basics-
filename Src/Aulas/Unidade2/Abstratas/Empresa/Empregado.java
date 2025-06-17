package Src.Aulas.Unidade2.Abstratas.Empresa;

public abstract class Empregado implements Pagavel {
  private String nome;
  private String ctps;

  public Empregado(String nome,String ctps){
  this.nome  = nome;
  this.ctps = ctps;
  }

  public String toString(){
  return "Nome: " + nome + "CTPS: " + ctps + "Valor a Pagar: " + obterValorPagamento();
  }
}
