import java.util.Scanner;

public class AdaSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int m = sc.nextInt();
                int n = sc.nextInt();

                if ((m * n) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}