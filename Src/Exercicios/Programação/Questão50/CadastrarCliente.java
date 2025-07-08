package Src.Exercicios.Programação.Questão50;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("Digite um ID negativo para encerrar o cadastro.\n");

        while (true) {
            System.out.print("Digite o ID do cliente: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            // Verifica se o ID é negativo para encerrar
            if (id < 0) {
                break;
            }
            
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();
            
            // Cria e adiciona o novo cliente à lista
            clientes.add(new Cliente(id, nome, idade, telefone));
            System.out.println("Cliente cadastrado com sucesso!\n");
        }
        
        // Exibe todos os clientes cadastrados
        System.out.println("\nLISTA DE CLIENTES CADASTRADOS:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        
        scanner.close();
    }
}
