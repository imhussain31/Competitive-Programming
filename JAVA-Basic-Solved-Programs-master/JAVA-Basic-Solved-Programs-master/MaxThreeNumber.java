public class MaxThreeNumber {
    int num1 , num2 , num3;
    MaxThreeNumber(int num1, int num2 , int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void ThreeMaxDisplay ()
    {
        if (num1 > num2 && num1 > num3) System.out.println("num1 is maximum");
        else if (num2 > num1 && num2 > num3) System.out.println("num2 is maximum");
        else System.out.println("num3 is maximum");
    }

}
