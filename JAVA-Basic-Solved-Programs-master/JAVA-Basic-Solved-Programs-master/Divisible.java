public class Divisible {
    int num;

    Divisible(int num)
    {
        this.num = num;
    }
    void DivideDisplay()
    {
        if (num%11 == 0 && num%5 == 0) System.out.println("Divisible");
        else System.out.println("Not Divisible");
    }
}
