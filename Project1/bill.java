class bill 
{
    public static void main(int c)
    {
        double bill=0.0;
        if(c>0&&c<101)
        {
            bill=c*0.8;
        }
        else if (c>200)
        {bill = (100*0.8)+(100*0.6)+(c-200)*0.3;
        }
        else 
        {
            System.out.println("Invalid number of units");
        }
        System.out.println("total bill="+bill);
    }
}
        
        
    