import java.util.*;
class ArrDelEnd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j, n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
                //Delete Last Position
		int t=a[n-1];//store elements to be deleted
		n--;// total no of elements decreased by 1
		System.out.println("Elements in array after delete -");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Element deleted : "+t);
	}
}