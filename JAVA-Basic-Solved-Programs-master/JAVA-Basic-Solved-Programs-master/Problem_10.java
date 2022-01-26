import java.util.Scanner;

public class Problem_10 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int Exponent = sc.nextInt();
        int cube = 1 , i = 1;
        do{
            cube*=base;
            i++;
        }while (i <= Exponent);
        System.out.println(cube);
    }
}
