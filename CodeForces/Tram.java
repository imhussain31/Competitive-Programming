import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        int target = 0 ,sum = 0 ;
        while (t--!=0){
            int a =  sc.nextInt();
            int b = sc.nextInt();

            sum -= a;
            sum += b;

            if (sum > target){
                target = sum;
            }
        }
        System.out.println(target);
    }
}
