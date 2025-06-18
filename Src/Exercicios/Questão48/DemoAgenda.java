package Src.Exercicios.Questão48;

public class DemoAgenda {
   public static void main(String[] args) {
        // Criando uma agenda
        Agenda minhaAgenda = new Agenda();
        
        // Adicionando 2 compromissos (substitua com a data do seu aniversário)
        minhaAgenda.adicionarCompromisso(14, 15, 10, 2023, "Reunião com cliente");
        minhaAgenda.adicionarCompromisso(9, 15, 10, 2023, "Consulta médica");
        minhaAgenda.adicionarCompromisso(16, 20, 10, 2023, "Entrega de projeto");
        
        // Listando compromissos no dia do aniversário (substitua com sua data)
        minhaAgenda.listaDia(15, 10, 2023);
    }
}
