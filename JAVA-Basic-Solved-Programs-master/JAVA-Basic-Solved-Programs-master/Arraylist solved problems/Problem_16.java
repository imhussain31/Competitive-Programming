import java.util.ArrayList;
import java.util.Collections;

public class Problem_16 {
    public static void main (String[] args)
    {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        System.out.println("Before clone : "+num1);
        ArrayList<Integer> newnum1 = (ArrayList<Integer>)num1.clone();
        System.out.println("After clone : "+newnum1);
    }
}
