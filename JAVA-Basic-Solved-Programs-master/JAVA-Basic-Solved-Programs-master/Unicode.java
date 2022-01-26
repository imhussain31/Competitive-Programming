import java.util.Scanner;

public class Unicode {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();

        System.out.println("Character(unicode point) = "+s.codePointAt(a));
    }
}
