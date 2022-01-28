import java.util.Scanner;

public class BookofPotionmaking {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int rem = 1, total = 0;
        if (n.length() != 10) System.out.println("Illegal ISBN");
        else {
            for (int i = 0; i < n.length(); i++) {
                rem = n.charAt(i);
                rem *= i + 1;
                total += rem;
            }
            if (total % 11 == 0) System.out.println("Legal ISBN");
            else System.out.println("Illegal ISBN");

        }
    }
}
