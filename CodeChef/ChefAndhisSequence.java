import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndhisSequence {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                int x = sc.nextInt();
                int[] arr1 =  new int[x];
                ArrayList<Integer> a = new ArrayList<>();
                for (int i = 0 ; i<arr1.length; i++){
                    arr1[i] = sc.nextInt();
                    a.add(arr1[i]);
                }
                int y = sc.nextInt();
                int[] arr2 =  new int[y];
                ArrayList<Integer> b = new ArrayList<>();

                for (int i = 0 ; i<arr2.length; i++){
                    arr2[i] = sc.nextInt();
                    b.add(arr2[i]);
                }

                boolean bol = a.containsAll(b);

                if (bol == true){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }
        }
    }
}
