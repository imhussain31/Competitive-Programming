import java.util.Scanner;

public class ChefAndOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) {
                    System.out.println(">");
                } else if (a < b) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            }
        }
    }
}