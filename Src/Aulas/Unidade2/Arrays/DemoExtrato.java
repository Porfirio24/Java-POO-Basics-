package Src.Aulas.Unidade2.Arrays;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato ex = new Extrato();
        int op;
        double valor;

        do {
            System.out.println("0 - Visualizar");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Encerrar");
            op = sc.nextInt();
            
            switch(op) {
                case 0:
                    System.out.println(ex);
                    break;
                case 1:
                    System.out.print("Valor do deposito: ");
                    valor = sc.nextDouble();
                    ex.transacao(valor);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    valor = sc.nextDouble();
                    ex.transacao(-valor);
                    break;
                case 3:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(op != 3);

        sc.close();
    }
}