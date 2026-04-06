
class FindThreeDigit_Prime
{
    public static void main()
    {
        int c=0,i,j;
        for(j=100;j<=999;j++)
        {
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    c++;
                }
            }
            {
                if(c==2)
                {
                    System.out.println(j);
                }
                c=0;
            }
        }
    }
}