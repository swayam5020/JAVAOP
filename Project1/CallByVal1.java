class CallByVal1
{
    public static void main()
    {
        int c=5,d=4;
        CallByVal1 ob=new CallByVal1();
        System.out.println(" in main before swap c= "+c+" d= "+d); 
        ob.swap(c,d);
        System.out.println(" in main after swap c= "+c+" d= "+d);
        ob.add(c,d);
        int m=ob.multiply(c,d);
        System.out.println("multiply "+m);
    }
    void swap(int a, int b)
    {
        int t=a;
        a=b;
        b=t;
        System.out.println(" in swap a= "+a+" b= "+b); 
    }

    void add(int a,int b)
    {
        int s=a+b;
        System.out.println("add "+s);
    }
    int multiply(int a,int b)
    {
        int k=a*b;
        return k;
    }
}