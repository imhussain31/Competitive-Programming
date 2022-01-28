import java.util.Scanner;

public class StringTokens {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.trim();
        if (s.length() == 0)
        {
            System.out.println(0);
            return;
        }
        String[] word = s.split("[^A-Za-z]+");
        System.out.println(word.length);
        for (String w : word)
        {
            System.out.println(w);
        }
    }

}
