public class Array {
    static int display(int x[])
    {
        int max = x[0];
        for (int i = 1; i<x.length; i++)
        {
           if (x[i] > max)
           {
               max = x[i];
           }
        }
       return max;
    }
    public static void main (String[] args)
    {
        int[] num = {10 , 20 , 30 , 40 ,50};
        System.out.println(display(num));
    }
}
