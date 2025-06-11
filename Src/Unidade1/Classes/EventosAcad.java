package Src.Unidade1.Classes;
public class EventosAcad {
  private String nomeDoEvento;
  private String localDoEvento;
  private int numeroDeParticipantes;

  public EventosAcad(String n, String l, int p){
    this.nomeDoEvento = n;
    this.localDoEvento = (l.isEmpty() ? "UFERSA" : l);
    this.numeroDeParticipantes = (numeroDeParticipantes > 0 ? numeroDeParticipantes : 1);
  } 
  void mostrarEvento(){
  System.out.println("Nome do Eevento: " + nomeDoEvento);
  System.out.println("Local do Eventos: " + localDoEvento);
  System.out.println("Participantes: " + numeroDeParticipantes);

  }
}
