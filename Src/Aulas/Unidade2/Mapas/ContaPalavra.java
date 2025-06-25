import java.util.TreeMap;

public class ContaPalavra{
    public static void main(String[] args) {
        TreeMap<String,Integer> mapa = new TreeMap<>();
        String texto = "A raposa marrom rápida salta sobre o cachorro prequiçoso. A raposa é ágil e esperta.";
        int qtd;
        String palavraMin;
        String[] palavras = texto.split(" ");

        for (String palavra : palavras) {
            palavraMin = palavra.toLowerCase();
            if (mapa.containsKey(palavraMin)) {
                qtd = mapa.get(palavraMin);
                mapa.put(palavraMin, qtd+1);
            } else {
                mapa.put(palavraMin, 1);
            }
        }
        
        for (String palavra : mapa.keySet()) {
            System.out.println(palavra + " " + mapa.get(palavra));
        }
    }
}