import java.util.Scanner;

public class FromHeavenToEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
               double n = sc.nextDouble();
               double v1 = sc.nextDouble();
               double v2 = sc.nextDouble();

                double stairs = (Math.sqrt(2) * n) / v1;
                double elevator = (2*n) / v2;

                if (stairs < elevator) {
                    System.out.println("Stairs");
                } else if (elevator < stairs) {
                    System.out.println("Elevator");
                }
            }
        }
    }
}