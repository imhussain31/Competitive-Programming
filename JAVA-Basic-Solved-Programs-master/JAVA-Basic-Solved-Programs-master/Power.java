import java.util.Scanner;

public class Power {
    static void power(double x , double y)
    {
        System.out.println(Math.pow(x , y));
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        power(a , b);

    }
}
