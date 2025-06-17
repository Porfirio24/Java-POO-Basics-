package Src.Aulas.Unidade2.Abstratas.Controle;

public abstract class Terrestre extends Veiculo {
    private int qtdRodas;

    public Terrestre(int capacidade, int qtdRodas) {
        super(capacidade);
        this.qtdRodas = qtdRodas;
    }   
}
