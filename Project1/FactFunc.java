//factorial using function 4! =1*2*3*4 =24
class FactFunc
{
    public static void main(int n)
    {
        FactFunc ob=new FactFunc();
        int f=ob.factorial(n);
        System.out.println("factorial = " +f); 
    }
    int factorial(int n) 
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;//5
    }
}