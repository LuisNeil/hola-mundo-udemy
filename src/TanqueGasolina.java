import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double capacidadActual;

        System.out.println("Diga la capacidad actual del tanque. Min 0, Max 70 L");
        capacidadActual = sc.nextDouble();

        if(capacidadActual >=0 && capacidadActual < 20){
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35){
            System.out.println("Suficiente");
        }else if (capacidadActual >= 35 && capacidadActual < 40){
            System.out.println("Medio estanque");
        }else if (capacidadActual >= 40 && capacidadActual < 60){
            System.out.println("Lo tiene 3/4");
        }else if (capacidadActual >= 60 && capacidadActual < 70){
            System.out.println("Casi lleno");
        }else if (capacidadActual == 70){
            System.out.println("Lleno");
        }
    }
}
