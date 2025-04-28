/*Faça um programa que retorne a distância entre dois pontos */

package Src.Aula;
import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        double x1,y1,x2,y2;
        Scanner ent = new Scanner(System.in);

        System.out.println("x1: ");
        x1 = ent.nextFloat();
        System.out.println("y1: ");
        y1 = ent.nextFloat();
        System.out.println("x2: ");
        x2 = ent.nextFloat();
        System.out.println("y2: ");
        y2 = ent.nextFloat();

        //raiz (x2-x1)^2 + (y2-y1)^2)
        double dist = Math.sqrt(Math.pow(x1-x2, 2.0) + Math.pow(y1-y2, 2.0));

        System.out.println("Distância entre ("+ x1 +", " + y1 + ") e ("+ x2 +", "+ y2 +") é : " + dist);

        ent.close();
    }
}
