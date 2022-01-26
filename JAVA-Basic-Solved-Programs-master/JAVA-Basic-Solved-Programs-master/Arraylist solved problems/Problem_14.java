import java.util.ArrayList;
import java.util.Collections;

public class Problem_14 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        Collections.swap(num1 , 0 , 3);
        for (int x : num1 )
        {
            System.out.println(x);
        }
    }
}
