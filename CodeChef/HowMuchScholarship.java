import java.util.Scanner;

public class HowMuchScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int r = sc.nextInt();

            if (r >= 1 && r <= 50) {
                System.out.println("100");
            } else if (r >= 51 && r <= 100) {
                System.out.println("50");
            } else {
                System.out.println("0");
            }
        }
    }
}