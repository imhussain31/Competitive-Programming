public class FindTheIndexOfTheFirstOccurrenceInaString {
    public static void strStr(String haystack, String needle) {
         int len1 = haystack.length();
         int len2 = needle.length();

         for(int i = 0; i<len1 - len2 + 1; i++){
             if (haystack.substring(i , i + len2).equals(needle)){
                 System.out.println("0");
                 break;
             }else{
                 System.out.println("-1");
                 break;
             }
         }
    }
    public static void main(String[] args) {
         strStr("sadbutsad", "nod");
    }
}
