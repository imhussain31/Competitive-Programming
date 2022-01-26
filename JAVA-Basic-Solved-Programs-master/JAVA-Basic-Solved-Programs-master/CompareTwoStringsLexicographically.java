import java.util.Scanner;

public class CompareTwoStringsLexicographically {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


            int b = s1.compareTo(s2);

            if (b > 0)
                System.out.println("s1 is greater than s2");
            else if (b == 0)
                System.out.println("s1 is equals to s2");
            else
                System.out.println("s1 is less than s2");

    }
}
