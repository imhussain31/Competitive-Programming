import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo_01 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size : "+number.size());

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4 , 50);

        Iterator itr = number.iterator();

        while(itr.hasNext())
        {
            System.out.println(" "+itr.next());
        }
    }
}
