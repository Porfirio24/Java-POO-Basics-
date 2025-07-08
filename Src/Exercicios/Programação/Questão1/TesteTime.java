package Src.Exercicios.Programação.Questão1;

public class TesteTime {
    public static void main(String[] args) {
        // Criando o time
        Time time1 = new Time("Flamengo", "Futebol");

        // Registrando partidas
        time1.registrarVitoria();
        time1.registrarVitoria();
        time1.registrarEmpate();
        time1.registrarDerrota();
        time1.registrarVitoria();

        // Exibindo as informações
        time1.exibirInformacoes();
    }
}
