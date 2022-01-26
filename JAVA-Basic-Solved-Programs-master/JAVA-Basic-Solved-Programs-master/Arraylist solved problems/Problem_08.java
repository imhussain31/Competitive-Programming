import java.util.ArrayList;
import java.util.Collections;

public class Problem_08 {
    public static void main (String[] args)
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Cat");
        color.add("doll");
        color.add("Bat");
        color.add("Apple");

        Collections.sort(color);
        System.out.println(color);
    }

}
