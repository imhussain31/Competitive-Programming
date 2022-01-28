import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []args)
    {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (b >= 0 && h >= 0)
        {
            System.out.println(b*h);
        }
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
