import java.util.Scanner;

public class LittleElephantAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int[] arr = new int[a];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }

                if (sum <= b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}