import java.util.Scanner;

public class StringequalsIgnor {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

           boolean b = s1.equalsIgnoreCase(s2);
           if (b == true) System.out.println("Equals");
           else System.out.println("Not Equals");
    }
}
