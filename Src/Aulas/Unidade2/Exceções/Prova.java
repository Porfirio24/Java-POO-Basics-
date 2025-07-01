package Src.Aulas.Unidade2.Exceções;

public class Prova {
  public static void main(String[] args) {
    int respostas[] = {0, 1, 3, 5, 6, 7, 8, 6, 4, 2};

    int contador[] = new int[9];

    for (int i = 0; i < contador.length; i++){
      contador[i] = 0;
    }
  
    for (int resp : respostas){
      contador[resp]++;
    }

    for (int i = 0; i < contador.length; i++){
      System.out.println("Respostas " + i + " Ocorreu " + contador[i] + " Vezes");
    }
  }
}
