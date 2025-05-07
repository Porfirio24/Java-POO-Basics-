package Src.Aulas;
import java.text.DecimalFormat;

public class UnidadesVelocidade {
    public static void main(String[] args){
        double kph = 0.0, mps,mph,pps;

        System.out.println("k/h \t m/s \n");

        while (kph <= 50.0) {
            mps = kph * 0.2778;
            mph = kph * 0.6214;
            pps = kph * 0.9113;

            //if (kph < 10) System.out.print("0");
            //System.out.printf("%.2f \t", kph);
            //if (mps < 10) System.out.print("0");
            //System.out.printf("%.2f \n", mps);
            //kph += 0.5;
            while (kph <= 50.0){
            System.out.print(new DecimalFormat("00.00").format(kph) + "\t");

            System.out.print(new DecimalFormat("00.00").format(mps) + "\t");
            System.out.print(new DecimalFormat("00.00").format(mph) + "\t");
            System.out.print(new DecimalFormat("00.00").format(pps) + "\t");
            }
        }
    }
}
