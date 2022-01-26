import java.util.Scanner;

public class Problem_01 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double Discriminant = Math.sqrt((b*b) - 4*a*c);

        double x1 = (-b + Discriminant)/2*a;
        double x2 = (-b - Discriminant)/2*a;

        System.out.println("X1 : "+x1);
        System.out.println("X1 : "+x2);

    }
}
