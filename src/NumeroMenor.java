import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar cantidad de numeros a comparar");
        int cant = sc.nextInt();

        if(cant < 10){
            System.out.println("Error: debe comparar al menos 10 numeros enteros");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese el numero " +(i + 1) + ": ");
                numero = sc.nextInt();
                menor = (numero < menor ) ? numero : menor;
            }
            System.out.println("El numero menos es: " + menor);

            if(menor > 10){
                System.out.println("El numero " + menor + " es mayor que 10");
            }else {
                System.out.println("El numero " + menor + " es menor que 10");
            }

        }
    }
}
