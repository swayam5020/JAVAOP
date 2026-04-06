import java.util.*;
class ArrMax100
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Access
		int max=a[0];
   		for( i=0;i<n;i++)
		{
			if(max<a[i])
			    max=a[i];
		}
		System.out.println("Maximum "+max);
	}
}