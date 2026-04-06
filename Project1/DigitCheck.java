class DigitCheck 
{
    public static void main(int n ,int m)
    {
        DigitCheck ob=new DigitCheck();
        
        if(ob.evenCheck(n)==true)
        System.out.println("The digit is even");
        else
        System.out.println("The digit is odd");
        
        if(ob.maxCheck(n,m)==true)
        System.out.println(n+"Is the greater one");
        else
        System.out.println(m+"Is the greater one");
    }
    boolean evenCheck(int n)
    {
        if(n%2==0)
        return true;
        else
        return false;
    }
    boolean maxCheck(int n,int m)
    {
            if(n>m)
            
                return true;
                else 
                return false;
            }
 }

        