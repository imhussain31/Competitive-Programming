public class MaxNumber {
    int num1 , num2;

    MaxNumber(int num1 , int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    void MaxDisplay()
    {
        if (num1 > num2 ) System.out.println("Num1 is maximum");
        else System.out.println("Num2 is maximum");
    }
}
