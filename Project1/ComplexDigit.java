//n=324, count =3, sum=9
class ComplexDigit
{
    public static void main(int n)//calling function
    {
        ComplexDigit ob=new ComplexDigit();
        int count=ob.digitCount(n);//function call, n - actual argument
        System.out.println("Digit Count "+count);
        int s=ob.digitSum(n);//function call, n - actual argument
        System.out.println("Digit sum "+s);
        if(ob.digitSumEvenCheck(n)==true)//function call, n - actual argument
             System.out.println("Digit sum is even");
  
  else 
             System.out.println("Digit sum is odd");
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
 int digitSum(int n)//called function, n- formal argument
    {
        int  d,s=0;
        while(n>0)
        {
            d=n%10;
            n=n/10; //32, 3,0
            s=s+d;
        }
        return s;
    }
 boolean digitSumEvenCheck(int n)
    {
        ComplexDigit ob1=new ComplexDigit();
        int s=ob1.digitSum(n);
        if(s%2==0)
            return true;
        else
            return false;

    }
}