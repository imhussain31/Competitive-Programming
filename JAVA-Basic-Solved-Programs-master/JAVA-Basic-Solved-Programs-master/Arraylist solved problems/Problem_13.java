import java.util.ArrayList;
import java.util.Collections;

public class Problem_13 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);

        num2.add(10);
        num2.add(20);
        num2.add(30);
        num2.add(40);

        for (int x  : num1 )
        {
            System.out.print(" "+num2.contains(x));

        }
    }
}
