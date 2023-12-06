import java.util.Scanner;

public class ChefAndBrainSpeed_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m<n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
