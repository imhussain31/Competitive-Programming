
import java.util.Scanner;

public class ZeroOnesEqualOneZeros {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc  =new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int n = sc.nextInt();
            for (int i = 0; i<n; i++){

                if (i == 0 || i == n-1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
