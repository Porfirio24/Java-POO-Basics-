import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("------Cadastro Cliente------");

    System.out.println("Nome Cliente: ");
    String nome = scanner.next();

    System.out.println("Sobrenome: ");
    String sobrenome = scanner.next();

    System.out.println("Numero da Agencia:");
    String agencia = scanner.next();

    System.out.println("Numero da Conta: ");
    int conta = scanner.nextInt();

    System.out.println("Quanto deseja Depositar?");
    double saldo = scanner.nextDouble();

    System.out.println("-----Cadastro Realizado!-----");

    System.out.println("Digite 1 para continuar...: ");
    System.out.println("digite 2 para sair...: ");
    System.out.println("Qual Deseja?: ");
    int opcao = scanner.nextInt();

    if (opcao == 1){
     System.out.println("----Bem-Vindo----");
     System.out.println("Cliente: " + nome + sobrenome);
     System.out.println("Sua Agência: " + agencia);
     System.out.println("Sua Conta: " + conta);
     System.out.println("Seu Saldo: "+ saldo);
    }else if (opcao == 2){
     System.out.println("Saindo... ");
    }else{
     System.out.println("Opção invalida! ");
    }

     scanner.close();
    }
    
}
