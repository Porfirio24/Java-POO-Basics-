package Src.Aulas.Unidade1.Classes;
public class CaixaBanco {
  public static int clientesAtendidos = 0;
  private int numeroCaixa;

  public CaixaBanco(int numeroCaixa){
   this.numeroCaixa = numeroCaixa;
  }
  
  public void iniciaAtendimento(){
  System.out.println("Caixa: " + numeroCaixa + " Atendendo cliente " + ++clientesAtendidos);
  }



  public String toString(){
    return "Numero Caixa " + numeroCaixa;
  }
}
