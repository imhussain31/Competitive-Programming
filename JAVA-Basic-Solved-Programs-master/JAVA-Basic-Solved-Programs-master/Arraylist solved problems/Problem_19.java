import java.util.ArrayList;
import java.util.Collections;

public class Problem_19 {
    public static void main (String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Muhammad");
        names.add("Hussain");
        names.add("Nihan");

        System.out.println("Before : "+names);
        names.trimToSize();
        System.out.println("After : "+names);

        // remove extra memory

    }
}
