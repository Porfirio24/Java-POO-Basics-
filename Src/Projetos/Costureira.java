import java.util.Scanner;

public class Costureira {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Bem-vindo---");

        System.out.println("Qual peça de deseja Modificar?");
        String nome = scanner.next();

        System.out.println("---Execelnte!---");

        System.out.println("Menu de Opções:");
        System.out.println("Opção 1: Modificar Tamanho");
        System.out.println("Opção 2: Mudar a Cor");
        System.out.println("Opção 3: Mudar Largura");
        int opcao = scanner.nextInt();

        switch (opcao){
           case 1:{
              System.out.println("Qual tamanho Desejado?");
              String tamanho = scanner.next();
              System.out.println("Novo Tamanho : " + tamanho);
              break;
           }
           case 2:{
              System.out.println("Qual a cor desejada?");
              String cor = scanner.next();
              System.out.println("Nova Cor : " + cor);
              break;
             }
            case 3:{
            System.out.println("Qual a lagura Desejada?");
            double largura = scanner.nextDouble();
            System.out.println("Nova Largura : " + largura);
            }
           default:
           System.out.println("Erro¹");

        }
    }
}
