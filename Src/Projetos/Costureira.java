import java.util.Scanner;

public class Costureira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Bem-vindo ao Ateliê Virtual====");

        System.out.print("Qual peça você deseja modificar? ");
        String nome = scanner.nextLine();

        // Variáveis para armazenar alterações
        String tamanho = "não definido";
        String cor = "não definida";
        double largura = 0;
        String tecido = "não definido";

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menu de Opções ---");
            System.out.println("1 - Modificar Tamanho");
            System.out.println("2 - Mudar a Cor");
            System.out.println("3 - Mudar a Largura");
            System.out.println("4 - Mudar o Tecido");
            System.out.println("0 - Finalizar e Ver Resumo");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo tamanho: ");
                    tamanho = scanner.next();
                    System.out.println("Tamanho atualizado para: " + tamanho);
                    break;

                case 2:
                    System.out.print("Digite a nova cor: ");
                    cor = scanner.nextLine();
                    System.out.println("Cor atualizada para: " + cor);
                    break;

                case 3:
                    System.out.print("Digite a nova largura (em cm): ");
                    largura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Largura atualizada para: " + largura + " cm");
                    break;

                case 4:
                    System.out.print("Digite o novo tipo de tecido: ");
                    tecido = scanner.nextLine();
                    System.out.println("Tecido atualizado para: " + tecido);
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("\n=== RESUMO FINAL DAS ALTERAÇÕES ===");
        System.out.println("Peça modificada: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Largura: " + (largura == 0 ? "não definida" : largura + "cm"));
        System.out.println("Tecido: " + tecido);
        System.out.println("=======================================");
        System.out.println("Obrigado por usar o Ateliê Virtual!");

        scanner.close();
    }
}
