package Src.Aulas.Unidade2.Conjunto;

import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> cores = new TreeSet<>();
        String corRef =  "preto";

        cores.add("preto");
        cores.add("azul");
        cores.add("preto");
        cores.add("laranja");
        cores.add("rosa");
        cores.add("vermelho");
        cores.add("cinza");
        System.out.println(cores);

        System.out.println("Antes(" + corRef + "):" + cores.headSet(corRef));
        System.out.println("A partir(" + corRef + "):" + cores.tailSet(corRef));
        System.out.println("1o: " + cores.first());
        System.out.println("Ultimo: " + cores.last());
    }
}
