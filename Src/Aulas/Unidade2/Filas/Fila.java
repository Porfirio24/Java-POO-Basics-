package Src.Aulas.Unidade2.Filas;
import java.util.PriorityQueue;

public class Fila {
    public static void main(String[] args) {
        PriorityQueue<Double> fila = new PriorityQueue<>();

        fila.offer(9.5);
        fila.offer(1.5);
        fila.offer(7.5);
        fila.offer(3.5);
        fila.offer(5.5);

        while (fila.size()>0) {
            System.out.println(fila.poll());
        }
    }
}