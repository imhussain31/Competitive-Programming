import java.util.Scanner;

public class Problem_05 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c && c==a ) System.out.println("Neither all are equal or different");
        else System.out.println("All numbers are different");

    }
}
