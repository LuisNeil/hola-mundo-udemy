public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String [] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        System.out.println("l = " + l);
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        System.out.println();

        String archivo = "alguna.imagen.jpeg";
        String [] archivoArr = archivo.split("\\.");
        int large = archivoArr.length;
        System.out.println("large = " + large);
        for (int k = 0; k < large; k++) {
            System.out.println(archivoArr[k]);
        }

        System.out.println("extension: "+archivoArr[large-1]);

    }
}
