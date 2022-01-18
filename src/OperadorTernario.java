import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero : si es falso
        String estado = "";
        double promedio = 0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2.0 y 10.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 y 10.0");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 y 10.0");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 6 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
    }
}
