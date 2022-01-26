public class LeapYear {
    int year;

    LeapYear(int Year )
    {
        this.year = year;
    }

    void display ()
    {
        if (year%4 == 0 || year%400 == 0)
            System.out.println("Leap Year");
        else if (year%100 == 0) System.out.println("Not Leap year");
    }
}
