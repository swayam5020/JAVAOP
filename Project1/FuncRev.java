import java.util.*;
class FuncRev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        FuncRev ob=new FuncRev();
        System.out.println("Number to be reversed" );
        int a=sc.nextInt();
        int m=ob.reverse(a);
        System.out.println();
    }
    int reverse(int x)
    {
        int d=0,r=0;
        while(x>0)//324
        {
            d=x%10;//4...2..3
            r=(r*10)+d;//4..42..423
            x=x/10;//32..3..0
        }
        return r;
    }
}
    
   
    
