package Empresa;

public class Funcionario extends Pessoa {
  private String cargo;
  private double salario;

  public Funcionario(String nome, String identidade, String cargo, double salario){
  super(nome, identidade);
  this.cargo = cargo;
  this.salario = salario;
  }

  public String getCargo(){
  return cargo;
  }

  public double getSalario(){
  return salario;
  }

  public String toString(){
  return super.toString() + "\n" + "Cargo = " + cargo + "\n" + "Salario = " + salario;
  }

  
}
