import java.util.Arrays;
import java.util.Scanner;

public class Lapindromes {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                String s1 = sc.next();
                int len = s1.length();
                if (len % 2 != 0) {
                    String s1a = s1.substring(0, (s1.length() / 2));
                    String s1b = s1.substring((s1.length() / 2 + 1));
                    char[] c1 = s1a.toCharArray();
                    Arrays.sort(c1);
                    String News1a = new String(c1);
                    char[] c2 = s1b.toCharArray();
                    Arrays.sort(c2);
                    String News1b = new String(c2);
                    if (News1a.contains(News1b)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    String s1a = s1.substring(0, (s1.length() / 2));
                    String s1b = s1.substring((s1.length() / 2));
                    char[] c1 = s1a.toCharArray();
                    Arrays.sort(c1);
                    String News1b = new String(c1);
                    char[] c2 = s1b.toCharArray();
                    Arrays.sort(c2);
                    String News1a = new String(c2);
                    if (News1b.contains(News1a)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }


            }
        }
    }
}
