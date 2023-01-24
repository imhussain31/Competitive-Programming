import java.util.Scanner;

public class RanklistPages {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t--!=0){
            int a = sc.nextInt();
            count = 0;
            if (a>25){
                while (true) {
                    if (a>25){
                        ++count;
                        a -= 25;
                    }else{
                        ++count;
                      break;
                    }
                }
            }else{
                ++count;
            }
            System.out.println(count);
        }

    }
}
