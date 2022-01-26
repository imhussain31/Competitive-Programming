import java.util.ArrayList;

public class problem_06 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        number.set(2,50);
        System.out.println(number);
    }

}
