import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int n = sc.nextInt();
                    while (n != 0) {
                        if (n != 0) {
                            a *= 2;
                            n--;
                        }
                        if (n != 0) {
                            b *= 2;
                            n--;
                        }
                    }
                    if (a >= b) {
                        System.out.println(a / b);
                    } else {
                        System.out.println(b / a);
                    }
                }
                catch (Exception e){
                    return;
                }
            }
        }
    }
}