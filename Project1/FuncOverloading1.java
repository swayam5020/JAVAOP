class FuncOverloading1
{
    public static void main(String args[])
    {
        FuncOverloading1 ob=new FuncOverloading1();
        boolean a=ob.digitCheck(234);//int
        if(a==true)
            System.out.println("The number is even");
        else 
            System.out.println("The number is odd");
        int b=ob.digitCheck(234L);//long type
        System.out.println("The number of digit is ="+b);
        System.out.println("The Digitsum is ="+ob.digitCheck((short)23));
        System.out.println("The Max is ="+ob.digitCheck(23,45));
        System.out.println("The Min is ="+ob.digitCheck(23,45L));
        System.out.println("The addition is ="+ob.digitCheck(23L,45));
    }
    long digitCheck(int n,long m)//max check
    {
        if(n>=m)
            return (long)n;
        else 
            return (long)m;
    }
    long digitCheck(long n,int m)//addition
    {

            return (long)(n+m);
       
    }
    boolean digitCheck(int n)
    {
        boolean flag=false;
        while(n!=0)
        {
            int d=n%10;
            if(d%2==0)
            {
                flag=true;
                break;
            }
            n=n/10;
        }
        return flag;
    }
    int digitCheck(long n)//digit count
    {

        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        return c;

    }
    int digitCheck(short n)//digit sum
    {

        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            n=(short)(n/10);
            s=s+d;
        }
        return s;

    }
    int digitCheck(int n,int m)
    {
        if(n>=m)
            return n;
        else 
            return m;
    }
    
    
}