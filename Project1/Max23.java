import java.util.*;
class Max23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Max23 ob=new Max23();
        System.out.println("a = " );
        int a=sc.nextInt();
        System.out.println("b = " );
        int b=sc.nextInt();
        int m=ob.maximum(a,b);
        System.out.println("Max = " +m);
    }
    int maximum(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;

        }
    }
}