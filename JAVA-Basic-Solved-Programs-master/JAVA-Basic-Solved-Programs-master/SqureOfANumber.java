import java.util.Scanner;

public class SqureOfANumber {

     static int square(int a)
     {
         return a*a;
     }
     public static void main (String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         System.out.println(square(num));

     }
}
