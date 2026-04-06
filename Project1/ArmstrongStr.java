class ArmstrongStr
{
    public static void main (int n)
    {
        ArmstrongStr ob=new ArmstrongStr();
        boolean a=ob.Armstrong(n);
        if(ob.Armstrong(n)==true)
        System.out.println("It is an Armstrong");
        else
        System.out.println("It is not an Armstrong");
    }
    boolean Armstrong(int n)
    {
        int r,s=0;    
        while(n>0)
    {
         r=n%10;
         n=n/10;
         s=s+r*r*r;
    }
    if(s==n)
{
    return true; 
}
else
{
    return false;
}
}
}