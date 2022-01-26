import java.util.Scanner;

public class IsitaVOWELorCONSONANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            {
                char ch = sc.next().charAt(0);
                switch (ch) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': {
                        System.out.println("Vowel");
                        break;
                    }
                    default: {
                        System.out.println("Consonant");
                    }
                }
            }
        }
    }
}