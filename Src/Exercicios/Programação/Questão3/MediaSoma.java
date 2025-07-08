/*Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usário */

package Src.Exercicios.Programação.Questão3;
import java.util.Scanner;

public class MediaSoma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Inforrme o Primeiro: ");
        num1 = leitor.nextDouble();
        System.out.println("Informe o Segundo: ");
        num2 = leitor.nextDouble();
        System.out.println("Informe o Terceiro: ");
        num3 = leitor.nextDouble();

        double soma = soma (num1,num2,num3);
        double media = media(num1, num2, num3);

        System.out.println("A media é: " + media);
        leitor.close();
    }
    public static double soma(double num1, double num2, double num3){
    
        return (num1+num2+num3);
    }
    public static double media(double num1, double num2, double num3){
      
        return (num1+num2+num3) / 3;
    }
}
