
import java.util.Scanner;

public class Test {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = 0;
        while (t--!=0)
        {
            n = sc.nextInt();
        }
        if (n%10 == 0) System.out.println("Yes");
        else System.out.println("No");
    }

}