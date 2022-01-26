public class CheckADS {
    char ch;

    CheckADS(char ch)
    {
        this.ch = ch;
    }

    void displayADS()
    {
        if ((ch >= 'a' && ch <='z')||(ch >= 'A' && ch <='Z')) System.out.println("Alphabet");
        else if (ch >'1' && ch <'9') System.out.println("Numeric");
        else System.out.println("Special Character");
    }
}
