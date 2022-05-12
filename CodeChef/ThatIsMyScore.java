import java.util.Scanner;

public class ThatIsMyScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int n = sc.nextInt();
                int[] arr = new int[20];
                while (n-- != 0) {
                    int p = sc.nextInt();
                    int s = sc.nextInt();

                    if (arr[p] < s && p < 9) {
                        arr[p] = s;
                    }
                }
                int sum = 0;
                for (int i = 0; i < 9; i++) {
                    sum += arr[i];
                }
                System.out.println(sum);

            }

        }
    }
}