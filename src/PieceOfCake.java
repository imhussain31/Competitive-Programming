import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                String str = sc.next();
                int len = str.length()/2;

                String[] part = {str.substring(0, len),str.substring(len)};

                if (part[0].length() == part[1].length()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}