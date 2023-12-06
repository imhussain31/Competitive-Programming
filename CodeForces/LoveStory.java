import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        while(t--!=0){
            String target = "codeforces";
            char[] ch = sc.next().toCharArray();
            count = 0;
            char[] targetCh = target.toCharArray();
            for (int i = 0; i<ch.length; i++){
                if (ch[i] != targetCh[i]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
