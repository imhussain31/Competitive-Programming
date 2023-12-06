import java.util.Scanner;

public class GrabtheCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();

        while(t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i<arr.length; i++){
                if (arr[i]%2 == 0){
                    sum1+=arr[i];
                }else{
                    sum2+=arr[i];
                }
            }
            if (sum1 > sum2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
