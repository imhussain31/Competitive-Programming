import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                if (a == b  && a == c && a == d && c == d && b == c && b==d){
                    System.out.println("YES");
                }else if (a == b && c == d){
                    System.out.println("YES");
                }else if (a == d && c == b){
                    System.out.println("YES");
                }else if (a==c && d == b){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
