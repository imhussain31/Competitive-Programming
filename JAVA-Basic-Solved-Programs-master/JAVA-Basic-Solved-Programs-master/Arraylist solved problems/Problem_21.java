import java.util.ArrayList;
import java.util.Collections;

public class Problem_21 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        num.set(1 , 99);

        System.out.println(num);
    }

}
