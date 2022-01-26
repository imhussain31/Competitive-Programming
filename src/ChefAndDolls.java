import java.util.Scanner;

public class ChefAndDolls {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int cnt = 0;
                for (int i = 0; i<arr.length; i++ ){
                    arr[i] = sc.nextInt();
                }
                for (int x : arr){
                    if (x%2 != 0){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
