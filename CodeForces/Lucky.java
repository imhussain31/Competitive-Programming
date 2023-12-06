import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            String str  = sc.next();
            int len = str.length()/2;
            String str1 = str.substring(0 , len);
            String str2 = str.substring(len);

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int sum1 = 0 , sum2 = 0;

            while (len!=0){
                sum1 +=num1%10;
                num1/=10;
                sum2 +=num2%10;
                num2/=10;
                len--;
            }

            if (sum1 == sum2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
