import java.util.Scanner;

public class PlayingWithMatches {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while(t--!=0){
            int a =  sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            int rem , result = 0;
            while(sum > 0){
                rem =  sum%10;
                if (rem == 2 || rem==3 || rem ==5){
                    result+=5;
                }
                if (rem == 9 || rem == 6 || rem == 0){
                    result+=6;
                }
                if (rem == 1){
                    result+=2;
                }
                if(rem == 4){
                    result+=4;
                }
                if (rem == 7){
                     result+=3;
                }
                if (rem == 8){
                    result+=7;
                }
                sum/=10;
            }
            System.out.println(result);
        }
    }
}
