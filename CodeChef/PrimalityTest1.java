import java.util.Scanner;

public class PrimalityTest1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                int cnt = 0;
                int[] arr = new int[n];
                for (int i = 2; i<n; i++){
                    if (arr[i] == i){
                        cnt = 0;
                    }
                    for(int j = i+i; j<=n; j+=i){
                        if (arr[i] == j){
                            cnt = 1;
                        }
                    }
                }
                if (cnt == 0){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
