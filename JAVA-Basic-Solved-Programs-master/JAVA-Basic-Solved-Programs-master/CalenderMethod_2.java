import java.sql.SQLOutput;
import java.util.Calendar;

public class CalenderMethod_2 {
    public static void main (String[] args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println("At present year:"+c.get(Calendar.YEAR));
        System.out.println("At present month:"+c.get(Calendar.MONTH));
        System.out.println("At present days:"+c.get(Calendar.DATE));
    }
}
