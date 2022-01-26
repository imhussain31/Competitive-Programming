import java.util.Scanner;

public class ContainMethod {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = "Muhammad";
        String s2 = sc.nextLine();

        if (s1.contains(s2))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
