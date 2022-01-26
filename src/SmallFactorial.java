import java.util.Scanner;

public class SmallFactorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int fact = 1;
                int n = sc.nextInt();
                for(int i = 1; i<=n; i++){
                    fact*=i;
                }
                System.out.println(fact);
            }
        }
    }
}
