package Src.Unidade1.Intro_Java;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Dia: ");
        dia = leitor.nextInt();
        System.out.println("Mês: ");
        mes = leitor.nextInt();
        System.out.println("Ano: ");
        ano = leitor.nextInt();

        System.out.print(dia + " de ");

        if (mes==1){
        System.out.print("Janeiro");
        }else if(mes==2){
            System.out.print("Fevereiro");
        }else if (mes==3){
        System.out.print("Março");
        }else if (mes==4){
         System.out.print("abril");
        }else if (mes==5){
        System.out.print("Maio");
        }else if (mes==6){
        System.out.print("Junho");
        }else if (mes==7){
        System.out.print("Julho");
        }else if (mes==8){
        System.out.print("Agosto");
        }else if(mes==9){
        System.out.print("Setembro");
        }else if(mes==10){
        System.out.print("Outubro");
        }else if(mes==11){
        System.out.print("novembro");
        }else{
        System.out.print("Dezembro");
        }
        System.out.print(" de "+ ano);

        leitor.close();
    }
}
