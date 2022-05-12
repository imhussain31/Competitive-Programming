import java.util.Scanner;

public class EmailReminders {
    public static void main (String[] args){
        Scanner  sc =  new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            int u =  sc.nextInt();

            System.out.println(n - u);
        }
    }
}
