import java.util.Scanner;

public class GradingsStudents {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int differ;

        for (int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<arr.length; i++)
        {
            if (arr[i] > 33)
            {
                for (int j = 1; j<=100; j++)
                {
                    if (arr[i] <  (j*5))
                    {
                        differ = (j*5) - arr[i];
                        if (differ < 3)
                        {
                            System.out.println(j*5);
                            break;
                        }
                        else
                        {
                            System.out.println(arr[i]);
                            break;
                        }
                    }
                }
            }
            else
                System.out.println(arr[i]);

        }

    }

}
