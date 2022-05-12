import java.util.Scanner;

public class TanuAndHead_bob {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            int cnt = 0;
            for (int i = 0; i<n; i++){
                if (ch[i] == 'Y'){
                    System.out.println("NOT INDIAN");
                    break;
                }
                else if (ch[i] == 'I'){
                    System.out.println("INDIAN");
                    break;
                }
                else{
                    cnt++;
                }
            }
            if (cnt == ch.length){
                System.out.println("NOT SURE");
            }
        }
    }
}
