package Src.Aulas.Unidade1.Intro_Java;
import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartão {
    public static void main(String[] args) {
        String nome, numero,codigo;
        int mes, ano;
        boolean invalido;
         

        Scanner leitor = new Scanner(System.in);
        Calendar calendario =  Calendar.getInstance();

        int mesAtual = calendario.get(Calendar.MONTH)+ 1;
        int anoAtual = calendario.get(Calendar.YEAR);

     //System.out.println(calendario.get(Calendar.MONTH + "" + calendario.get(Calendar.YEAR)));

        System.out.print("Nome: ");
        nome = leitor.nextLine();
        System.out.print("Numero: ");
        numero = leitor.nextLine();
        System.out.print("Codigo: ");
        codigo = leitor.nextLine();
        

        do {
        System.out.print("Mes: ");
        mes = leitor.nextInt();
        System.out.print("Ano: ");
        ano = leitor.nextInt();

        invalido = (ano < anoAtual) || (ano == anoAtual && mes < mesAtual);

        if(!invalido) System.out.println("Cartão Invalido. Insira os dados novamente");
        }while (invalido);


        System.out.println("Cartão Invalido. Bem-Vindo" + nome + "-" +  numero +"-" + codigo);
        leitor.close();
    }
}
