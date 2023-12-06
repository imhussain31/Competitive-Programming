import java.util.Arrays;

public class LongestCommonPrefix {
    public static String LCP(String[] str){
        int size  = str.length;
        String target = null;
        if (size == 0){
            return null;
        }
        else if (size == 1){
            return str[0];
        }else{
            Arrays.sort(str);
            int length = str[0].length();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i<length; i++){
                if (str[0].charAt(i) == str[size-1].charAt(i)){
                    stringBuilder.append(str[0].charAt(i));
                }else{
                    break;
                }
            }
            target = stringBuilder.toString();
        }
        return target;
    }

    public static void main(String[] args) {
        String[] str = {"flower" , "flow" , "Flish"};
        System.out.println(LCP(str));
    }


}
