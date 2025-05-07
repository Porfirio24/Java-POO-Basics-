/*Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

package Src.Exercicios.Questão5;

import java.util.Scanner;

public class ConversoMinutos {
  public static void main(String[] args) {
    
   Scanner leitor = new Scanner(System.in);

   System.out.println("Digite os Minutos");
   int minutosTotais = leitor.nextInt();

   int dias = minutosTotais / (24 * 60);//Dia = 1440 minutos
   int horas = (minutosTotais % (24 * 60))/ 60;
   int seg = minutosTotais % 60;

   System.out.printf("%d minutos:%d dias, %d horas, %d seg", minutosTotais,dias,horas,seg);

   leitor.close();
  }
}
