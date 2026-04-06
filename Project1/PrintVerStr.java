import java.util.*;
class PrintVerStr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string " );
        String s=sc.nextLine();
        int i;
        char ch;
        System.out.println(s);
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);// H
            System.out.println(ch);
        }        
    }
}