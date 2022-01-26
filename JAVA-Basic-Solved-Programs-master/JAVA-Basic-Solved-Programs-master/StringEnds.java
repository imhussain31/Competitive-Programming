import java.util.Scanner;

public class StringEnds {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean b  = s.endsWith("int");

        if (b == true) System.out.println("True");
        else System.out.println("False");
    }
}
