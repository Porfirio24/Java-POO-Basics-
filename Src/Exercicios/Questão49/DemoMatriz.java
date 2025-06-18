package Src.Exercicios.Questão49;

public class DemoMatriz {
  public static void main(String[] args) {
        // Criando uma matriz de teste
        Matriz2x2 matrizTeste = new Matriz2x2(1.5f, 2.0f, 3.2f, 4.5f);
        
        // Imprimindo a matriz
        matrizTeste.imprimirMatriz();
        
        // Calculando e exibindo o determinante
        float determinante = matrizTeste.calcularDeterminante();
        System.out.printf("\nDeterminante: %.2f\n", determinante);
    }
}

