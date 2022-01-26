import java.util.Scanner;

public class SmallestNumbersOfNotes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                int count  = 0;
                int[] arr = new int[]{1, 2, 5, 10 ,50 , 100};
                for(int i=5; i>=0; i--){
                    count = count+n/arr[i];
                    n  =  n%arr[i];
                }
                System.out.println(count);
            }
        }
    }
}
