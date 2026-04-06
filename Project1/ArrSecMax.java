import java.util.*;
class ArrSecMax
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter number of elements in array");
		n=sc.nextInt();
		int a[]=new int[n];/* Declare array and allocates memry with new operator. 
		size of int = 4byte. Total array size = 4*n byte. */
		//Input 
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
                //Access : Find Max
		int max=a[0];
		int smax=a[0];
   		for( i=0;i<n;i++)
		{       
			   if(a[i]>max)
			   {
			       smax=max;
			       max=a[i];
			   }
			   else if(a[i]<max && a[i]>smax)
			        smax=a[i];
		}
		System.out.println(" Second Maximum number : "+smax);
	
	}
}