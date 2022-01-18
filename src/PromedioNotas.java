import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        int contNotas1 = 0;
        int contNotasMayoresA5 = 0;
        int contNotasMenoresA4 = 0;
        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        double sumaTotal = 0;

        double promedioNotasMayoresA5, promedioNotasMenoresA4;

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota N" + (i +1) +": ");
            nota = sc.nextDouble();

            if(nota == 0){
                error = true;
                break;
            }

            if(nota == 1){
                contNotas1++;
            }else {
                if(nota < 5){
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                }else if(nota < 4){
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if(error){
            System.out.println("Error: no pueden haber notas con valor 0, ha finalizado la ejecucion");
            System.exit(1);
        }

        System.out.println("La cantidad de notas 1 es de: " + contNotas1);

        if(contNotasMayoresA5 == 0){
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("El promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        if(contNotasMenoresA4 == 0){
            System.out.println("No se puede calcular el promedio de notas menores a 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("El promedio  de notas menores a 4: " + promedioNotasMenoresA4 );
        }

        double promedioTotal = sumaTotal / 20;
        System.out.println("promedio total de las notas es: " + promedioTotal);
    }
}
