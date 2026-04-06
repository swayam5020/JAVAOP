//input an array and find minimum number
import java.util.*;
class Minarray
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Min="+min);
    }
}
        

     
    
