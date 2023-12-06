import java.util.Scanner;

public class SlowSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
           int max_t = sc.nextInt();
           int max_n = sc.nextInt();
           int sum_n = sc.nextInt();
            int T = sum_n/max_n;
            int r = sum_n%max_n;
            if(T < max_t)
                System.out.println(T*max_n*max_n + r*r);
            else
                System.out.println(max_t*max_n*max_n);
        }
    }
}
