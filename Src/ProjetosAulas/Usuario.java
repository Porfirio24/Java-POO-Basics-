public class Usuario {
    public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();
       
    smartTv.ligada();
    System.out.println("TV -> Ligada: " + smartTv.ligada);

    smartTv.desligada();
    System.out.println("TV -> Desligada: " + smartTv.ligada);

    smartTv.diminuirVolume();
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.diminuirVolume();
    System.out.println("Volume Atual: " + smartTv.volume);
    
    smartTv.aumentarVolume();
    System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.aumentarCanal();
    System.out.println("Canal Atual: " + smartTv.canal);

    smartTv.diminuirCanal();
    System.out.println("Canal Atual: " + smartTv.canal);

    smartTv.mudarCanal(54);
    System.out.println("Canal Atual: " + smartTv.canal);

    System.out.println("STATUS ATUAL: ");
    System.out.println("Tv Ligada: " + smartTv.ligada);
    System.out.println("Canal Atual: " + smartTv.canal);
    System.out.println("Volume Atual: " + smartTv.volume);

    }
}
