import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        a=a.toUpperCase();
        int i,c=0;
        for(i=0;i<a.length()-1;i++)
        {
            if(a.charAt(i)==a.charAt(i+1))
            c++;
        }
        System.out.println(c);
    }
}
        