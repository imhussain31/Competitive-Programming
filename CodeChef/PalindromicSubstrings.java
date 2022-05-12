import java.util.Arrays;
import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
                String str1 = sc.next();
                String str2 = sc.next();

                char[] ch1 = str1.toCharArray();
                Arrays.sort(ch1);
                char[] ch2 = str2.toCharArray();
                Arrays.sort(ch2);

                String nStr1 = String.valueOf(ch1);
                String nStr2 = String.valueOf(ch2);

                if (nStr1.length() == nStr2.length()){
                if (nStr1.equals(nStr2)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }}else{
                    System.out.println("No");
                }

            }
        }
    }
}
