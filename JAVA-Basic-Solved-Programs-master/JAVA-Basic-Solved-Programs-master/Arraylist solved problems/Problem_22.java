import java.util.ArrayList;

public class Problem_22 {
    public static void main  (String[] args)
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Black");
        color.add("White");
        color.add("Blue");
        for (String x : color )
        {
            System.out.println(x.indexOf(x));
            System.out.println(x);
        }
    }
}
