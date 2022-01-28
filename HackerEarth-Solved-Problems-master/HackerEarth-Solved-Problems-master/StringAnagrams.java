import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

    static boolean isAnagram(String a, String b) {
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) {
            return false;
        }
        a.toLowerCase();
        b.toLowerCase();

        char[] c1 = a.toCharArray();
        char[] c2 = a.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String new_string1 = new String(c1);
        String new_string2 = new String(c2);

        if (new_string1.equals(new_string2)) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}