class PrimeNumber
{
    public static void main(int n)
    {
        int c=0,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
               c++;
        }
        if(c==2)
             System.out.println(n+" is Prime");
        else
             System.out.println(n+" is not Prime");
    }
}