import java.util.Scanner;

public class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int n = sc.nextInt();
                int max1 = 0, max2 = 0;
                int[] L = new int[n];
                int[] M = new int[n];
                for (int i = 0; i < n; i++) {
                    L[i] = sc.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    M[i] = sc.nextInt();
                }
                int maxInt1 = 0;
                for (int i = 0; i < L.length; i++) {
                    if (maxInt1 < L[i]) {
                        maxInt1 = L[i];
                        max1 = i + 1;
                    }
                }
                int maxInt2 = 0;
                for (int i = 0; i < M.length; i++) {
                    if (maxInt2 < M[i]) {
                        maxInt2 = M[i];
                        max2 = i + 1;
                    }
                }
                System.out.println(Math.min(max1, max2));
            }
        }
    }
}