public class CharacterArray {
    public static void main (String[] args)
    {
        char[] arr_num = new char[] { '1', '2', '3', '4' , '6' };
        String str = String.copyValueOf(arr_num, 1, 4);
        System.out.println( str );
    }
}
