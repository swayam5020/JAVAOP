/*Q. Overload a function called calculate
calculate() 
1. Subtract 2 numbers
2. Multiply 2 numbers
3. Divide 2 number
4. Find average of 3 numbers
5. Increment a number by 1*/
import java.util.*;
class FuncOverloading2
{
    public static void main(String args[])
    {
        FuncOverloading2 ob=new FuncOverloading2();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter another number: ");
        int m=sc.nextInt();
        System.out.println("Enter 1st number for avg: ");
        int x=sc.nextInt();
        System.out.println("Enter 2nd number for avg: ");
        int y=sc.nextInt();
        System.out.println("Enter 3rd number for avg: ");
        int z=sc.nextInt();
        System.out.println("The subracted value will be= "+ob.Calculate(n,m));
        System.out.println("The product = "+ob.Calculate(m,n));
        System.out.println("The remainder = " +ob.Calculate(m,n));
        System.out.println("The average = "+ob.Calculate(x,y,z));
        System.out.println("The increment = "+ob.Calculate(x));
    }
    int Calculate(int n,int m)
    {
        int s=n-m;
        return s;
    }
    long Calculate(long m,int n)
    {
        long p=m*n;
        return p;
    }
    long Calculate(long m,long n)
    {
        long r=n/m;
        return r;
    }
    int Calculate(int x,int y,int z)
    {
      int avg=(x+y+z)/3; 
      return avg;
    }
    int Calculate(int x)
    {
        int i=x++;
        return i;
    }
}
    
           
       
       
    
    