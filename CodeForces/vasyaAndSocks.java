import java.util.Scanner;

public class vasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = (n-1)/(m-1);

        System.out.println(n+result);
    }
}
