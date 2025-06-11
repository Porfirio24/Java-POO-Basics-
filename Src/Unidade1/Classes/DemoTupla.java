package Src.Unidade1.Classes;

public class DemoTupla {
   public static void main(String[] args) {
        Tupla<Integer,Float> t1 = new Tupla<>(10, 3.5F);
        Tupla<Double,String> t2 = new Tupla<>(2.687, "UFERSA");

        System.out.println("Tupla 1 : (" + t1.getPrimeiro() + "," + t1.getSegundo() + ")");
        System.out.println("Tupla 2 : (" + t2.getPrimeiro() + "," + t2.getSegundo() + ")");
    }
}
