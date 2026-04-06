// eAccept a number and check if it has any even digit or not using boolean evenDigitCheck(int n) and find number of digits using int numbrOfDigit(int n) function
/* n=231
evenDigitCheck(int n) == true
Partha Sen19:39
numberOfDigit(int n)  =3*/
class Func 
{
    public static void main(int n)
    {
        Func ob=new Func();
        boolean a=ob.evenDigitCheck(n);
        if(a==true)
        System.out.println("The number is even");
        else 
        System.out.println("The number is odd");
        int b=ob.numberOfDigit(n);
        System.out.println("The number of digit is ="+b);
    }
    boolean evenDigitCheck(int n)
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
    int numberOfDigit(int n)
    {
        {
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        return c;
        }
    }
            
}
        
            
           
            
            
       
        
        