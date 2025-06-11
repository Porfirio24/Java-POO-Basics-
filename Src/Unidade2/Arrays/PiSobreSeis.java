package Src.Unidade2.Arrays;

public class PiSobreSeis {
  public static void main(String[] args) {
    double termoDaSerie[] = new double [10000]; 

    for (int i = 0; i < termoDaSerie.length; i++){
      termoDaSerie[i] = 1.0/Math.pow(i+1, 2);
    }

    for (int i = 10; i <= 1000000; i*=10){
     calculaEMostraSomatoria(i, termoDaSerie);
    }
  }

  public static void calculaEMostraSomatoria(int num, double [] array){
    double soma = 0.0;
    for (int i = 0; i < array.length; i++){
     soma += array[i];
    }
    System.out.println(soma);
  }
}
