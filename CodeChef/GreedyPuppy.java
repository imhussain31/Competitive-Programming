import java.util.Scanner;

public class GreedyPuppy {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int rem , max = 0;
                int n = sc.nextInt();
                int k = sc.nextInt();
                for (int i = 1; i<=k; i++){
                    rem = n%i;
                    if (rem > max){
                        max=rem;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
