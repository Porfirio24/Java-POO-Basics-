package Src.Unidade1.Classes;
public class DemoData {
  public static void main(String[] args) {
    Data d1 = new Data(-13, 2, 2025);
    System.out.println(d1);

    Data d2 = new Data(2, 2, 2007);
    if (d1 != null) System.out.println(d2);

    Data d3 = Data.fabricaDeNatal(2025);
    System.out.println(d3);
  }
}
