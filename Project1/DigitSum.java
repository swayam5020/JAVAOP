class DigitSum
{
    public static void main(int n)
    {
        DigitSum ob=new DigitSum();
        int digitsum = ob.ds(n);
    }
    int ds(int n)
    {
        int d, s=0;
        while(n>0) //231, 23, 2, 0
        {
            d=n%10; //231%10=1, 23%10=3, 2%10=2
            s=s+d; // 0+1=1 , 1+3=4, 4+2=6
            n=n/10; // 231/10=23, 23/10=2, 2/10=0
        }
        System.out.println(s);
    return s;
    }
}
       
    
       