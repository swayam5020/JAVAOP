class OddEven
{
    public static void main()
    {
        int so=0,se=0;
        for(int i=1;i<=100;i++)
        {
           if(i%2==0)
           {
              se=se+i;
            }
            else
            {
               so=so+i;
            }
        }
        System.out.println("The sum of even numbers is"+se);
        System.out.println("The sum of odd numbers is"+so);
    }
}