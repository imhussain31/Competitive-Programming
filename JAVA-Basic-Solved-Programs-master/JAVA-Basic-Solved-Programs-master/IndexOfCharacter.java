public class IndexOfCharacter {
    public static void main (String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.";
        for (char i = 'a'; i<'z'; i++)
        {
            System.out.print(" "+i+" -");
            System.out.print(" "+str.indexOf(i)+",");
            System.out.println();
        }
    }
}
