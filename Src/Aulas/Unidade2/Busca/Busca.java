package Src.Aulas.Unidade2.Busca;

import java.util.ArrayList;
import java.util.Collections;

public class Busca {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("vermelho");
        lista.add("azul");
        lista.add("roxo");
        lista.add("cinza");        
        lista.add("laranja");
        
        System.out.println("Lista inicial: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);

        busca(lista, "azul");
        busca(lista, "rosa");
        busca(lista, "laranja");
    }

    public static void busca(ArrayList<String> list, String alvo) {
        int idx;
        if (list.contains(alvo)){
            idx = Collections.binarySearch(list, alvo);
            System.out.println("Alvo encontrado em " + idx);
        } else {
            System.out.println("Alvo nao encontrado");
        }
    }
}