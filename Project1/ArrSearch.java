import java.util.*;
class ArrSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in array");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements you want to search in the array");
        int e=sc.nextInt();
        int flag=0;
        for(i=0;i<n;i++)
        {
            if(e==a[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Found at"+i);
        else
            System.out.println("Not Found");
    }
}