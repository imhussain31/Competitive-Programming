public class CheckAlphabet {
   char ch;
   CheckAlphabet(char ch)
   {
       this.ch = ch;
   }

   void AlphabetDisplay()
   {
       //if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
           if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) System.out.println("Alphabet");
       else System.out.println("Not Alphabet");
   }
}
