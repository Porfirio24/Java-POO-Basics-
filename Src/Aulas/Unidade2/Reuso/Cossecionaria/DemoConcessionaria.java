package Src.Aulas.Unidade2.Reuso.Cossecionaria;

public class DemoConcessionaria {
  public static void main(String[] args) {
        AutomovelLuxo auto = new AutomovelLuxo(2023, "ferrari", "vermelho", true, true, true, true);
        System.out.println(auto);
        System.out.println(auto.quantoCusta());
    }
}
