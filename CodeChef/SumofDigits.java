import java.util.Scanner;

public class SumofDigits {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while(t--!=0){
                int sum = 0;
                int n = sc.nextInt();
                while(n > 0){
                    int digit = n%10;
                    sum+=digit;
                    n/=10;
                }
                System.out.println(sum);
            }

        }
    }
}
