class Fibonacci
{
    public static void main(int n)
    {
        Fibonacci ob=new Fibonacci();
        ob.f(n);
    }
    void f(int n)
    {
        int a=-1,b=1,c=0;
        for(int i=1;i<=n;i++)
        {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
      
        }
    }
}
