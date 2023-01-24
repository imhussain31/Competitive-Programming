import java.util.Scanner;

public class Parity {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int n = sc.nextInt();

            if (n%2 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
