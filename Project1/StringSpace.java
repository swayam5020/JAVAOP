//Input a string and count number of spaces present in it
import java.util.*;
class StringSpace 
{
    public static void main(String s)
    {
       int i;
       char ch;
       String a=" " ;
       for(i=0;i<s.length();i++)
       {
           ch=s.charAt(i);
           s=ch++;
       }
       if(s==a)
       {
           s++;
        }
       System.out.println(s);
    }
}
           
           
        
