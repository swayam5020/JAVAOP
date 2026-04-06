import java.util.*;
class ArrInp
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int i, n;
	  System.out.println("Enter size of array");
	  n=sc.nextInt();
	  int a[]=new int[n];/* Declare array and allocates memry with new operator. 
	  size of int = 4byte. Total array size = 4*n byte. */
          //Input System.out.println("Enter elements in array");
	  for( i=0;i<n;i++)
	      {
			a[i]=sc.nextInt();
	      }
	      //Access : Sum of elememts
		int sum=0;
   	  for( i=0;i<n;i++)
               {
			sum+=a[i]; 
		}
		System.out.println("sum "+sum);
	}
}