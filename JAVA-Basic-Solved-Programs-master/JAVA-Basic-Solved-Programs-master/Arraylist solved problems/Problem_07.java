import java.util.ArrayList;

public class Problem_07 {
    public static void main (String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        if (number.contains(50))
        {
            System.out.println("Element Found");
        }
        else
            System.out.print("Not Found");
    }
}
