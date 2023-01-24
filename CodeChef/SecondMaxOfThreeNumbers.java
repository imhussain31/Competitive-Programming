import java.util.Scanner;

public class SecondMaxOfThreeNumbers {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();


        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a>b && b < c){
                System.out.println(c);
            }
            else if (a < b && b < c){
                System.out.println(b);
            }else if (a < b && c < b){
                System.out.println(a);
            }else if (a < b && b > c){

            }
        }
    }
}