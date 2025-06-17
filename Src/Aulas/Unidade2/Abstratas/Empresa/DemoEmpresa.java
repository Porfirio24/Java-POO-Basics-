package Src.Aulas.Unidade2.Abstratas.Empresa;

public class DemoEmpresa {
  public static void main(String[] args) {
    Assalariado a = new Assalariado("Pedro ", " 345876 ", 4000.00f);
    Fatura f = new Fatura( 124.98f ,   9 );

    System.out.println(a);
    System.out.println(f);
  }

  public static void impreimeCustoPgamento(Pagavel pag){
  System.out.println("Custo de Pagamento: " + pag.obterValorPagamento());
  }
}
