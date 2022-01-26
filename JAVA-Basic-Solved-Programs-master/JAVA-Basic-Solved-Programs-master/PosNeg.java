public class PosNeg {
    int num;

    PosNeg(int num)
    {
        this.num = num;
    }

    void display()
    {
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
