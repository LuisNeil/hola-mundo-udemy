import java.util.Scanner;

public class NumeroDiasMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el mes del 1 al 12");
        int mes = sc.nextInt();
        System.out.println("Ingrese el anio YYYY");
        int numDias = 0;
        int anio = sc.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes ==7 || mes == 8 || mes == 10 || mes == 12){
            numDias = 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes ==11){
            numDias = 30;
        }else if (mes == 2){
            if((anio & 400) == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numDias = 29;
            }else {
                numDias = 28;
            }
        }
        System.out.println("numDias = " + numDias);
    }
}
