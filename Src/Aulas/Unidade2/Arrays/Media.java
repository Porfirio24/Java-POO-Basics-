package Src.Aulas.Unidade2.Arrays;
public class Media {
    public static void main(String[] args) {
        System.out.println(media(1,5,2,5));
        System.out.println(media(1,5,2,5,3,5));
        System.out.println(media(1,5,2,5,3,5,4,5));
    }

    public static double media(double...valores) {
        double soma = 0.0;
        for (double d : valores) {
            soma += d;
        }
        return (soma/valores.length);
    }
}