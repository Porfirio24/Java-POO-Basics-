package Src.Exercicios.Questão1;

public class Time {
    private String nome;
    private String esporte;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;

     // Construtor
     public Time(String nome, String esporte) {
        this.nome = nome;
        this.esporte = esporte;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.pontos = 0;
    }

    // Métodos para registrar resultados
    public void registrarVitoria() {
        vitorias++;
        pontos += 3; // vitória vale 3 pontos
    }

    public void registrarEmpate() {
        empates++;
        pontos += 1; // empate vale 1 ponto
    }

    public void registrarDerrota() {
        derrotas++;
        // derrota não soma pontos
    }

    // Menu de informações
    public void exibirInformacoes() {
        System.out.println("Nome do Time: " + nome);
        System.out.println("Esporte: " + esporte);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + pontos);
    }

    /*Getters: você dá um acesso controlado: só pode ler o valor, não mudar. */
    public String getNome() {
        return nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getPontos() {
        return pontos;
    }
}

