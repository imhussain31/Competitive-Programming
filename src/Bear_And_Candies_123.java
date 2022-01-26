import java.util.Scanner;

public class Bear_And_Candies_123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int t = sc.nextInt();

            while (t--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sumA = 0, sumB = 0;

                for (int i = 1; sumA<=a; i+=2){
                    sumA+=i;
                }
                for (int i = 2; sumB<=b; i+=2){
                    sumB+=i;
                }

                if (sumA > sumB){
                    System.out.println("Limak");
                }else{
                    System.out.println("Bob");
                }
            }
        }
    }
}