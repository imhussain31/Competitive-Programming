public class RoundMethod {
    public static void main (String[] args)
    {
        double num = 23.12345;
        System.out.println("Before : "+num);
        num = Math.round(num * 1000.0) / 1000.0;
        System.out.println("After : "+num);

    }
}
