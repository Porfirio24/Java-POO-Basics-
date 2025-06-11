public class DemoPessoa {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Pedro", 1.84);

    System.out.println(p1.toString());

    p1.setNome("Pedro");

    System.out.println(p1.getNome());
  }
}
