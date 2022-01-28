import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ItsMagic {
    public static void  main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] A = new int[t];
        int max = 0, count = 0;
        for (int i = 0; i<t; i++)
        {
            A[i] = sc.nextInt();

            if (A[i]%7 == 0 ) {
                if (max < A[i])
                    count++;
            }


        }
        System.out.println(count);
    }
}
