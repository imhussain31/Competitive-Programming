import java.util.Scanner;

public class PlayPiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- != 0) {
                String str = sc.next();
                char[] ch = str.toCharArray();
                int cnt = 0;
                for (int i = 0; i < ch.length; i += 2) {
                    if (ch[i] == 'A' && ch[i + 1] == 'B') {
                        continue;
                    } else if (ch[i] == 'B' && ch[i + 1] == 'A') {
                        continue;
                    } else {
                        cnt++;
                        break;
                    }
                }
                if (cnt == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}