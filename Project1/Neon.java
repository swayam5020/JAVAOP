//WAP to select 
class Neon
{
    public static void main (int n)
    {
        int sum= 0,r,sqr;
        sqr=n*n;
        while (sqr!=0)
        {
            r=sqr%10;
            sum=sum+r;
            sqr=sqr/10;
            if(sum==n)
            {
                System.out.println("Neon Number");
            }
            else
            {
                System.out.println("Not a Neon number");
            }
        }
    }
}
            
            
            
            
          
