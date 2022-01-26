import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            int max = 0, diff, player = 0;
            while (t-- != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b) {
                    diff = a - b;
                } else {
                    diff = b - a;
                }
                if (diff > max) {
                    max = diff;
                    if (a > b) {
                        player = 1;
                    } else {
                        player = 2;
                    }
                }
            }
            System.out.println(player + " " + max);
        }
    }
}