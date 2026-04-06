import java.util.*;
class SelectionSort1
{
    public static void main(String args[])
    {
        SelectionSort1 ob =new SelectionSort1();
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];/* Declare array and allocates memry with new operator. 
        size of int = 4byte. Total array size = 4*n byte. */
        //Input 
        System.out.println("Enter elements in array");
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ob.selection(a); 
    }
    void selection(int a[])
    {
        int i,j,t, n=a.length;
        //Sorting
        for(i=0;i<n-1;i++)// 0-3 if n=5
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])//a[i].compareTo(a[j])<0

                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        //Display
        System.out.println("Display Array");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
