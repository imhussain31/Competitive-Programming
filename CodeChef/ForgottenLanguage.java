import java.util.Scanner;

public class ForgottenLanguage {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t--!=0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                while (n--!=0){
                    String str1 = sc.next();
                    char[] ch1 = str1.toCharArray();

                    int l = sc.nextInt();
                    while (l--!=0){
                        String str2 = sc.next();
                        char[] ch2 = str2.toCharArray();
                        int cnt = 0;
                        for (int i = 0; i<str2.length(); i++){
                            if (ch1[i] == ch2[i]){
                                cnt++;
                            }
                        }
                        if (str2.length() == cnt){
                            System.out.println("YES");
                        }else{
                            System.out.println("NO");
                        }
                    }

                }
            }
        }
    }
}
