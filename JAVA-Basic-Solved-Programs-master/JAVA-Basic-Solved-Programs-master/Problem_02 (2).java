import java.util.Scanner;

public class Problem_02 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        a = Math.round(a*1000.0)/1000.0;
        b = Math.round(b*1000.0)/1000.0;

        if (a == b) System.out.println("They are same");
        else System.out.println("They are different");
    }
}
