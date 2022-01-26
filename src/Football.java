import java.util.Scanner;

public class Football {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();


            while (t--!=0){
                int n = sc.nextInt();
                int[] arr1 = new int[n];
                int[] arr2  = new int[n];

                for (int i = 0; i<arr1.length; i++){
                    arr1[i] = sc.nextInt();
                }
                for (int i = 0; i<arr2.length; i++){
                    arr2[i] = sc.nextInt();
                }

                int max = 0;

                for (int i = 0; i<n; i++){
                    int target = arr1[i]*20 - arr2[i]*10;

                    if (target > max){
                        max = target;
                    }
                }

                System.out.println(max);
            }
        }
    }
}
