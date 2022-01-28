import java.util.Scanner;

public class AppleAndOrange {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextInt();
        long v1 = sc.nextInt();
        long x2 = sc.nextInt();
        long v2 = sc.nextInt();
        int p = 0;
        while (x1 < 10000000)
        {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2)
            {
                p = 1;
                break;
            }
        }
        if (p == 1 ) System.out.println("YES");
        else System.out.println("NO");
    }
}
