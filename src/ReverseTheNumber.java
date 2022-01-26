import java.util.Scanner;

public class ReverseTheNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int rem,rev = 0;
            while (n > 0){
                rem = n%10;
                rev = rev*10 + rem;
                n/=10;
            }
            System.out.println(rev);
        }
    }
}
