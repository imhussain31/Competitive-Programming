import java.util.Scanner;

public class BinaryAdd {
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a , 2);
        int num2 = Integer.parseInt(b , 2);
        int sum  = num1 + num2;
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11" ,"1"));

    }
}
