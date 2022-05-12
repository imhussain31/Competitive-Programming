import java.util.Scanner;

public class BinaryBaseBasics {


    public static void printReverse(char[] letters, int size) {

        for (int i = letters.length - 1; i >= 0; i--) {

        }

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int t = sc.nextInt();


            while (t-- != 0) {
                int len = sc.nextInt();
                int target = sc.nextInt();

                char[] ch = new char[len];

                if (target == 0) {
                    System.out.println("NO");
                } else {
                    for (int i = 1; i <= ch.length; i++) {
                        if(ch[target] == 0){
                            ch[target] = 1;
                        }
                        else if (ch[target] == 1){
                            ch[target] = 0;
                        }
                    }
                }

            }
        }
    }
}
