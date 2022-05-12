import java.util.Scanner;

public class PuppyAndSum {
    public static int sum(int d , int n){
        int ans = (n*(n+1))/2;
        for (int i = 1; i<d; i++){
            ans = (ans*(ans+1))/2;
        }
        return ans;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        b = Math.floorDiv(b , 2);
        System.out.println(b);
    }
}
