import java.util.Scanner;

public class EqualMethod {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.equals(s2)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}
