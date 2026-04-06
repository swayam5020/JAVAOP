class TwinPrime1
{
    public static void main(String args[])
    {
        TwinPrime1 ob=new TwinPrime1();
        System.out.println("Twin Primes = ");
        for(int n=3;n<=100;n=n+2)
        {
            if(ob.isPrime(n)==true && ob.isPrime(n+2)==true)
                System.out.println(n+" "+(n+2));
        }
    }   
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
   
} 