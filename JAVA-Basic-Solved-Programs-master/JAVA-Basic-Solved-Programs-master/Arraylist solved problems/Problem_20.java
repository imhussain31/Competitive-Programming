import java.util.ArrayList;

public class Problem_20 {
    public static void  main (String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>(3);
        num.add(10);
        num.add(20);
        num.add(30);
        num.ensureCapacity(6);
        num.add(40);
        num.add(50);
        num.add(70);
        System.out.println(num);

    }
}
