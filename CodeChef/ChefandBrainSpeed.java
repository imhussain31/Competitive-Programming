import java.util.Scanner;

public class ChefandBrainSpeed {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        if (x > y){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
