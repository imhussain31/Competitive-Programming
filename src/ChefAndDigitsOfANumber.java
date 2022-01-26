import java.util.Arrays;
import java.util.Scanner;

public class ChefAndDigitsOfANumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();

            while (t--!=0){
               String str = sc.next();
               char[]  ch  = str.toCharArray();
               Arrays.sort(ch);
               int cnt  = 0;
               for (int i = 0; i<ch.length; i++){
                   if (ch[0] == '0'){
                       ch[0] = '1';
                       break;
                   }
                   if (ch[0] == '1'){
                       ch[0] = '0';
                       break;
                   }
               }
                for (int i = 0; i<ch.length; i++){
                    if (ch[0] == ch[i]){
                        cnt++;
                    }
                }
               if (cnt == ch.length){
                   System.out.println("Yes");
               }else{
                   System.out.println("No");
               }
            }
        }
    }
}
