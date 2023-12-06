import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();

        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int count = 0 , sum = 0;

           while(sum <= n) {
               if (a > b) {
                   b += a;
                   sum = b;
                   count++;
               }
               else {
                       a += b;
                       sum = a;
                       count++;
               }
               if (sum > n) {
                   break;
               }

               }
            System.out.println(count);
           }

        }
}

