package Src.Exercicios.Questão48;

public class EntradaEmAgenda {
  private int hora;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    // Construtor
    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    // Método toString
    public String toString() {
        return String.format("%02d:%02d - %02d/%02d/%04d - %s", 
               hora, 0, dia, mes, ano, assunto);
    }

    // Método NoDia
    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
}
