import java.util.Scanner;

public class PrimalityTest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n =sc.nextInt();
                int cnt = 0;
                if (n< 2){
                    System.out.println("no");
                    continue;
                }
                for (int i = 2; i<=Math.sqrt(n); i++){
                    if (n%i == 0){
                        cnt = 1;
                        break;
                    }
                }
                if (cnt == 1){
                    System.out.println("no");
                }else{
                    System.out.println("yes");
                }
            }
        }
    }
}
