import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class PlusMinus {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int zero = 0, minus = 0 , plus = 0;
        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] == 0)zero++;
            if (arr[i] < 0)minus++;
            if (arr[i] > 0)plus++;
        }
        double plus_r = (double)plus/n;
        double zero_r = (double)zero/n;
        double minus_r = (double)minus/n;
        System.out.println(String.format("%.6f", plus_r));
        System.out.println(String.format("%.6f", zero_r));
        System.out.println(String.format("%.6f", minus_r));

    }
}
