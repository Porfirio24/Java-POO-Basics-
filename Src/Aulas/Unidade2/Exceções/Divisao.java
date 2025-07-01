package Src.Aulas.Unidade2.Exceções;

import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, den;

    System.out.print("Numerador: ");
    num = sc.nextInt();

    System.out.print("Denominador: ");
    den = sc.nextInt();

    System.out.println("Resultado: " + num + "/" + den + " = " + divisaoInteira(num, den));

    sc.close();
  }

  public static int divisaoInteira(int numerador, int denomidaor){
    return numerador/denomidaor;
  }
}
