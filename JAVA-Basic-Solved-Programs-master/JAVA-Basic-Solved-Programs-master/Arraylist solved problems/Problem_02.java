import java.util.ArrayList;
import java.util.Iterator;

public class Problem_02 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        Iterator itr = number.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
