import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    int opcao;

    do {
    
        System.out.println("==== Calculadora ====");
        System.out.println("[1] Soma ");
        System.out.println("[2] Subtração ");
        System.out.println("[3] Multiplicação ");
        System.out.println("[4] Divisão ");
        System.out.println("[0] Sair");
        System.out.println("Escolha uma opção:");
        opcao = scanner.nextInt();

        if(opcao == 0){
            System.out.println("Encerrando...");
            break;
            
            }
       
        System.out.println("Digite o Primeiro número: ");
        double num1= scanner.nextDouble();

        System.out.println("Digite o Segundo número: ");
        double num2= scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao){
          case 1:
          resultado = num1 + num2;
          break;

          case 2:
          resultado = num1 - num2;
          break;

          case 3:
          resultado = num1 * num2;
          break;

          case 4:
          if (num2 != 0){
             resultado = num1 / num2;
         }else{
            System.out.println("Erro: divisão por zero!");
            operacaoValida = false;
        
        }
        break;
        default:
        System.out.println("Opção inválida!");
                    operacaoValida = false;
        }
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
    } while (opcao != 0);

    scanner.close();
    
    }
}
