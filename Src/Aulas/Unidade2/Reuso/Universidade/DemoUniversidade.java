package Src.Aulas.Unidade2.Reuso.Universidade;

public class DemoUniversidade {
  public static void main(String[] args) {
    RegistroAcademico registro = new RegistroAcademico("Pedro Lucas", "12345", "CeT");
    System.out.println(registro);

    RegistroPosGraduacao registroPos = new RegistroPosGraduacao("Pedro Lucas", "12345", "CeT", "Joao Paulo", "Mundo dos games");
    System.out.println(registroPos);
  }
}
