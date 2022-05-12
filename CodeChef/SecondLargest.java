import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            int[] arr = new int[3];
            while (t-- != 0) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[1]);
            }
        }
    }
}