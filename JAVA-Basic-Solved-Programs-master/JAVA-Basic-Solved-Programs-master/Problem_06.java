import java.util.Scanner;

public class Problem_06 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && c > b) System.out.println("Increasing ordered");
        else if (a > b && b > c) System.out.println("Decreasing ordered");
        else System.out.println("Neither increasing or decreasing order");
    }
}
