import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class IntToString {
    public static String findDay(int month, int day, int year) {
          String[] day_of_week = {"SATURDAY" , "SUNDAY" , "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" ,"FRIDAY"};
          Calendar c = Calendar.getInstance();
          c.set(year , month- 1 ,day);
          int i = c.get(Calendar.DAY_OF_WEEK);

          return day_of_week[i-1];

    }
}
