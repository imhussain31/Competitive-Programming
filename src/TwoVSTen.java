import java.util.Scanner;

public class TwoVSTen {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int n = sc.nextInt();
            int cnt = 0;
                if (n % 10 == 0) {
                    cnt = 0;
                } else if (n%5 == 0) {
                    cnt++;
                }
                else{
                    cnt = -1;
                }
            System.out.println(cnt);
        }
    }
}
