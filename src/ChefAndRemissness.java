import java.util.Scanner;

public class ChefAndRemissness {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a > b){
                    System.out.println(a+" "+(a+b));
                }else{
                    System.out.println(b+" "+(a+b));
                }
            }
        }
    }
}
