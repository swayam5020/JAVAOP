/*Define a class to accept a sentence and count total number of words
which start with a vowel. */
import java.util.*;
class StrVowel4
{
    public static void main(String s)
    {
      int c=0,i;
      s=s.trim();
      s=s.toUpperCase();
      char ch;
      s=" "+s;
      for(i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          {
             ch=s.charAt(i+1);
          
          if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
          {
              c++;
            }
      }
      
    }
    System.out.println(c);
}
}
              