package Src.Aulas.Unidade2.Abstratas.Controle;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();
}