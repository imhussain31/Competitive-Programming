import java.util.Scanner;

public class MinimumCarsRequired {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        if (sc.hasNextInt()){
            int t =  sc.nextInt();
            while (t--!=0){
                int n =  sc.nextInt();
                int cnt = 0;
                for (int i = 1; i<n; i+=4){
                    if (i<n){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
