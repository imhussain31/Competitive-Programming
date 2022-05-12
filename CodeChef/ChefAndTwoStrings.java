import java.util.Scanner;

public class ChefAndTwoStrings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t  = sc.nextInt();
            int cnt = 0 , cnt1 = 0;
            while (t--!=0){
                String s1 = sc.next();
                String s2  =sc.next();

                char[] ch1 = s1.toCharArray();
                char[] ch2 = s2.toCharArray();

                for (int i = 0; i<ch1.length; i++){
                    if (ch1[i] == '?'){
                        ch1[i] = 'b';
                    }
                    if (ch2[i] == '?') {
                        ch2[i] = ch1[i];
                    }
                    if (ch1[i] != ch2[i]){
                        cnt++;
                    }
                }
                for (int i = 0; i<ch1.length; i++){
                    if (ch2[i] == 'a'){
                        ch1[i] = 'b';
                    }
                    if (ch2[i] == 'a') {
                        ch2[i] = 'b';
                    }
                    if (ch1[i] != ch2[i]){
                        cnt1++;
                    }
                }
                System.out.println(cnt+" "+cnt1);
            }
        }
    }
}
