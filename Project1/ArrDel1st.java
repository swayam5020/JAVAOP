import java.util.*;
class ArrDel1st
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
                //Delete 1st Position
		int t=a[0];//store elements to be deleted
   		for(i=1;i<n;i++)
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