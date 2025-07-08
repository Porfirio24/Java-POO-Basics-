package Src.Exercicios.Programação.Questão51;

public class TesteProduto {

    public static void main(String[] args) {
        // Testes com diferentes quantidades de argumentos

        System.out.println("Produto de 2, 3, 4: " + CalculadoraProduto.produto(2, 3, 4));
        System.out.println("Produto de 5, 5: " + CalculadoraProduto.produto(5, 5));
        System.out.println("Produto de 10: " + CalculadoraProduto.produto(10));
        System.out.println("Produto de nenhum número (padrão): " + CalculadoraProduto.produto());
        System.out.println("Produto de 1, 2, 3, 4, 5: " + CalculadoraProduto.produto(1, 2, 3, 4, 5));
    }
}
