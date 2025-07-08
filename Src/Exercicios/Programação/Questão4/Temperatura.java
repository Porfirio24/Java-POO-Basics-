/*Escrava um programa que receba uma temperatura em  graus centigrados e a apresente em graus Fahrenheit */

package Src.Exercicios.Programação.Questão4;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double temp;

        System.out.println("Informe a Temperatura: ");
        temp = leitor.nextDouble();

        double fahren = convert(temp);

        System.out.println("A temperatura em Celcius: " + temp);
        System.out.println("A Temperatura em Fahren: " + fahren);
        
        leitor.close();
    }
    public static double convert(double temp){
    return (temp * 9/5) + 32;
    }
}
