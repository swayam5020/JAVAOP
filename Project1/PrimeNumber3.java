class PrimeNumber3
{
        public static void main(int n)
    {
        PrimeNumber3 ob=new PrimeNumber3();
        for(n=99;n<1000;n++)
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