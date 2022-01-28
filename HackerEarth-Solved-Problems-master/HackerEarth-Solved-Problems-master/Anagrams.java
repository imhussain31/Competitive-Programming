import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Anagrams {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t--!=0)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();

            char[] s1 = a.toCharArray();
            char[] s2 = b.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            for (int i = 0; i<s1.length; i++)
            {

                    if (s1[i] == s2[i])
                    {
                        count = 0;
                    }
                        else count++;
            }

        }
        System.out.println(count);
    }
}
