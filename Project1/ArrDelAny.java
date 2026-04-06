import java.util.*;
class ArrDelAny
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j, n;
		System.out.println("Enter size of array");
		n=sc.nextInt();//6
		int a[]=new int[n];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
                //Delete Any Position
		System.out.println("Enter Position to delete from 0 to "+n);
		int pos=sc.nextInt();
                int t=a[pos];//store elements to be deleted
   		for(i=pos+1;i<n;i++)
		{
			a[i-1]=a[i];
		}
		n--;// total no of elements decreased by 1
		System.out.println("Elements in array after delete -");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Element deleted : "+t);
	}
}