import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalExpenses {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#0.000000");
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                double q = sc.nextDouble();
                double p = sc.nextDouble();

                if (q > 1000){
                    double discount =p - (p*10)/100;
                    System.out.println(dc.format(discount*q));
                }else{
                    double total = p*q;
                    System.out.println(dc.format(total));
                }
            }
        }
    }
}
