import java.util.Scanner;

public class Coldplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
        int t = sc.nextInt();
            while (t-- != 0) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println(m/n);
            }
        }
    }
}