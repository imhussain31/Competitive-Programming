import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class IgnoreCase {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}
