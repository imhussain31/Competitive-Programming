import java.util.Scanner;

public class ChefAndTheWildcardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- != 0) {
                int cnt = 0;
                String x = sc.next();
                String y = sc.next();
                char[] ch1 = x.toCharArray();
                char[] ch2 = y.toCharArray();
                for (int i = 0; i < ch1.length; i++) {
                    if (ch2[i] == '?') {
                        ch2[i] = ch1[i];
                    }
                    if (ch1[i] == '?') {
                        ch1[i] = ch2[i];
                    }
                }
                for (int i = 0; i < ch1.length; i++) {
                    if (ch2[i] == '?') {
                        ch2[i] = 'e';
                    }
                    if (ch1[i] == '?') {
                        ch1[i] = 'e';
                    }
                    if (ch1[i] == ch2[i]) {
                        cnt++;
                    } else {
                        cnt--;
                    }
                }
                if (ch1.length == cnt) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }
    }
}