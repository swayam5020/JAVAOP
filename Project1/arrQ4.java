/*Define a class to accept two integers array A & B of size 5 elements
each. Create another array C that stores the intersection of the two arrays.
Eg: A = {1,3,5,7,8}
B = {7,4,2,8,9}
C = {7,8}*/
import java.util.*;
class arrQ4
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5], B = new int[5], C = new int[5];

        for(int i=0; i<5; i++)
        {
            System.out.println("Enter element no. "+i +"of A");
            A[i] = sc.nextInt();
            System.out.println("Enter element no. "+i +"of B");
            B[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                if(A[i]==B[j])
                {
                    boolean b = true;
                    for(int k=0; k<5; k++)
                    {
                        if(B[j]==C[k])
                            b = false;
                    }
                    if(b)
                    {
                        for(int l=0; l<5; l++)
                        {
                            if(C[l]!=0)
                                continue;
                            else
                            {
                                C[l]=A[i];
                                l=6;
                            }
                        }
                    }
                }    
            }
        }
        for(int i=0; i<5; i++)
        {
            if(C[i]!=0)
                System.out.println(C[i]);
        }
    }
}

