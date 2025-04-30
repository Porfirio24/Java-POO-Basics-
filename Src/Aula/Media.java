package Src.Aula;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double n1, n2, n3, m;

        System.out.print("Numero 1: ");
        n1 = leitor.nextDouble();
        System.out.print("Numero 2: ");
        n2 = leitor.nextDouble();
        System.out.print("Numero 3: ");
        n3 = leitor.nextDouble();

        m = media(n1,n2,n3);

        System.out.println("A media de " + n1 + ", " + n2 + ", " + n3 + " eh: " + m);

        leitor.close();
    }
    public static double media (double n1, double n2, double n3){
       return (n1 + n2 + n3) /3;
    }
   
}
