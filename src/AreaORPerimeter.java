import java.util.Scanner;

public class AreaORPerimeter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int l = sc.nextInt();
            int b = sc.nextInt();

            int area = l*b;
            int perimeter = 2*(l+b);

            if (area > perimeter){
                System.out.println("Area");
                System.out.println(l*b);
            }else if (area < perimeter){
                System.out.println("Peri");
                System.out.println( 2*(l+b));
            }else{
                System.out.println("Eq");
                System.out.println(l*b);
                System.out.println( 2*(l+b));
            }

        }
    }
}
