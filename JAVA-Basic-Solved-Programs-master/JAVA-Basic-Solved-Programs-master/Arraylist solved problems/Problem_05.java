import java.util.ArrayList;

public class Problem_05 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.remove(3);
        System.out.println(number);
    }
}
