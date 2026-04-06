class CompositeNumbers
{
    public static void main()
    {
        int c=0,i,j;
       for(j=1000;j<=9999;j++)
        {
            for(i=1;i<=j;i=i+2)
            {
                if(c!=2)
                {
                    c=c+2;
                }
            }
            {
                    System.out.println(j);
                }
                c=0;
            }
        }
    }
 