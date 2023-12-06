import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
static int converter(String s){
        Map<Character , Integer> number = new HashMap<>();

        number.put('I' , 1);
        number.put('V' , 5);
        number.put('X' , 10);
        number.put('L' , 50);
        number.put('C' , 100);
        number.put('D' , 500);
        number.put('M' , 1000);

         s = s.replace("IV","IIII");
         s = s.replace("IX","VIIII");
         s = s.replace("XL","XXXX");
         s = s.replace("XC","LXXXX");
         s = s.replace("CD","CCCC");
         s = s.replace("CM","DCCCC");

         int num = 0;
         for (int i = 0; i<s.length(); i++){
             num = num + (number.get(s.charAt(i)));
         }


        return num;
    }
    public static void main(String[] args) {
        System.out.println(converter("LVIII"));
    }
}
