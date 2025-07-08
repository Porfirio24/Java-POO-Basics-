package Src.Exercicios.Programação.Questão49;

/*Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float usando um array de duas dimensões. Nesta classe, além do construtor, escreva um método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */

public class Matriz2x2 {
  
    private float[][] matriz;

    // Construtor que recebe os 4 elementos da matriz
    public Matriz2x2(float a, float b, float c, float d) {
        matriz = new float[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    // Método para calcular o determinante
    public float calcularDeterminante() {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }

    // Método para imprimir a matriz em formato matricial
    public void imprimirMatriz() {
        System.out.println("Matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
