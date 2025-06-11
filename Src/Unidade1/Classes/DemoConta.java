package Src.Unidade1.Classes;
public class DemoConta {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria("Pedro", 2000, false);

    System.out.println(conta.toString());
  }
}
