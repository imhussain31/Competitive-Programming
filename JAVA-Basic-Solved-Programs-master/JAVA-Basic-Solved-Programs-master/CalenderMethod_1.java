import java.util.Calendar;

public class CalenderMethod_1 {
    public static void main (String[] args)
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date and Time :"+c.getTime());
        c.add(Calendar.DATE, - 15);
        System.out.println("15 days ago :"+c.getTime());
        c.add(Calendar.MONTH, -1);
        System.out.println("1 month ago :"+c.getTime());
        c.add(Calendar.YEAR , 2);
        System.out.println("After 2 years :"+c.getTime());
    }
}
