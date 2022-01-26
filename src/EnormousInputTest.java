import java.util.Scanner;

public class EnormousInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            while (n-- != 0) {
                int t = sc.nextInt();
                if (t % k == 0) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
