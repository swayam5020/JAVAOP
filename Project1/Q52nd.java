//Write a Program to accept a string and Print the words that starts and ends with the same letter. Also Print there count.
import java.util.*;
class Q52nd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of names");
        int n = sc.nextInt();
        int i,c=0;
        String names[]=new String[n];
        System.out.println("Enter names in array :"); 
        for(i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
            
        }   
        for(i=0;i<n;i++)
        {
            if(names[i].charAt(0)==names[i].charAt(names[i].length()-1))
            {
                System.out.println(names[i]);
                c++;
            }
        }
    }
}
            
 