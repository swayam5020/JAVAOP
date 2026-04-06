import java.util.*;
class ArrMax1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Input size of array " );
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0], pos=-1;
        //Max find
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
 
               max=a[i];
               pos=i;
            }
        }

            System.out.println("Max"+max);
     
        
    }
}