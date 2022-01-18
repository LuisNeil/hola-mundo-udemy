public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Luis Tejeda";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        /*String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });*/

    }
}
