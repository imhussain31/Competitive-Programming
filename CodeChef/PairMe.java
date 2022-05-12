import java.util.Scanner;

public class PairMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                if (x + y == z || x + z == y || y + z == x) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}