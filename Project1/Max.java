import java.util.*;
class Max
{
    public static void main(String args[])
    {
        Max ob=new Max();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        double a=sc.nextInt();
        System.out.println("Enter b = ");
        double b=sc.nextInt();
        double max1;
        max1=ob.max(a,b);
        System.out.print("Max ="+max1);
    }

    double max(double a, double b)
    {
        double max=Math.max(a,b);
        return max;
    }
}
