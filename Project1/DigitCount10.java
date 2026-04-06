//n=324, count =3
class DigitCount10
{
    public static void main(int n)//calling function
    {
        DigitCount10 ob=new DigitCount10();
        int count=ob.digitCount(n);//function call, n - actual argument
        System.out.println("Digit Count "+count);
    }
    int digitCount(int n)//called function, n- formal argument
    {
        int  c=0;
        while(n>0)
        {
            n=n/10; //32, 3,0
            c++; //1,2,3
        }
        return c;
    }
}