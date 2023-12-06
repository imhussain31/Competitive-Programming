import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            int target = sc.nextInt();

            if (target>=1900){
                System.out.println("Division 1");
            }else if (1600<= target && target <= 1899){
                System.out.println("Division 2");
            }else if (1400<= target && target <= 1599 ){
                System.out.println("Division 3");
            }else{
                System.out.println("Division 4");
            }
        }
    }
}
