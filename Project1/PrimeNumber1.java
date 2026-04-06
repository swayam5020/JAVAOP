import java.util.*;
class PrimeNumber1
{
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else 
        return false;
    }
    public static void main(int n)
    {
        PrimeNumber1 ob=new PrimeNumber1();
        System.out.println(ob.isPrime(n));
    }
}
