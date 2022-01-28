import java.util.Scanner;

public class DiogonalProblem {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i<n; i++)
        {
            for (int j = 0; j<n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal diagonal
                if (i == j)
                    sum1 += a[i][j];

                // Condition for secondary diagonal
                if ((i + j) == (n - 1))
                    sum2 += a[i][j];
            }
        }
        int result = sum1 - sum2;
        System.out.println(Math.abs(result));
    }

}
