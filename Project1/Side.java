import java.util.*;
class Side
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=Math.min(a,b);
        e=Math.max(c,d);
        System.out.println("The smallest number is"+d);
        System.out.println("The greatest number is"+e);
    }
}

        
        
