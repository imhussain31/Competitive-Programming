import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[1001];
        int  j = 1;

        for (int i = 1; i<=1666; i++){
            if (i%3 != 0){
                if (i%10 != 3){
                    arr[j] = i;
                    j = j +1;
                }
            }
        }

        int t = sc.nextInt();
        while (t--!=0){
            int k = sc.nextInt();
            System.out.println(arr[k]);
        }
    }
}
