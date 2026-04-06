//Enter a character array and a character using bufferedreader and search the character is present in the array or not
import java.io.*;
class LinearSearch2
{
     public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the size of the array");
        int n=5;
        System.out.println("Enter Charecters of array");
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]= br.readLine().charAt(0);
        }
        System.out.println("Enter the charecter you want to seach");
        char t=br.readLine().charAt(0);
        int flag=0,pos=-1;
        for(int i=0;i<n;i++)
        {
            if(ch[i]==t)
            {
                flag=1;
                pos=i;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Found the charecter to index"+pos);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}