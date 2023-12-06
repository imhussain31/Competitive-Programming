import java.util.Scanner;

public class ChefAndSubarrays {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while (t--!=0){
            int  n = sc.nextInt();
            int[] arr = new int[n];
            int cnt = 0;
            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i<arr.length; i++){
                int sum = 0 , product = 1;
                for (int j = i; j<arr.length; j++){
                    product*=arr[j];
                    sum+=arr[j];

                    if (product == sum){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}