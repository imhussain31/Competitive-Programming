import java.util.Scanner;

public class AreaOfTriangle {

    static double area(double a , double b)
    {
        return (0.5*a*b);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.println(area(b , h));
    }
}
