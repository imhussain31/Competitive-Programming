import java.util.Scanner;

public class ProgramYourOwnCALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char ch=sc.next().charAt(0);
            if (b > 0) {
                switch (ch) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        System.out.println((float) a / b);
                        break;
                }
            }
        }
    }
}