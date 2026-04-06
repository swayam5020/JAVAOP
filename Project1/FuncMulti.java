class FuncMulti
{
    public static void main(String args[])
    {
        FuncMulti ob=new FuncMulti();
        int s1=ob.product(2,3);
        System.out.println("produnt = " +s1);
        double s2=ob.remainder(6,3);
        System.out.println("remainder= " +s2);
    }
    int product(int a,int b) 
    {
        int p=a*b;
        return p;
    }
    double remainder(int a,int b) 
    {
        double r=a/b;
        return r;
    }
}