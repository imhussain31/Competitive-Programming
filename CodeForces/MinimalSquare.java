import java.util.Scanner;



public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a>b){
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println(Math.max(a*2 , b)* Math.max(a*2 , b));
        }
    }


}
