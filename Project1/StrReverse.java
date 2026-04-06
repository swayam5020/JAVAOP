import java.util.*;
class StrReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String op="",word="", sent="";
        char ch;
        str=str.trim();
        str=str+" ";
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
                word=word+ch;
            else
            {
                sent=word+" "+sent;
                word="";
            }
            
       }
       System.out.println(sent);
    }
}
        