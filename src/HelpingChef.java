import java.util.Scanner;

public class HelpingChef {
    public static void main (String[] aegs){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t  = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                if (n < 10){
                    System.out.println("Thanks for helping Chef!");
                }else{
                    System.out.println("-1");
                }
            }
        }
    }
}
