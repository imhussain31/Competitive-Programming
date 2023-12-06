
import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a!=b){
                count++;
            }
        }

        if (count != 0){
            System.out.println("Happy Alex");
        }else{
            System.out.println("Poor Alex");
        }
    }
}
