import java.util.*;
class FuncAdd
{
     public static void main(String args[]) // calling function
     {
        FuncAdd ob=new FuncAdd();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        int a=sc.nextInt();
        System.out.println("Enter b = ");
        int b=sc.nextInt();
         int sum;
         sum=ob.add(a,b);//function call
         System.out.print("Sum ="+sum);
     }
     int add(int a, int b) //called fuinction
     {
         int s=a+b;
         return s;
     }
     
}
/*
 * syntax 
 * [access specifier] [modifier] <return type> <function name>(argument list)
 * {
 *     body;
 * }
 * [] - optional
 * <> - mandatory
 */