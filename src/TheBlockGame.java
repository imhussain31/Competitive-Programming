import java.util.Scanner;

public class TheBlockGame {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                int rem,rev = 0;
                int Nonrev = n;
                while (n>0){
                    rem= n%10;
                    rev = (rev*10)+rem;
                    n/=10;
                }
                if (rev == Nonrev){
                    System.out.println("wins");
                }else{
                    System.out.println("loses");
                }
            }
        }
    }
}
