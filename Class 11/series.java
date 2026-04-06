import java.util.*;
public class series
{
    int ser(int a)
    { 
        int i,f=1;
        for(i=1;i<=a;i++)
        f=f*i;
        return f;
    }
    public static void main(String args[])
    {
        int a,n;
        double p,k,s=1;
       Scanner sc=new Scanner(System.in);
        series ob=new series();
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of n");
        n=sc.nextInt();
        for(int j=2;j<=n;j=j+2)
        {
          p=Math.pow(a,j);
          k=ob.ser(j);
          s=s+p/k;
        }
        System.out.println("the factorial series are"+s);
    }
}