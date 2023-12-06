import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--!=0){
            String targetStr = "codeforces";
            char[] charArr = targetStr.toCharArray();
            char ch = sc.next().charAt(0);
            int count = 0;
            for (int i = 0; i<targetStr.length(); i++){
                if (charArr[i] == ch){
                   count++;
                }
            }
            if (count !=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
