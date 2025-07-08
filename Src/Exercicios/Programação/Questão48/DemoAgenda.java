package Src.Exercicios.Programação.Questão48;

public class DemoAgenda {
   public static void main(String[] args) {
        // Criando uma agenda
        Agenda minhaAgenda = new Agenda();
        
        // Adicionando 2 compromissos
        minhaAgenda.adicionarCompromisso(14, 15, 10, 2023, "Reunião com cliente");
        minhaAgenda.adicionarCompromisso(9, 15, 10, 2023, "Consulta médica");
        minhaAgenda.adicionarCompromisso(16, 20, 10, 2023, "Entrega de projeto");
        
        // Listando compromissos no dia
        minhaAgenda.listaDia(15, 10, 2023);
    }
}
