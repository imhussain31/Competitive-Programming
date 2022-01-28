import java.util.Scanner;

public class ReverseString {


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();

            String reverse_string = new StringBuilder(A).reverse().toString();

            if (reverse_string.equals(A)) System.out.println("Yes");
            else System.out.println("No");
        }
    }
