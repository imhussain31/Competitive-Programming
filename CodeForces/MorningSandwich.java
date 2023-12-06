import java.util.Scanner;

public class MorningSandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();

            int ans = 2* Math.min(b , Math.min(c , h));

            if (b>c){
                ans+= 2* Math.min(b - c,h);
            }else{
                ans+= 2* Math.min(c - b,h);
            }
            System.out.println(ans);
        }
    }
}
