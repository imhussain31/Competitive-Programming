import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int count = 0;
            int isPrime = a+b;

            if (isPrime <=1){
                System.out.println("Bob");
                return;
            }else{
               for (int i = 2; i<=isPrime; i++){
                   if (isPrime%i == 0){
                       count++;
                   }
               }

            }
            if (count>1){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
    }
}
