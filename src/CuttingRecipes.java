import java.util.Scanner;

public class CuttingRecipes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int first = arr[0];
            for (int i = 0; i<arr.length; i++){
                if (arr.length % 2== 0){
                    if (arr[i]%first == 0){
                        System.out.print(arr[i]/first+" ");
                    }
                }else{
                    System.out.print(arr[i]+" ");
                }

            }
        }
    }
}
