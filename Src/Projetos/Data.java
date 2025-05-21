public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano){
  this.dia = dia;
  this.mes = mes;
  this.ano = ano;
    if(!dataValida()){
      dia = 1;
      mes = 1;
      ano =  2000;
    }
  }

  public Data fabricaDeDados(int dia, int mes, int ano){
     if(dia > 0 && dia <= 30 && mes <= 12 && ano > 0){
       return new Data(dia, mes, ano);
    }else {
     return null;
    }
  }
  
  public static Data fabricaDeNatal(int ano){
   return new Data(25, 12, ano);
  }
  private boolean dataValida(){
   return (dia > 0 && dia <= 30 && mes <= 12 && ano > 0);
  }

  public String toString(){
   return "dia = " + dia + ", mes = " + mes + ", ano = " + ano;
  }
}