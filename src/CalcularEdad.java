import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese fecha de nacimiento con formato yyyy-MM-dd");
        String fechaStr = sc.next();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = df.parse(fechaStr);
        Date actual = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        int desde = Integer.parseInt(df.format(fechaNac));
        int hasta = Integer.parseInt(df.format(actual));
        int edad = (hasta - desde)/10000;
        System.out.println("edad = " + edad);
    }
}
