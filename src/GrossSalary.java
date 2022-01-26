import java.text.DecimalFormat;
import java.util.Scanner;

public class GrossSalary {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#0.00");
        int t = sc.nextInt();
        while(t--!=0){
            double grossSalary , HRA , DA;
            double salary  = sc.nextDouble();
            if (salary < 1500){
                HRA =(salary*10/100);
                DA =  (salary*90/100);
            }
            else {
                DA = (salary*98/100);
                HRA = 500;
            }
            grossSalary = salary + HRA + DA ;
            System.out.println(dec.format(grossSalary));

        }
    }
}
