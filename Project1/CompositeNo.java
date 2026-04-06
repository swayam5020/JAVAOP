//print all composite numbers from 1 to 100
class CompositeNo
{
    public static void main(int n)
    {
        CompositeNo ob=new CompositeNo();
        for(n=1;n<=100;n++)
        {
           if(ob.isPrime(n)==false)
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
