import java.util.Scanner;

public class LastAndFirstDigit {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=10){
                long n = sc.nextLong();
                long last = n%10;
                while (n > 10){
                    n/=10;
                }
                System.out.println(last + n);
            }
        }
    }
}
