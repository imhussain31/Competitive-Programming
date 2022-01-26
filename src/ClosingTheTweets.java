import java.util.Scanner;

public class ClosingTheTweets {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int n =  sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i<arr.length; i++){
                    if (arr[i] == i) {
                        System.out.println(i);
                    }
            }

        }
    }
}
