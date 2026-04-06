import java.util.*;
class SelectionSort2
{
    public static void main(String args[])
    {
        SelectionSort1 ob =new SelectionSort1();
        Scanner sc = new Scanner(System.in);
        int i,n,j,t;
        System.out.println("En ter size of array :");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements in array :");
         for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }       
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Display Array :");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}