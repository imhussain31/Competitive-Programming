import java.util.Scanner;

public class ChefAndSnackDown {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int year = sc.nextInt();

                if (year == 2010 ||  year == 2015 || year == 2016 || year==2017 || year == 2019){
                    System.out.println("HOSTED");
                }else{
                    System.out.println("NOT HOSTED");
                }
            }
        }
    }
}
