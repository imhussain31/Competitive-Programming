import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if (i%2 ==0) {
                for (int j = 1; j <= m; j++) {
                    if (j >= m){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }

                }System.out.println();
            }
            else{
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }System.out.println();
            }

        }
    }
}
