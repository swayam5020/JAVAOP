//Input your name and marks in 2 array name and marks and find the person who got maximum marks
import java.util.*;
class MaxMarks
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Input the number of people" );
        int n = sc.nextInt();
        char a[]=new char[n];
        System.out.println("Enter names");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Enter the marks");
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextLine();
        }
        int max=a[0], pos=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
 
               max=a[i];
               pos=i;
            }
        }
    }
}
       
      
     
        
  
       
       
            
            
    
