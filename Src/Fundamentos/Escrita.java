public class Escrita {
    
    public static void main(String[] args) {

        String primeiroNome = " Francisco";
        String segundoNome = " Porfirio";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do Metodo:" + primeiroNome.concat("").concat(segundoNome);
    }
}
