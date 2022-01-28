public class Arithmetic {
    int add(int a , int b)
    {
        return a+b;
    }
}
class Adder extends Arithmetic
{

}
class Test
{
    public static void main (String[] args)
    {
        Adder ob = new Adder();
        System.out.println(ob.add(10 , 20));
    }
}
