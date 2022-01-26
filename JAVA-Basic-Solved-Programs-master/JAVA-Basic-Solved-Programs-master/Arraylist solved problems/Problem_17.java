import java.util.ArrayList;
import java.util.Collections;

public class Problem_17 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println("After : "+num.size());
        num.removeAll(num);
        System.out.println("Before : "+num.size());

    }
}
