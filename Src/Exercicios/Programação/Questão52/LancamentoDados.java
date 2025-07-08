package Src.Exercicios.Programação.Questão52;

import java.util.Random;

public class LancamentoDados {

    public static void main(String[] args) {
        // Array para armazenar as frequências das somas (2 a 12)
        // Índices 0 e 1 não são usados
        int[] frequencias = new int[13];

        Random aleatorio = new Random();

        int lancamentos = 36000000;

        // Realiza os lançamentos
        for (int i = 0; i < lancamentos; i++) {
            int dado1 = 1 + aleatorio.nextInt(6); // número entre 1 e 6
            int dado2 = 1 + aleatorio.nextInt(6); // número entre 1 e 6

            int soma = dado1 + dado2;

            // Incrementa a contagem da soma
            frequencias[soma]++;
        }

        // Exibe os resultados
        System.out.println("Soma\tFrequência");

        for (int soma = 2; soma <= 12; soma++) {
            System.out.println(soma + "\t" + frequencias[soma]);
        }
    }
}
