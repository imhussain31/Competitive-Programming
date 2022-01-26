public class Problem_02 {
    public static void main (String[] args)
    {
        int k=0;
        for (int i = 1; i<=4; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(++k);
            }
            System.out.println();
        }
    }
}
