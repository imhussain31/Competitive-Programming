import java.util.Scanner;

public class LuckyFour {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int rem = 0 , cnt = 0;
                int n = sc.nextInt();
                while (n > 0){
                    rem = n%10;
                    if(rem == 4){
                        cnt++;
                    }
                    n/=10;
                }
                System.out.println(cnt);
            }
        }
    }
}
