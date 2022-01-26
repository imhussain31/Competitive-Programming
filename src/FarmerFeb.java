import java.util.Scanner;

public class FarmerFeb {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t  = sc.nextInt();
            while (t--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sum = a+b;
                int len = sum;
                int cnt = 0;
                for (int i = 2; i<len; i++){
                    if (sum%i == 0) {
                        sum++;
                        cnt++;
                        i = 2;
                    }
                }
                if (cnt == 0) {
                    sum++;
                    cnt++;
                    for (int i = 2; i<sum; i++){
                        if (sum%i == 0) {
                            cnt++;
                            sum++;
                            i = 2;
                        }

                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
