import java.util.Scanner;

public class MultiplicacionSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int numeroA = scanner.nextInt();

        System.out.println("Ingrese segundo numero: ");
        int numeroB = scanner.nextInt();
        int resultado = 0;

        boolean positivoA = numeroA > -1;
        boolean positivoB = numeroB > -1;

        int absolutoA = positivoA ? numeroA : -numeroA;

        for (int i = 0; i < absolutoA; i++) {
            resultado = resultado + numeroB;
        }

        if(!positivoA && !positivoB || !positivoA){
            resultado = -resultado;
        }
        System.out.println("El resultado es = " + resultado);
    }
}
