import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int  t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                for (int i = 1; true; i++ ){
                    n-=i;
                    if (n == 0){
                        System.out.println(i);
                        break;
                    }else if (n < 0){
                        System.out.println(i - 1);
                        break;
                    }
                }
            }
        }
    }
}
