class Palindrome
{
    public static void main(int n)
    {
        Palindrome ob=new Palindrome();
        for(n=1;n<=100;n++)
        {
            if(ob.palindrome(n)==true && ob.isPrime(n)==true)
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
        {

            return true;
        }
        else 
        return false;
    }

    boolean palindrome(int x)
    {
        int d=0,r=0;
        while(x>0)
        {
            d=x%10;
            r=(r*10)+d;
            x=x/10;
        }
        return true;
        
    }

}
