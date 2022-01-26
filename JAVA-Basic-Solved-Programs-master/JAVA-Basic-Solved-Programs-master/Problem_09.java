public class Problem_09 {
    public static void main (String[] args)
    {
        int[] num = new int[]{ 2 ,30 ,40 , -5 , 10 , 60 ,70 ,80 ,9};
        int max = num[0];
        for (int i = 0; i<num.length; i++)
        {
             if (num[i] < max)
             {
                 max = num[i];
             }
        }
        System.out.println(max);
    }
}
