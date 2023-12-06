import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = "";

            int[] arr = new int[n];

            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for (int i= 0; i<arr.length; i++){
                if (k >= arr[i]){
                    str+="1";
                    k-=arr[i];
                }else{
                    str+="0";
                }
            }
            System.out.println(str);
        }
    }
}
