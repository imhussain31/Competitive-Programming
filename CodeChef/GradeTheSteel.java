import java.util.Scanner;

public class GradeTheSteel {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while(t--!=0){
                int har = sc.nextInt();
                double car = sc.nextDouble();
                int ten = sc.nextInt();
                if (har > 50 && car < 0.7 && ten > 5600){
                    System.out.println("10");
                }
                else if (har > 50 && car < 0.7){
                    System.out.println("9");
                }
                else if (car < 0.7 && ten > 5600){
                    System.out.println("8");
                }
                else if (har > 50 && ten > 5600){
                    System.out.println("7");
                }else if (har > 50 || ten > 5600 || car < 0.7){
                    System.out.println("6");
                }
                else{
                    System.out.println("5");
                }

            }
        }
    }
}
