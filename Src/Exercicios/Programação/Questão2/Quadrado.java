/*Escreva um programamque calcule a area de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário */

package Src.Exercicios.Programação.Questão2;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.println("Informe o valor: ");
        num = leitor.nextInt();

        int area = areaQuad(num);

        System.out.println("A area de " + num + " : " + area);

        leitor.close();
    }

    public static int areaQuad(int lado){
       return lado * lado;
    }
}
