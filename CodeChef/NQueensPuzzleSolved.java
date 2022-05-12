import java.util.Scanner;

public class NQueensPuzzleSolved {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int num = sc.nextInt();

                double target = Math.pow(0.143*num , num);

                System.out.println(Math.round(target));
            }
        }
    }
}
