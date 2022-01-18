import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con formato yyyy-MM-DD");
        try {
            Date fecha =  format.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha del usuario es anterior a fecha2");
            }else if (fecha.equals(fecha2)){
                System.out.println("Fecha del usuario es igual a fecha actual");
            }
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser yyyy-MM-dd");
            //System.exit(1);
            main(args);
        }
    }
}
