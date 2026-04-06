//Call by value
class Swap
{
    void swapVal(int a, int b)
    {
        int c=a;
        a=b;
        b=c;
        System.out.println("In swap a="+a+"b="+b);
    }
    public static void main(String args[])
    {
        int a=4,b=5;
        Swap ob=new Swap();
        System.out.println("In main before swap a="+a+"b="+b);
        ob.swapVal(a,b);
        System.out.println("In main after swap a="+a+"b="+b);
    }
}