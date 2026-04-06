class PrimeNumber2
{
        public static void main(int n)
    {
        PrimeNumber2 ob=new PrimeNumber2();
        for(n=1;n<=100;n++)
        {
        if(ob.isPrime(n)==true)
        System.out.println(n);
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
        return false;
    
    }
}
        
        