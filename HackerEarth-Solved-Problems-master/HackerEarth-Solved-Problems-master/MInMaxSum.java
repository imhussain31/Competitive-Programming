import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class MInMaxSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i<arr.length; i++)
        {
            arr[i] =sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int n : arr)
        {
            sum+=n;
            if (max > n)max = n;
            if (min < n)min = n;
        }
        System.out.println((sum - min)+" "+(sum - max));

    }
}
