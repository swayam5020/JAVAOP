//input an array and print all negative numbers
import java.util.*;
class NegatuveArray
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
        System.out.println("The negetive numbers are:");
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
                System.out.println(a[i]);

        } 

    }
}

            