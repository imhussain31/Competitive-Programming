import java.math.BigInteger;
import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int temp = z/x;
            int ans = temp*x+y;

            if (ans > z){
                ans-=x;
            }
            System.out.println(ans);

        }

    }
}
