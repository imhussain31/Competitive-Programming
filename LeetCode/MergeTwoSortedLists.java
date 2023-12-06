import java.util.Scanner;

public class MergeTwoSortedLists {


    static int ceil(double num){
        int x = 0;
        if (num - (int)num >= .5) {
            x = (int) num + 1;
        }else{
            x = (int) num;
        }
        return x;
    }

    static int floor(double num){
        int x = 0;

        if (num - (int)num < .5 ) {
            x = (int) num;
        }
        return x;
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double num = sc.nextDouble();

        System.out.println(ceil(num));
        System.out.println(floor(num));



       
    }
}
