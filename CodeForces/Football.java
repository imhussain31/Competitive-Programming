import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder stringBuilder  = new StringBuilder();
        while (t--!=0){
            String str = sc.next();
            stringBuilder.append(str);
        }
        System.out.print(stringBuilder);

    }
}
