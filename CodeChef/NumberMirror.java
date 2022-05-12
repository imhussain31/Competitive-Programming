import java.util.Scanner;

public class NumberMirror {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        if (sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(n);
        }
    }
}
