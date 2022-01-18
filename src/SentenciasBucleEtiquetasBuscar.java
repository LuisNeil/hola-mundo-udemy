public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal trigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra ='t';
        buscar:
        for (int i = 0; i <= maxFrase ; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            if(frase.charAt(i) != letra){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" +palabra + "' en la frase");
    }
}
