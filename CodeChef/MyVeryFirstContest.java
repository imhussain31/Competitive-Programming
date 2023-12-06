import java.util.Scanner;

public class MyVeryFirstContest {
    public static void main(String[] src){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        int c = sc.nextInt();


        int sum = a-b;
        int target = sum - c;

        System.out.println(sum+" "+target);
    }
}
