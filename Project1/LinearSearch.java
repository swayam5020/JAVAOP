import java.util.*;
class LinearSearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Input size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to seach");
        int t=sc.nextInt();
        int flag=0,pos=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]==t)
            {
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Found the number to index"+pos);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
            