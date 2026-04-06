import java.util.*;
class ArrInLast
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Insert Last Position
		System.out.println("Enter elements to insert in array at the end");
		int t=sc.nextInt();
   		for(i=n-1;i>=n;i--)
		{
			a[i+1]=a[i];
		}
                a[n]=t;
		n++;
		System.out.println("Elements in array after insert -");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}