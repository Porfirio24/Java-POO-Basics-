package Src.Exercicios.Questão48;

import java.util.ArrayList;

public class Agenda {
   private ArrayList<EntradaEmAgenda> compromissos;

    // Construtor
    public Agenda() {
        compromissos = new ArrayList<>();
    }

    // Método para adicionar compromisso
    public void adicionarCompromisso(int hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda novoCompromisso = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(novoCompromisso);
    }

    // Método listaDia
    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos no dia " + dia + "/" + mes + "/" + ano + ":");
        boolean encontrou = false;
        
        for (EntradaEmAgenda compromisso : compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso);
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum compromisso encontrado para esta data.");
        }
    }
}
