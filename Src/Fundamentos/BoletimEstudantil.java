import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite sua Primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua Terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.print("Media final: " + media);

        if (media < 6.0) {
            System.out.println(" Reprovado!");
        } else if (media == 6.0) {
            System.out.println("Na Média");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}
