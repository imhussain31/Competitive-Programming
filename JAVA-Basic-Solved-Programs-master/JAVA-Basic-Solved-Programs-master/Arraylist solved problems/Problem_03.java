import java.util.ArrayList;

public class Problem_03 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(0 , 90);

        for (int x  : number )
        {
            System.out.println(x);
        }
    }
}
