public class EvenOdd {
    int num;

    EvenOdd (int num)
    {
        this.num = num;
    }
    void displayOddEven()
    {
        if (num%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
