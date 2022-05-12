import java.util.Scanner;

public class HOWMANYDIGITSDOIHAVE {
    public static void main (String[]  args){
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                    int rem, rev = 0, cnt = 0;
                    while (n > 0) {
                        rem = n % 10;
                        rev = (rev * 10) + rem;
                        n /= 10;
                        cnt++;
                    }
                    System.out.println(cnt);
                }
        }
    }
}

