import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0) {
            int[] arr = new int[4];

            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int first = Math.max(arr[0] , arr[1]);

            int second = Math.max(arr[2], arr[3]);

            Arrays.sort(arr);

            if (first == arr[2] && second == arr[3] ||first == arr[3] && second == arr[2] ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}