import java.util.Scanner;

public class VCpairs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0)
        {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i<s.length; i++)
            {
                s[i] = sc.nextLine();
            }
            int count = 0;
            for (int i = 0; i<s.length; i++)
            {
                if (s[i] == "a" || s[i] == "e" || s[i] == "i" || s[i] == "o" || s[i] == "u")
                {
                    count = 0;
                    break;
                }
                else
                    count++;
            }
            System.out.println(count);
        }
    }
}
