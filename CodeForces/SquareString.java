import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            String str  = sc.next();
            int len  = str.length()/2;
            String s1 = str.substring(0 ,len);
            String s2 = str.substring(len);

            if (s1.equals(s2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
