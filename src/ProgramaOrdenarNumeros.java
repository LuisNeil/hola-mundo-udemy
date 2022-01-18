import java.util.Scanner;

public class ProgramaOrdenarNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese segundo numero");
        int num2 = sc.nextInt();
        
        String resultado = (num1 > num2) ? num1 + ", " +num2 : num2 + ", " + num1;
        System.out.println("resultado = " + resultado);
    }
}
