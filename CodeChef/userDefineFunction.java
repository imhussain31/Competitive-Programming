import java.util.Scanner;

public class userDefineFunction {

    public static void add(int a){
       if (a%2 == 0){
           System.out.println("Even");
       }else{
           System.out.println("Odd");
       }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        add(n);
    }
}
