import java.util.Scanner;

public class ChefAndNextGen {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        if(sc.hasNextInt()){
        int t = sc.nextInt();

        while (t--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (a*b <= x*y){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
}
