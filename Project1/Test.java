class Test 
{
    static int n;
    int m;
    Test()
    {
        n=5;
        m=10;
    }
    void cal()
    {
        n++;
        m++;
    }
    public static void main()
    {
     Test ob=new Test();
     Test ob1=new Test();
     ob.cal();
     ob1.cal();
     ob.cal();
     System.out.println(ob.m+" "+Test.n);/* blah blah blah 
     bcabcsjbc */
}
}