import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int color = 0;
        for (int i = 0; i<m*n; i++){
                char ch = sc.next().charAt(0);
                if (ch == 'W' || ch =='B' || ch == 'G' )
                   color++;

        }
        if (color == n*m){
            System.out.println("#Black&White");
        }else{
            System.out.println("#Color");
        }
    }
}
