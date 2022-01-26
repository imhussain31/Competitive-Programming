import java.util.Scanner;

public class UnicodeBefore {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        System.out.println("Character(unicode point) = "+s.codePointBefore(n));
    }
}
