import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_09 {
    public static void main (String[] args)
    {
        ArrayList<String> num1 = new ArrayList<>();
        num1.add("1");
        num1.add("2");
        num1.add("3");
        num1.add("4");
        ArrayList<String> num2 = new ArrayList<>();
        num2.add("Black");
        num2.add("White");
        num2.add("Green");
        num2.add("Blue");
        Collections.copy(num1 , num2);
        System.out.println("num2 :"+num1);
    }
}
