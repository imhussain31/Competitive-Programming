import java.util.Scanner;

public class ChefAndColoring {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            char[] ch = new char[n];
            String str =  sc.next();
            int cnt = 0;
            for (int i = 0; i<ch.length; i++){
                ch[i] = str.charAt(i);
            }
            for (int i = 0; i<ch.length; i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
