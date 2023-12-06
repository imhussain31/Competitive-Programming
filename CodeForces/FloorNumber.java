import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count  = 1;
            for (int  i = 2; i<a; i+=b){
                count++;
            }
            System.out.println(count);
        }
    }
}
