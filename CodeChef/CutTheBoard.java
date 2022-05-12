import java.util.Scanner;

public class CutTheBoard {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int n = sc.nextInt();
                int m = sc.nextInt();

                System.out.println((n*m)-(n+m)+1);
            }
        }
    }
}
