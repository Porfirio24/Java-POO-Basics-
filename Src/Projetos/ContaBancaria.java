public class ContaBancaria {
  private String  nome;
  private float saldo;
  private boolean especial;

  public ContaBancaria(String nome, float saldo, boolean especial){
  this.nome = nome;
  this.saldo = saldo;
  this.especial = especial;
  
  }

  public String toString(){
    return "Nome: " + nome + "\nSaldo:" + saldo + "\nEspecial:" + especial + (especial?"Sim" : "Não");
  }
}
