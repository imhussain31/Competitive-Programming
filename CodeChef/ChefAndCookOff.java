import java.util.Scanner;

public class ChefAndCookOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                int[] arr = new int[5];
                int sum = 0;

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                if (sum == 0) {
                    System.out.println("Beginner");
                } else if (sum == 1) {
                    System.out.println("Junior Developer");
                } else if (sum == 2) {
                    System.out.println("Middle Developer");
                } else if (sum == 3) {
                    System.out.println("Senior Developer");
                } else if (sum == 4) {
                    System.out.println("Hacker");
                } else {
                    System.out.println("Jeff Dean");
                }
            }
        }
    }
}