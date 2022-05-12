import java.util.Scanner;

public class RollerCoaster {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int x = sc.nextInt();
                int h = sc.nextInt();

                if (x >= h){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");

                }
            }
        }
    }
}
