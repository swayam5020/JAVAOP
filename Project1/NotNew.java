import java.util.*;
class NotNew 
{
    public static void main(String s)
    {
        String str="";
        s=s.trim();
        s=" "+s;
        int i;
        char ch;
        String surname=s.substring(s.lastIndexOf(' ')+1);
         for(i=0;i<s.lastIndexOf(' ');i++)
        {
            ch=s.charAt(i);
            str=str+ch;
        }
        str=surname+str;
            System.out.println(str);
        }
}
        