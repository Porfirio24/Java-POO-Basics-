package Src.Aula;

public class UnidadesVelocidade {
    public static void main(String[] args){
        double kph = 0.0, mps;

        System.out.println("k/h \t m/s");

        while (kph <= 50.0){
            mps = kph * 0.2778;
            System.out.println(kph + "\t" + mps);
            kph += 0.5;
        }
    }
}
