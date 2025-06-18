package Src.Exercicios.Questão50;

class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    // Construtor
    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    // Método toString para exibir os dados
    public String toString() {
        return "ID: " + id + 
               "\nNome: " + nome + 
               "\nIdade: " + idade + 
               "\nTelefone: " + telefone + "\n";
    }
}
