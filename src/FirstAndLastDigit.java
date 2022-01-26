import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=10){
            int n = sc.nextInt();
            int last = n%10;
            int digit = (int) Math.log10(n);
            int first = (int) (n/ Math.pow(10 , digit));
            System.out.println(first+last);
        }
    }
}
