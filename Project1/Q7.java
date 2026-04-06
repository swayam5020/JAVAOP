// WAP to input integer elements into an array of size 20 and perform : 1) display largest no. 2) smallest 3) sum of all
import java.util.*;
class Q7
{
    public static void main(String args[])
    {
        int a[]=new int[20];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in array");
        for( i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
   	for( i=0;i<20;i++)
	{       
		if(a[i]>max)
		{
			max=a[i];
                }
        }
        System.out.println(" Maximum number : "+max);
        int min=a[0];
	for(i=0;i<20;i++)
	{
	    if(a[i]<min)
	    {
	        min=a[i];
	    }
	    System.out.println("min number = " + min);
	}
	int sum=0;
	for(i=0;i<20;i++)
	{
	    sum=sum+a[i];
	}
	System.out.println("Sum =" + sum);
    }
}
	     
		
		

            
        