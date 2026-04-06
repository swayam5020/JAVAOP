import java.util.*;
class AlphabeticSelection
{
    public static void main(String args[])
    {
        AlphabeticSelection ob =new AlphabeticSelection();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int i, n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        String city[]=new String[n];/* Declare array and allocates memory with new operator. 
        size of int = 4byte. Total array size = 4*n byte. *///Input 
        System.out.println("Enter cities in array");
        for( i=0;i<n;i++)
        {
            city[i]=sc1.nextLine();
        }
        ob.selection(city); 
    }
     void selection(String a[])
    {
        int i,j, n=a.length;
        String t="";
        //Sorting
        for(i=0;i<n-1;i++)// 0-3 if n=5
        {
            for(j=i+1;j<n;j++)
            {
        if(a[i].compareTo(a[j])>0)//a[i]>a[j]

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