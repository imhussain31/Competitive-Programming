import java.util.ArrayList;
import java.util.Collections;

public class problem_15 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);

        num2.add(40);
        num2.add(50);
        num2.add(60);

        ArrayList<Integer> num3 = new ArrayList<>();
        num3.addAll(num1);
        num3.addAll(num2);
        System.out.println(num3);

    }
}
