import java.util.Scanner;

public class VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        if (k >=n && m >=n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
