import java.util.*;
class MaxArr
{
    public static void main(String args[])
    {
        //input
        Scanner sc=new Scanner(System.in);// sc object created
        System.out.println("Enter the length of array ");
        int n=sc.nextInt();//nextInt for integer input
        int a[]=new int[n];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // 3,5,2,6,4
        //end of input
        int max=a[0];//3
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Max = "+max);
         //Display
        System.out.println("\nThe elements of array ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}