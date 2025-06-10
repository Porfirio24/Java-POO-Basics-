package Empresa;

public class Demoempresa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Leandra", "236789");
    System.out.println(pessoa);

    Funcionario funcionario = new Funcionario("Kayc", "12345", "Atendentee", 2000.00);
    System.out.println(funcionario);

    ChefeDepartamento chefe = new ChefeDepartamento("Porfirio", "657890", "Gerente ds Empresa", 40000.00, "Adimistracao");
    System.out.println(chefe);
  }
 
}
