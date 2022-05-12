import java.util.Scanner;

public class ATM {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int x = sc.nextInt();
            double y = sc.nextDouble();

            if (x%5==0 && x < y){
                System.out.println(String.format("%.2f",(y-x)-.50));
            }
            else{
                System.out.println(String.format("%.2f",y));
            }
        }
    }
}