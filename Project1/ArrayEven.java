// Input an array and find sum of all even numbers present in it
import java.util.*;
class ArrayEven
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int[n];
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for( i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                sum=a[i]; 
            }
        }
        System.out.println("sum "+sum);
    }
}  