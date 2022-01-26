public class FrequentCharacter {
    public static void main (String[] args)
    {
        String s = "Muhammad";
        char[] ch = s.toCharArray();
        int max = 0 , max1  = 0;
        for (int i = 0; i<ch.length; i++)
        {
            int cnt = 0;
            for (int j = i; j<ch.length; j++)
            {
                if (ch[i] == ch[j])
                {
                    cnt++;
                }
            }
            if (max < cnt )
            {
                max = cnt;
            }
            else if (max1 < cnt )
            {
                max1 = cnt;
            }
        }
        System.out.println(max);
    }
}
