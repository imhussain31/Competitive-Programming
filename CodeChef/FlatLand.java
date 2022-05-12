import java.util.Scanner;

public class FlatLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int root = (int)Math.sqrt(n);

            if (root * root < n) {
                int res = n - root * root;
                System.out.println((int) Math.sqrt(res));
            }
        }
    }
}