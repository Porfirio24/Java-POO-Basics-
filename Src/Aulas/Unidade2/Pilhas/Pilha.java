package Src.Aulas.Unidade2.Pilhas;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>();

        pilha.push(15);
        System.out.println(pilha + " <- topo");
        pilha.push(4.5F);
        System.out.println(pilha + " <- topo");
        pilha.push(3.69);
        System.out.println(pilha + " <- topo");
        pilha.push(148964564L);
        System.out.println(pilha + " <- topo");

        while(!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
            System.out.println(pilha + " <- topo");
        }
    }
}