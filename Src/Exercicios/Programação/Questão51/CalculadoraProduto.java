package Src.Exercicios.Programação.Questão51;
// Classe que contém o método para calcular o produto de inteiros
public class CalculadoraProduto {

    /**
     * Calcula o produto de uma quantidade variável de inteiros.
     * @param numeros inteiros a serem multiplicados
     * @return o produto dos números fornecidos
     */
    public static int produto(int... numeros) {
        int resultado = 1;

        for (int n : numeros) {
            resultado *= n;
        }

        return resultado;
    }
}
