import java.util.Scanner;

public class ConjectIt {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        int check , result = 0;
        while (t--!=0)
        {
            int N = sc.nextInt();
            if (N%2!=0)
            {
                check = 3*N+1;
                if (check%2==0)
                {
                    result = check/2;
                    while (true)
                    {
                        result/=2;
                        if (result == 1)
                        {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
                else System.out.println("NO");
            }
            else if (N%2 == 0) System.out.println("YES");

        }
    }
}
