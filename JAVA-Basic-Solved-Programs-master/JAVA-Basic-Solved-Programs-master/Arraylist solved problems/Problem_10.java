import java.util.ArrayList;
import java.util.Collections;

public class Problem_10 {
    public static void main (String[] args)
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Before :"+colors);
        Collections.shuffle(colors);
        System.out.println("After :"+colors);

    }
}
