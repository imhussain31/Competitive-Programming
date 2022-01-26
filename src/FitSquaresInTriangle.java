import java.util.Scanner;

public class FitSquaresInTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int base = sc.nextInt();
                base = base - 2;
                base = Math.floorDiv(base , 2);
                System.out.println(base*(base+1)/2);
            }
        }
    }
}
