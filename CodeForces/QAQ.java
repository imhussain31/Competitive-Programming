import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        int sum = 0;
        for (int i = 0; i<ch.length; i++){
            if (ch[i]=='Q'){
                for (int j = i+1; j<ch.length; j++){
                    if (ch[j] == 'A'){
                        for (int k = j+1; k < ch.length; k++){
                            if (ch[k]=='Q'){
                               sum++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
