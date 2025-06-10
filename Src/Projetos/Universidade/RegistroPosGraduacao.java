package Universidade;

public class RegistroPosGraduacao {
  private RegistroAcademico registro;
  private String orientador;
  private String tituloTese;
  
  /*public RegsitroAcademicoPosGraduação(RegistroAcademico registro, String orientador, string tituloTese){
  }
  this.registro = registro;
  this.orientador = orientador;
  this.tituloTese = tituloTese;
  
  */

  public RegistroPosGraduacao(String nome, String matricula, String curso, String orientador, String tituloTese){
  this.registro = new RegistroAcademico(nome, matricula, curso);
  this.orientador = orientador;
  this.tituloTese = tituloTese;
  }

  public String toString(){
  return "RegistroAcademicoPosGraduacao" + "Registro = " + registro + "Orientador = " + orientador + "Titulos = " + tituloTese;
  }
}
