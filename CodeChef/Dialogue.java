import java.util.Scanner;

public class Dialogue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[]{"Jaber", "Hussain", "Jilan"};
        System.out.println("Enter your department :");
        String stuDept = sc.next();
        while (true) {
            if (stuDept.equals("CSE")) {
                System.out.println("May I come in Sir?");
            } else {
                System.out.println("No! You are not allowed");
                break;
            }
            for (int i = 0; i < str.length; i++) {
                System.out.println("Enter your name :");
                String name = sc.next();
                if (str[i].equals(name)) {
                    System.out.println("come in");
                } else {
                    System.out.println("No! your are not allowed!");
                }
            }

        }
    }
}