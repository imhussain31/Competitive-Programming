import java.util.Scanner;

public class StringIndex {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The character at position "+a+" is "+s.charAt(a));
        System.out.println("The character at position "+b+" is "+s.charAt(b));
    }
}
