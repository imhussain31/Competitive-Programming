import java.util.Scanner;

public class SumsInATriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int sum = 0;
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                for (int i = 0; i<n; i++){
                    for (int j = 0; j<=i; j++) {
                        arr[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i<n; i++){
                    for (int j = 0; j<=i; j++) {
                        arr[i][j]=arr[i][j]+Math.max(arr[i+1][j],arr[i+1][j+1]);
                    }
                }
                System.out.println(arr[0][0]);
            }
        }
    }
}
