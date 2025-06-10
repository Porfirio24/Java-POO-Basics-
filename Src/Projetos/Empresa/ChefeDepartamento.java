package Empresa;

public class ChefeDepartamento extends Funcionario{
  
  private String departamento;

  public ChefeDepartamento(String nome, String identidade, String cargo, double salario, String departamento){
  super(nome, identidade, cargo, salario);
  this.departamento = departamento;
  }
 
  public String getDepartamento(){
  return departamento;
  }

  public String toString(){
  return super.toString() + "\n" + "Departamento = " + departamento;
  }
  
}

