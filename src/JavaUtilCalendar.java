import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //calendar.set(2020,0,25, 19,20,45);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 11);
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);
        Date fecha = calendar.getTime();
        System.out.println("calendar sin formato = " + fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaFormat = format.format(fecha);
        System.out.println("fechaFormat = " + fechaFormat);
    }
}
