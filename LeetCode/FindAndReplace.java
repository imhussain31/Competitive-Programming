import java.util.Scanner;

public class FindAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int n = sc.nextInt();
            char[] a = sc.next().toCharArray();
            int[] new_a = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++){
                if (a[i] == 'a'){
                    a[i] = 0;
                    new_a[i] = a[i];
                }else if (a[i] == 'b'){
                    a[i] = 1;
                    new_a[i] = a[i];
                }else if(a[i] == 'c'){
                    a[i] = 1;
                    new_a[i] = a[i];
                }else{
                    a[i] = 1;
                    new_a[i] = a[i];
                }
            }


            for (int i = 0; i<new_a.length-1; i++){
                if (new_a[i] == new_a[i+1]){
                    count = -1;
                    break;
                }else{
                    count++;
                }
            }
            if (count ==  -1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
