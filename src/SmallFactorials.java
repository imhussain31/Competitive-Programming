import java.util.Scanner;

public class SmallFactorials {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n  = sc.nextInt();
                int fact = 1;
                for (int i = n; i>=1; i--){
                    fact*=i;
                }
                System.out.println(fact);
            }
        }
    }
}
