//1. Input a sentnce and cnt no of vowls
import java.util.*;
class VowelStr
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
            if(ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                    System.out.println(ch);
            
                }
    }
}