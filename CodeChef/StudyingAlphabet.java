import java.util.Arrays;
import java.util.Scanner;

public class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String firstString = sc.next();
            int t = sc.nextInt();
            while (t-- != 0) {
                String secondString = sc.next();
                char[] ch2 = secondString.toCharArray();
                Arrays.sort(ch2);
                String newStr = String.valueOf(ch2);
                if (newStr.contains(firstString)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }

            }
        }
    }
}