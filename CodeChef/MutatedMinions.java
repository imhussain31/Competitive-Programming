import java.util.Scanner;

public class MutatedMinions {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int[] arr = new int[x];
                int cnt = 0;
                for (int i = 0; i<arr.length; i++){
                    arr[i] = sc.nextInt();
                }
                for (int a : arr){
                    if ((a+y)%7 == 0){
                        cnt++;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}
