package Src.Aulas.Unidade2.Exceções;

public class Prova {
  public static void main(String[] args) {
    int respostas[] = {0, 1, 3, 5, 6, 7, 8, 6, 4, 2, 7, 4, 3, 8, 9};

    int contador[] = new int[9];

    for (int i = 0; i < contador.length; i++){
      contador[i] = 0;
    }
  
    for (int resp : respostas){
      try{
        contador[resp]++;
      } catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Resposta Invalida (Ocorreu uma exceção): " + resp + " Deve estar entre 0 e " + (contador.length -1));
      } catch (Exception e){
        System.out.println("Erro inesperado: " + e.getMessage());
      }
      
    }

    for (int i = 0; i < contador.length; i++){
      System.out.println("Respostas " + i + " Ocorreu " + contador[i] + " Vezes");
    }
  }
}
