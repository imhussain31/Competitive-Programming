import java.util.Scanner;

public class PackagingCupcakes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            int packages = 0;
            while (t--!=0){
                int n = sc.nextInt();
                int max = n;
                packages = max - packages;
                System.out.println(packages);
            }
        }
    }
}
